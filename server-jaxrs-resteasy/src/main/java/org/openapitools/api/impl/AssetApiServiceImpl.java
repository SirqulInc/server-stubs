package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AssetFullResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AssetShortResponse;
import java.io.File;
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
public class AssetApiServiceImpl implements AssetApiService {
      public Response assetDownload(String filename,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response assetMorph(Long offerId,String adSize,Long creativeId,Integer width,Integer height,String backgroundSize,String template,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createAsset(Boolean returnNulls,String deviceId,Long accountId,Long albumId,Long collectionId,String addToDefaultAlbum,Boolean addToMediaLibrary,Integer versionCode,String versionName,String metaData,String caption,String assetType,String approvalStatus,Long assignedAccountId,File media,String mediaUrl,String mediaString,String mediaStringFileName,String mediaStringContentType,Integer mediaHeight,Integer mediaWidth,File attachedMedia,String attachedMediaUrl,String attachedMediaString,String attachedMediaStringFileName,String attachedMediaStringContentType,Integer attachedMediaHeight,Integer attachedMediaWidth,String locationDescription,String app,String appKey,String searchTags,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteAsset(String assetId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getAsset(Long assetId,String deviceId,Long accountId,Boolean noteDescending,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response removeAsset(String assetId,String deviceId,Long accountId,Long albumId,Long collectionId,Boolean removeFromDefaultAlbums,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchAssets(String deviceId,Long accountId,String albumIds,String assetIds,String appKey,String mediaType,String mimeType,String keyword,Integer versionCode,String versionName,Long updatedSince,Long updatedBefore,String sortField,Boolean descending,Boolean searchMediaLibrary,Boolean filterByBillable,Boolean activeOnly,Boolean returnApp,Integer start,Integer limit,String searchMode,String assetType,String approvalStatus,Long assignedAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateAsset(Long assetId,String deviceId,Long accountId,Long albumId,Long attachedAssetId,Integer versionCode,String versionName,String metaData,String caption,String assetType,String approvalStatus,Long assignedAccountId,File media,String mediaUrl,String mediaString,String mediaStringFileName,String mediaStringContentType,Integer mediaHeight,Integer mediaWidth,File attachedMedia,String attachedMediaUrl,String attachedMediaString,String attachedMediaStringFileName,String attachedMediaStringContentType,Integer attachedMediaHeight,Integer attachedMediaWidth,String locationDescription,String searchTags,String appKey,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
