package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.Program;

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
public class ProgramApiServiceImpl implements ProgramApi {
    /**
     * Create Program
     *
     * Create a new program
     *
     */
    public Program createProgram(BigDecimal version, Program body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Program
     *
     * Delete an existing program
     *
     */
    public void deleteProgram(BigDecimal version, Long id) {
        // TODO: Implement...

        
    }

    /**
     * Get Program
     *
     * Get an existing program
     *
     */
    public Program getProgram(BigDecimal version, Long id) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Program
     *
     * Update an existing program
     *
     */
    public Program postProgram(BigDecimal version, Long id, Program body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Program
     *
     * Update an existing program
     *
     */
    public Program putProgram(BigDecimal version, Long id, Program body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Programs
     *
     * Search for programs
     *
     */
    public List<Program> searchPrograms(BigDecimal version, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, String keyword) {
        // TODO: Implement...

        return null;
    }

}
