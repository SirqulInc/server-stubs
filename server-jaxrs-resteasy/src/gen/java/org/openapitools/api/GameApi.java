package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.GameApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.GameResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/game")


@io.swagger.annotations.Api(description = "the game API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameApi  {

    @Inject GameApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create a Game", notes = "Create a Game.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response createGame( @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("packIds") String packIds, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createGame(accountId,appKey,title,description,metaData,packIds,includeGameData,securityContext);
    }
    @POST
    @Path("/question/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Question", notes = "Create a question and related answers by the given params.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response createQuestion( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("question") String question, @NotNull @QueryParam("answers") String answers, @NotNull @QueryParam("active") Boolean active, @NotNull @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("tags") String tags, @QueryParam("videoURL") String videoURL, @QueryParam("assetId") Long assetId, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createQuestion(accountId,question,answers,active,allocateTickets,ticketCount,tags,videoURL,assetId,ticketType,points,securityContext);
    }
    @POST
    @Path("/word/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Word", notes = "Create a word by the given params.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response createWord( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("word") String word, @NotNull @QueryParam("definition") String definition, @NotNull @DefaultValue("false") @QueryParam("active") Boolean active, @NotNull @DefaultValue("false") @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @DefaultValue("0") @QueryParam("ticketCount") Long ticketCount, @QueryParam("assetId") Long assetId, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createWord(accountId,word,definition,active,allocateTickets,ticketCount,assetId,ticketType,points,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete a Game", notes = "Delete a game.", response = SirqulResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteGame( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("gameId") Long gameId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteGame(accountId,gameId,securityContext);
    }
    @POST
    @Path("/question/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Question", notes = "Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.", response = SirqulResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteQuestion( @NotNull @QueryParam("questionId") Long questionId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteQuestion(questionId,accountId,securityContext);
    }
    @DELETE
    @Path("/word/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Word", notes = "Delete a word by the given id. The accountId given needs to be the owner or executive to delete.", response = SirqulResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteWord( @NotNull @QueryParam("wordId") Long wordId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteWord(wordId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get a Game by id", notes = "Get a Game by id.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response getGame( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("gameId") Long gameId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGame(accountId,gameId,includeGameData,securityContext);
    }
    @GET
    @Path("/question/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Question", notes = "Get a question by the given id.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response getQuestion( @NotNull @QueryParam("questionId") Long questionId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getQuestion(questionId,accountId,securityContext);
    }
    @GET
    @Path("/word/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Word", notes = "Get a word by the given id.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response getWord( @NotNull @QueryParam("wordId") Long wordId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getWord(wordId,accountId,securityContext);
    }
    @GET
    @Path("/word/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Words", notes = "Search for words by the given params.", response = WordzWordResponse.class, responseContainer = "List", tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class, responseContainer = "List") })
    public Response getWords( @NotNull @QueryParam("accountId") Long accountId, @NotNull @DefaultValue("id") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getWords(accountId,sortField,descending,activeOnly,start,limit,keyword,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search a Game", notes = "Get a list of games for an application, just those the account has permissions to view.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response searchGames( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword, @QueryParam("appVersion") String appVersion, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeInactive") Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchGames(accountId,appKey,start,limit,keyword,appVersion,includeGameData,includeInactive,securityContext);
    }
    @GET
    @Path("/question/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Questions", notes = "Search for questions by the given params.", response = QuestionResponse.class, responseContainer = "List", tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class, responseContainer = "List") })
    public Response searchQuestions( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchQuestions(accountId,sortField,descending,activeOnly,start,limit,keyword,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update a Game", notes = "Update a Game", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response updateGame( @QueryParam("accountId") Long accountId, @QueryParam("gameId") Long gameId, @QueryParam("appKey") String appKey, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("packIds") String packIds, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateGame(accountId,gameId,appKey,title,description,metaData,packIds,includeGameData,securityContext);
    }
    @POST
    @Path("/question/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Question", notes = "Update a question and related answers.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response updateQuestion( @NotNull @QueryParam("questionId") Long questionId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("question") String question, @QueryParam("answers") String answers, @QueryParam("tags") String tags, @QueryParam("videoURL") String videoURL, @QueryParam("assetId") Long assetId, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateQuestion(questionId,accountId,ticketCount,question,answers,tags,videoURL,assetId,active,allocateTickets,ticketType,points,securityContext);
    }
    @POST
    @Path("/word/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Word", notes = "Update a word by the given params.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response updateWord( @NotNull @QueryParam("wordId") Long wordId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @DefaultValue("0") @QueryParam("ticketCount") Long ticketCount, @QueryParam("wordText") String wordText, @QueryParam("definition") String definition, @QueryParam("assetId") Long assetId, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateWord(wordId,accountId,ticketCount,wordText,definition,assetId,active,allocateTickets,ticketType,points,securityContext);
    }
}
