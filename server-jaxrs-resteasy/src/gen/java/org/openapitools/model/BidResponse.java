package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BidResponse   {
  
  private Long bidId;
  private String biddableType;
  private Long biddableId;
  private Double amountPerView;
  private Double amountPerAction;
  private Double currentDailyBudget;
  private Double currentBudget;
  private Long currentBudgetExpiration;
  private Long currentBudgetStart;
  private Double budgetAmount;

  /**
   * Gets or Sets budgetSchedule
   */
  public enum BudgetScheduleEnum {
    DAILY("DAILY"),

        WEEKLY("WEEKLY"),

        MONTHLY("MONTHLY"),

        YEARLY("YEARLY");
    private String value;

    BudgetScheduleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private BudgetScheduleEnum budgetSchedule;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bidId")
  public Long getBidId() {
    return bidId;
  }
  public void setBidId(Long bidId) {
    this.bidId = bidId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("biddableType")
  public String getBiddableType() {
    return biddableType;
  }
  public void setBiddableType(String biddableType) {
    this.biddableType = biddableType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("biddableId")
  public Long getBiddableId() {
    return biddableId;
  }
  public void setBiddableId(Long biddableId) {
    this.biddableId = biddableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amountPerView")
  public Double getAmountPerView() {
    return amountPerView;
  }
  public void setAmountPerView(Double amountPerView) {
    this.amountPerView = amountPerView;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amountPerAction")
  public Double getAmountPerAction() {
    return amountPerAction;
  }
  public void setAmountPerAction(Double amountPerAction) {
    this.amountPerAction = amountPerAction;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentDailyBudget")
  public Double getCurrentDailyBudget() {
    return currentDailyBudget;
  }
  public void setCurrentDailyBudget(Double currentDailyBudget) {
    this.currentDailyBudget = currentDailyBudget;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentBudget")
  public Double getCurrentBudget() {
    return currentBudget;
  }
  public void setCurrentBudget(Double currentBudget) {
    this.currentBudget = currentBudget;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentBudgetExpiration")
  public Long getCurrentBudgetExpiration() {
    return currentBudgetExpiration;
  }
  public void setCurrentBudgetExpiration(Long currentBudgetExpiration) {
    this.currentBudgetExpiration = currentBudgetExpiration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentBudgetStart")
  public Long getCurrentBudgetStart() {
    return currentBudgetStart;
  }
  public void setCurrentBudgetStart(Long currentBudgetStart) {
    this.currentBudgetStart = currentBudgetStart;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("budgetAmount")
  public Double getBudgetAmount() {
    return budgetAmount;
  }
  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("budgetSchedule")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

