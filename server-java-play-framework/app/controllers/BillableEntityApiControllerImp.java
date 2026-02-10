package controllers;

import java.math.BigDecimal;
import apimodels.BillableEntityResponse;
import apimodels.SirqulResponse;

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
public class BillableEntityApiControllerImp extends BillableEntityApiControllerImpInterface {
    @Override
    public BillableEntityResponse createBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) throws Exception {
        //Do your magic!!!
        return new BillableEntityResponse();
    }

    @Override
    public SirqulResponse deleteBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public BillableEntityResponse getBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId, Boolean includeCounts, Boolean includePayments) throws Exception {
        //Do your magic!!!
        return new BillableEntityResponse();
    }

    @Override
    public BillableEntityResponse updateBillableEntity(Http.Request request, BigDecimal version, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String businessPhone, String businessPhoneExt, String authorizeNetApiKey, String authorizeNetTransactionKey) throws Exception {
        //Do your magic!!!
        return new BillableEntityResponse();
    }

}
