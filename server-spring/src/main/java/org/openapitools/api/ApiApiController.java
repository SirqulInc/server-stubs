package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AccountListResponse;
import org.openapitools.model.AccountLoginResponse;
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AccountResponse;
import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
import org.openapitools.model.ActivityResponse;
import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AlbumContestListResponse;
import org.openapitools.model.AlbumContestResponse;
import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.AlbumResponse;
import org.openapitools.model.AppResponse;
import org.openapitools.model.ApplicationConfigResponse;
import org.openapitools.model.ApplicationResponse;
import org.openapitools.model.ApplicationSettingsResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.ApplicationUsageResponse;
import org.openapitools.model.AssetFullResponse;
import org.openapitools.model.AssetListResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.BidResponse;
import java.math.BigDecimal;
import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.BlockedNotificationResponse;
import org.openapitools.model.CargoType;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
import org.openapitools.model.CellCarrierResponse;
import org.openapitools.model.ChartData;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.CoordsResponse;
import org.openapitools.model.CountResponse;
import org.openapitools.model.CreativeResponse;
import org.openapitools.model.CsvImportResponse;
import org.openapitools.model.Direction;
import org.openapitools.model.DisbursementResponse;
import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.EntityReference;
import org.openapitools.model.EventAttendanceResponse;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
import org.openapitools.model.FlagResponse;
import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.GameResponse;
import org.openapitools.model.GeoPointResponse;
import org.openapitools.model.ImportStatuses;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.LeaderboardResponse;
import org.openapitools.model.Leg;
import org.openapitools.model.LegResponse;
import org.openapitools.model.LikableResponse;
import org.openapitools.model.ListCountResponse;
import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
import org.openapitools.model.Location;
import org.openapitools.model.LocationSearchResponse;
import java.util.Map;
import org.openapitools.model.MediaOfferResponse;
import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.NoteResponse;
import org.openapitools.model.NotificationMessageListResponse;
import org.openapitools.model.NotificationRecipientResponse;
import org.openapitools.model.NotificationRecipientResponseListResponse;
import org.openapitools.model.NotificationTemplateResponse;
import org.springframework.lang.Nullable;
import org.openapitools.model.ObjectStoreResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.OfferTransactionStatusResponse;
import org.openapitools.model.OrderResponse;
import org.openapitools.model.Orders;
import org.openapitools.model.OrsonAiAddMovieResponse;
import org.openapitools.model.OrsonAiBatchResponse;
import org.openapitools.model.OrsonAiEmotionsResponse;
import org.openapitools.model.OrsonAiProtoResponse;
import org.openapitools.model.OrsonAiSTTResponse;
import org.openapitools.model.OrsonAiTTSResponse;
import org.openapitools.model.OrsonAiTechTuneResponse;
import org.openapitools.model.OrsonAiTopicsResponse;
import org.openapitools.model.OrsonAiVoiceCanvasResponse;
import org.openapitools.model.OrsonEpisodeResponse;
import org.openapitools.model.OrsonRenderResponse;
import org.openapitools.model.PackResponse;
import org.openapitools.model.PathingResponse;
import org.openapitools.model.PaymentRequest;
import org.openapitools.model.PaymentTypesResponse;
import org.openapitools.model.PlacementResponse;
import org.openapitools.model.PostalCodeResponse;
import org.openapitools.model.PredictedLocationResponse;
import org.openapitools.model.PreferredLocationResponse;
import org.openapitools.model.PreviewPersonaResponse;
import org.openapitools.model.ProfileInfoResponse;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.Program;
import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.PurchaseItemResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.QueueResponse;
import org.openapitools.model.RankFullResponse;
import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
import org.openapitools.model.RegionLegSummary;
import org.openapitools.model.RegionResponse;
import org.openapitools.model.ReportBatchResponse;
import org.openapitools.model.ReportRegionLegSummaryBatchResponse;
import org.openapitools.model.ReportResponse;
import org.openapitools.model.ReservationResponse;
import org.openapitools.model.RetailerFullResponse;
import org.openapitools.model.RetailerLocationResponse;
import org.openapitools.model.RetailerOfferResponse;
import org.openapitools.model.RetailerResponse;
import org.openapitools.model.Route;
import org.openapitools.model.RouteSettings;
import org.openapitools.model.RoutingListResponse;
import org.openapitools.model.ScheduledNotificationFullResponse;
import org.openapitools.model.ScoreResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;
import org.openapitools.model.ShipmentOrder;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.StepResponse;
import org.openapitools.model.Stop;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;
import org.openapitools.model.TaskResponse;
import org.openapitools.model.TerritoryResponse;
import org.openapitools.model.ThemeDescriptorResponse;
import org.openapitools.model.ThirdPartyCredentialResponse;
import org.openapitools.model.ThirdPartyNetworkResponse;
import org.openapitools.model.ThirdPartyNetworkShortResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TicketOfferResponse;
import org.openapitools.model.TimeSlotResponse;
import org.openapitools.model.TokenResponse;
import org.openapitools.model.TournamentResponse;
import org.openapitools.model.TriggerResponse;
import org.openapitools.model.TrilatCacheRequest;
import org.openapitools.model.Trip;
import org.openapitools.model.TwiMLResponse;
import org.openapitools.model.UserActivityResponse;
import org.openapitools.model.UserLocationSearchResponse;
import org.openapitools.model.UserPermissionsResponse;
import org.openapitools.model.UserSettingsResponse;
import org.openapitools.model.Vehicle;
import org.openapitools.model.VehicleType;
import org.openapitools.model.WeatherResponse;
import org.openapitools.model.WordzWordResponse;
import org.openapitools.model.WrappedProxyItemResponse;
import org.openapitools.model.WrappedResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Controller
@RequestMapping("${openapi.sirqulIoTPlatform.base-path:}")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
