package controllers;

import java.math.BigDecimal;
import apimodels.FilterResponse;
import apimodels.FilterTreeResponse;
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
public class FilterApiControllerImp extends FilterApiControllerImpInterface {
    @Override
    public FilterTreeResponse createFilter(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, Long parentFilterId, String description, String externalId, String externalType, Boolean active, String metaData) throws Exception {
        //Do your magic!!!
        return new FilterTreeResponse();
    }

    @Override
    public SirqulResponse deleteFilter(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long filterId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public FilterTreeResponse getFilter(Http.Request request, BigDecimal version, @NotNull Long filterId) throws Exception {
        //Do your magic!!!
        return new FilterTreeResponse();
    }

    @Override
    public List<FilterResponse> searchFilters(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String responseGroup, Boolean rootOnly, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<FilterResponse>();
    }

    @Override
    public FilterTreeResponse updateFilter(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long filterId, Long parentFilterId, String name, String description, String externalId, String externalType, Boolean active, String metaData) throws Exception {
        //Do your magic!!!
        return new FilterTreeResponse();
    }

}
