package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.LikableResponse;
import org.openapitools.model.SearchResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class LikeApiService {
    public abstract Response registerLike( @NotNull String likableType, @NotNull Long likableId,String deviceId,Long accountId,String permissionableType,Long permissionableId,Boolean like,String app,String gameType,String appKey,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeLike( @NotNull String likableType, @NotNull Long likableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchLikes( @NotNull String likableType, @NotNull Long likableId,String deviceId,Long accountId,String connectionAccountIds,String sortField,Boolean descending,Long updatedSince,Long updatedBefore,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
}
