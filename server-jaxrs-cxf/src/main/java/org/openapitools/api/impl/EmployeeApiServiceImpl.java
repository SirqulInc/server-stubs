package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.SirqulResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class EmployeeApiServiceImpl implements EmployeeApi {
    /**
     * Assign Employee
     *
     * Assign An existing account to be an employee
     *
     */
    public EmployeeResponse assignEmployee(BigDecimal version, Long accountId, Long managerAccountId, Long employeeAccountId, String role) {
        // TODO: Implement...

        return null;
    }

    /**
     * Assign Employee to Location
     *
     * Assign or unassign the account to a retailer location.
     *
     */
    public SirqulResponse assignToLocationEmployee(BigDecimal version, Long accountId, Long retailerLocationId, Long employeeAccountId, Boolean assign) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Employee
     *
     * Create a new account record with the provided information.
     *
     */
    public EmployeeResponse createEmployee(BigDecimal version, Long accountId, Long managerAccountId, String username, String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String aboutUs, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Employee
     *
     * Set the deleted date field which marks the record as deleted.
     *
     */
    public SirqulResponse deleteEmployee(BigDecimal version, Long accountId, Long employeeAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Employee
     *
     * Get the account record for the account id provided.
     *
     */
    public EmployeeResponse getEmployee(BigDecimal version, Long accountId, Long employeeAccountId, String settingsAppKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Employees
     *
     * Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.
     *
     */
    public List<EmployeeResponse> searchEmployees(BigDecimal version, Long accountId, String role, Long retailerId, Long retailerLocationId, String q, String keyword, String sortField, Boolean descending, Integer i, Integer start, Integer l, Integer limit, Boolean activeOnly, Boolean managedOnly, String settingsAppKey, String categoryIds, String query) {
        // TODO: Implement...

        return null;
    }

    /**
     * Unassign Employee
     *
     * Unassign An existing account to be an employee
     *
     */
    public EmployeeResponse unassignEmployee(BigDecimal version, Long accountId, Long employeeAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Employee
     *
     * Update the account record with the provided information.
     *
     */
    public EmployeeResponse updateEmployee(BigDecimal version, Long accountId, Long employeeAccountId, Long managerAccountId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, Long assetId, String gender, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, String role, Boolean active, String password, String retailerLocationIds, String settingsAppKey, String appBlob, String assignedDeviceId) {
        // TODO: Implement...

        return null;
    }

}
