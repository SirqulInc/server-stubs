package controllers;

import java.math.BigDecimal;
import apimodels.ImportStatuses;
import java.util.Map;
import apimodels.Orders;
import apimodels.ShipmentOrder;

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
public class OptimizeApiControllerImp extends OptimizeApiControllerImpInterface {
    @Override
    public Map<String, ShipmentOrder> getOptimizationResult(Http.Request request, BigDecimal version, String batchID, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        //Do your magic!!!
        return new HashMap<String, ShipmentOrder>();
    }

    @Override
    public ImportStatuses requestOptimization(Http.Request request, BigDecimal version, Orders body) throws Exception {
        //Do your magic!!!
        return new ImportStatuses();
    }

}
