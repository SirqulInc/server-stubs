package controllers;

import java.math.BigDecimal;
import apimodels.EmployeeResponse;
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
public class EmployeeApiControllerImp extends EmployeeApiControllerImpInterface {
    @Override
    public EmployeeResponse assignEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull Long employeeAccountId, String role) throws Exception {
        //Do your magic!!!
        return new EmployeeResponse();
    }

    @Override
    public SirqulResponse assignToLocationEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long retailerLocationId, Long employeeAccountId, Boolean assign) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public EmployeeResponse createEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull String username, @NotNull String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String aboutUs, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) throws Exception {
        //Do your magic!!!
        return new EmployeeResponse();
    }

    @Override
    public SirqulResponse deleteEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public EmployeeResponse getEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId, String settingsAppKey) throws Exception {
        //Do your magic!!!
        return new EmployeeResponse();
    }

    @Override
    public List<EmployeeResponse> searchEmployees(Http.Request request, BigDecimal version, @NotNull Long accountId, String role, Long retailerId, Long retailerLocationId, String q, String keyword, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean activeOnly, Boolean managedOnly, String settingsAppKey, String categoryIds, String query) throws Exception {
        //Do your magic!!!
        return new ArrayList<EmployeeResponse>();
    }

    @Override
    public EmployeeResponse unassignEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId) throws Exception {
        //Do your magic!!!
        return new EmployeeResponse();
    }

    @Override
    public EmployeeResponse updateEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId, Long managerAccountId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, Boolean active, String password, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) throws Exception {
        //Do your magic!!!
        return new EmployeeResponse();
    }

}
