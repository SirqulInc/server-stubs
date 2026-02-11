package controllers;

import apimodels.ListingFullResponse;
import apimodels.ListingGroupResponse;
import apimodels.ListingResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ListingApiControllerImp extends ListingApiControllerImpInterface {
    @Override
    public ListingFullResponse createListing(Http.Request request, @NotNull Long accountId, @NotNull String name, String filterIds, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) throws Exception {
        //Do your magic!!!
        return new ListingFullResponse();
    }

    @Override
    public SirqulResponse deleteListing(Http.Request request, @NotNull Long accountId, @NotNull Long listingId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ListingFullResponse getListing(Http.Request request, @NotNull Long listingId) throws Exception {
        //Do your magic!!!
        return new ListingFullResponse();
    }

    @Override
    public List<ListingResponse> searchListing(Http.Request request, Long accountId, String keyword, Integer start, Integer limit, Boolean activeOnly, Double latitude, Double longitude, Long startDate, Long endDate, String categoryIds, String filterIds, Boolean useListingOrderIds, String externalId, String externalId2, String externalGroupId) throws Exception {
        //Do your magic!!!
        return new ArrayList<ListingResponse>();
    }

    @Override
    public List<ListingGroupResponse> summaryListing(Http.Request request, Long accountId, Long startDate, String categoryIds, Integer daysToInclude, Boolean useListingOrderIds) throws Exception {
        //Do your magic!!!
        return new ArrayList<ListingGroupResponse>();
    }

    @Override
    public ListingFullResponse updateListing(Http.Request request, @NotNull Long accountId, @NotNull Long listingId, String filterIds, String name, String description, Long start, Long end, String locationName, String locationDescription, Boolean isPrivate, String externalId, String externalId2, String externalGroupId, Boolean active, String metaData) throws Exception {
        //Do your magic!!!
        return new ListingFullResponse();
    }

}
