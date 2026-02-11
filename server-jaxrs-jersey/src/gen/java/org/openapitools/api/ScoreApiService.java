package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ScoreResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class ScoreApiService {
    public abstract Response createScore( @NotNull Long accountId, @NotNull String appKey, @NotNull Integer points,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,Integer timeTaken,Boolean highest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getScore( @NotNull Long accountId, @NotNull String appKey,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,String scoreObjectType,String scoreStatus,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchScores( @NotNull Long accountId, @NotNull String appKey,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,SecurityContext securityContext) throws NotFoundException;
}
