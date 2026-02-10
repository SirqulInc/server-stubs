package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Account;
import org.openapitools.model.OfferLocation;
import org.openapitools.model.Region;
import org.openapitools.model.RetailerLocation;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceTargetType   {
  

  /**
   * Gets or Sets targetType
   */
  public enum TargetTypeEnum {
    RETAILER_LOCATION("RETAILER_LOCATION"),

        OFFER_LOCATION("OFFER_LOCATION"),

        ACCOUNT("ACCOUNT"),

        REGION("REGION");
    private String value;

    TargetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TargetTypeEnum targetType;
  private String targetDescription;
  private RetailerLocation retailerLocation;
  private OfferLocation offerLocation;
  private Account account;
  private Region region;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetType")
  public TargetTypeEnum getTargetType() {
    return targetType;
  }
  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targetDescription")
  public String getTargetDescription() {
    return targetDescription;
  }
  public void setTargetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocation")
  @Valid
  public RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }
  public void setRetailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerLocation")
  @Valid
  public OfferLocation getOfferLocation() {
    return offerLocation;
  }
  public void setOfferLocation(OfferLocation offerLocation) {
    this.offerLocation = offerLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("account")
  @Valid
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("region")
  @Valid
  public Region getRegion() {
    return region;
  }
  public void setRegion(Region region) {
    this.region = region;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

