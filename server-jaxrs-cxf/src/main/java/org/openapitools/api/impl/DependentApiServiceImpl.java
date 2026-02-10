package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Account;
import java.math.BigDecimal;
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
public class DependentApiServiceImpl implements DependentApi {
    /**
     * Create Dependent
     *
     * Create dependent of the account
     *
     */
    public SirqulResponse create(BigDecimal version, Long accountId, Account body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get dependent list of an account
     *
     * Get the dependent list of an account
     *
     */
    public SirqulResponse getDependents(BigDecimal version, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Dependent
     *
     * Delete the Dependent
     *
     */
    public void removeDependent(BigDecimal version, Long accountId, Long dependentId) {
        // TODO: Implement...

        
    }

}
