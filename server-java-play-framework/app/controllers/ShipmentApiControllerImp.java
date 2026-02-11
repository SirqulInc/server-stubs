package controllers;

import java.util.Map;
import apimodels.Shipment;

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
public class ShipmentApiControllerImp extends ShipmentApiControllerImpInterface {
    @Override
    public void cancelShipment(Http.Request request, Long id) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Shipment createShipment(Http.Request request, Shipment body) throws Exception {
        //Do your magic!!!
        return new Shipment();
    }

    @Override
    public void deleteShipment(Http.Request request, Long id) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Shipment getShipment(Http.Request request, Long id) throws Exception {
        //Do your magic!!!
        return new Shipment();
    }

    @Override
    public List<Shipment> searchShipments(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long ownerId, Long riderId, Long routeId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Shipment>();
    }

    @Override
    public Shipment updateShipment(Http.Request request, Long id, Shipment body) throws Exception {
        //Do your magic!!!
        return new Shipment();
    }

    @Override
    public void updateShipmentStatus(Http.Request request, Long id, Map<String, Boolean> body) throws Exception {
        //Do your magic!!!
    }

}
