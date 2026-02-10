package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AnswerResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.TicketListResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QuestionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class QuestionResponse {

  private @Nullable Long id;

  private @Nullable String question;

  private @Nullable AssetShortResponse image;

  private @Nullable String videoURL;

  private @Nullable Boolean active;

  @Valid
  private List<@Valid AnswerResponse> answers = new ArrayList<>();

  private @Nullable ScoreListResponse scores;

  private @Nullable TicketListResponse tickets;

  private @Nullable AccountShortResponse owner;

  private @Nullable AssetShortResponse icon;

  private @Nullable String authorOverride;

  private @Nullable Long updatedDate;

  private @Nullable Long startDate;

  private @Nullable Long endDate;

  private @Nullable Long createdDate;

  private @Nullable String tags;

  private @Nullable Boolean allocateTickets;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Long points;

  public QuestionResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public QuestionResponse question(@Nullable String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
   */
  
  @Schema(name = "question", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question")
  public @Nullable String getQuestion() {
    return question;
  }

  public void setQuestion(@Nullable String question) {
    this.question = question;
  }

  public QuestionResponse image(@Nullable AssetShortResponse image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable AssetShortResponse getImage() {
    return image;
  }

  public void setImage(@Nullable AssetShortResponse image) {
    this.image = image;
  }

  public QuestionResponse videoURL(@Nullable String videoURL) {
    this.videoURL = videoURL;
    return this;
  }

  /**
   * Get videoURL
   * @return videoURL
   */
  
  @Schema(name = "videoURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("videoURL")
  public @Nullable String getVideoURL() {
    return videoURL;
  }

  public void setVideoURL(@Nullable String videoURL) {
    this.videoURL = videoURL;
  }

  public QuestionResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public QuestionResponse answers(List<@Valid AnswerResponse> answers) {
    this.answers = answers;
    return this;
  }

  public QuestionResponse addAnswersItem(AnswerResponse answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

  /**
   * Get answers
   * @return answers
   */
  @Valid 
  @Schema(name = "answers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answers")
  public List<@Valid AnswerResponse> getAnswers() {
    return answers;
  }

  public void setAnswers(List<@Valid AnswerResponse> answers) {
    this.answers = answers;
  }

  public QuestionResponse scores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

  /**
   * Get scores
   * @return scores
   */
  @Valid 
  @Schema(name = "scores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scores")
  public @Nullable ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(@Nullable ScoreListResponse scores) {
    this.scores = scores;
  }

  public QuestionResponse tickets(@Nullable TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

  /**
   * Get tickets
   * @return tickets
   */
  @Valid 
  @Schema(name = "tickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tickets")
  public @Nullable TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(@Nullable TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public QuestionResponse owner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public QuestionResponse icon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @Valid 
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public @Nullable AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(@Nullable AssetShortResponse icon) {
    this.icon = icon;
  }

  public QuestionResponse authorOverride(@Nullable String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

  /**
   * Get authorOverride
   * @return authorOverride
   */
  
  @Schema(name = "authorOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorOverride")
  public @Nullable String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(@Nullable String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public QuestionResponse updatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
   */
  
  @Schema(name = "updatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedDate")
  public @Nullable Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@Nullable Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public QuestionResponse startDate(@Nullable Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable Long getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable Long startDate) {
    this.startDate = startDate;
  }

  public QuestionResponse endDate(@Nullable Long endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable Long getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable Long endDate) {
    this.endDate = endDate;
  }

  public QuestionResponse createdDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public @Nullable Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@Nullable Long createdDate) {
    this.createdDate = createdDate;
  }

  public QuestionResponse tags(@Nullable String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public @Nullable String getTags() {
    return tags;
  }

  public void setTags(@Nullable String tags) {
    this.tags = tags;
  }

  public QuestionResponse allocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

  /**
   * Get allocateTickets
   * @return allocateTickets
   */
  
  @Schema(name = "allocateTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allocateTickets")
  public @Nullable Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public QuestionResponse ticketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * Get ticketType
   * @return ticketType
   */
  
  @Schema(name = "ticketType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketType")
  public @Nullable String getTicketType() {
    return ticketType;
  }

  public void setTicketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
  }

  public QuestionResponse ticketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

  /**
   * Get ticketCount
   * @return ticketCount
   */
  
  @Schema(name = "ticketCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketCount")
  public @Nullable Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public QuestionResponse points(@Nullable Long points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public @Nullable Long getPoints() {
    return points;
  }

  public void setPoints(@Nullable Long points) {
    this.points = points;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionResponse questionResponse = (QuestionResponse) o;
    return Objects.equals(this.id, questionResponse.id) &&
        Objects.equals(this.question, questionResponse.question) &&
        Objects.equals(this.image, questionResponse.image) &&
        Objects.equals(this.videoURL, questionResponse.videoURL) &&
        Objects.equals(this.active, questionResponse.active) &&
        Objects.equals(this.answers, questionResponse.answers) &&
        Objects.equals(this.scores, questionResponse.scores) &&
        Objects.equals(this.tickets, questionResponse.tickets) &&
        Objects.equals(this.owner, questionResponse.owner) &&
        Objects.equals(this.icon, questionResponse.icon) &&
        Objects.equals(this.authorOverride, questionResponse.authorOverride) &&
        Objects.equals(this.updatedDate, questionResponse.updatedDate) &&
        Objects.equals(this.startDate, questionResponse.startDate) &&
        Objects.equals(this.endDate, questionResponse.endDate) &&
        Objects.equals(this.createdDate, questionResponse.createdDate) &&
        Objects.equals(this.tags, questionResponse.tags) &&
        Objects.equals(this.allocateTickets, questionResponse.allocateTickets) &&
        Objects.equals(this.ticketType, questionResponse.ticketType) &&
        Objects.equals(this.ticketCount, questionResponse.ticketCount) &&
        Objects.equals(this.points, questionResponse.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question, image, videoURL, active, answers, scores, tickets, owner, icon, authorOverride, updatedDate, startDate, endDate, createdDate, tags, allocateTickets, ticketType, ticketCount, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    videoURL: ").append(toIndentedString(videoURL)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

