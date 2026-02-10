package controllers;

import java.math.BigDecimal;
import apimodels.EmployeeResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class EmployeeApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result assignEmployeeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull Long employeeAccountId, String role) throws Exception {
        EmployeeResponse obj = assignEmployee(request, version, accountId, managerAccountId, employeeAccountId, role);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmployeeResponse assignEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull Long employeeAccountId, String role) throws Exception;

    public Result assignToLocationEmployeeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long retailerLocationId, Long employeeAccountId, Boolean assign) throws Exception {
        SirqulResponse obj = assignToLocationEmployee(request, version, accountId, retailerLocationId, employeeAccountId, assign);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse assignToLocationEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long retailerLocationId, Long employeeAccountId, Boolean assign) throws Exception;

    public Result createEmployeeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull String username, @NotNull String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String aboutUs, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) throws Exception {
        EmployeeResponse obj = createEmployee(request, version, accountId, managerAccountId, username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, aboutUs, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmployeeResponse createEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long managerAccountId, @NotNull String username, @NotNull String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String aboutUs, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) throws Exception;

    public Result deleteEmployeeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId) throws Exception {
        SirqulResponse obj = deleteEmployee(request, version, accountId, employeeAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId) throws Exception;

    public Result getEmployeeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId, String settingsAppKey) throws Exception {
        EmployeeResponse obj = getEmployee(request, version, accountId, employeeAccountId, settingsAppKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmployeeResponse getEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId, String settingsAppKey) throws Exception;

    public Result searchEmployeesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String role, Long retailerId, Long retailerLocationId, String q, String keyword, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean activeOnly, Boolean managedOnly, String settingsAppKey, String categoryIds, String query) throws Exception {
        List<EmployeeResponse> obj = searchEmployees(request, version, accountId, role, retailerId, retailerLocationId, q, keyword, sortField, descending, i, start, l, limit, activeOnly, managedOnly, settingsAppKey, categoryIds, query);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (EmployeeResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<EmployeeResponse> searchEmployees(Http.Request request, BigDecimal version, @NotNull Long accountId, String role, Long retailerId, Long retailerLocationId, String q, String keyword, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean activeOnly, Boolean managedOnly, String settingsAppKey, String categoryIds, String query) throws Exception;

    public Result unassignEmployeeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId) throws Exception {
        EmployeeResponse obj = unassignEmployee(request, version, accountId, employeeAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmployeeResponse unassignEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId) throws Exception;

    public Result updateEmployeeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId, Long managerAccountId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, Boolean active, String password, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) throws Exception {
        EmployeeResponse obj = updateEmployee(request, version, accountId, employeeAccountId, managerAccountId, name, prefixName, firstName, middleName, lastName, suffixName, title, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, active, password, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmployeeResponse updateEmployee(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long employeeAccountId, Long managerAccountId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, Boolean active, String password, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) throws Exception;

}
