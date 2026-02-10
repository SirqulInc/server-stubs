package controllers;

import java.math.BigDecimal;
import apimodels.ConsumerInviteResponse;
import apimodels.InviteResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class InviteApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result acceptInviteHttp(Http.Request request, BigDecimal version, @NotNull String token, @NotNull Long accountId, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey, Boolean autoFriend, Boolean autoAttendEvent, Boolean autoFavoriteOffer, Boolean autoFavoriteOfferLocation, Boolean autoFavoriteRetailerLocation) throws Exception {
        ConsumerInviteResponse obj = acceptInvite(request, version, token, accountId, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey, autoFriend, autoAttendEvent, autoFavoriteOffer, autoFavoriteOfferLocation, autoFavoriteRetailerLocation);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ConsumerInviteResponse acceptInvite(Http.Request request, BigDecimal version, @NotNull String token, @NotNull Long accountId, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey, Boolean autoFriend, Boolean autoAttendEvent, Boolean autoFavoriteOffer, Boolean autoFavoriteOfferLocation, Boolean autoFavoriteRetailerLocation) throws Exception;

    public Result albumContestInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumContestId, Double latitude, Double longitude) throws Exception {
        InviteResponse obj = albumContestInvite(request, version, deviceId, accountId, appId, appKey, albumContestId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse albumContestInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumContestId, Double latitude, Double longitude) throws Exception;

    public Result albumInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumId, Double latitude, Double longitude) throws Exception {
        InviteResponse obj = albumInvite(request, version, deviceId, accountId, appId, appKey, albumId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse albumInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumId, Double latitude, Double longitude) throws Exception;

    public Result eventInviteHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long listingId, String receiverAccountIds, Long retailerLocationId) throws Exception {
        InviteResponse obj = eventInvite(request, version, accountId, appKey, listingId, receiverAccountIds, retailerLocationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse eventInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long listingId, String receiverAccountIds, Long retailerLocationId) throws Exception;

    public Result gameInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long gameLevelId, Double latitude, Double longitude) throws Exception {
        InviteResponse obj = gameInvite(request, version, deviceId, accountId, appId, appKey, gameLevelId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse gameInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long gameLevelId, Double latitude, Double longitude) throws Exception;

    public Result getInviteHttp(Http.Request request, BigDecimal version, Long accountId, String token, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey) throws Exception {
        SirqulResponse obj = getInvite(request, version, accountId, token, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse getInvite(Http.Request request, BigDecimal version, Long accountId, String token, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey) throws Exception;

    public Result missionInviteHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long missionId, Double latitude, Double longitude) throws Exception {
        InviteResponse obj = missionInvite(request, version, deviceId, accountId, appId, appKey, missionId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse missionInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long missionId, Double latitude, Double longitude) throws Exception;

    public Result offerInviteHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long offerId) throws Exception {
        InviteResponse obj = offerInvite(request, version, accountId, appKey, offerId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse offerInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long offerId) throws Exception;

    public Result offerLocationInviteHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long offerLocationId) throws Exception {
        InviteResponse obj = offerLocationInvite(request, version, accountId, appKey, offerLocationId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse offerLocationInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long offerLocationId) throws Exception;

    public Result retailerLocationInviteHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long retailerLocationId, Long albumId) throws Exception {
        InviteResponse obj = retailerLocationInvite(request, version, accountId, appKey, retailerLocationId, albumId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract InviteResponse retailerLocationInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long retailerLocationId, Long albumId) throws Exception;

}
