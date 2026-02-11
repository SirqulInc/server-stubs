package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.NoteResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class NoteApiService {
    public abstract Response batchOperation( @NotNull Long notableId, @NotNull String notableType,String deviceId,Long accountId,String batchOperation,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createNote( @NotNull String comment,String deviceId,Long accountId,String notableType,Long notableId,String noteType,String assetIds,String tags,String permissionableType,Long permissionableId,String appKey,String locationDescription,Double latitude,Double longitude,String metaData,String receiverAccountIds,Boolean returnFullResponse,Boolean initializeAsset,Boolean assetReturnNulls,Long assetAlbumId,Long assetCollectionId,String assetAddToDefaultAlbum,Boolean assetAddToMediaLibrary,Integer assetVersionCode,String assetVersionName,String assetMetaData,String assetCaption,File assetMedia,String assetMediaUrl,String assetMediaString,String assetMediaStringFileName,String assetMediaStringContentType,File assetAttachedMedia,String assetAttachedMediaUrl,String assetAttachedMediaString,String assetAttachedMediaStringFileName,String assetAttachedMediaStringContentType,String assetLocationDescription,String assetApp,String assetSearchTags,Double assetLatitude,BigDecimal assetLongitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteNote( @NotNull Long noteId,String deviceId,Long accountId,Double latitude,Double longitude,String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNote( @NotNull Long noteId,String deviceId,Long accountId,Boolean returnFullResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchNotes(String deviceId,Long accountId,String notableType,Long notableId,String noteTypes,String appKey,String keyword,Long flagCountMinimum,Boolean flagsExceedThreshold,Boolean includeInactive,String sortField,Boolean descending,Boolean returnFullResponse,Long updatedSince,Long updatedBefore,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateNote( @NotNull Long noteId,String deviceId,Long accountId,String comment,String noteType,String assetIds,String tags,String permissionableType,Long permissionableId,String appKey,String locationDescription,Double latitude,Double longitude,String metaData,Boolean returnFullResponse,Boolean active,Boolean updateAsset,Boolean assetReturnNulls,Long assetAlbumId,Long assetCollectionId,String assetAddToDefaultAlbum,Boolean assetAddToMediaLibrary,Integer assetVersionCode,String assetVersionName,String assetMetaData,String assetCaption,File assetMedia,String assetMediaUrl,String assetMediaString,String assetMediaStringFileName,String assetMediaStringContentType,File assetAttachedMedia,String assetAttachedMediaUrl,String assetAttachedMediaString,String assetAttachedMediaStringFileName,String assetAttachedMediaStringContentType,String assetLocationDescription,String assetApp,String assetSearchTags,Double assetLatitude,Double assetLongitude,SecurityContext securityContext) throws NotFoundException;
}
