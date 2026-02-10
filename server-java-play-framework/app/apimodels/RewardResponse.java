package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RewardResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RewardResponse   {
  @JsonProperty("offerId")
  
  private Long offerId;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("subTitle")
  
  private String subTitle;

  @JsonProperty("details")
  
  private String details;

  @JsonProperty("artwork")
  @Valid

  private AssetShortResponse artwork;

  @JsonProperty("finePrint")
  
  private String finePrint;

  @JsonProperty("redemptionCode")
  
  private String redemptionCode;

  @JsonProperty("redemptionStatus")
  
  private Integer redemptionStatus;

  @JsonProperty("transactionId")
  
  private Long transactionId;

  @JsonProperty("estimatedValue")
  
  private Double estimatedValue;

  public RewardResponse offerId(Long offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  public RewardResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RewardResponse subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

   /**
   * Get subTitle
   * @return subTitle
  **/
  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public RewardResponse details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public RewardResponse artwork(AssetShortResponse artwork) {
    this.artwork = artwork;
    return this;
  }

   /**
   * Get artwork
   * @return artwork
  **/
  public AssetShortResponse getArtwork() {
    return artwork;
  }

  public void setArtwork(AssetShortResponse artwork) {
    this.artwork = artwork;
  }

  public RewardResponse finePrint(String finePrint) {
    this.finePrint = finePrint;
    return this;
  }

   /**
   * Get finePrint
   * @return finePrint
  **/
  public String getFinePrint() {
    return finePrint;
  }

  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }

  public RewardResponse redemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

   /**
   * Get redemptionCode
   * @return redemptionCode
  **/
  public String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  public RewardResponse redemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
    return this;
  }

   /**
   * Get redemptionStatus
   * @return redemptionStatus
  **/
  public Integer getRedemptionStatus() {
    return redemptionStatus;
  }

  public void setRedemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  public RewardResponse transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public RewardResponse estimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

   /**
   * Get estimatedValue
   * @return estimatedValue
  **/
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
    return Objects.equals(offerId, rewardResponse.offerId) &&
        Objects.equals(title, rewardResponse.title) &&
        Objects.equals(subTitle, rewardResponse.subTitle) &&
        Objects.equals(details, rewardResponse.details) &&
        Objects.equals(artwork, rewardResponse.artwork) &&
        Objects.equals(finePrint, rewardResponse.finePrint) &&
        Objects.equals(redemptionCode, rewardResponse.redemptionCode) &&
        Objects.equals(redemptionStatus, rewardResponse.redemptionStatus) &&
        Objects.equals(transactionId, rewardResponse.transactionId) &&
        Objects.equals(estimatedValue, rewardResponse.estimatedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, title, subTitle, details, artwork, finePrint, redemptionCode, redemptionStatus, transactionId, estimatedValue);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

