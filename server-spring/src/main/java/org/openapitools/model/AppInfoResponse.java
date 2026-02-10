package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.TicketCountResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppInfoResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AppInfoResponse {

  private @Nullable Long points;

  private @Nullable Long ticketsAvailable;

  private @Nullable Long ticketsEarned;

  private @Nullable Long ticketsPurchased;

  private @Nullable Long ticketsUsed;

  private @Nullable String rank;

  private @Nullable Long maxPoints;

  private @Nullable Long maxTickets;

  private @Nullable Float pointToTicketModifier;

  /**
   * Gets or Sets scoringType
   */
  public enum ScoringTypeEnum {
    GAME_LEVEL("GAME_LEVEL"),
    
    GAME_OBJECT("GAME_OBJECT");

    private final String value;

    ScoringTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ScoringTypeEnum scoringType;

  private @Nullable PurchaseItemListResponse purchaseItemListResponse;

  private @Nullable Long termsAcceptedDate;

  private @Nullable Boolean requiresTermsAcceptance;

  @Valid
  private List<@Valid AchievementProgressResponse> completedAchievements = new ArrayList<>();

  @Valid
  private List<@Valid AchievementProgressResponse> wipAchievements = new ArrayList<>();

  private @Nullable String appBlob;

  private @Nullable Boolean enablePush;

  private @Nullable Boolean enableSMS;

  private @Nullable Boolean enableEmail;

  @Valid
  private List<@Valid TicketCountResponse> ticketCounts = new ArrayList<>();

  public AppInfoResponse points(@Nullable Long points) {
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

  public AppInfoResponse ticketsAvailable(@Nullable Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
    return this;
  }

  /**
   * Get ticketsAvailable
   * @return ticketsAvailable
   */
  
  @Schema(name = "ticketsAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsAvailable")
  public @Nullable Long getTicketsAvailable() {
    return ticketsAvailable;
  }

  public void setTicketsAvailable(@Nullable Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
  }

  public AppInfoResponse ticketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

  /**
   * Get ticketsEarned
   * @return ticketsEarned
   */
  
  @Schema(name = "ticketsEarned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsEarned")
  public @Nullable Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(@Nullable Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public AppInfoResponse ticketsPurchased(@Nullable Long ticketsPurchased) {
    this.ticketsPurchased = ticketsPurchased;
    return this;
  }

  /**
   * Get ticketsPurchased
   * @return ticketsPurchased
   */
  
  @Schema(name = "ticketsPurchased", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsPurchased")
  public @Nullable Long getTicketsPurchased() {
    return ticketsPurchased;
  }

  public void setTicketsPurchased(@Nullable Long ticketsPurchased) {
    this.ticketsPurchased = ticketsPurchased;
  }

  public AppInfoResponse ticketsUsed(@Nullable Long ticketsUsed) {
    this.ticketsUsed = ticketsUsed;
    return this;
  }

  /**
   * Get ticketsUsed
   * @return ticketsUsed
   */
  
  @Schema(name = "ticketsUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsUsed")
  public @Nullable Long getTicketsUsed() {
    return ticketsUsed;
  }

  public void setTicketsUsed(@Nullable Long ticketsUsed) {
    this.ticketsUsed = ticketsUsed;
  }

  public AppInfoResponse rank(@Nullable String rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   * @return rank
   */
  
  @Schema(name = "rank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rank")
  public @Nullable String getRank() {
    return rank;
  }

  public void setRank(@Nullable String rank) {
    this.rank = rank;
  }

  public AppInfoResponse maxPoints(@Nullable Long maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }

  /**
   * Get maxPoints
   * @return maxPoints
   */
  
  @Schema(name = "maxPoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPoints")
  public @Nullable Long getMaxPoints() {
    return maxPoints;
  }

  public void setMaxPoints(@Nullable Long maxPoints) {
    this.maxPoints = maxPoints;
  }

  public AppInfoResponse maxTickets(@Nullable Long maxTickets) {
    this.maxTickets = maxTickets;
    return this;
  }

  /**
   * Get maxTickets
   * @return maxTickets
   */
  
  @Schema(name = "maxTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTickets")
  public @Nullable Long getMaxTickets() {
    return maxTickets;
  }

  public void setMaxTickets(@Nullable Long maxTickets) {
    this.maxTickets = maxTickets;
  }

  public AppInfoResponse pointToTicketModifier(@Nullable Float pointToTicketModifier) {
    this.pointToTicketModifier = pointToTicketModifier;
    return this;
  }

  /**
   * Get pointToTicketModifier
   * @return pointToTicketModifier
   */
  
  @Schema(name = "pointToTicketModifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointToTicketModifier")
  public @Nullable Float getPointToTicketModifier() {
    return pointToTicketModifier;
  }

  public void setPointToTicketModifier(@Nullable Float pointToTicketModifier) {
    this.pointToTicketModifier = pointToTicketModifier;
  }

  public AppInfoResponse scoringType(@Nullable ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

  /**
   * Get scoringType
   * @return scoringType
   */
  
  @Schema(name = "scoringType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoringType")
  public @Nullable ScoringTypeEnum getScoringType() {
    return scoringType;
  }

  public void setScoringType(@Nullable ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public AppInfoResponse purchaseItemListResponse(@Nullable PurchaseItemListResponse purchaseItemListResponse) {
    this.purchaseItemListResponse = purchaseItemListResponse;
    return this;
  }

  /**
   * Get purchaseItemListResponse
   * @return purchaseItemListResponse
   */
  @Valid 
  @Schema(name = "purchaseItemListResponse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseItemListResponse")
  public @Nullable PurchaseItemListResponse getPurchaseItemListResponse() {
    return purchaseItemListResponse;
  }

  public void setPurchaseItemListResponse(@Nullable PurchaseItemListResponse purchaseItemListResponse) {
    this.purchaseItemListResponse = purchaseItemListResponse;
  }

  public AppInfoResponse termsAcceptedDate(@Nullable Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
    return this;
  }

  /**
   * Get termsAcceptedDate
   * @return termsAcceptedDate
   */
  
  @Schema(name = "termsAcceptedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("termsAcceptedDate")
  public @Nullable Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }

  public void setTermsAcceptedDate(@Nullable Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  public AppInfoResponse requiresTermsAcceptance(@Nullable Boolean requiresTermsAcceptance) {
    this.requiresTermsAcceptance = requiresTermsAcceptance;
    return this;
  }

  /**
   * Get requiresTermsAcceptance
   * @return requiresTermsAcceptance
   */
  
  @Schema(name = "requiresTermsAcceptance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiresTermsAcceptance")
  public @Nullable Boolean getRequiresTermsAcceptance() {
    return requiresTermsAcceptance;
  }

  public void setRequiresTermsAcceptance(@Nullable Boolean requiresTermsAcceptance) {
    this.requiresTermsAcceptance = requiresTermsAcceptance;
  }

  public AppInfoResponse completedAchievements(List<@Valid AchievementProgressResponse> completedAchievements) {
    this.completedAchievements = completedAchievements;
    return this;
  }

  public AppInfoResponse addCompletedAchievementsItem(AchievementProgressResponse completedAchievementsItem) {
    if (this.completedAchievements == null) {
      this.completedAchievements = new ArrayList<>();
    }
    this.completedAchievements.add(completedAchievementsItem);
    return this;
  }

  /**
   * Get completedAchievements
   * @return completedAchievements
   */
  @Valid 
  @Schema(name = "completedAchievements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAchievements")
  public List<@Valid AchievementProgressResponse> getCompletedAchievements() {
    return completedAchievements;
  }

  public void setCompletedAchievements(List<@Valid AchievementProgressResponse> completedAchievements) {
    this.completedAchievements = completedAchievements;
  }

  public AppInfoResponse wipAchievements(List<@Valid AchievementProgressResponse> wipAchievements) {
    this.wipAchievements = wipAchievements;
    return this;
  }

  public AppInfoResponse addWipAchievementsItem(AchievementProgressResponse wipAchievementsItem) {
    if (this.wipAchievements == null) {
      this.wipAchievements = new ArrayList<>();
    }
    this.wipAchievements.add(wipAchievementsItem);
    return this;
  }

  /**
   * Get wipAchievements
   * @return wipAchievements
   */
  @Valid 
  @Schema(name = "wipAchievements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wipAchievements")
  public List<@Valid AchievementProgressResponse> getWipAchievements() {
    return wipAchievements;
  }

  public void setWipAchievements(List<@Valid AchievementProgressResponse> wipAchievements) {
    this.wipAchievements = wipAchievements;
  }

  public AppInfoResponse appBlob(@Nullable String appBlob) {
    this.appBlob = appBlob;
    return this;
  }

  /**
   * Get appBlob
   * @return appBlob
   */
  
  @Schema(name = "appBlob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appBlob")
  public @Nullable String getAppBlob() {
    return appBlob;
  }

  public void setAppBlob(@Nullable String appBlob) {
    this.appBlob = appBlob;
  }

  public AppInfoResponse enablePush(@Nullable Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

  /**
   * Get enablePush
   * @return enablePush
   */
  
  @Schema(name = "enablePush", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enablePush")
  public @Nullable Boolean getEnablePush() {
    return enablePush;
  }

  public void setEnablePush(@Nullable Boolean enablePush) {
    this.enablePush = enablePush;
  }

  public AppInfoResponse enableSMS(@Nullable Boolean enableSMS) {
    this.enableSMS = enableSMS;
    return this;
  }

  /**
   * Get enableSMS
   * @return enableSMS
   */
  
  @Schema(name = "enableSMS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableSMS")
  public @Nullable Boolean getEnableSMS() {
    return enableSMS;
  }

  public void setEnableSMS(@Nullable Boolean enableSMS) {
    this.enableSMS = enableSMS;
  }

  public AppInfoResponse enableEmail(@Nullable Boolean enableEmail) {
    this.enableEmail = enableEmail;
    return this;
  }

  /**
   * Get enableEmail
   * @return enableEmail
   */
  
  @Schema(name = "enableEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableEmail")
  public @Nullable Boolean getEnableEmail() {
    return enableEmail;
  }

  public void setEnableEmail(@Nullable Boolean enableEmail) {
    this.enableEmail = enableEmail;
  }

  public AppInfoResponse ticketCounts(List<@Valid TicketCountResponse> ticketCounts) {
    this.ticketCounts = ticketCounts;
    return this;
  }

  public AppInfoResponse addTicketCountsItem(TicketCountResponse ticketCountsItem) {
    if (this.ticketCounts == null) {
      this.ticketCounts = new ArrayList<>();
    }
    this.ticketCounts.add(ticketCountsItem);
    return this;
  }

  /**
   * Get ticketCounts
   * @return ticketCounts
   */
  @Valid 
  @Schema(name = "ticketCounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketCounts")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

