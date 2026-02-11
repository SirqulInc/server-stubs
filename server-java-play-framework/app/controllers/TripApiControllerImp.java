package controllers;

import apimodels.Trip;

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
public class TripApiControllerImp extends TripApiControllerImpInterface {
    @Override
    public Trip createTrip(Http.Request request, Trip body) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public void delete(Http.Request request, Long id) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Trip driveTrip(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public Trip flexibleTrip(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public Trip getTrip(Http.Request request, Long id) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public List<Trip> getTripMatches(Http.Request request, Long id, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception {
        //Do your magic!!!
        return new ArrayList<Trip>();
    }

    @Override
    public List<Trip> processTripMatches(Http.Request request, Long startDate, Long endDate, Long tripId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Trip>();
    }

    @Override
    public Trip ride(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public List<Trip> search(Http.Request request, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean hasNotifications) throws Exception {
        //Do your magic!!!
        return new ArrayList<Trip>();
    }

    @Override
    public List<Trip> searchTrips(Http.Request request, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception {
        //Do your magic!!!
        return new ArrayList<Trip>();
    }

    @Override
    public Trip updateLocations(Http.Request request, Long id, Trip body) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public List<Trip> updateRecurrenceLocations(Http.Request request, Long id, Trip body) throws Exception {
        //Do your magic!!!
        return new ArrayList<Trip>();
    }

    @Override
    public List<Trip> updateRecurrenceShipments(Http.Request request, Long id, Trip body) throws Exception {
        //Do your magic!!!
        return new ArrayList<Trip>();
    }

    @Override
    public Trip updateShipments(Http.Request request, Long id, Trip body) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public Trip updateTrip(Http.Request request, Long id, Trip body) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

    @Override
    public Trip updateTripNotifications(Http.Request request, @NotNull Long id, String notifications) throws Exception {
        //Do your magic!!!
        return new Trip();
    }

}
