package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.MissionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class AdsApiService {
    public abstract Response adsFind( @NotNull String appKey, @NotNull Boolean randomize, @NotNull Boolean targetedAdsOnly,String type,Long accountId,String appVersion,Double latitude,Double longitude,String device,Long deviceIdentifier,String deviceVersion,Integer start,Integer limit,Boolean includeAudiences,Boolean allocatesTickets,String missionIds,SecurityContext securityContext) throws NotFoundException;
}
