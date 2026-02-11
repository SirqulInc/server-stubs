package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.PackResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface PackApiService {
      Response createPack(Long accountId,String title,Long packOrder,Integer price,Boolean highest,Boolean allocateTickets,Long ticketCount,String description,String searchTags,Boolean active,String gameType,String appKey,String packType,String sequenceType,Long backgroundId,Long imageId,Long startDate,Long endDate,String authorOverride,String priceType,String gameLevelIds,Boolean inGame,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePack(Long accountId,Long packId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPack(Long accountId,Long packId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPacks(Long accountId,String sortField,Boolean descending,String keyword,String packType,Integer start,Integer limit,Boolean includeGameData,Boolean includeInactive,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePack(Long accountId,Long packId,Boolean allocateTickets,Long ticketCount,String title,String description,String searchTags,Boolean active,String gameType,String appKey,String packType,Long packOrder,String sequenceType,Long backgroundId,Long imageId,Long startDate,Long endDate,String authorOverride,Integer price,String priceType,String gameLevelIds,Boolean inGame,Boolean highest,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;


}
