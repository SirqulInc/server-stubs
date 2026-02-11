package controllers;

import apimodels.CargoType;

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
public class CargoTypeApiControllerImp extends CargoTypeApiControllerImpInterface {
    @Override
    public CargoType createCargoType(Http.Request request, CargoType body) throws Exception {
        //Do your magic!!!
        return new CargoType();
    }

    @Override
    public void deleteCargoType(Http.Request request, Long cargoTypeId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public CargoType getCargoType(Http.Request request, Long cargoTypeId) throws Exception {
        //Do your magic!!!
        return new CargoType();
    }

    @Override
    public List<CargoType> searchCargoTypes(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long retailerId, Long hubId) throws Exception {
        //Do your magic!!!
        return new ArrayList<CargoType>();
    }

    @Override
    public CargoType updateCargoType(Http.Request request, Long cargoTypeId, CargoType body) throws Exception {
        //Do your magic!!!
        return new CargoType();
    }

}
