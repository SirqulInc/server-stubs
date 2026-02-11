package controllers;

import apimodels.AvailabilityResponse;
import apimodels.ReservationResponse;
import apimodels.TimeSlotResponse;

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
public class ReservationApiControllerImp extends ReservationApiControllerImpInterface {
    @Override
    public void createReservation(Http.Request request, String deviceId, Long accountId, Long startDate, Long endDate, Long offerId, Long offerLocationId, String appKey, String metaData) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void deleteReservation(Http.Request request, @NotNull Long reservationId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<AvailabilityResponse> reservableAvailability(Http.Request request, @NotNull Long reservableId, @NotNull String reservableType, String deviceId, Long accountId, String availability, String availabilitySummary) throws Exception {
        //Do your magic!!!
        return new ArrayList<AvailabilityResponse>();
    }

    @Override
    public List<AvailabilityResponse> searchAvailability(Http.Request request, @NotNull Long reservableId, @NotNull String reservableType, String deviceId, Long accountId, Long startDate, Long endDate, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<AvailabilityResponse>();
    }

    @Override
    public List<ReservationResponse> searchReservations(Http.Request request, String deviceId, String appKey, Long accountId, Long filterAccountId, Long reservableId, String reservableType, String keyword, Long startDate, Long endDate, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<ReservationResponse>();
    }

    @Override
    public List<TimeSlotResponse> searchSchedule(Http.Request request, @NotNull Long reservableId, @NotNull String reservableType, @NotNull Long startDate, @NotNull Long endDate, String deviceId, Long accountId, Integer timeBucketMins) throws Exception {
        //Do your magic!!!
        return new ArrayList<TimeSlotResponse>();
    }

}
