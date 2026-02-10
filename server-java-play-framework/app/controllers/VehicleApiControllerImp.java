package controllers;

import java.math.BigDecimal;
import apimodels.Vehicle;

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
public class VehicleApiControllerImp extends VehicleApiControllerImpInterface {
    @Override
    public Vehicle createVehicle(Http.Request request, BigDecimal version, @NotNull String vehicle, Vehicle body) throws Exception {
        //Do your magic!!!
        return new Vehicle();
    }

    @Override
    public void deleteVehicle(Http.Request request, BigDecimal version, Long id) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Vehicle getVehicle(Http.Request request, BigDecimal version, Long id) throws Exception {
        //Do your magic!!!
        return new Vehicle();
    }

    @Override
    public List<Vehicle> searchVehicle(Http.Request request, BigDecimal version, @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<Vehicle>();
    }

    @Override
    public Vehicle updateVehicle(Http.Request request, BigDecimal version, Long id, @NotNull String vehicle, Vehicle body) throws Exception {
        //Do your magic!!!
        return new Vehicle();
    }

}
