package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TerritoryResponse;

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
public class TerritoryApiControllerImp extends TerritoryApiControllerImpInterface {
    @Override
    public TerritoryResponse createTerritory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, Boolean active) throws Exception {
        //Do your magic!!!
        return new TerritoryResponse();
    }

    @Override
    public SirqulResponse deleteTerritory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long territoryId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public TerritoryResponse getTerritory(Http.Request request, BigDecimal version, @NotNull Long territoryId) throws Exception {
        //Do your magic!!!
        return new TerritoryResponse();
    }

    @Override
    public List<TerritoryResponse> searchTerritories(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, String keyword, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<TerritoryResponse>();
    }

    @Override
    public TerritoryResponse updateTerritory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long territoryId, String name, Boolean active) throws Exception {
        //Do your magic!!!
        return new TerritoryResponse();
    }

}
