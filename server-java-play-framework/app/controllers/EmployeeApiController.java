package controllers;

import java.math.BigDecimal;
import apimodels.EmployeeResponse;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EmployeeApiController extends Controller {
    private final EmployeeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private EmployeeApiController(Config configuration, EmployeeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result assignEmployee(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemanagerAccountId = request.getQueryString("managerAccountId");
        Long managerAccountId;
        if (valuemanagerAccountId != null) {
            managerAccountId = Long.parseLong(valuemanagerAccountId);
        } else {
            throw new IllegalArgumentException("'managerAccountId' parameter is required");
        }
        String valueemployeeAccountId = request.getQueryString("employeeAccountId");
        Long employeeAccountId;
        if (valueemployeeAccountId != null) {
            employeeAccountId = Long.parseLong(valueemployeeAccountId);
        } else {
            throw new IllegalArgumentException("'employeeAccountId' parameter is required");
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        return imp.assignEmployeeHttp(request, version, accountId, managerAccountId, employeeAccountId, role);
    }

    @ApiAction
    public Result assignToLocationEmployee(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueemployeeAccountId = request.getQueryString("employeeAccountId");
        Long employeeAccountId;
        if (valueemployeeAccountId != null) {
            employeeAccountId = Long.parseLong(valueemployeeAccountId);
        } else {
            employeeAccountId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            throw new IllegalArgumentException("'retailerLocationId' parameter is required");
        }
        String valueassign = request.getQueryString("assign");
        Boolean assign;
        if (valueassign != null) {
            assign = Boolean.valueOf(valueassign);
        } else {
            assign = true;
        }
        return imp.assignToLocationEmployeeHttp(request, version, accountId, retailerLocationId, employeeAccountId, assign);
    }

    @ApiAction
    public Result createEmployee(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuemanagerAccountId = request.getQueryString("managerAccountId");
        Long managerAccountId;
        if (valuemanagerAccountId != null) {
            managerAccountId = Long.parseLong(valuemanagerAccountId);
        } else {
            throw new IllegalArgumentException("'managerAccountId' parameter is required");
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valueprefixName = request.getQueryString("prefixName");
        String prefixName;
        if (valueprefixName != null) {
            prefixName = valueprefixName;
        } else {
            prefixName = null;
        }
        String valuefirstName = request.getQueryString("firstName");
        String firstName;
        if (valuefirstName != null) {
            firstName = valuefirstName;
        } else {
            firstName = null;
        }
        String valuemiddleName = request.getQueryString("middleName");
        String middleName;
        if (valuemiddleName != null) {
            middleName = valuemiddleName;
        } else {
            middleName = null;
        }
        String valuelastName = request.getQueryString("lastName");
        String lastName;
        if (valuelastName != null) {
            lastName = valuelastName;
        } else {
            lastName = null;
        }
        String valuesuffixName = request.getQueryString("suffixName");
        String suffixName;
        if (valuesuffixName != null) {
            suffixName = valuesuffixName;
        } else {
            suffixName = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valueaboutUs = request.getQueryString("aboutUs");
        String aboutUs;
        if (valueaboutUs != null) {
            aboutUs = valueaboutUs;
        } else {
            aboutUs = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valuehomePhone = request.getQueryString("homePhone");
        String homePhone;
        if (valuehomePhone != null) {
            homePhone = valuehomePhone;
        } else {
            homePhone = null;
        }
        String valuecellPhone = request.getQueryString("cellPhone");
        String cellPhone;
        if (valuecellPhone != null) {
            cellPhone = valuecellPhone;
        } else {
            cellPhone = null;
        }
        String valuecellPhoneCarrier = request.getQueryString("cellPhoneCarrier");
        String cellPhoneCarrier;
        if (valuecellPhoneCarrier != null) {
            cellPhoneCarrier = valuecellPhoneCarrier;
        } else {
            cellPhoneCarrier = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valueemailAddress = request.getQueryString("emailAddress");
        String emailAddress;
        if (valueemailAddress != null) {
            emailAddress = valueemailAddress;
        } else {
            emailAddress = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuezipcode = request.getQueryString("zipcode");
        String zipcode;
        if (valuezipcode != null) {
            zipcode = valuezipcode;
        } else {
            zipcode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valuesettingsAppKey = request.getQueryString("settingsAppKey");
        String settingsAppKey;
        if (valuesettingsAppKey != null) {
            settingsAppKey = valuesettingsAppKey;
        } else {
            settingsAppKey = null;
        }
        String valueappBlob = request.getQueryString("appBlob");
        String appBlob;
        if (valueappBlob != null) {
            appBlob = valueappBlob;
        } else {
            appBlob = null;
        }
        String valueassignedDeviceId = request.getQueryString("assignedDeviceId");
        String assignedDeviceId;
        if (valueassignedDeviceId != null) {
            assignedDeviceId = valueassignedDeviceId;
        } else {
            assignedDeviceId = null;
        }
        return imp.createEmployeeHttp(request, version, accountId, managerAccountId, username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, aboutUs, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId);
    }

    @ApiAction
    public Result deleteEmployee(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueemployeeAccountId = request.getQueryString("employeeAccountId");
        Long employeeAccountId;
        if (valueemployeeAccountId != null) {
            employeeAccountId = Long.parseLong(valueemployeeAccountId);
        } else {
            throw new IllegalArgumentException("'employeeAccountId' parameter is required");
        }
        return imp.deleteEmployeeHttp(request, version, accountId, employeeAccountId);
    }

    @ApiAction
    public Result getEmployee(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueemployeeAccountId = request.getQueryString("employeeAccountId");
        Long employeeAccountId;
        if (valueemployeeAccountId != null) {
            employeeAccountId = Long.parseLong(valueemployeeAccountId);
        } else {
            throw new IllegalArgumentException("'employeeAccountId' parameter is required");
        }
        String valuesettingsAppKey = request.getQueryString("settingsAppKey");
        String settingsAppKey;
        if (valuesettingsAppKey != null) {
            settingsAppKey = valuesettingsAppKey;
        } else {
            settingsAppKey = null;
        }
        return imp.getEmployeeHttp(request, version, accountId, employeeAccountId, settingsAppKey);
    }

    @ApiAction
    public Result searchEmployees(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = false;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = true;
        }
        String valuemanagedOnly = request.getQueryString("managedOnly");
        Boolean managedOnly;
        if (valuemanagedOnly != null) {
            managedOnly = Boolean.valueOf(valuemanagedOnly);
        } else {
            managedOnly = null;
        }
        String valuesettingsAppKey = request.getQueryString("settingsAppKey");
        String settingsAppKey;
        if (valuesettingsAppKey != null) {
            settingsAppKey = valuesettingsAppKey;
        } else {
            settingsAppKey = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            query = null;
        }
        return imp.searchEmployeesHttp(request, version, accountId, role, retailerId, retailerLocationId, q, keyword, sortField, descending, i, start, l, limit, activeOnly, managedOnly, settingsAppKey, categoryIds, query);
    }

    @ApiAction
    public Result unassignEmployee(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueemployeeAccountId = request.getQueryString("employeeAccountId");
        Long employeeAccountId;
        if (valueemployeeAccountId != null) {
            employeeAccountId = Long.parseLong(valueemployeeAccountId);
        } else {
            throw new IllegalArgumentException("'employeeAccountId' parameter is required");
        }
        return imp.unassignEmployeeHttp(request, version, accountId, employeeAccountId);
    }

    @ApiAction
    public Result updateEmployee(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueemployeeAccountId = request.getQueryString("employeeAccountId");
        Long employeeAccountId;
        if (valueemployeeAccountId != null) {
            employeeAccountId = Long.parseLong(valueemployeeAccountId);
        } else {
            throw new IllegalArgumentException("'employeeAccountId' parameter is required");
        }
        String valuemanagerAccountId = request.getQueryString("managerAccountId");
        Long managerAccountId;
        if (valuemanagerAccountId != null) {
            managerAccountId = Long.parseLong(valuemanagerAccountId);
        } else {
            managerAccountId = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valueprefixName = request.getQueryString("prefixName");
        String prefixName;
        if (valueprefixName != null) {
            prefixName = valueprefixName;
        } else {
            prefixName = null;
        }
        String valuefirstName = request.getQueryString("firstName");
        String firstName;
        if (valuefirstName != null) {
            firstName = valuefirstName;
        } else {
            firstName = null;
        }
        String valuemiddleName = request.getQueryString("middleName");
        String middleName;
        if (valuemiddleName != null) {
            middleName = valuemiddleName;
        } else {
            middleName = null;
        }
        String valuelastName = request.getQueryString("lastName");
        String lastName;
        if (valuelastName != null) {
            lastName = valuelastName;
        } else {
            lastName = null;
        }
        String valuesuffixName = request.getQueryString("suffixName");
        String suffixName;
        if (valuesuffixName != null) {
            suffixName = valuesuffixName;
        } else {
            suffixName = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valuehomePhone = request.getQueryString("homePhone");
        String homePhone;
        if (valuehomePhone != null) {
            homePhone = valuehomePhone;
        } else {
            homePhone = null;
        }
        String valuecellPhone = request.getQueryString("cellPhone");
        String cellPhone;
        if (valuecellPhone != null) {
            cellPhone = valuecellPhone;
        } else {
            cellPhone = null;
        }
        String valuecellPhoneCarrier = request.getQueryString("cellPhoneCarrier");
        String cellPhoneCarrier;
        if (valuecellPhoneCarrier != null) {
            cellPhoneCarrier = valuecellPhoneCarrier;
        } else {
            cellPhoneCarrier = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valueemailAddress = request.getQueryString("emailAddress");
        String emailAddress;
        if (valueemailAddress != null) {
            emailAddress = valueemailAddress;
        } else {
            emailAddress = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuezipcode = request.getQueryString("zipcode");
        String zipcode;
        if (valuezipcode != null) {
            zipcode = valuezipcode;
        } else {
            zipcode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            password = null;
        }
        String valueretailerLocationIds = request.getQueryString("retailerLocationIds");
        String retailerLocationIds;
        if (valueretailerLocationIds != null) {
            retailerLocationIds = valueretailerLocationIds;
        } else {
            retailerLocationIds = null;
        }
        String valuesettingsAppKey = request.getQueryString("settingsAppKey");
        String settingsAppKey;
        if (valuesettingsAppKey != null) {
            settingsAppKey = valuesettingsAppKey;
        } else {
            settingsAppKey = null;
        }
        String valueappBlob = request.getQueryString("appBlob");
        String appBlob;
        if (valueappBlob != null) {
            appBlob = valueappBlob;
        } else {
            appBlob = null;
        }
        String valueassignedDeviceId = request.getQueryString("assignedDeviceId");
        String assignedDeviceId;
        if (valueassignedDeviceId != null) {
            assignedDeviceId = valueassignedDeviceId;
        } else {
            assignedDeviceId = null;
        }
        return imp.updateEmployeeHttp(request, version, accountId, employeeAccountId, managerAccountId, name, prefixName, firstName, middleName, lastName, suffixName, title, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, active, password, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId);
    }

}
