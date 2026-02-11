package org.openapitools.api;

import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/game/question")
@Api(value = "/", description = "")
public interface QuestionApi  {

    /**
     * Create Question
     *
     * Create a question and related answers by the given params.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Question", tags={ "Question" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public QuestionResponse createQuestion(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("question") @NotNull String question, @QueryParam("answers") @NotNull String answers, @QueryParam("active") @NotNull Boolean active, @QueryParam("allocateTickets") @NotNull Boolean allocateTickets, @QueryParam("ticketCount") @NotNull Long ticketCount, @QueryParam("tags") String tags, @QueryParam("videoURL") String videoURL, @QueryParam("assetId") Long assetId, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points);

    /**
     * Delete Question
     *
     * Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Question", tags={ "Question" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteQuestion(@QueryParam("questionId") @NotNull Long questionId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Question
     *
     * Get a question by the given id.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Question", tags={ "Question" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public QuestionResponse getQuestion(@QueryParam("questionId") @NotNull Long questionId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Search Questions
     *
     * Search for questions by the given params.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Questions", tags={ "Question" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class, responseContainer = "List") })
    public List<QuestionResponse> searchQuestions(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("keyword") String keyword);

    /**
     * Update Question
     *
     * Update a question and related answers.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Question", tags={ "Question" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public QuestionResponse updateQuestion(@QueryParam("questionId") @NotNull Long questionId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("ticketCount") @NotNull Long ticketCount, @QueryParam("question") String question, @QueryParam("answers") String answers, @QueryParam("tags") String tags, @QueryParam("videoURL") String videoURL, @QueryParam("assetId") Long assetId, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points);
}
