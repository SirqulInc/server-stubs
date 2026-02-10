package org.openapitools.server

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.resources.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.hsts.*
import com.codahale.metrics.Slf4jReporter
import io.ktor.server.metrics.dropwizard.*
import java.util.concurrent.TimeUnit
import io.ktor.server.routing.*
import io.ktor.serialization.kotlinx.json.json
import com.typesafe.config.ConfigFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.server.config.HoconApplicationConfig
import io.ktor.server.auth.*
import org.openapitools.server.infrastructure.*
import org.openapitools.server.apis.AMQPApi
import org.openapitools.server.apis.AccountApi
import org.openapitools.server.apis.AchievementApi
import org.openapitools.server.apis.ActivityApi
import org.openapitools.server.apis.AlbumApi
import org.openapitools.server.apis.AnalyticsApi
import org.openapitools.server.apis.AppDataApi
import org.openapitools.server.apis.ApplicationApi
import org.openapitools.server.apis.ApplicationConfigApi
import org.openapitools.server.apis.AssetApi
import org.openapitools.server.apis.AssignmentApi
import org.openapitools.server.apis.AudienceApi
import org.openapitools.server.apis.BidApi
import org.openapitools.server.apis.BillableEntityApi
import org.openapitools.server.apis.BillingInfoApi
import org.openapitools.server.apis.CSVImportApi
import org.openapitools.server.apis.CargoTypeApi
import org.openapitools.server.apis.CarrierApi
import org.openapitools.server.apis.CategoryApi
import org.openapitools.server.apis.ConnectionApi
import org.openapitools.server.apis.ContestApi
import org.openapitools.server.apis.CreativeApi
import org.openapitools.server.apis.DependentApi
import org.openapitools.server.apis.DisbursementApi
import org.openapitools.server.apis.EmployeeApi
import org.openapitools.server.apis.EventApi
import org.openapitools.server.apis.FacebookApi
import org.openapitools.server.apis.FavoriteApi
import org.openapitools.server.apis.FilterApi
import org.openapitools.server.apis.FlagApi
import org.openapitools.server.apis.GameApi
import org.openapitools.server.apis.GameLevelApi
import org.openapitools.server.apis.InviteApi
import org.openapitools.server.apis.LeaderboardApi
import org.openapitools.server.apis.LikeApi
import org.openapitools.server.apis.ListingApi
import org.openapitools.server.apis.LocationApi
import org.openapitools.server.apis.LocationApiV2Api
import org.openapitools.server.apis.MediaApi
import org.openapitools.server.apis.MissionApi
import org.openapitools.server.apis.MissionInviteApi
import org.openapitools.server.apis.NoteApi
import org.openapitools.server.apis.NotificationApi
import org.openapitools.server.apis.ObjectStoreApi
import org.openapitools.server.apis.OfferApi
import org.openapitools.server.apis.OfferStatusApi
import org.openapitools.server.apis.OpenAIApi
import org.openapitools.server.apis.OptimizeApi
import org.openapitools.server.apis.OrsonApi
import org.openapitools.server.apis.PackApi
import org.openapitools.server.apis.ParticipantsApi
import org.openapitools.server.apis.PathingApi
import org.openapitools.server.apis.PostalCodeApi
import org.openapitools.server.apis.PreviewPersonaApi
import org.openapitools.server.apis.ProgramApi
import org.openapitools.server.apis.PurchaseItemApi
import org.openapitools.server.apis.PurchaseOrderApi
import org.openapitools.server.apis.QuestionApi
import org.openapitools.server.apis.RankingApi
import org.openapitools.server.apis.RatingApi
import org.openapitools.server.apis.RegionApi
import org.openapitools.server.apis.ReportingApi
import org.openapitools.server.apis.ReservationApi
import org.openapitools.server.apis.RetailerApi
import org.openapitools.server.apis.RetailerLocationApi
import org.openapitools.server.apis.RetailerV2Api
import org.openapitools.server.apis.RouteApi
import org.openapitools.server.apis.RouteSettingApi
import org.openapitools.server.apis.RoutingApi
import org.openapitools.server.apis.ScheduledNotificationApi
import org.openapitools.server.apis.ScoreApi
import org.openapitools.server.apis.SecureAppApi
import org.openapitools.server.apis.ServiceHubApi
import org.openapitools.server.apis.ShipmentApi
import org.openapitools.server.apis.ShipmentBatchApi
import org.openapitools.server.apis.SimulationApi
import org.openapitools.server.apis.StopApi
import org.openapitools.server.apis.StripeApi
import org.openapitools.server.apis.SubscriptionApi
import org.openapitools.server.apis.TaskApi
import org.openapitools.server.apis.TerritoryApi
import org.openapitools.server.apis.ThemeDescriptorApi
import org.openapitools.server.apis.ThirdPartyCredentialsApi
import org.openapitools.server.apis.TicketApi
import org.openapitools.server.apis.TournamentApi
import org.openapitools.server.apis.TrackingApi
import org.openapitools.server.apis.TriggerApi
import org.openapitools.server.apis.TripApi
import org.openapitools.server.apis.TwilioApi
import org.openapitools.server.apis.TwitterApi
import org.openapitools.server.apis.UserPermissionsApi
import org.openapitools.server.apis.VatomApi
import org.openapitools.server.apis.VehicleApi
import org.openapitools.server.apis.VehicleTypeApi
import org.openapitools.server.apis.WalletApi
import org.openapitools.server.apis.WeatherApi
import org.openapitools.server.apis.WordApi
import org.openapitools.server.apis.WorkflowApi


fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
            .outputTo(this@main.log)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        json()
    }
    install(AutoHeadResponse) // see https://ktor.io/docs/autoheadresponse.html
    install(Compression, ApplicationCompressionConfiguration()) // see https://ktor.io/docs/compression.html
    install(HSTS, ApplicationHstsConfiguration()) // see https://ktor.io/docs/hsts.html
    install(Resources)
    install(Authentication) {
        // "Implement API key auth (appKey) for parameter name 'Application-Key'."
        apiKeyAuth("appKey") {
            validate { apikeyCredential: ApiKeyCredential ->
                when {
                    apikeyCredential.value == "keyboardcat" -> ApiPrincipal(apikeyCredential)
                    else -> null
                }
            }
        }
        // "Implement API key auth (restKey) for parameter name 'Application-Rest-Key'."
        apiKeyAuth("restKey") {
            validate { apikeyCredential: ApiKeyCredential ->
                when {
                    apikeyCredential.value == "keyboardcat" -> ApiPrincipal(apikeyCredential)
                    else -> null
                }
            }
        }
    }
    routing {
        AMQPApi()
        AccountApi()
        AchievementApi()
        ActivityApi()
        AlbumApi()
        AnalyticsApi()
        AppDataApi()
        ApplicationApi()
        ApplicationConfigApi()
        AssetApi()
        AssignmentApi()
        AudienceApi()
        BidApi()
        BillableEntityApi()
        BillingInfoApi()
        CSVImportApi()
        CargoTypeApi()
        CarrierApi()
        CategoryApi()
        ConnectionApi()
        ContestApi()
        CreativeApi()
        DependentApi()
        DisbursementApi()
        EmployeeApi()
        EventApi()
        FacebookApi()
        FavoriteApi()
        FilterApi()
        FlagApi()
        GameApi()
        GameLevelApi()
        InviteApi()
        LeaderboardApi()
        LikeApi()
        ListingApi()
        LocationApi()
        LocationApiV2Api()
        MediaApi()
        MissionApi()
        MissionInviteApi()
        NoteApi()
        NotificationApi()
        ObjectStoreApi()
        OfferApi()
        OfferStatusApi()
        OpenAIApi()
        OptimizeApi()
        OrsonApi()
        PackApi()
        ParticipantsApi()
        PathingApi()
        PostalCodeApi()
        PreviewPersonaApi()
        ProgramApi()
        PurchaseItemApi()
        PurchaseOrderApi()
        QuestionApi()
        RankingApi()
        RatingApi()
        RegionApi()
        ReportingApi()
        ReservationApi()
        RetailerApi()
        RetailerLocationApi()
        RetailerV2Api()
        RouteApi()
        RouteSettingApi()
        RoutingApi()
        ScheduledNotificationApi()
        ScoreApi()
        SecureAppApi()
        ServiceHubApi()
        ShipmentApi()
        ShipmentBatchApi()
        SimulationApi()
        StopApi()
        StripeApi()
        SubscriptionApi()
        TaskApi()
        TerritoryApi()
        ThemeDescriptorApi()
        ThirdPartyCredentialsApi()
        TicketApi()
        TournamentApi()
        TrackingApi()
        TriggerApi()
        TripApi()
        TwilioApi()
        TwitterApi()
        UserPermissionsApi()
        VatomApi()
        VehicleApi()
        VehicleTypeApi()
        WalletApi()
        WeatherApi()
        WordApi()
        WorkflowApi()
    }
}
