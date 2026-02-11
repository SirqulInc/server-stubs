package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BidResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BidResponse {

  private @Nullable Long bidId;

  private @Nullable String biddableType;

  private @Nullable Long biddableId;

  private @Nullable Double amountPerView;

  private @Nullable Double amountPerAction;

  private @Nullable Double currentDailyBudget;

  private @Nullable Double currentBudget;

  private @Nullable Long currentBudgetExpiration;

  private @Nullable Long currentBudgetStart;

  private @Nullable Double budgetAmount;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable BudgetScheduleEnum budgetSchedule;

  public BidResponse bidId(@Nullable Long bidId) {
    this.bidId = bidId;
    return this;
  }

  /**
   * Get bidId
   * @return bidId
   */
  
  @Schema(name = "bidId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bidId")
  public @Nullable Long getBidId() {
    return bidId;
  }

  public void setBidId(@Nullable Long bidId) {
    this.bidId = bidId;
  }

  public BidResponse biddableType(@Nullable String biddableType) {
    this.biddableType = biddableType;
    return this;
  }

  /**
   * Get biddableType
   * @return biddableType
   */
  
  @Schema(name = "biddableType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biddableType")
  public @Nullable String getBiddableType() {
    return biddableType;
  }

  public void setBiddableType(@Nullable String biddableType) {
    this.biddableType = biddableType;
  }

  public BidResponse biddableId(@Nullable Long biddableId) {
    this.biddableId = biddableId;
    return this;
  }

  /**
   * Get biddableId
   * @return biddableId
   */
  
  @Schema(name = "biddableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biddableId")
  public @Nullable Long getBiddableId() {
    return biddableId;
  }

  public void setBiddableId(@Nullable Long biddableId) {
    this.biddableId = biddableId;
  }

  public BidResponse amountPerView(@Nullable Double amountPerView) {
    this.amountPerView = amountPerView;
    return this;
  }

  /**
   * Get amountPerView
   * @return amountPerView
   */
  
  @Schema(name = "amountPerView", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountPerView")
  public @Nullable Double getAmountPerView() {
    return amountPerView;
  }

  public void setAmountPerView(@Nullable Double amountPerView) {
    this.amountPerView = amountPerView;
  }

  public BidResponse amountPerAction(@Nullable Double amountPerAction) {
    this.amountPerAction = amountPerAction;
    return this;
  }

  /**
   * Get amountPerAction
   * @return amountPerAction
   */
  
  @Schema(name = "amountPerAction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amountPerAction")
  public @Nullable Double getAmountPerAction() {
    return amountPerAction;
  }

  public void setAmountPerAction(@Nullable Double amountPerAction) {
    this.amountPerAction = amountPerAction;
  }

  public BidResponse currentDailyBudget(@Nullable Double currentDailyBudget) {
    this.currentDailyBudget = currentDailyBudget;
    return this;
  }

  /**
   * Get currentDailyBudget
   * @return currentDailyBudget
   */
  
  @Schema(name = "currentDailyBudget", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentDailyBudget")
  public @Nullable Double getCurrentDailyBudget() {
    return currentDailyBudget;
  }

  public void setCurrentDailyBudget(@Nullable Double currentDailyBudget) {
    this.currentDailyBudget = currentDailyBudget;
  }

  public BidResponse currentBudget(@Nullable Double currentBudget) {
    this.currentBudget = currentBudget;
    return this;
  }

  /**
   * Get currentBudget
   * @return currentBudget
   */
  
  @Schema(name = "currentBudget", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentBudget")
  public @Nullable Double getCurrentBudget() {
    return currentBudget;
  }

  public void setCurrentBudget(@Nullable Double currentBudget) {
    this.currentBudget = currentBudget;
  }

  public BidResponse currentBudgetExpiration(@Nullable Long currentBudgetExpiration) {
    this.currentBudgetExpiration = currentBudgetExpiration;
    return this;
  }

  /**
   * Get currentBudgetExpiration
   * @return currentBudgetExpiration
   */
  
  @Schema(name = "currentBudgetExpiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentBudgetExpiration")
  public @Nullable Long getCurrentBudgetExpiration() {
    return currentBudgetExpiration;
  }

  public void setCurrentBudgetExpiration(@Nullable Long currentBudgetExpiration) {
    this.currentBudgetExpiration = currentBudgetExpiration;
  }

  public BidResponse currentBudgetStart(@Nullable Long currentBudgetStart) {
    this.currentBudgetStart = currentBudgetStart;
    return this;
  }

  /**
   * Get currentBudgetStart
   * @return currentBudgetStart
   */
  
  @Schema(name = "currentBudgetStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentBudgetStart")
  public @Nullable Long getCurrentBudgetStart() {
    return currentBudgetStart;
  }

  public void setCurrentBudgetStart(@Nullable Long currentBudgetStart) {
    this.currentBudgetStart = currentBudgetStart;
  }

  public BidResponse budgetAmount(@Nullable Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * Get budgetAmount
   * @return budgetAmount
   */
  
  @Schema(name = "budgetAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budgetAmount")
  public @Nullable Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(@Nullable Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public BidResponse budgetSchedule(@Nullable BudgetScheduleEnum budgetSchedule) {
    this.budgetSchedule = budgetSchedule;
    return this;
  }

  /**
   * Get budgetSchedule
   * @return budgetSchedule
   */
  
  @Schema(name = "budgetSchedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budgetSchedule")
  public @Nullable BudgetScheduleEnum getBudgetSchedule() {
    return budgetSchedule;
  }

  public void setBudgetSchedule(@Nullable BudgetScheduleEnum budgetSchedule) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

