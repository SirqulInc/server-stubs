package controllers;

import apimodels.AppResponse;
import java.math.BigDecimal;
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
public class AppDataApiControllerImp extends AppDataApiControllerImpInterface {
    @Override
    public AppResponse getAppData(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) throws Exception {
        //Do your magic!!!
        return new AppResponse();
    }

    @Override
    public AppResponse postAppData(Http.Request request, BigDecimal version, @NotNull String gameType, @NotNull Integer start, @NotNull Integer limit, @NotNull String data, String deviceId, Long accountId, Boolean includeGameData, String q, String keyword, String sortField, Boolean descending, Integer i, Integer l, Boolean gameObjectCount, String filter, Long dateCreated, Long ownerId, String missionIds, String gameIds, String packIds, String gameLevelIds, String appVersion, Boolean includeHigherVersionPacks, Boolean includeHigherVersionLevels, String responseGroups, String purchaseType) throws Exception {
        //Do your magic!!!
        return new AppResponse();
    }

    @Override
    public SirqulResponse regenAppData(Http.Request request, BigDecimal version, Long accountId, String appKey, String buildVersion, String apiVersion) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
