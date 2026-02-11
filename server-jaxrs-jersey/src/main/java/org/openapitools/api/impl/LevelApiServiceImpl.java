package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LevelApiServiceImpl extends LevelApiService {
    @Override
    public Response createGameLevel( @NotNull Long accountId,  @NotNull String name,  @NotNull String gameData,  @NotNull String gameDataSuffix, String appKey, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteGameLevel( @NotNull Long accountId,  @NotNull Long levelId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getGameLevel( @NotNull Long accountId,  @NotNull Long levelId, Boolean includeGameData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getGameLevelsByApplication( @NotNull Long accountId,  @NotNull String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, String appVersion, Boolean includeGameData, String filters, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getGameLevelsByBillableEntity( @NotNull Long accountId, String appKey, String keyword, String sortField, Boolean descending, Boolean activeOnly, Long start, Long limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getQuestionsInLevel( @NotNull Long levelId,  @NotNull Long accountId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getWordsInLevel( @NotNull Long levelId,  @NotNull Long accountId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateGameLevel( @NotNull Long accountId,  @NotNull Long levelId, String appKey, String name, String description, String difficulty, String appVersion, Long assetImageId, Long assetIconId, String gameData, String gameDataSuffix, String visibility, Boolean friendGroup, String connectionIds, String connectionGroupIds, Double balance, Boolean active, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String tutorialTitle, String tutorialMessage, String tutorialAlignment, Long tutorialImageAssetId, Long offerId, String metaData, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateQuestionsInLevel( @NotNull Long levelId,  @NotNull Long accountId,  @NotNull String questionIds, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateWordsInLevel( @NotNull Long levelId,  @NotNull Long accountId,  @NotNull String wordIds, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
