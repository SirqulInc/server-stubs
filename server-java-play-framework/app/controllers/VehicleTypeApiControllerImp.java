package controllers;

import java.math.BigDecimal;
import apimodels.VehicleType;

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
public class VehicleTypeApiControllerImp extends VehicleTypeApiControllerImpInterface {
    @Override
    public VehicleType createVehicleType(Http.Request request, BigDecimal version, @NotNull String vehicleType, VehicleType body) throws Exception {
        //Do your magic!!!
        return new VehicleType();
    }

    @Override
    public void deleteVehicleType(Http.Request request, BigDecimal version, Long vehicleTypeId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public VehicleType getVehicleType(Http.Request request, BigDecimal version, Long vehicleTypeId) throws Exception {
        //Do your magic!!!
        return new VehicleType();
    }

    @Override
    public List<VehicleType> searchVehicleTypes(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long retailerId, Long hubId) throws Exception {
        //Do your magic!!!
        return new ArrayList<VehicleType>();
    }

    @Override
    public VehicleType updateVehicleType(Http.Request request, BigDecimal version, Long vehicleTypeId, @NotNull String vehicleType, VehicleType body) throws Exception {
        //Do your magic!!!
        return new VehicleType();
    }

}
