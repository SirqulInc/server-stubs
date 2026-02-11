package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Account;
import org.openapitools.model.OfferLocation;
import org.openapitools.model.Region;
import org.openapitools.model.RetailerLocation;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AudienceTargetType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceTargetType {

  /**
   * Gets or Sets targetType
   */
  public enum TargetTypeEnum {
    RETAILER_LOCATION("RETAILER_LOCATION"),
    
    OFFER_LOCATION("OFFER_LOCATION"),
    
    ACCOUNT("ACCOUNT"),
    
    REGION("REGION");

    private final String value;

    TargetTypeEnum(String value) {
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
    public static TargetTypeEnum fromValue(String value) {
      for (TargetTypeEnum b : TargetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TargetTypeEnum targetType;

  private @Nullable String targetDescription;

  private @Nullable RetailerLocation retailerLocation;

  private @Nullable OfferLocation offerLocation;

  private @Nullable Account account;

  private @Nullable Region region;

  public AudienceTargetType targetType(@Nullable TargetTypeEnum targetType) {
    this.targetType = targetType;
    return this;
  }

  /**
   * Get targetType
   * @return targetType
   */
  
  @Schema(name = "targetType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetType")
  public @Nullable TargetTypeEnum getTargetType() {
    return targetType;
  }

  public void setTargetType(@Nullable TargetTypeEnum targetType) {
    this.targetType = targetType;
  }

  public AudienceTargetType targetDescription(@Nullable String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
  }

  /**
   * Get targetDescription
   * @return targetDescription
   */
  
  @Schema(name = "targetDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetDescription")
  public @Nullable String getTargetDescription() {
    return targetDescription;
  }

  public void setTargetDescription(@Nullable String targetDescription) {
    this.targetDescription = targetDescription;
  }

  public AudienceTargetType retailerLocation(@Nullable RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

  /**
   * Get retailerLocation
   * @return retailerLocation
   */
  @Valid 
  @Schema(name = "retailerLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocation")
  public @Nullable RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(@Nullable RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public AudienceTargetType offerLocation(@Nullable OfferLocation offerLocation) {
    this.offerLocation = offerLocation;
    return this;
  }

  /**
   * Get offerLocation
   * @return offerLocation
   */
  @Valid 
  @Schema(name = "offerLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerLocation")
  public @Nullable OfferLocation getOfferLocation() {
    return offerLocation;
  }

  public void setOfferLocation(@Nullable OfferLocation offerLocation) {
    this.offerLocation = offerLocation;
  }

  public AudienceTargetType account(@Nullable Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public @Nullable Account getAccount() {
    return account;
  }

  public void setAccount(@Nullable Account account) {
    this.account = account;
  }

  public AudienceTargetType region(@Nullable Region region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @Valid 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public @Nullable Region getRegion() {
    return region;
  }

  public void setRegion(@Nullable Region region) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

