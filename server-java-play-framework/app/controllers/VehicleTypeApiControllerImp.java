package controllers;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleTypeApiControllerImp extends VehicleTypeApiControllerImpInterface {
    @Override
    public VehicleType createVehicleType(Http.Request request, @NotNull String vehicleType, VehicleType body) throws Exception {
        //Do your magic!!!
        return new VehicleType();
    }

    @Override
    public void deleteVehicleType(Http.Request request, Long vehicleTypeId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public VehicleType getVehicleType(Http.Request request, Long vehicleTypeId) throws Exception {
        //Do your magic!!!
        return new VehicleType();
    }

    @Override
    public List<VehicleType> searchVehicleTypes(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long retailerId, Long hubId) throws Exception {
        //Do your magic!!!
        return new ArrayList<VehicleType>();
    }

    @Override
    public VehicleType updateVehicleType(Http.Request request, Long vehicleTypeId, @NotNull String vehicleType, VehicleType body) throws Exception {
        //Do your magic!!!
        return new VehicleType();
    }

}
