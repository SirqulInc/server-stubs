package org.openapitools.api;

import org.openapitools.api.GameApiService;
import org.openapitools.api.factories.GameApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/game")


@io.swagger.annotations.Api(description = "the game API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class GameApi  {
   private final GameApiService delegate;

   public GameApi(@Context ServletConfig servletContext) {
      GameApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("GameApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (GameApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = GameApiServiceFactory.getGameApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create a Game", notes = "Create a Game.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class)
    })
    public Response createGame(@ApiParam(value = "The logged in user.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The game application key to save the level for.") @QueryParam("appKey")  String appKey,@ApiParam(value = "Title of the game.") @QueryParam("title")  String title,@ApiParam(value = "Description of the game.") @QueryParam("description")  String description,@ApiParam(value = "metaData of the Game.") @QueryParam("metaData")  String metaData,@ApiParam(value = "comma separated String of pack Ids that will associate with the game.") @QueryParam("packIds")  String packIds,@ApiParam(value = "Show more details in response.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createGame(accountId, appKey, title, description, metaData, packIds, includeGameData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/question/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Question", notes = "Create a question and related answers by the given params.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class)
    })
    public Response createQuestion(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the text of the question", required = true) @QueryParam("question") @NotNull  String question,@ApiParam(value = "```json [   {     \"text\": \"1942\",     \"image\": 123,     \"videoURL\": \"http://www.here.com\",     \"correct\": true   },   {     \"text\": \"1943\",     \"image\": 124,     \"videoURL\": \"http://www.there.com\",     \"correct\": false   } ] ``` ", required = true) @QueryParam("answers") @NotNull  String answers,@ApiParam(value = "If true set the question to active. Default to false.", required = true) @QueryParam("active") @NotNull  Boolean active,@ApiParam(value = "If true then scoring will give tickets. Default to false.", required = true) @QueryParam("allocateTickets") @NotNull  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward", required = true) @QueryParam("ticketCount") @NotNull  Long ticketCount,@ApiParam(value = "The tags of the question for search.") @QueryParam("tags")  String tags,@ApiParam(value = "The video link for the question.") @QueryParam("videoURL")  String videoURL,@ApiParam(value = "The asset id of the question.") @QueryParam("assetId")  Long assetId,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createQuestion(accountId, question, answers, active, allocateTickets, ticketCount, tags, videoURL, assetId, ticketType, points, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/word/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Word", notes = "Create a word by the given params.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class)
    })
    public Response createWord(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The text of the word.", required = true) @QueryParam("word") @NotNull  String word,@ApiParam(value = "The definition of the word.", required = true) @QueryParam("definition") @NotNull  String definition,@ApiParam(value = "If true set the word to active. Default to false.", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("active") @NotNull  Boolean active,@ApiParam(value = "If true then scoring will give tickets. Default to false.", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("allocateTickets") @NotNull  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward", required = true, defaultValue = "0") @DefaultValue("0") @QueryParam("ticketCount") @NotNull  Long ticketCount,@ApiParam(value = "The asset id of the word.") @QueryParam("assetId")  Long assetId,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createWord(accountId, word, definition, active, allocateTickets, ticketCount, assetId, ticketType, points, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete a Game", notes = "Delete a game.", response = SirqulResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteGame(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the updating game's id.", required = true) @QueryParam("gameId") @NotNull  Long gameId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteGame(accountId, gameId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/question/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Question", notes = "Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.", response = SirqulResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteQuestion(@ApiParam(value = "the id of the question to delete", required = true) @QueryParam("questionId") @NotNull  Long questionId,@ApiParam(value = "the id of the account that can execute this request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteQuestion(questionId, accountId, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/word/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Word", notes = "Delete a word by the given id. The accountId given needs to be the owner or executive to delete.", response = SirqulResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteWord(@ApiParam(value = "The id of the word to delete.", required = true) @QueryParam("wordId") @NotNull  Long wordId,@ApiParam(value = "The account vor validating permission", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteWord(wordId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get a Game by id", notes = "Get a Game by id.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class)
    })
    public Response getGame(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the updating game's id.", required = true) @QueryParam("gameId") @NotNull  Long gameId,@ApiParam(value = "If true include the game level data, otherwise don't. default is false.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGame(accountId, gameId, includeGameData, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/question/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Question", notes = "Get a question by the given id.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class)
    })
    public Response getQuestion(@ApiParam(value = "the id of the question to get", required = true) @QueryParam("questionId") @NotNull  Long questionId,@ApiParam(value = "the id of the account that can make this request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getQuestion(questionId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/word/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Word", notes = "Get a word by the given id.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class)
    })
    public Response getWord(@ApiParam(value = "The id of the word to get.", required = true) @QueryParam("wordId") @NotNull  Long wordId,@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getWord(wordId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/word/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Words", notes = "Search for words by the given params.", response = WordzWordResponse.class, responseContainer = "List", tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class, responseContainer = "List")
    })
    public Response getWords(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The column to sort the search on", required = true, defaultValue = "id") @DefaultValue("id") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "The order to return the search results", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "Return only active results if set to true.", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The record to begin the return set on.", required = true, defaultValue = "0") @DefaultValue("0") @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The number of records to return.", required = true, defaultValue = "20") @DefaultValue("20") @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "The keyword for searching words with matching definition or word text.") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getWords(accountId, sortField, descending, activeOnly, start, limit, keyword, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search a Game", notes = "Get a list of games for an application, just those the account has permissions to view.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class)
    })
    public Response searchGames(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "Start the result set at some index.", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "Limit the result to some number.", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Match the keyword to the owner name or level name.") @QueryParam("keyword")  String keyword,@ApiParam(value = "The maximum version of the level to return.") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "more details in response") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "more details in response") @QueryParam("includeInactive")  Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchGames(accountId, appKey, start, limit, keyword, appVersion, includeGameData, includeInactive, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/question/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Questions", notes = "Search for questions by the given params.", response = QuestionResponse.class, responseContainer = "List", tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class, responseContainer = "List")
    })
    public Response searchQuestions(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The column to sort the search on", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "The order to return the search results", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "Return only active results if set to true.", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The record to begin the return set on.", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The number of records to return.", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "The keyword for searching questions with matching tags or question text.") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchQuestions(accountId, sortField, descending, activeOnly, start, limit, keyword, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update a Game", notes = "Update a Game", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class)
    })
    public Response updateGame(@ApiParam(value = "The logged in user.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the updating game's id") @QueryParam("gameId")  Long gameId,@ApiParam(value = "The game application key to save the level for.") @QueryParam("appKey")  String appKey,@ApiParam(value = "Title of the Game.") @QueryParam("title")  String title,@ApiParam(value = "Description of the Game.") @QueryParam("description")  String description,@ApiParam(value = "metaData of the Game.") @QueryParam("metaData")  String metaData,@ApiParam(value = "comma separated String of pack Ids that will associate with the game.") @QueryParam("packIds")  String packIds,@ApiParam(value = "show more details in response.") @QueryParam("includeGameData")  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateGame(accountId, gameId, appKey, title, description, metaData, packIds, includeGameData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/question/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Question", notes = "Update a question and related answers.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class)
    })
    public Response updateQuestion(@ApiParam(value = "The id of the question to update.", required = true) @QueryParam("questionId") @NotNull  Long questionId,@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The number of tickets to reward", required = true) @QueryParam("ticketCount") @NotNull  Long ticketCount,@ApiParam(value = "The text of the question.") @QueryParam("question")  String question,@ApiParam(value = "The json representations of answers for the question.") @QueryParam("answers")  String answers,@ApiParam(value = "The tags of the question for search.") @QueryParam("tags")  String tags,@ApiParam(value = "The video link for the question.") @QueryParam("videoURL")  String videoURL,@ApiParam(value = "The asset id of the question.") @QueryParam("assetId")  Long assetId,@ApiParam(value = "If true set the question to active.") @QueryParam("active")  Boolean active,@ApiParam(value = "If true then scoring will give tickets.") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateQuestion(questionId, accountId, ticketCount, question, answers, tags, videoURL, assetId, active, allocateTickets, ticketType, points, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/word/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Word", notes = "Update a word by the given params.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class)
    })
    public Response updateWord(@ApiParam(value = "The id of the word to update.", required = true) @QueryParam("wordId") @NotNull  Long wordId,@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The number of tickets to reward", required = true, defaultValue = "0") @DefaultValue("0") @QueryParam("ticketCount") @NotNull  Long ticketCount,@ApiParam(value = "The text for the word") @QueryParam("wordText")  String wordText,@ApiParam(value = "The definition of the word.") @QueryParam("definition")  String definition,@ApiParam(value = "The asset id of the word.") @QueryParam("assetId")  Long assetId,@ApiParam(value = "If true set the word to active.") @QueryParam("active")  Boolean active,@ApiParam(value = "If true then scoring will give tickets.") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateWord(wordId, accountId, ticketCount, wordText, definition, assetId, active, allocateTickets, ticketType, points, securityContext);
    }
}
