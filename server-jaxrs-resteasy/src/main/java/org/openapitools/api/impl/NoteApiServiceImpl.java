package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.NoteResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NoteApiServiceImpl implements NoteApiService {
      public Response batchOperation(Long notableId,String notableType,String deviceId,Long accountId,String batchOperation,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createNote(String comment,String deviceId,Long accountId,String notableType,Long notableId,String noteType,String assetIds,String tags,String permissionableType,Long permissionableId,String appKey,String locationDescription,Double latitude,Double longitude,String metaData,String receiverAccountIds,Boolean returnFullResponse,Boolean initializeAsset,Boolean assetReturnNulls,Long assetAlbumId,Long assetCollectionId,String assetAddToDefaultAlbum,Boolean assetAddToMediaLibrary,Integer assetVersionCode,String assetVersionName,String assetMetaData,String assetCaption,File assetMedia,String assetMediaUrl,String assetMediaString,String assetMediaStringFileName,String assetMediaStringContentType,File assetAttachedMedia,String assetAttachedMediaUrl,String assetAttachedMediaString,String assetAttachedMediaStringFileName,String assetAttachedMediaStringContentType,String assetLocationDescription,String assetApp,String assetSearchTags,Double assetLatitude,BigDecimal assetLongitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteNote(Long noteId,String deviceId,Long accountId,Double latitude,Double longitude,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getNote(Long noteId,String deviceId,Long accountId,Boolean returnFullResponse,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchNotes(String deviceId,Long accountId,String notableType,Long notableId,String noteTypes,String appKey,String keyword,Long flagCountMinimum,Boolean flagsExceedThreshold,Boolean includeInactive,String sortField,Boolean descending,Boolean returnFullResponse,Long updatedSince,Long updatedBefore,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateNote(Long noteId,String deviceId,Long accountId,String comment,String noteType,String assetIds,String tags,String permissionableType,Long permissionableId,String appKey,String locationDescription,Double latitude,Double longitude,String metaData,Boolean returnFullResponse,Boolean active,Boolean updateAsset,Boolean assetReturnNulls,Long assetAlbumId,Long assetCollectionId,String assetAddToDefaultAlbum,Boolean assetAddToMediaLibrary,Integer assetVersionCode,String assetVersionName,String assetMetaData,String assetCaption,File assetMedia,String assetMediaUrl,String assetMediaString,String assetMediaStringFileName,String assetMediaStringContentType,File assetAttachedMedia,String assetAttachedMediaUrl,String assetAttachedMediaString,String assetAttachedMediaStringFileName,String assetAttachedMediaStringContentType,String assetLocationDescription,String assetApp,String assetSearchTags,Double assetLatitude,Double assetLongitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
