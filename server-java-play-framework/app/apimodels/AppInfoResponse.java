package apimodels;

import apimodels.AchievementProgressResponse;
import apimodels.PurchaseItemListResponse;
import apimodels.TicketCountResponse;
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
 * AppInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AppInfoResponse   {
  @JsonProperty("points")
  
  private Long points;

  @JsonProperty("ticketsAvailable")
  
  private Long ticketsAvailable;

  @JsonProperty("ticketsEarned")
  
  private Long ticketsEarned;

  @JsonProperty("ticketsPurchased")
  
  private Long ticketsPurchased;

  @JsonProperty("ticketsUsed")
  
  private Long ticketsUsed;

  @JsonProperty("rank")
  
  private String rank;

  @JsonProperty("maxPoints")
  
  private Long maxPoints;

  @JsonProperty("maxTickets")
  
  private Long maxTickets;

  @JsonProperty("pointToTicketModifier")
  
  private Float pointToTicketModifier;

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

  @JsonProperty("scoringType")
  
  private ScoringTypeEnum scoringType;

  @JsonProperty("purchaseItemListResponse")
  @Valid

  private PurchaseItemListResponse purchaseItemListResponse;

  @JsonProperty("termsAcceptedDate")
  
  private Long termsAcceptedDate;

  @JsonProperty("requiresTermsAcceptance")
  
  private Boolean requiresTermsAcceptance;

  @JsonProperty("completedAchievements")
  @Valid

  private List<@Valid AchievementProgressResponse> completedAchievements = null;

  @JsonProperty("wipAchievements")
  @Valid

  private List<@Valid AchievementProgressResponse> wipAchievements = null;

  @JsonProperty("appBlob")
  
  private String appBlob;

  @JsonProperty("enablePush")
  
  private Boolean enablePush;

  @JsonProperty("enableSMS")
  
  private Boolean enableSMS;

  @JsonProperty("enableEmail")
  
  private Boolean enableEmail;

  @JsonProperty("ticketCounts")
  @Valid

  private List<@Valid TicketCountResponse> ticketCounts = null;

  public AppInfoResponse points(Long points) {
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

  public AppInfoResponse ticketsAvailable(Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
    return this;
  }

   /**
   * Get ticketsAvailable
   * @return ticketsAvailable
  **/
  public Long getTicketsAvailable() {
    return ticketsAvailable;
  }

  public void setTicketsAvailable(Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
  }

  public AppInfoResponse ticketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
    return this;
  }

   /**
   * Get ticketsEarned
   * @return ticketsEarned
  **/
  public Long getTicketsEarned() {
    return ticketsEarned;
  }

  public void setTicketsEarned(Long ticketsEarned) {
    this.ticketsEarned = ticketsEarned;
  }

  public AppInfoResponse ticketsPurchased(Long ticketsPurchased) {
    this.ticketsPurchased = ticketsPurchased;
    return this;
  }

   /**
   * Get ticketsPurchased
   * @return ticketsPurchased
  **/
  public Long getTicketsPurchased() {
    return ticketsPurchased;
  }

  public void setTicketsPurchased(Long ticketsPurchased) {
    this.ticketsPurchased = ticketsPurchased;
  }

  public AppInfoResponse ticketsUsed(Long ticketsUsed) {
    this.ticketsUsed = ticketsUsed;
    return this;
  }

   /**
   * Get ticketsUsed
   * @return ticketsUsed
  **/
  public Long getTicketsUsed() {
    return ticketsUsed;
  }

  public void setTicketsUsed(Long ticketsUsed) {
    this.ticketsUsed = ticketsUsed;
  }

  public AppInfoResponse rank(String rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public AppInfoResponse maxPoints(Long maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }

   /**
   * Get maxPoints
   * @return maxPoints
  **/
  public Long getMaxPoints() {
    return maxPoints;
  }

  public void setMaxPoints(Long maxPoints) {
    this.maxPoints = maxPoints;
  }

  public AppInfoResponse maxTickets(Long maxTickets) {
    this.maxTickets = maxTickets;
    return this;
  }

   /**
   * Get maxTickets
   * @return maxTickets
  **/
  public Long getMaxTickets() {
    return maxTickets;
  }

  public void setMaxTickets(Long maxTickets) {
    this.maxTickets = maxTickets;
  }

  public AppInfoResponse pointToTicketModifier(Float pointToTicketModifier) {
    this.pointToTicketModifier = pointToTicketModifier;
    return this;
  }

   /**
   * Get pointToTicketModifier
   * @return pointToTicketModifier
  **/
  public Float getPointToTicketModifier() {
    return pointToTicketModifier;
  }

  public void setPointToTicketModifier(Float pointToTicketModifier) {
    this.pointToTicketModifier = pointToTicketModifier;
  }

  public AppInfoResponse scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }

   /**
   * Get scoringType
   * @return scoringType
  **/
  public ScoringTypeEnum getScoringType() {
    return scoringType;
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public AppInfoResponse purchaseItemListResponse(PurchaseItemListResponse purchaseItemListResponse) {
    this.purchaseItemListResponse = purchaseItemListResponse;
    return this;
  }

   /**
   * Get purchaseItemListResponse
   * @return purchaseItemListResponse
  **/
  public PurchaseItemListResponse getPurchaseItemListResponse() {
    return purchaseItemListResponse;
  }

  public void setPurchaseItemListResponse(PurchaseItemListResponse purchaseItemListResponse) {
    this.purchaseItemListResponse = purchaseItemListResponse;
  }

  public AppInfoResponse termsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
    return this;
  }

   /**
   * Get termsAcceptedDate
   * @return termsAcceptedDate
  **/
  public Long getTermsAcceptedDate() {
    return termsAcceptedDate;
  }

  public void setTermsAcceptedDate(Long termsAcceptedDate) {
    this.termsAcceptedDate = termsAcceptedDate;
  }

  public AppInfoResponse requiresTermsAcceptance(Boolean requiresTermsAcceptance) {
    this.requiresTermsAcceptance = requiresTermsAcceptance;
    return this;
  }

   /**
   * Get requiresTermsAcceptance
   * @return requiresTermsAcceptance
  **/
  public Boolean getRequiresTermsAcceptance() {
    return requiresTermsAcceptance;
  }

  public void setRequiresTermsAcceptance(Boolean requiresTermsAcceptance) {
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
  **/
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
  **/
  public List<@Valid AchievementProgressResponse> getWipAchievements() {
    return wipAchievements;
  }

  public void setWipAchievements(List<@Valid AchievementProgressResponse> wipAchievements) {
    this.wipAchievements = wipAchievements;
  }

  public AppInfoResponse appBlob(String appBlob) {
    this.appBlob = appBlob;
    return this;
  }

   /**
   * Get appBlob
   * @return appBlob
  **/
  public String getAppBlob() {
    return appBlob;
  }

  public void setAppBlob(String appBlob) {
    this.appBlob = appBlob;
  }

  public AppInfoResponse enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Get enablePush
   * @return enablePush
  **/
  public Boolean getEnablePush() {
    return enablePush;
  }

  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }

  public AppInfoResponse enableSMS(Boolean enableSMS) {
    this.enableSMS = enableSMS;
    return this;
  }

   /**
   * Get enableSMS
   * @return enableSMS
  **/
  public Boolean getEnableSMS() {
    return enableSMS;
  }

  public void setEnableSMS(Boolean enableSMS) {
    this.enableSMS = enableSMS;
  }

  public AppInfoResponse enableEmail(Boolean enableEmail) {
    this.enableEmail = enableEmail;
    return this;
  }

   /**
   * Get enableEmail
   * @return enableEmail
  **/
  public Boolean getEnableEmail() {
    return enableEmail;
  }

  public void setEnableEmail(Boolean enableEmail) {
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
  **/
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
    return Objects.equals(points, appInfoResponse.points) &&
        Objects.equals(ticketsAvailable, appInfoResponse.ticketsAvailable) &&
        Objects.equals(ticketsEarned, appInfoResponse.ticketsEarned) &&
        Objects.equals(ticketsPurchased, appInfoResponse.ticketsPurchased) &&
        Objects.equals(ticketsUsed, appInfoResponse.ticketsUsed) &&
        Objects.equals(rank, appInfoResponse.rank) &&
        Objects.equals(maxPoints, appInfoResponse.maxPoints) &&
        Objects.equals(maxTickets, appInfoResponse.maxTickets) &&
        Objects.equals(pointToTicketModifier, appInfoResponse.pointToTicketModifier) &&
        Objects.equals(scoringType, appInfoResponse.scoringType) &&
        Objects.equals(purchaseItemListResponse, appInfoResponse.purchaseItemListResponse) &&
        Objects.equals(termsAcceptedDate, appInfoResponse.termsAcceptedDate) &&
        Objects.equals(requiresTermsAcceptance, appInfoResponse.requiresTermsAcceptance) &&
        Objects.equals(completedAchievements, appInfoResponse.completedAchievements) &&
        Objects.equals(wipAchievements, appInfoResponse.wipAchievements) &&
        Objects.equals(appBlob, appInfoResponse.appBlob) &&
        Objects.equals(enablePush, appInfoResponse.enablePush) &&
        Objects.equals(enableSMS, appInfoResponse.enableSMS) &&
        Objects.equals(enableEmail, appInfoResponse.enableEmail) &&
        Objects.equals(ticketCounts, appInfoResponse.ticketCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, ticketsAvailable, ticketsEarned, ticketsPurchased, ticketsUsed, rank, maxPoints, maxTickets, pointToTicketModifier, scoringType, purchaseItemListResponse, termsAcceptedDate, requiresTermsAcceptance, completedAchievements, wipAchievements, appBlob, enablePush, enableSMS, enableEmail, ticketCounts);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

