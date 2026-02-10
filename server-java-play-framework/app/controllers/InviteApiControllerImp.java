package controllers;

import java.math.BigDecimal;
import apimodels.ConsumerInviteResponse;
import apimodels.InviteResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class InviteApiControllerImp extends InviteApiControllerImpInterface {
    @Override
    public ConsumerInviteResponse acceptInvite(Http.Request request, BigDecimal version, @NotNull String token, @NotNull Long accountId, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey, Boolean autoFriend, Boolean autoAttendEvent, Boolean autoFavoriteOffer, Boolean autoFavoriteOfferLocation, Boolean autoFavoriteRetailerLocation) throws Exception {
        //Do your magic!!!
        return new ConsumerInviteResponse();
    }

    @Override
    public InviteResponse albumContestInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumContestId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

    @Override
    public InviteResponse albumInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

    @Override
    public InviteResponse eventInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long listingId, String receiverAccountIds, Long retailerLocationId) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

    @Override
    public InviteResponse gameInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long gameLevelId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

    @Override
    public SirqulResponse getInvite(Http.Request request, BigDecimal version, Long accountId, String token, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public InviteResponse missionInvite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long missionId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

    @Override
    public InviteResponse offerInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long offerId) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

    @Override
    public InviteResponse offerLocationInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long offerLocationId) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

    @Override
    public InviteResponse retailerLocationInvite(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long retailerLocationId, Long albumId) throws Exception {
        //Do your magic!!!
        return new InviteResponse();
    }

}
