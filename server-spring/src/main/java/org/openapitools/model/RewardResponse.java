package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RewardResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RewardResponse {

  private @Nullable Long offerId;

  private @Nullable String title;

  private @Nullable String subTitle;

  private @Nullable String details;

  private @Nullable AssetShortResponse artwork;

  private @Nullable String finePrint;

  private @Nullable String redemptionCode;

  private @Nullable Integer redemptionStatus;

  private @Nullable Long transactionId;

  private @Nullable Double estimatedValue;

  public RewardResponse offerId(@Nullable Long offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
   */
  
  @Schema(name = "offerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerId")
  public @Nullable Long getOfferId() {
    return offerId;
  }

  public void setOfferId(@Nullable Long offerId) {
    this.offerId = offerId;
  }

  public RewardResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public RewardResponse subTitle(@Nullable String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  /**
   * Get subTitle
   * @return subTitle
   */
  
  @Schema(name = "subTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subTitle")
  public @Nullable String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(@Nullable String subTitle) {
    this.subTitle = subTitle;
  }

  public RewardResponse details(@Nullable String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public @Nullable String getDetails() {
    return details;
  }

  public void setDetails(@Nullable String details) {
    this.details = details;
  }

  public RewardResponse artwork(@Nullable AssetShortResponse artwork) {
    this.artwork = artwork;
    return this;
  }

  /**
   * Get artwork
   * @return artwork
   */
  @Valid 
  @Schema(name = "artwork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artwork")
  public @Nullable AssetShortResponse getArtwork() {
    return artwork;
  }

  public void setArtwork(@Nullable AssetShortResponse artwork) {
    this.artwork = artwork;
  }

  public RewardResponse finePrint(@Nullable String finePrint) {
    this.finePrint = finePrint;
    return this;
  }

  /**
   * Get finePrint
   * @return finePrint
   */
  
  @Schema(name = "finePrint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finePrint")
  public @Nullable String getFinePrint() {
    return finePrint;
  }

  public void setFinePrint(@Nullable String finePrint) {
    this.finePrint = finePrint;
  }

  public RewardResponse redemptionCode(@Nullable String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

  /**
   * Get redemptionCode
   * @return redemptionCode
   */
  
  @Schema(name = "redemptionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptionCode")
  public @Nullable String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(@Nullable String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  public RewardResponse redemptionStatus(@Nullable Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
    return this;
  }

  /**
   * Get redemptionStatus
   * @return redemptionStatus
   */
  
  @Schema(name = "redemptionStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptionStatus")
  public @Nullable Integer getRedemptionStatus() {
    return redemptionStatus;
  }

  public void setRedemptionStatus(@Nullable Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  public RewardResponse transactionId(@Nullable Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   */
  
  @Schema(name = "transactionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public @Nullable Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(@Nullable Long transactionId) {
    this.transactionId = transactionId;
  }

  public RewardResponse estimatedValue(@Nullable Double estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

  /**
   * Get estimatedValue
   * @return estimatedValue
   */
  
  @Schema(name = "estimatedValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedValue")
  public @Nullable Double getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(@Nullable Double estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardResponse rewardResponse = (RewardResponse) o;
    return Objects.equals(this.offerId, rewardResponse.offerId) &&
        Objects.equals(this.title, rewardResponse.title) &&
        Objects.equals(this.subTitle, rewardResponse.subTitle) &&
        Objects.equals(this.details, rewardResponse.details) &&
        Objects.equals(this.artwork, rewardResponse.artwork) &&
        Objects.equals(this.finePrint, rewardResponse.finePrint) &&
        Objects.equals(this.redemptionCode, rewardResponse.redemptionCode) &&
        Objects.equals(this.redemptionStatus, rewardResponse.redemptionStatus) &&
        Objects.equals(this.transactionId, rewardResponse.transactionId) &&
        Objects.equals(this.estimatedValue, rewardResponse.estimatedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, title, subTitle, details, artwork, finePrint, redemptionCode, redemptionStatus, transactionId, estimatedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardResponse {\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    artwork: ").append(toIndentedString(artwork)).append("\n");
    sb.append("    finePrint: ").append(toIndentedString(finePrint)).append("\n");
    sb.append("    redemptionCode: ").append(toIndentedString(redemptionCode)).append("\n");
    sb.append("    redemptionStatus: ").append(toIndentedString(redemptionStatus)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
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

