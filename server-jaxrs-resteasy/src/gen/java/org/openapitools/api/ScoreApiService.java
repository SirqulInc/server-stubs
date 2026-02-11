package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ScoreResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ScoreApiService {
      Response createScore(Long accountId,String appKey,Integer points,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,Integer timeTaken,Boolean highest,SecurityContext securityContext)
      throws NotFoundException;
      Response getScore(Long accountId,String appKey,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,String scoreObjectType,String scoreStatus,SecurityContext securityContext)
      throws NotFoundException;
      Response searchScores(Long accountId,String appKey,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,SecurityContext securityContext)
      throws NotFoundException;


}
