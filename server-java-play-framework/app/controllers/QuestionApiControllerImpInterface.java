package controllers;

import java.math.BigDecimal;
import apimodels.QuestionResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class QuestionApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createQuestionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String question, @NotNull String answers, @NotNull Boolean active, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String tags, String videoURL, Long assetId, String ticketType, Long points) throws Exception {
        QuestionResponse obj = createQuestion(request, version, accountId, question, answers, active, allocateTickets, ticketCount, tags, videoURL, assetId, ticketType, points);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QuestionResponse createQuestion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String question, @NotNull String answers, @NotNull Boolean active, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String tags, String videoURL, Long assetId, String ticketType, Long points) throws Exception;

    public Result deleteQuestionHttp(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId) throws Exception {
        SirqulResponse obj = deleteQuestion(request, version, questionId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteQuestion(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId) throws Exception;

    public Result getQuestionHttp(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId) throws Exception {
        QuestionResponse obj = getQuestion(request, version, questionId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QuestionResponse getQuestion(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId) throws Exception;

    public Result searchQuestionsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, String keyword) throws Exception {
        List<QuestionResponse> obj = searchQuestions(request, version, accountId, sortField, descending, activeOnly, start, limit, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (QuestionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<QuestionResponse> searchQuestions(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, String keyword) throws Exception;

    public Result updateQuestionHttp(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId, @NotNull Long ticketCount, String question, String answers, String tags, String videoURL, Long assetId, Boolean active, Boolean allocateTickets, String ticketType, Long points) throws Exception {
        QuestionResponse obj = updateQuestion(request, version, questionId, accountId, ticketCount, question, answers, tags, videoURL, assetId, active, allocateTickets, ticketType, points);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QuestionResponse updateQuestion(Http.Request request, BigDecimal version, @NotNull Long questionId, @NotNull Long accountId, @NotNull Long ticketCount, String question, String answers, String tags, String videoURL, Long assetId, Boolean active, Boolean allocateTickets, String ticketType, Long points) throws Exception;

}
