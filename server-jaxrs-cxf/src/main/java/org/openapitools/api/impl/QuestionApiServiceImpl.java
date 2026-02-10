package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.QuestionResponse;
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
public class QuestionApiServiceImpl implements QuestionApi {
    /**
     * Create Question
     *
     * Create a question and related answers by the given params.
     *
     */
    public QuestionResponse createQuestion(BigDecimal version, Long accountId, String question, String answers, Boolean active, Boolean allocateTickets, Long ticketCount, String tags, String videoURL, Long assetId, String ticketType, Long points) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Question
     *
     * Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.
     *
     */
    public SirqulResponse deleteQuestion(BigDecimal version, Long questionId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Question
     *
     * Get a question by the given id.
     *
     */
    public QuestionResponse getQuestion(BigDecimal version, Long questionId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Questions
     *
     * Search for questions by the given params.
     *
     */
    public List<QuestionResponse> searchQuestions(BigDecimal version, Long accountId, String sortField, Boolean descending, Boolean activeOnly, Integer start, Integer limit, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Question
     *
     * Update a question and related answers.
     *
     */
    public QuestionResponse updateQuestion(BigDecimal version, Long questionId, Long accountId, Long ticketCount, String question, String answers, String tags, String videoURL, Long assetId, Boolean active, Boolean allocateTickets, String ticketType, Long points) {
        // TODO: Implement...

        return null;
    }

}
