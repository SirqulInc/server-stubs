package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Account;
import org.openapitools.model.OfferLocation;
import org.openapitools.model.Region;
import org.openapitools.model.RetailerLocation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceTargetType  {
  
public enum TargetTypeEnum {

RETAILER_LOCATION(String.valueOf("RETAILER_LOCATION")), OFFER_LOCATION(String.valueOf("OFFER_LOCATION")), ACCOUNT(String.valueOf("ACCOUNT")), REGION(String.valueOf("REGION"));


    private String value;

    TargetTypeEnum (String v) {
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
    public static TargetTypeEnum fromValue(String value) {
        for (TargetTypeEnum b : TargetTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TargetTypeEnum targetType;

  @ApiModelProperty(value = "")

  private String targetDescription;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerLocation retailerLocation;

  @ApiModelProperty(value = "")

  @Valid

  private OfferLocation offerLocation;

  @ApiModelProperty(value = "")

  @Valid

  private Account account;

  @ApiModelProperty(value = "")

  @Valid

  private Region region;
 /**
   * Get targetType
   * @return targetType
  **/
  @JsonProperty("targetType")
  public String getTargetType() {
    if (targetType == null) {
      return null;
    }
    return targetType.value();
  }

  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }

  public AudienceTargetType targetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
    return this;
  }

 /**
   * Get targetDescription
   * @return targetDescription
  **/
  @JsonProperty("targetDescription")
  public String getTargetDescription() {
    return targetDescription;
  }

  public void setTargetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
  }

  public AudienceTargetType targetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
  }

 /**
   * Get retailerLocation
   * @return retailerLocation
  **/
  @JsonProperty("retailerLocation")
  public RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public AudienceTargetType retailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

 /**
   * Get offerLocation
   * @return offerLocation
  **/
  @JsonProperty("offerLocation")
  public OfferLocation getOfferLocation() {
    return offerLocation;
  }

  public void setOfferLocation(OfferLocation offerLocation) {
    this.offerLocation = offerLocation;
  }

  public AudienceTargetType offerLocation(OfferLocation offerLocation) {
    this.offerLocation = offerLocation;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public AudienceTargetType account(Account account) {
    this.account = account;
    return this;
  }

 /**
   * Get region
   * @return region
  **/
  @JsonProperty("region")
  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public AudienceTargetType region(Region region) {
    this.region = region;
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
    AudienceTargetType audienceTargetType = (AudienceTargetType) o;
    return Objects.equals(this.targetType, audienceTargetType.targetType) &&
        Objects.equals(this.targetDescription, audienceTargetType.targetDescription) &&
        Objects.equals(this.retailerLocation, audienceTargetType.retailerLocation) &&
        Objects.equals(this.offerLocation, audienceTargetType.offerLocation) &&
        Objects.equals(this.account, audienceTargetType.account) &&
        Objects.equals(this.region, audienceTargetType.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetType, targetDescription, retailerLocation, offerLocation, account, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceTargetType {\n");
    
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetDescription: ").append(toIndentedString(targetDescription)).append("\n");
    sb.append("    retailerLocation: ").append(toIndentedString(retailerLocation)).append("\n");
    sb.append("    offerLocation: ").append(toIndentedString(offerLocation)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

