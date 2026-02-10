package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.TicketCountResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppInfoResponse   {
  
  private Long points;
  private Long ticketsAvailable;
  private Long ticketsEarned;
  private Long ticketsPurchased;
  private Long ticketsUsed;
  private String rank;
  private Long maxPoints;
  private Long maxTickets;
  private Float pointToTicketModifier;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    GAME_LEVEL("GAME_LEVEL"),

        GAME_OBJECT("GAME_OBJECT");
    private String value;

    ScoringTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ScoringTypeEnum scoringType;
  private PurchaseItemListResponse purchaseItemListResponse;
  private Long termsAcceptedDate;
  private Boolean requiresTermsAcceptance;
  private List<@Valid AchievementProgressResponse> completedAchievements = new ArrayList<>();
  private List<@Valid AchievementProgressResponse> wipAchievements = new ArrayList<>();
  private String appBlob;
  private Boolean enablePush;
  private Boolean enableSMS;
  private Boolean enableEmail;
  private List<@Valid TicketCountResponse> ticketCounts = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }
  public void setPoints(Long points) {
    this.points = points;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsAvailable")
  public Long getTicketsAvailable() {
    return ticketsAvailable;
  }
  public void setTicketsAvailable(Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsEarned")
  public Long getTicketsEarned() {
    return ticketsEarned;
  }
  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsPurchased")
  public Long getTicketsPurchased() {
    return ticketsPurchased;
  }
  public void setTicketsPurchased(Long ticketsPurchased) {
    this.ticketsPurchased = ticketsPurchased;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsUsed")
  public Long getTicketsUsed() {
    return ticketsUsed;
  }
  public void setTicketsUsed(Long ticketsUsed) {
    this.ticketsUsed = ticketsUsed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rank")
  public String getRank() {
    return rank;
  }
  public void setRank(String rank) {
    this.rank = rank;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPoints")
  public Long getMaxPoints() {
    return maxPoints;
  }
  public void setMaxPoints(Long maxPoints) {
    this.maxPoints = maxPoints;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxTickets")
  public Long getMaxTickets() {
    return maxTickets;
  }
  public void setMaxTickets(Long maxTickets) {
    this.maxTickets = maxTickets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pointToTicketModifier")
  public Float getPointToTicketModifier() {
    return pointToTicketModifier;
  }
  public void setPointToTicketModifier(Float pointToTicketModifier) {
    this.pointToTicketModifier = pointToTicketModifier;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scoringType")
  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }
  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseItemListResponse")
  @Valid
  public PurchaseItemListResponse getPurchaseItemListResponse() {
    return purchaseItemListResponse;
  }
  public void setPurchaseItemListResponse(PurchaseItemListResponse purchaseItemListResponse) {
    this.purchaseItemListResponse = purchaseItemListResponse;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("termsAcceptedDate")
  public Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }
  public void setTermsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requiresTermsAcceptance")
  public Boolean getRequiresTermsAcceptance() {
    return requiresTermsAcceptance;
  }
  public void setRequiresTermsAcceptance(Boolean requiresTermsAcceptance) {
    this.requiresTermsAcceptance = requiresTermsAcceptance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completedAchievements")
  @Valid
  public List<@Valid AchievementProgressResponse> getCompletedAchievements() {
    return completedAchievements;
  }
  public void setCompletedAchievements(List<@Valid AchievementProgressResponse> completedAchievements) {
    this.completedAchievements = completedAchievements;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wipAchievements")
  @Valid
  public List<@Valid AchievementProgressResponse> getWipAchievements() {
    return wipAchievements;
  }
  public void setWipAchievements(List<@Valid AchievementProgressResponse> wipAchievements) {
    this.wipAchievements = wipAchievements;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appBlob")
  public String getAppBlob() {
    return appBlob;
  }
  public void setAppBlob(String appBlob) {
    this.appBlob = appBlob;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enablePush")
  public Boolean getEnablePush() {
    return enablePush;
  }
  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableSMS")
  public Boolean getEnableSMS() {
    return enableSMS;
  }
  public void setEnableSMS(Boolean enableSMS) {
    this.enableSMS = enableSMS;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableEmail")
  public Boolean getEnableEmail() {
    return enableEmail;
  }
  public void setEnableEmail(Boolean enableEmail) {
    this.enableEmail = enableEmail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketCounts")
  @Valid
  public List<@Valid TicketCountResponse> getTicketCounts() {
    return ticketCounts;
  }
  public void setTicketCounts(List<@Valid TicketCountResponse> ticketCounts) {
    this.ticketCounts = ticketCounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoResponse appInfoResponse = (AppInfoResponse) o;
    return Objects.equals(this.points, appInfoResponse.points) &&
        Objects.equals(this.ticketsAvailable, appInfoResponse.ticketsAvailable) &&
        Objects.equals(this.ticketsEarned, appInfoResponse.ticketsEarned) &&
        Objects.equals(this.ticketsPurchased, appInfoResponse.ticketsPurchased) &&
        Objects.equals(this.ticketsUsed, appInfoResponse.ticketsUsed) &&
        Objects.equals(this.rank, appInfoResponse.rank) &&
        Objects.equals(this.maxPoints, appInfoResponse.maxPoints) &&
        Objects.equals(this.maxTickets, appInfoResponse.maxTickets) &&
        Objects.equals(this.pointToTicketModifier, appInfoResponse.pointToTicketModifier) &&
        Objects.equals(this.scoringType, appInfoResponse.scoringType) &&
        Objects.equals(this.purchaseItemListResponse, appInfoResponse.purchaseItemListResponse) &&
        Objects.equals(this.termsAcceptedDate, appInfoResponse.termsAcceptedDate) &&
        Objects.equals(this.requiresTermsAcceptance, appInfoResponse.requiresTermsAcceptance) &&
        Objects.equals(this.completedAchievements, appInfoResponse.completedAchievements) &&
        Objects.equals(this.wipAchievements, appInfoResponse.wipAchievements) &&
        Objects.equals(this.appBlob, appInfoResponse.appBlob) &&
        Objects.equals(this.enablePush, appInfoResponse.enablePush) &&
        Objects.equals(this.enableSMS, appInfoResponse.enableSMS) &&
        Objects.equals(this.enableEmail, appInfoResponse.enableEmail) &&
        Objects.equals(this.ticketCounts, appInfoResponse.ticketCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, ticketsAvailable, ticketsEarned, ticketsPurchased, ticketsUsed, rank, maxPoints, maxTickets, pointToTicketModifier, scoringType, purchaseItemListResponse, termsAcceptedDate, requiresTermsAcceptance, completedAchievements, wipAchievements, appBlob, enablePush, enableSMS, enableEmail, ticketCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoResponse {\n");
    
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    ticketsAvailable: ").append(toIndentedString(ticketsAvailable)).append("\n");
    sb.append("    ticketsEarned: ").append(toIndentedString(ticketsEarned)).append("\n");
    sb.append("    ticketsPurchased: ").append(toIndentedString(ticketsPurchased)).append("\n");
    sb.append("    ticketsUsed: ").append(toIndentedString(ticketsUsed)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    maxTickets: ").append(toIndentedString(maxTickets)).append("\n");
    sb.append("    pointToTicketModifier: ").append(toIndentedString(pointToTicketModifier)).append("\n");
    sb.append("    scoringType: ").append(toIndentedString(scoringType)).append("\n");
    sb.append("    purchaseItemListResponse: ").append(toIndentedString(purchaseItemListResponse)).append("\n");
    sb.append("    termsAcceptedDate: ").append(toIndentedString(termsAcceptedDate)).append("\n");
    sb.append("    requiresTermsAcceptance: ").append(toIndentedString(requiresTermsAcceptance)).append("\n");
    sb.append("    completedAchievements: ").append(toIndentedString(completedAchievements)).append("\n");
    sb.append("    wipAchievements: ").append(toIndentedString(wipAchievements)).append("\n");
    sb.append("    appBlob: ").append(toIndentedString(appBlob)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    enableSMS: ").append(toIndentedString(enableSMS)).append("\n");
    sb.append("    enableEmail: ").append(toIndentedString(enableEmail)).append("\n");
    sb.append("    ticketCounts: ").append(toIndentedString(ticketCounts)).append("\n");
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

