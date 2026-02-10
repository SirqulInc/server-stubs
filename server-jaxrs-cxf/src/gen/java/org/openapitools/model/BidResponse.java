package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BidResponse  {
  
  @ApiModelProperty(value = "")

  private Long bidId;

  @ApiModelProperty(value = "")

  private String biddableType;

  @ApiModelProperty(value = "")

  private Long biddableId;

  @ApiModelProperty(value = "")

  private Double amountPerView;

  @ApiModelProperty(value = "")

  private Double amountPerAction;

  @ApiModelProperty(value = "")

  private Double currentDailyBudget;

  @ApiModelProperty(value = "")

  private Double currentBudget;

  @ApiModelProperty(value = "")

  private Long currentBudgetExpiration;

  @ApiModelProperty(value = "")

  private Long currentBudgetStart;

  @ApiModelProperty(value = "")

  private Double budgetAmount;

public enum BudgetScheduleEnum {

DAILY(String.valueOf("DAILY")), WEEKLY(String.valueOf("WEEKLY")), MONTHLY(String.valueOf("MONTHLY")), YEARLY(String.valueOf("YEARLY"));


    private String value;

    BudgetScheduleEnum (String v) {
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
    public static BudgetScheduleEnum fromValue(String value) {
        for (BudgetScheduleEnum b : BudgetScheduleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private BudgetScheduleEnum budgetSchedule;
 /**
   * Get bidId
   * @return bidId
  **/
  @JsonProperty("bidId")
  public Long getBidId() {
    return bidId;
  }

  public void setBidId(Long bidId) {
    this.bidId = bidId;
  }

  public BidResponse bidId(Long bidId) {
    this.bidId = bidId;
    return this;
  }

 /**
   * Get biddableType
   * @return biddableType
  **/
  @JsonProperty("biddableType")
  public String getBiddableType() {
    return biddableType;
  }

  public void setBiddableType(String biddableType) {
    this.biddableType = biddableType;
  }

  public BidResponse biddableType(String biddableType) {
    this.biddableType = biddableType;
    return this;
  }

 /**
   * Get biddableId
   * @return biddableId
  **/
  @JsonProperty("biddableId")
  public Long getBiddableId() {
    return biddableId;
  }

  public void setBiddableId(Long biddableId) {
    this.biddableId = biddableId;
  }

  public BidResponse biddableId(Long biddableId) {
    this.biddableId = biddableId;
    return this;
  }

 /**
   * Get amountPerView
   * @return amountPerView
  **/
  @JsonProperty("amountPerView")
  public Double getAmountPerView() {
    return amountPerView;
  }

  public void setAmountPerView(Double amountPerView) {
    this.amountPerView = amountPerView;
  }

  public BidResponse amountPerView(Double amountPerView) {
    this.amountPerView = amountPerView;
    return this;
  }

 /**
   * Get amountPerAction
   * @return amountPerAction
  **/
  @JsonProperty("amountPerAction")
  public Double getAmountPerAction() {
    return amountPerAction;
  }

  public void setAmountPerAction(Double amountPerAction) {
    this.amountPerAction = amountPerAction;
  }

  public BidResponse amountPerAction(Double amountPerAction) {
    this.amountPerAction = amountPerAction;
    return this;
  }

 /**
   * Get currentDailyBudget
   * @return currentDailyBudget
  **/
  @JsonProperty("currentDailyBudget")
  public Double getCurrentDailyBudget() {
    return currentDailyBudget;
  }

  public void setCurrentDailyBudget(Double currentDailyBudget) {
    this.currentDailyBudget = currentDailyBudget;
  }

  public BidResponse currentDailyBudget(Double currentDailyBudget) {
    this.currentDailyBudget = currentDailyBudget;
    return this;
  }

 /**
   * Get currentBudget
   * @return currentBudget
  **/
  @JsonProperty("currentBudget")
  public Double getCurrentBudget() {
    return currentBudget;
  }

  public void setCurrentBudget(Double currentBudget) {
    this.currentBudget = currentBudget;
  }

  public BidResponse currentBudget(Double currentBudget) {
    this.currentBudget = currentBudget;
    return this;
  }

 /**
   * Get currentBudgetExpiration
   * @return currentBudgetExpiration
  **/
  @JsonProperty("currentBudgetExpiration")
  public Long getCurrentBudgetExpiration() {
    return currentBudgetExpiration;
  }

  public void setCurrentBudgetExpiration(Long currentBudgetExpiration) {
    this.currentBudgetExpiration = currentBudgetExpiration;
  }

  public BidResponse currentBudgetExpiration(Long currentBudgetExpiration) {
    this.currentBudgetExpiration = currentBudgetExpiration;
    return this;
  }

 /**
   * Get currentBudgetStart
   * @return currentBudgetStart
  **/
  @JsonProperty("currentBudgetStart")
  public Long getCurrentBudgetStart() {
    return currentBudgetStart;
  }

  public void setCurrentBudgetStart(Long currentBudgetStart) {
    this.currentBudgetStart = currentBudgetStart;
  }

  public BidResponse currentBudgetStart(Long currentBudgetStart) {
    this.currentBudgetStart = currentBudgetStart;
    return this;
  }

 /**
   * Get budgetAmount
   * @return budgetAmount
  **/
  @JsonProperty("budgetAmount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public BidResponse budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

 /**
   * Get budgetSchedule
   * @return budgetSchedule
  **/
  @JsonProperty("budgetSchedule")
  public String getBudgetSchedule() {
    if (budgetSchedule == null) {
      return null;
    }
    return budgetSchedule.value();
  }

  public void setBudgetSchedule(BudgetScheduleEnum budgetSchedule) {
    this.budgetSchedule = budgetSchedule;
  }

  public BidResponse budgetSchedule(BudgetScheduleEnum budgetSchedule) {
    this.budgetSchedule = budgetSchedule;
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
    BidResponse bidResponse = (BidResponse) o;
    return Objects.equals(this.bidId, bidResponse.bidId) &&
        Objects.equals(this.biddableType, bidResponse.biddableType) &&
        Objects.equals(this.biddableId, bidResponse.biddableId) &&
        Objects.equals(this.amountPerView, bidResponse.amountPerView) &&
        Objects.equals(this.amountPerAction, bidResponse.amountPerAction) &&
        Objects.equals(this.currentDailyBudget, bidResponse.currentDailyBudget) &&
        Objects.equals(this.currentBudget, bidResponse.currentBudget) &&
        Objects.equals(this.currentBudgetExpiration, bidResponse.currentBudgetExpiration) &&
        Objects.equals(this.currentBudgetStart, bidResponse.currentBudgetStart) &&
        Objects.equals(this.budgetAmount, bidResponse.budgetAmount) &&
        Objects.equals(this.budgetSchedule, bidResponse.budgetSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidId, biddableType, biddableId, amountPerView, amountPerAction, currentDailyBudget, currentBudget, currentBudgetExpiration, currentBudgetStart, budgetAmount, budgetSchedule);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

