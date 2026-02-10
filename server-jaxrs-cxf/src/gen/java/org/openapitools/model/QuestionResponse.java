package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AnswerResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.ScoreListResponse;
import org.openapitools.model.TicketListResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class QuestionResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String question;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse image;

  @ApiModelProperty(value = "")

  private String videoURL;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AnswerResponse> answers = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private ScoreListResponse scores;

  @ApiModelProperty(value = "")

  @Valid

  private TicketListResponse tickets;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse icon;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  private Long updatedDate;

  @ApiModelProperty(value = "")

  private Long startDate;

  @ApiModelProperty(value = "")

  private Long endDate;

  @ApiModelProperty(value = "")

  private Long createdDate;

  @ApiModelProperty(value = "")

  private String tags;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Long points;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public QuestionResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get question
   * @return question
  **/
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public QuestionResponse question(String question) {
    this.question = question;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public QuestionResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

 /**
   * Get videoURL
   * @return videoURL
  **/
  @JsonProperty("videoURL")
  public String getVideoURL() {
    return videoURL;
  }

  public void setVideoURL(String videoURL) {
    this.videoURL = videoURL;
  }

  public QuestionResponse videoURL(String videoURL) {
    this.videoURL = videoURL;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public QuestionResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get answers
   * @return answers
  **/
  @JsonProperty("answers")
  public List<@Valid AnswerResponse> getAnswers() {
    return answers;
  }

  public void setAnswers(List<@Valid AnswerResponse> answers) {
    this.answers = answers;
  }

  public QuestionResponse answers(List<@Valid AnswerResponse> answers) {
    this.answers = answers;
    return this;
  }

  public QuestionResponse addAnswersItem(AnswerResponse answersItem) {
    this.answers.add(answersItem);
    return this;
  }

 /**
   * Get scores
   * @return scores
  **/
  @JsonProperty("scores")
  public ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  public QuestionResponse scores(ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

 /**
   * Get tickets
   * @return tickets
  **/
  @JsonProperty("tickets")
  public TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public QuestionResponse tickets(TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public QuestionResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public QuestionResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get authorOverride
   * @return authorOverride
  **/
  @JsonProperty("authorOverride")
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public QuestionResponse authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

 /**
   * Get updatedDate
   * @return updatedDate
  **/
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public QuestionResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public QuestionResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public QuestionResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get createdDate
   * @return createdDate
  **/
  @JsonProperty("createdDate")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public QuestionResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public QuestionResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

 /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  @JsonProperty("allocateTickets")
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public QuestionResponse allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

 /**
   * Get ticketType
   * @return ticketType
  **/
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public QuestionResponse ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

 /**
   * Get ticketCount
   * @return ticketCount
  **/
  @JsonProperty("ticketCount")
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public QuestionResponse ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

 /**
   * Get points
   * @return points
  **/
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }

  public QuestionResponse points(Long points) {
    this.points = points;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

