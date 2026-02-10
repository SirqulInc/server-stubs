package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CargoType;

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
public class CargoTypeApiServiceImpl implements CargoTypeApi {
    /**
     * Create Cargo Type
     *
     * Create new cargo type
     *
     */
    public CargoType createCargoType(BigDecimal version, CargoType body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Cargo Type
     *
     * Delete a type of cargo
     *
     */
    public void deleteCargoType(BigDecimal version, Long cargoTypeId) {
        // TODO: Implement...

        
    }

    /**
     * Get Cargo Type
     *
     * Get an existing cargo type
     *
     */
    public CargoType getCargoType(BigDecimal version, Long cargoTypeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Cargo Type
     *
     * Search for types of cargo
     *
     */
    public List<CargoType> searchCargoTypes(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Long retailerId, Long hubId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Cargo Type
     *
     * Update an existing cargo type
     *
     */
    public CargoType updateCargoType(BigDecimal version, Long cargoTypeId, CargoType body) {
        // TODO: Implement...

        return null;
    }

}
