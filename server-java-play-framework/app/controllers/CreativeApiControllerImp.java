package controllers;

import java.math.BigDecimal;
import apimodels.CreativeResponse;
import apimodels.MissionResponse;
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
public class CreativeApiControllerImp extends CreativeApiControllerImpInterface {
    @Override
    public SirqulResponse addPreview(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<MissionResponse> adsFind(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull Boolean randomize, @NotNull Boolean targetedAdsOnly, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeAudiences, Boolean allocatesTickets, String missionIds) throws Exception {
        //Do your magic!!!
        return new ArrayList<MissionResponse>();
    }

    @Override
    public CreativeResponse createCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, @NotNull Boolean active, @NotNull Boolean waitForAsset, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Long referenceId, String appVersion, Long missionId, Long offerId) throws Exception {
        //Do your magic!!!
        return new CreativeResponse();
    }

    @Override
    public SirqulResponse deleteCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public CreativeResponse getCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        //Do your magic!!!
        return new CreativeResponse();
    }

    @Override
    public List<CreativeResponse> getCreativesByApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer start, @NotNull Integer limit, Long missionId, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<CreativeResponse>();
    }

    @Override
    public SirqulResponse removePreview(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public CreativeResponse updateCreative(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long creativeId, String name, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Boolean active, Long referenceId, String appVersion, Long missionId) throws Exception {
        //Do your magic!!!
        return new CreativeResponse();
    }

}
