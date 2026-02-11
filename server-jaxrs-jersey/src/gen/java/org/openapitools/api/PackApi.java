package org.openapitools.api;

import org.openapitools.api.PackApiService;
import org.openapitools.api.factories.PackApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PackResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/pack")


@io.swagger.annotations.Api(description = "the pack API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PackApi  {
   private final PackApiService delegate;

   public PackApi(@Context ServletConfig servletContext) {
      PackApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PackApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PackApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = PackApiServiceFactory.getPackApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Pack", notes = "Create a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class)
    })
    public Response createPack(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The title of the pack", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "The order of the pack", required = true) @QueryParam("packOrder") @NotNull  Long packOrder,@ApiParam(value = "The price in tickets to purchase this pack", required = true) @QueryParam("price") @NotNull  Integer price,@ApiParam(value = "The scoring is highest is best", required = true) @QueryParam("highest") @NotNull  Boolean highest,@ApiParam(value = "Flag to indicate owner should receive tickets for completed packs", required = true) @QueryParam("allocateTickets") @NotNull  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward", required = true) @QueryParam("ticketCount") @NotNull  Long ticketCount,@ApiParam(value = "The description of the pack") @QueryParam("description")  String description,@ApiParam(value = "The tags for searching the pack, comma separated") @QueryParam("searchTags")  String searchTags,@ApiParam(value = "Activate/deactivate the pack") @QueryParam("active")  Boolean active,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "The type of the pack", allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT") @QueryParam("packType")  String packType,@ApiParam(value = "The type of game sequence of the pack", allowableValues="FIRST_AVAILABLE, ALL_AVAILABLE") @QueryParam("sequenceType")  String sequenceType,@ApiParam(value = "The background asset id of the pack") @QueryParam("backgroundId")  Long backgroundId,@ApiParam(value = "The image asset id of the pack") @QueryParam("imageId")  Long imageId,@ApiParam(value = "The date/time to start the pack, send 0 to unset") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The date/time to end the pack, send 0 to unset") @QueryParam("endDate")  Long endDate,@ApiParam(value = "") @QueryParam("authorOverride")  String authorOverride,@ApiParam(value = "the type of ticket required to purchase this pack") @QueryParam("priceType")  String priceType,@ApiParam(value = "the game level ids to include in the pack, comma separated") @QueryParam("gameLevelIds")  String gameLevelIds,@ApiParam(value = "") @QueryParam("inGame")  Boolean inGame,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a pack") @QueryParam("points")  Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPack(accountId, title, packOrder, price, highest, allocateTickets, ticketCount, description, searchTags, active, gameType, appKey, packType, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, priceType, gameLevelIds, inGame, ticketType, points, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Pack", notes = "Delete a pack.", response = SirqulResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deletePack(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the pack to delete", required = true) @QueryParam("packId") @NotNull  Long packId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePack(accountId, packId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Pack", notes = "Get a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class)
    })
    public Response getPack(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the pack to return.", required = true) @QueryParam("packId") @NotNull  Long packId,@ApiParam(value = "If true include the game level data, otherwise don't. default is false.", required = true) @QueryParam("includeGameData") @NotNull  Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPack(accountId, packId, includeGameData, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Packs", notes = "Search on packs.", response = PackResponse.class, responseContainer = "List", tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class, responseContainer = "List")
    })
    public Response searchPacks(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The field to sort by. Possible values include: TITLE, DESCRIPTION, CREATED, UPDATED", required = true, allowableValues="TITLE, DESCRIPTION, CREATED, UPDATED") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "Keyword search on the pack name") @QueryParam("keyword")  String keyword,@ApiParam(value = "Filters results on pack type", allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT") @QueryParam("packType")  String packType,@ApiParam(value = "Start the result set at some index.") @QueryParam("start")  Integer start,@ApiParam(value = "Limit the result to some number.") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to include game data in the results") @QueryParam("includeGameData")  Boolean includeGameData,@ApiParam(value = "Determines whether to include inactive results") @QueryParam("includeInactive")  Boolean includeInactive,@ApiParam(value = "The application to filter results on") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPacks(accountId, sortField, descending, keyword, packType, start, limit, includeGameData, includeInactive, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Pack", notes = "Update a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class)
    })
    public Response updatePack(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the pack to update.", required = true) @QueryParam("packId") @NotNull  Long packId,@ApiParam(value = "Flag to indicate owner should receive tickets for completed packs", required = true) @QueryParam("allocateTickets") @NotNull  Boolean allocateTickets,@ApiParam(value = "The number of tickets to reward", required = true) @QueryParam("ticketCount") @NotNull  Long ticketCount,@ApiParam(value = "The title of the pack") @QueryParam("title")  String title,@ApiParam(value = "The description of the pack") @QueryParam("description")  String description,@ApiParam(value = "The tags for searching the pack, comma separated") @QueryParam("searchTags")  String searchTags,@ApiParam(value = "Activate/deactivate the pack") @QueryParam("active")  Boolean active,@ApiParam(value = "This parameter is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "The type of the pack", allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT") @QueryParam("packType")  String packType,@ApiParam(value = "The order of the pack") @QueryParam("packOrder")  Long packOrder,@ApiParam(value = "The type of game sequence of the pack", allowableValues="FIRST_AVAILABLE, ALL_AVAILABLE") @QueryParam("sequenceType")  String sequenceType,@ApiParam(value = "The background asset id of the pack") @QueryParam("backgroundId")  Long backgroundId,@ApiParam(value = "The image asset id of the pack") @QueryParam("imageId")  Long imageId,@ApiParam(value = "The date/time to start the pack, send 0 to unset") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The date/time to end the pack, send 0 to unset") @QueryParam("endDate")  Long endDate,@ApiParam(value = "") @QueryParam("authorOverride")  String authorOverride,@ApiParam(value = "The price in tickets to purchase this pack") @QueryParam("price")  Integer price,@ApiParam(value = "the type of ticket required to purchase this pack") @QueryParam("priceType")  String priceType,@ApiParam(value = "the game level ids to include in the pack, comma separated") @QueryParam("gameLevelIds")  String gameLevelIds,@ApiParam(value = "") @QueryParam("inGame")  Boolean inGame,@ApiParam(value = "The scoring is highest is best") @QueryParam("highest")  Boolean highest,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a pack") @QueryParam("points")  Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updatePack(accountId, packId, allocateTickets, ticketCount, title, description, searchTags, active, gameType, appKey, packType, packOrder, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, price, priceType, gameLevelIds, inGame, highest, ticketType, points, securityContext);
    }
}
