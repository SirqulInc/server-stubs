package controllers;

import java.math.BigDecimal;
import apimodels.QuestionResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class QuestionApiControllerImp extends QuestionApiControllerImpInterface {
    @Override
    public QuestionResponse createQuestion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String question, @NotNull String answers, @NotNull Boolean active, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String tags, String videoURL, Long assetId, String ticketType, Long points) throws Exception {
        //Do your magic!!!
        return new QuestionResponse();
    }

    @Override
    public SirqulResponse deleteQuestion(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public QuestionResponse getQuestion(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new QuestionResponse();
    }

    @Override
    public List<QuestionResponse> searchQuestions(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<QuestionResponse>();
    }

    @Override
    public QuestionResponse updateQuestion(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId, @NotNull Long ticketCount, String question, String answers, String tags, String videoURL, Long assetId, Boolean active, Boolean allocateTickets, String ticketType, Long points) throws Exception {
        //Do your magic!!!
        return new QuestionResponse();
    }

}
