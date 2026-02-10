package controllers;

import java.math.BigDecimal;
import apimodels.ConsumerInviteResponse;
import apimodels.InviteResponse;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class InviteApiController extends Controller {
    private final InviteApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private InviteApiController(Config configuration, InviteApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result acceptInvite(Http.Request request, BigDecimal version) throws Exception {
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            albumId = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            albumContestId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueautoFriend = request.getQueryString("autoFriend");
        Boolean autoFriend;
        if (valueautoFriend != null) {
            autoFriend = Boolean.valueOf(valueautoFriend);
        } else {
            autoFriend = true;
        }
        String valueautoAttendEvent = request.getQueryString("autoAttendEvent");
        Boolean autoAttendEvent;
        if (valueautoAttendEvent != null) {
            autoAttendEvent = Boolean.valueOf(valueautoAttendEvent);
        } else {
            autoAttendEvent = false;
        }
        String valueautoFavoriteOffer = request.getQueryString("autoFavoriteOffer");
        Boolean autoFavoriteOffer;
        if (valueautoFavoriteOffer != null) {
            autoFavoriteOffer = Boolean.valueOf(valueautoFavoriteOffer);
        } else {
            autoFavoriteOffer = false;
        }
        String valueautoFavoriteOfferLocation = request.getQueryString("autoFavoriteOfferLocation");
        Boolean autoFavoriteOfferLocation;
        if (valueautoFavoriteOfferLocation != null) {
            autoFavoriteOfferLocation = Boolean.valueOf(valueautoFavoriteOfferLocation);
        } else {
            autoFavoriteOfferLocation = false;
        }
        String valueautoFavoriteRetailerLocation = request.getQueryString("autoFavoriteRetailerLocation");
        Boolean autoFavoriteRetailerLocation;
        if (valueautoFavoriteRetailerLocation != null) {
            autoFavoriteRetailerLocation = Boolean.valueOf(valueautoFavoriteRetailerLocation);
        } else {
            autoFavoriteRetailerLocation = false;
        }
        return imp.acceptInviteHttp(request, version, token, accountId, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey, autoFriend, autoAttendEvent, autoFavoriteOffer, autoFavoriteOfferLocation, autoFavoriteRetailerLocation);
    }

    @ApiAction
    public Result albumContestInvite(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappId = request.getQueryString("appId");
        Long appId;
        if (valueappId != null) {
            appId = Long.parseLong(valueappId);
        } else {
            appId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            albumContestId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.albumContestInviteHttp(request, version, deviceId, accountId, appId, appKey, albumContestId, latitude, longitude);
    }

    @ApiAction
    public Result albumInvite(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappId = request.getQueryString("appId");
        Long appId;
        if (valueappId != null) {
            appId = Long.parseLong(valueappId);
        } else {
            appId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            albumId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.albumInviteHttp(request, version, deviceId, accountId, appId, appKey, albumId, latitude, longitude);
    }

    @ApiAction
    public Result eventInvite(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuereceiverAccountIds = request.getQueryString("receiverAccountIds");
        String receiverAccountIds;
        if (valuereceiverAccountIds != null) {
            receiverAccountIds = valuereceiverAccountIds;
        } else {
            receiverAccountIds = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuelistingId = request.getQueryString("listingId");
        Long listingId;
        if (valuelistingId != null) {
            listingId = Long.parseLong(valuelistingId);
        } else {
            throw new IllegalArgumentException("'listingId' parameter is required");
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        return imp.eventInviteHttp(request, version, accountId, appKey, listingId, receiverAccountIds, retailerLocationId);
    }

    @ApiAction
    public Result gameInvite(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappId = request.getQueryString("appId");
        Long appId;
        if (valueappId != null) {
            appId = Long.parseLong(valueappId);
        } else {
            appId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuegameLevelId = request.getQueryString("gameLevelId");
        Long gameLevelId;
        if (valuegameLevelId != null) {
            gameLevelId = Long.parseLong(valuegameLevelId);
        } else {
            gameLevelId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.gameInviteHttp(request, version, deviceId, accountId, appId, appKey, gameLevelId, latitude, longitude);
    }

    @ApiAction
    public Result getInvite(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            token = null;
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            albumId = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            albumContestId = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.getInviteHttp(request, version, accountId, token, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey);
    }

    @ApiAction
    public Result missionInvite(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappId = request.getQueryString("appId");
        Long appId;
        if (valueappId != null) {
            appId = Long.parseLong(valueappId);
        } else {
            appId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuemissionId = request.getQueryString("missionId");
        Long missionId;
        if (valuemissionId != null) {
            missionId = Long.parseLong(valuemissionId);
        } else {
            missionId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.missionInviteHttp(request, version, deviceId, accountId, appId, appKey, missionId, latitude, longitude);
    }

    @ApiAction
    public Result offerInvite(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            throw new IllegalArgumentException("'offerId' parameter is required");
        }
        return imp.offerInviteHttp(request, version, accountId, appKey, offerId);
    }

    @ApiAction
    public Result offerLocationInvite(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            throw new IllegalArgumentException("'offerLocationId' parameter is required");
        }
        return imp.offerLocationInviteHttp(request, version, accountId, appKey, offerLocationId);
    }

    @ApiAction
    public Result retailerLocationInvite(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            throw new IllegalArgumentException("'retailerLocationId' parameter is required");
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            albumId = null;
        }
        return imp.retailerLocationInviteHttp(request, version, accountId, appKey, retailerLocationId, albumId);
    }

}
