package controllers;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleApiControllerImp extends VehicleApiControllerImpInterface {
    @Override
    public Vehicle createVehicle(Http.Request request, @NotNull String vehicle, Vehicle body) throws Exception {
        //Do your magic!!!
        return new Vehicle();
    }

    @Override
    public void deleteVehicle(Http.Request request, Long id) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Vehicle getVehicle(Http.Request request, Long id) throws Exception {
        //Do your magic!!!
        return new Vehicle();
    }

    @Override
    public List<Vehicle> searchVehicle(Http.Request request, @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<Vehicle>();
    }

    @Override
    public Vehicle updateVehicle(Http.Request request, Long id, @NotNull String vehicle, Vehicle body) throws Exception {
        //Do your magic!!!
        return new Vehicle();
    }

}
