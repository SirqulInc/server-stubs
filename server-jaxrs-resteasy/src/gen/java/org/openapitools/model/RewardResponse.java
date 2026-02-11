package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RewardResponse   {
  
  private Long offerId;
  private String title;
  private String subTitle;
  private String details;
  private AssetShortResponse artwork;
  private String finePrint;
  private String redemptionCode;
  private Integer redemptionStatus;
  private Long transactionId;
  private Double estimatedValue;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerId")
  public Long getOfferId() {
    return offerId;
  }
  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subTitle")
  public String getSubTitle() {
    return subTitle;
  }
  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("artwork")
  @Valid
  public AssetShortResponse getArtwork() {
    return artwork;
  }
  public void setArtwork(AssetShortResponse artwork) {
    this.artwork = artwork;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("finePrint")
  public String getFinePrint() {
    return finePrint;
  }
  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redemptionCode")
  public String getRedemptionCode() {
    return redemptionCode;
  }
  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redemptionStatus")
  public Integer getRedemptionStatus() {
    return redemptionStatus;
  }
  public void setRedemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionId")
  public Long getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedValue")
  public Double getEstimatedValue() {
    return estimatedValue;
  }
  public void setEstimatedValue(Double estimatedValue) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

