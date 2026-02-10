package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AnswerResponse;
import apimodels.AssetShortResponse;
import apimodels.ScoreListResponse;
import apimodels.TicketListResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QuestionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QuestionResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("question")
  
  private String question;

  @JsonProperty("image")
  @Valid

  private AssetShortResponse image;

  @JsonProperty("videoURL")
  
  private String videoURL;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("answers")
  @Valid

  private List<@Valid AnswerResponse> answers = null;

  @JsonProperty("scores")
  @Valid

  private ScoreListResponse scores;

  @JsonProperty("tickets")
  @Valid

  private TicketListResponse tickets;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("icon")
  @Valid

  private AssetShortResponse icon;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  @JsonProperty("startDate")
  
  private Long startDate;

  @JsonProperty("endDate")
  
  private Long endDate;

  @JsonProperty("createdDate")
  
  private Long createdDate;

  @JsonProperty("tags")
  
  private String tags;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("points")
  
  private Long points;

  public QuestionResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public QuestionResponse question(String question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public QuestionResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public QuestionResponse videoURL(String videoURL) {
    this.videoURL = videoURL;
    return this;
  }

   /**
   * Get videoURL
   * @return videoURL
  **/
  public String getVideoURL() {
    return videoURL;
  }

  public void setVideoURL(String videoURL) {
    this.videoURL = videoURL;
  }

  public QuestionResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
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
  **/
  public List<@Valid AnswerResponse> getAnswers() {
    return answers;
  }

  public void setAnswers(List<@Valid AnswerResponse> answers) {
    this.answers = answers;
  }

  public QuestionResponse scores(ScoreListResponse scores) {
    this.scores = scores;
    return this;
  }

   /**
   * Get scores
   * @return scores
  **/
  public ScoreListResponse getScores() {
    return scores;
  }

  public void setScores(ScoreListResponse scores) {
    this.scores = scores;
  }

  public QuestionResponse tickets(TicketListResponse tickets) {
    this.tickets = tickets;
    return this;
  }

   /**
   * Get tickets
   * @return tickets
  **/
  public TicketListResponse getTickets() {
    return tickets;
  }

  public void setTickets(TicketListResponse tickets) {
    this.tickets = tickets;
  }

  public QuestionResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public QuestionResponse icon(AssetShortResponse icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public AssetShortResponse getIcon() {
    return icon;
  }

  public void setIcon(AssetShortResponse icon) {
    this.icon = icon;
  }

  public QuestionResponse authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

   /**
   * Get authorOverride
   * @return authorOverride
  **/
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public QuestionResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public QuestionResponse startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public QuestionResponse endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public QuestionResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public QuestionResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public QuestionResponse allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

   /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public QuestionResponse ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

   /**
   * Get ticketType
   * @return ticketType
  **/
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public QuestionResponse ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

   /**
   * Get ticketCount
   * @return ticketCount
  **/
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public QuestionResponse points(Long points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
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
    return Objects.equals(id, questionResponse.id) &&
        Objects.equals(question, questionResponse.question) &&
        Objects.equals(image, questionResponse.image) &&
        Objects.equals(videoURL, questionResponse.videoURL) &&
        Objects.equals(active, questionResponse.active) &&
        Objects.equals(answers, questionResponse.answers) &&
        Objects.equals(scores, questionResponse.scores) &&
        Objects.equals(tickets, questionResponse.tickets) &&
        Objects.equals(owner, questionResponse.owner) &&
        Objects.equals(icon, questionResponse.icon) &&
        Objects.equals(authorOverride, questionResponse.authorOverride) &&
        Objects.equals(updatedDate, questionResponse.updatedDate) &&
        Objects.equals(startDate, questionResponse.startDate) &&
        Objects.equals(endDate, questionResponse.endDate) &&
        Objects.equals(createdDate, questionResponse.createdDate) &&
        Objects.equals(tags, questionResponse.tags) &&
        Objects.equals(allocateTickets, questionResponse.allocateTickets) &&
        Objects.equals(ticketType, questionResponse.ticketType) &&
        Objects.equals(ticketCount, questionResponse.ticketCount) &&
        Objects.equals(points, questionResponse.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question, image, videoURL, active, answers, scores, tickets, owner, icon, authorOverride, updatedDate, startDate, endDate, createdDate, tags, allocateTickets, ticketType, ticketCount, points);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

