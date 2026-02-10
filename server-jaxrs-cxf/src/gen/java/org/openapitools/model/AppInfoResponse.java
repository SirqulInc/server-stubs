package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.TicketCountResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AppInfoResponse  {
  
  @ApiModelProperty(value = "")

  private Long points;

  @ApiModelProperty(value = "")

  private Long ticketsAvailable;

  @ApiModelProperty(value = "")

  private Long ticketsEarned;

  @ApiModelProperty(value = "")

  private Long ticketsPurchased;

  @ApiModelProperty(value = "")

  private Long ticketsUsed;

  @ApiModelProperty(value = "")

  private String rank;

  @ApiModelProperty(value = "")

  private Long maxPoints;

  @ApiModelProperty(value = "")

  private Long maxTickets;

  @ApiModelProperty(value = "")

  private Float pointToTicketModifier;

public enum ScoringTypeEnum {

GAME_LEVEL(String.valueOf("GAME_LEVEL")), GAME_OBJECT(String.valueOf("GAME_OBJECT"));


    private String value;

    ScoringTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ScoringTypeEnum fromValue(String value) {
        for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ScoringTypeEnum scoringType;

  @ApiModelProperty(value = "")

  @Valid

  private PurchaseItemListResponse purchaseItemListResponse;

  @ApiModelProperty(value = "")

  private Long termsAcceptedDate;

  @ApiModelProperty(value = "")

  private Boolean requiresTermsAcceptance;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AchievementProgressResponse> completedAchievements = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AchievementProgressResponse> wipAchievements = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String appBlob;

  @ApiModelProperty(value = "")

  private Boolean enablePush;

  @ApiModelProperty(value = "")

  private Boolean enableSMS;

  @ApiModelProperty(value = "")

  private Boolean enableEmail;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid TicketCountResponse> ticketCounts = new ArrayList<>();
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

  public AppInfoResponse points(Long points) {
    this.points = points;
    return this;
  }

 /**
   * Get ticketsAvailable
   * @return ticketsAvailable
  **/
  @JsonProperty("ticketsAvailable")
  public Long getTicketsAvailable() {
    return ticketsAvailable;
  }

  public void setTicketsAvailable(Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
  }

  public AppInfoResponse ticketsAvailable(Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
    return this;
  }

 /**
   * Get ticketsEarned
   * @return ticketsEarned
  **/
  @JsonProperty("ticketsEarned")
  public Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public AppInfoResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

 /**
   * Get ticketsPurchased
   * @return ticketsPurchased
  **/
  @JsonProperty("ticketsPurchased")
  public Long getTicketsPurchased() {
    return ticketsPurchased;
  }

  public void setTicketsPurchased(Long ticketsPurchased) {
    this.ticketsPurchased = ticketsPurchased;
  }

  public AppInfoResponse ticketsPurchased(Long ticketsPurchased) {
    this.ticketsPurchased = ticketsPurchased;
    return this;
  }

 /**
   * Get ticketsUsed
   * @return ticketsUsed
  **/
  @JsonProperty("ticketsUsed")
  public Long getTicketsUsed() {
    return ticketsUsed;
  }

  public void setTicketsUsed(Long ticketsUsed) {
    this.ticketsUsed = ticketsUsed;
  }

  public AppInfoResponse ticketsUsed(Long ticketsUsed) {
    this.ticketsUsed = ticketsUsed;
    return this;
  }

 /**
   * Get rank
   * @return rank
  **/
  @JsonProperty("rank")
  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public AppInfoResponse rank(String rank) {
    this.rank = rank;
    return this;
  }

 /**
   * Get maxPoints
   * @return maxPoints
  **/
  @JsonProperty("maxPoints")
  public Long getMaxPoints() {
    return maxPoints;
  }

  public void setMaxPoints(Long maxPoints) {
    this.maxPoints = maxPoints;
  }

  public AppInfoResponse maxPoints(Long maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }

 /**
   * Get maxTickets
   * @return maxTickets
  **/
  @JsonProperty("maxTickets")
  public Long getMaxTickets() {
    return maxTickets;
  }

  public void setMaxTickets(Long maxTickets) {
    this.maxTickets = maxTickets;
  }

  public AppInfoResponse maxTickets(Long maxTickets) {
    this.maxTickets = maxTickets;
    return this;
  }

 /**
   * Get pointToTicketModifier
   * @return pointToTicketModifier
  **/
  @JsonProperty("pointToTicketModifier")
  public Float getPointToTicketModifier() {
    return pointToTicketModifier;
  }

  public void setPointToTicketModifier(Float pointToTicketModifier) {
    this.pointToTicketModifier = pointToTicketModifier;
  }

  public AppInfoResponse pointToTicketModifier(Float pointToTicketModifier) {
    this.pointToTicketModifier = pointToTicketModifier;
    return this;
  }

 /**
   * Get scoringType
   * @return scoringType
  **/
  @JsonProperty("scoringType")
  public String getScoringType() {
    if (scoringType == null) {
      return null;
    }
    return scoringType.value();
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public AppInfoResponse scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

 /**
   * Get purchaseItemListResponse
   * @return purchaseItemListResponse
  **/
  @JsonProperty("purchaseItemListResponse")
  public PurchaseItemListResponse getPurchaseItemListResponse() {
    return purchaseItemListResponse;
  }

  public void setPurchaseItemListResponse(PurchaseItemListResponse purchaseItemListResponse) {
    this.purchaseItemListResponse = purchaseItemListResponse;
  }

  public AppInfoResponse purchaseItemListResponse(PurchaseItemListResponse purchaseItemListResponse) {
    this.purchaseItemListResponse = purchaseItemListResponse;
    return this;
  }

 /**
   * Get termsAcceptedDate
   * @return termsAcceptedDate
  **/
  @JsonProperty("termsAcceptedDate")
  public Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }

  public void setTermsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  public AppInfoResponse termsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
    return this;
  }

 /**
   * Get requiresTermsAcceptance
   * @return requiresTermsAcceptance
  **/
  @JsonProperty("requiresTermsAcceptance")
  public Boolean getRequiresTermsAcceptance() {
    return requiresTermsAcceptance;
  }

  public void setRequiresTermsAcceptance(Boolean requiresTermsAcceptance) {
    this.requiresTermsAcceptance = requiresTermsAcceptance;
  }

  public AppInfoResponse requiresTermsAcceptance(Boolean requiresTermsAcceptance) {
    this.requiresTermsAcceptance = requiresTermsAcceptance;
    return this;
  }

 /**
   * Get completedAchievements
   * @return completedAchievements
  **/
  @JsonProperty("completedAchievements")
  public List<@Valid AchievementProgressResponse> getCompletedAchievements() {
    return completedAchievements;
  }

  public void setCompletedAchievements(List<@Valid AchievementProgressResponse> completedAchievements) {
    this.completedAchievements = completedAchievements;
  }

  public AppInfoResponse completedAchievements(List<@Valid AchievementProgressResponse> completedAchievements) {
    this.completedAchievements = completedAchievements;
    return this;
  }

  public AppInfoResponse addCompletedAchievementsItem(AchievementProgressResponse completedAchievementsItem) {
    this.completedAchievements.add(completedAchievementsItem);
    return this;
  }

 /**
   * Get wipAchievements
   * @return wipAchievements
  **/
  @JsonProperty("wipAchievements")
  public List<@Valid AchievementProgressResponse> getWipAchievements() {
    return wipAchievements;
  }

  public void setWipAchievements(List<@Valid AchievementProgressResponse> wipAchievements) {
    this.wipAchievements = wipAchievements;
  }

  public AppInfoResponse wipAchievements(List<@Valid AchievementProgressResponse> wipAchievements) {
    this.wipAchievements = wipAchievements;
    return this;
  }

  public AppInfoResponse addWipAchievementsItem(AchievementProgressResponse wipAchievementsItem) {
    this.wipAchievements.add(wipAchievementsItem);
    return this;
  }

 /**
   * Get appBlob
   * @return appBlob
  **/
  @JsonProperty("appBlob")
  public String getAppBlob() {
    return appBlob;
  }

  public void setAppBlob(String appBlob) {
    this.appBlob = appBlob;
  }

  public AppInfoResponse appBlob(String appBlob) {
    this.appBlob = appBlob;
    return this;
  }

 /**
   * Get enablePush
   * @return enablePush
  **/
  @JsonProperty("enablePush")
  public Boolean getEnablePush() {
    return enablePush;
  }

  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }

  public AppInfoResponse enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

 /**
   * Get enableSMS
   * @return enableSMS
  **/
  @JsonProperty("enableSMS")
  public Boolean getEnableSMS() {
    return enableSMS;
  }

  public void setEnableSMS(Boolean enableSMS) {
    this.enableSMS = enableSMS;
  }

  public AppInfoResponse enableSMS(Boolean enableSMS) {
    this.enableSMS = enableSMS;
    return this;
  }

 /**
   * Get enableEmail
   * @return enableEmail
  **/
  @JsonProperty("enableEmail")
  public Boolean getEnableEmail() {
    return enableEmail;
  }

  public void setEnableEmail(Boolean enableEmail) {
    this.enableEmail = enableEmail;
  }

  public AppInfoResponse enableEmail(Boolean enableEmail) {
    this.enableEmail = enableEmail;
    return this;
  }

 /**
   * Get ticketCounts
   * @return ticketCounts
  **/
  @JsonProperty("ticketCounts")
  public List<@Valid TicketCountResponse> getTicketCounts() {
    return ticketCounts;
  }

  public void setTicketCounts(List<@Valid TicketCountResponse> ticketCounts) {
    this.ticketCounts = ticketCounts;
  }

  public AppInfoResponse ticketCounts(List<@Valid TicketCountResponse> ticketCounts) {
    this.ticketCounts = ticketCounts;
    return this;
  }

  public AppInfoResponse addTicketCountsItem(TicketCountResponse ticketCountsItem) {
    this.ticketCounts.add(ticketCountsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

