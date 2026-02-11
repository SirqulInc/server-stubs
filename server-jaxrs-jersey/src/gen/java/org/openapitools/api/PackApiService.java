package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.PackResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class PackApiService {
    public abstract Response createPack( @NotNull Long accountId, @NotNull String title, @NotNull Long packOrder, @NotNull Integer price, @NotNull Boolean highest, @NotNull Boolean allocateTickets, @NotNull Long ticketCount,String description,String searchTags,Boolean active,String gameType,String appKey,String packType,String sequenceType,Long backgroundId,Long imageId,Long startDate,Long endDate,String authorOverride,String priceType,String gameLevelIds,Boolean inGame,String ticketType,Long points,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePack( @NotNull Long accountId, @NotNull Long packId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPack( @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean includeGameData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchPacks( @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending,String keyword,String packType,Integer start,Integer limit,Boolean includeGameData,Boolean includeInactive,String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePack( @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean allocateTickets, @NotNull Long ticketCount,String title,String description,String searchTags,Boolean active,String gameType,String appKey,String packType,Long packOrder,String sequenceType,Long backgroundId,Long imageId,Long startDate,Long endDate,String authorOverride,Integer price,String priceType,String gameLevelIds,Boolean inGame,Boolean highest,String ticketType,Long points,SecurityContext securityContext) throws NotFoundException;
}
