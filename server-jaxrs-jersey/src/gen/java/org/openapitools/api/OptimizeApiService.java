package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ImportStatuses;
import java.util.Map;
import org.openapitools.model.Orders;
import org.openapitools.model.ShipmentOrder;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class OptimizeApiService {
    public abstract Response getOptimizationResult(String batchID, @NotNull Integer start, @NotNull Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response requestOptimization(Orders body,SecurityContext securityContext) throws NotFoundException;
}
