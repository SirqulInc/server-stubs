package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.GameResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface GameApiService {
      Response createGame(Long accountId,String appKey,String title,String description,String metaData,String packIds,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response createQuestion(Long accountId,String question,String answers,Boolean active,Boolean allocateTickets,Long ticketCount,String tags,String videoURL,Long assetId,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response createWord(Long accountId,String word,String definition,Boolean active,Boolean allocateTickets,Long ticketCount,Long assetId,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteGame(Long accountId,Long gameId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteQuestion(Long questionId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteWord(Long wordId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getGame(Long accountId,Long gameId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response getQuestion(Long questionId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getWord(Long wordId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getWords(Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchGames(Long accountId,String appKey,Integer start,Integer limit,String keyword,String appVersion,Boolean includeGameData,Boolean includeInactive,SecurityContext securityContext)
      throws NotFoundException;
      Response searchQuestions(Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response updateGame(Long accountId,Long gameId,String appKey,String title,String description,String metaData,String packIds,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateQuestion(Long questionId,Long accountId,Long ticketCount,String question,String answers,String tags,String videoURL,Long assetId,Boolean active,Boolean allocateTickets,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response updateWord(Long wordId,Long accountId,Long ticketCount,String wordText,String definition,Long assetId,Boolean active,Boolean allocateTickets,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;


}
