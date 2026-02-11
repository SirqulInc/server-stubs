package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.GameResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class GameApiService {
    public abstract Response createGame(Long accountId,String appKey,String title,String description,String metaData,String packIds,Boolean includeGameData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createQuestion( @NotNull Long accountId, @NotNull String question, @NotNull String answers, @NotNull Boolean active, @NotNull Boolean allocateTickets, @NotNull Long ticketCount,String tags,String videoURL,Long assetId,String ticketType,Long points,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createWord( @NotNull Long accountId, @NotNull String word, @NotNull String definition, @NotNull Boolean active, @NotNull Boolean allocateTickets, @NotNull Long ticketCount,Long assetId,String ticketType,Long points,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteGame( @NotNull Long accountId, @NotNull Long gameId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteQuestion( @NotNull Long questionId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteWord( @NotNull Long wordId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getGame( @NotNull Long accountId, @NotNull Long gameId,Boolean includeGameData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getQuestion( @NotNull Long questionId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getWord( @NotNull Long wordId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getWords( @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit,String keyword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchGames( @NotNull Long accountId, @NotNull String appKey, @NotNull Integer start, @NotNull Integer limit,String keyword,String appVersion,Boolean includeGameData,Boolean includeInactive,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchQuestions( @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit,String keyword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateGame(Long accountId,Long gameId,String appKey,String title,String description,String metaData,String packIds,Boolean includeGameData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateQuestion( @NotNull Long questionId, @NotNull Long accountId, @NotNull Long ticketCount,String question,String answers,String tags,String videoURL,Long assetId,Boolean active,Boolean allocateTickets,String ticketType,Long points,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateWord( @NotNull Long wordId, @NotNull Long accountId, @NotNull Long ticketCount,String wordText,String definition,Long assetId,Boolean active,Boolean allocateTickets,String ticketType,Long points,SecurityContext securityContext) throws NotFoundException;
}
