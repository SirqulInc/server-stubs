package controllers;

import java.math.BigDecimal;
import apimodels.ShipmentBatch;
import apimodels.ShipmentImportStatus;

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
public class ShipmentBatchApiControllerImp extends ShipmentBatchApiControllerImpInterface {
    @Override
    public ShipmentBatch createShipmentBatch(Http.Request request, BigDecimal version, ShipmentBatch body) throws Exception {
        //Do your magic!!!
        return new ShipmentBatch();
    }

    @Override
    public void deleteShipmentBatch(Http.Request request, BigDecimal version, Long batchId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public ShipmentBatch getShipmentBatch(Http.Request request, BigDecimal version, Long batchId) throws Exception {
        //Do your magic!!!
        return new ShipmentBatch();
    }

    @Override
    public List<ShipmentImportStatus> getShipmentBatchStatus(Http.Request request, BigDecimal version, Long batchId, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, Boolean valid, Boolean started, Boolean completed, Boolean hasShipment, Boolean hasRoute, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<ShipmentImportStatus>();
    }

    @Override
    public List<ShipmentBatch> searchShipmentBatch(Http.Request request, BigDecimal version, @NotNull Long hubId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<ShipmentBatch>();
    }

}
