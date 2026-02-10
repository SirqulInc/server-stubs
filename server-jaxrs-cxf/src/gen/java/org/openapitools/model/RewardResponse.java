package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RewardResponse  {
  
  @ApiModelProperty(value = "")

  private Long offerId;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String subTitle;

  @ApiModelProperty(value = "")

  private String details;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse artwork;

  @ApiModelProperty(value = "")

  private String finePrint;

  @ApiModelProperty(value = "")

  private String redemptionCode;

  @ApiModelProperty(value = "")

  private Integer redemptionStatus;

  @ApiModelProperty(value = "")

  private Long transactionId;

  @ApiModelProperty(value = "")

  private Double estimatedValue;
 /**
   * Get offerId
   * @return offerId
  **/
  @JsonProperty("offerId")
  public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  public RewardResponse offerId(Long offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RewardResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get subTitle
   * @return subTitle
  **/
  @JsonProperty("subTitle")
  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public RewardResponse subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public RewardResponse details(String details) {
    this.details = details;
    return this;
  }

 /**
   * Get artwork
   * @return artwork
  **/
  @JsonProperty("artwork")
  public AssetShortResponse getArtwork() {
    return artwork;
  }

  public void setArtwork(AssetShortResponse artwork) {
    this.artwork = artwork;
  }

  public RewardResponse artwork(AssetShortResponse artwork) {
    this.artwork = artwork;
    return this;
  }

 /**
   * Get finePrint
   * @return finePrint
  **/
  @JsonProperty("finePrint")
  public String getFinePrint() {
    return finePrint;
  }

  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }

  public RewardResponse finePrint(String finePrint) {
    this.finePrint = finePrint;
    return this;
  }

 /**
   * Get redemptionCode
   * @return redemptionCode
  **/
  @JsonProperty("redemptionCode")
  public String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  public RewardResponse redemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

 /**
   * Get redemptionStatus
   * @return redemptionStatus
  **/
  @JsonProperty("redemptionStatus")
  public Integer getRedemptionStatus() {
    return redemptionStatus;
  }

  public void setRedemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  public RewardResponse redemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
    return this;
  }

 /**
   * Get transactionId
   * @return transactionId
  **/
  @JsonProperty("transactionId")
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public RewardResponse transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

 /**
   * Get estimatedValue
   * @return estimatedValue
  **/
  @JsonProperty("estimatedValue")
  public Double getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  public RewardResponse estimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

