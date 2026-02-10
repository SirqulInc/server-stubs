package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BidResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidResponse   {
  @JsonProperty("bidId")
  
  private Long bidId;

  @JsonProperty("biddableType")
  
  private String biddableType;

  @JsonProperty("biddableId")
  
  private Long biddableId;

  @JsonProperty("amountPerView")
  
  private Double amountPerView;

  @JsonProperty("amountPerAction")
  
  private Double amountPerAction;

  @JsonProperty("currentDailyBudget")
  
  private Double currentDailyBudget;

  @JsonProperty("currentBudget")
  
  private Double currentBudget;

  @JsonProperty("currentBudgetExpiration")
  
  private Long currentBudgetExpiration;

  @JsonProperty("currentBudgetStart")
  
  private Long currentBudgetStart;

  @JsonProperty("budgetAmount")
  
  private Double budgetAmount;

  /**
   * Gets or Sets budgetSchedule
   */
  public enum BudgetScheduleEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    YEARLY("YEARLY");

    private final String value;

    BudgetScheduleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BudgetScheduleEnum fromValue(String value) {
      for (BudgetScheduleEnum b : BudgetScheduleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("budgetSchedule")
  
  private BudgetScheduleEnum budgetSchedule;

  public BidResponse bidId(Long bidId) {
    this.bidId = bidId;
    return this;
  }

   /**
   * Get bidId
   * @return bidId
  **/
  public Long getBidId() {
    return bidId;
  }

  public void setBidId(Long bidId) {
    this.bidId = bidId;
  }

  public BidResponse biddableType(String biddableType) {
    this.biddableType = biddableType;
    return this;
  }

   /**
   * Get biddableType
   * @return biddableType
  **/
  public String getBiddableType() {
    return biddableType;
  }

  public void setBiddableType(String biddableType) {
    this.biddableType = biddableType;
  }

  public BidResponse biddableId(Long biddableId) {
    this.biddableId = biddableId;
    return this;
  }

   /**
   * Get biddableId
   * @return biddableId
  **/
  public Long getBiddableId() {
    return biddableId;
  }

  public void setBiddableId(Long biddableId) {
    this.biddableId = biddableId;
  }

  public BidResponse amountPerView(Double amountPerView) {
    this.amountPerView = amountPerView;
    return this;
  }

   /**
   * Get amountPerView
   * @return amountPerView
  **/
  public Double getAmountPerView() {
    return amountPerView;
  }

  public void setAmountPerView(Double amountPerView) {
    this.amountPerView = amountPerView;
  }

  public BidResponse amountPerAction(Double amountPerAction) {
    this.amountPerAction = amountPerAction;
    return this;
  }

   /**
   * Get amountPerAction
   * @return amountPerAction
  **/
  public Double getAmountPerAction() {
    return amountPerAction;
  }

  public void setAmountPerAction(Double amountPerAction) {
    this.amountPerAction = amountPerAction;
  }

  public BidResponse currentDailyBudget(Double currentDailyBudget) {
    this.currentDailyBudget = currentDailyBudget;
    return this;
  }

   /**
   * Get currentDailyBudget
   * @return currentDailyBudget
  **/
  public Double getCurrentDailyBudget() {
    return currentDailyBudget;
  }

  public void setCurrentDailyBudget(Double currentDailyBudget) {
    this.currentDailyBudget = currentDailyBudget;
  }

  public BidResponse currentBudget(Double currentBudget) {
    this.currentBudget = currentBudget;
    return this;
  }

   /**
   * Get currentBudget
   * @return currentBudget
  **/
  public Double getCurrentBudget() {
    return currentBudget;
  }

  public void setCurrentBudget(Double currentBudget) {
    this.currentBudget = currentBudget;
  }

  public BidResponse currentBudgetExpiration(Long currentBudgetExpiration) {
    this.currentBudgetExpiration = currentBudgetExpiration;
    return this;
  }

   /**
   * Get currentBudgetExpiration
   * @return currentBudgetExpiration
  **/
  public Long getCurrentBudgetExpiration() {
    return currentBudgetExpiration;
  }

  public void setCurrentBudgetExpiration(Long currentBudgetExpiration) {
    this.currentBudgetExpiration = currentBudgetExpiration;
  }

  public BidResponse currentBudgetStart(Long currentBudgetStart) {
    this.currentBudgetStart = currentBudgetStart;
    return this;
  }

   /**
   * Get currentBudgetStart
   * @return currentBudgetStart
  **/
  public Long getCurrentBudgetStart() {
    return currentBudgetStart;
  }

  public void setCurrentBudgetStart(Long currentBudgetStart) {
    this.currentBudgetStart = currentBudgetStart;
  }

  public BidResponse budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * Get budgetAmount
   * @return budgetAmount
  **/
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public BidResponse budgetSchedule(BudgetScheduleEnum budgetSchedule) {
    this.budgetSchedule = budgetSchedule;
    return this;
  }

   /**
   * Get budgetSchedule
   * @return budgetSchedule
  **/
  public BudgetScheduleEnum getBudgetSchedule() {
    return budgetSchedule;
  }

  public void setBudgetSchedule(BudgetScheduleEnum budgetSchedule) {
    this.budgetSchedule = budgetSchedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidResponse bidResponse = (BidResponse) o;
    return Objects.equals(bidId, bidResponse.bidId) &&
        Objects.equals(biddableType, bidResponse.biddableType) &&
        Objects.equals(biddableId, bidResponse.biddableId) &&
        Objects.equals(amountPerView, bidResponse.amountPerView) &&
        Objects.equals(amountPerAction, bidResponse.amountPerAction) &&
        Objects.equals(currentDailyBudget, bidResponse.currentDailyBudget) &&
        Objects.equals(currentBudget, bidResponse.currentBudget) &&
        Objects.equals(currentBudgetExpiration, bidResponse.currentBudgetExpiration) &&
        Objects.equals(currentBudgetStart, bidResponse.currentBudgetStart) &&
        Objects.equals(budgetAmount, bidResponse.budgetAmount) &&
        Objects.equals(budgetSchedule, bidResponse.budgetSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidId, biddableType, biddableId, amountPerView, amountPerAction, currentDailyBudget, currentBudget, currentBudgetExpiration, currentBudgetStart, budgetAmount, budgetSchedule);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidResponse {\n");
    
    sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
    sb.append("    biddableType: ").append(toIndentedString(biddableType)).append("\n");
    sb.append("    biddableId: ").append(toIndentedString(biddableId)).append("\n");
    sb.append("    amountPerView: ").append(toIndentedString(amountPerView)).append("\n");
    sb.append("    amountPerAction: ").append(toIndentedString(amountPerAction)).append("\n");
    sb.append("    currentDailyBudget: ").append(toIndentedString(currentDailyBudget)).append("\n");
    sb.append("    currentBudget: ").append(toIndentedString(currentBudget)).append("\n");
    sb.append("    currentBudgetExpiration: ").append(toIndentedString(currentBudgetExpiration)).append("\n");
    sb.append("    currentBudgetStart: ").append(toIndentedString(currentBudgetStart)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    budgetSchedule: ").append(toIndentedString(budgetSchedule)).append("\n");
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

