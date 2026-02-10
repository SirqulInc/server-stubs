package apimodels;

import apimodels.Account;
import apimodels.OfferLocation;
import apimodels.Region;
import apimodels.RetailerLocation;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AudienceTargetType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceTargetType   {
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

  @JsonProperty("targetType")
  
  private TargetTypeEnum targetType;

  @JsonProperty("targetDescription")
  
  private String targetDescription;

  @JsonProperty("retailerLocation")
  @Valid

  private RetailerLocation retailerLocation;

  @JsonProperty("offerLocation")
  @Valid

  private OfferLocation offerLocation;

  @JsonProperty("account")
  @Valid

  private Account account;

  @JsonProperty("region")
  @Valid

  private Region region;

  public AudienceTargetType targetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  public TargetTypeEnum getTargetType() {
    return targetType;
  }

  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }

  public AudienceTargetType targetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
  }

   /**
   * Get targetDescription
   * @return targetDescription
  **/
  public String getTargetDescription() {
    return targetDescription;
  }

  public void setTargetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
  }

  public AudienceTargetType retailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

   /**
   * Get retailerLocation
   * @return retailerLocation
  **/
  public RetailerLocation getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(RetailerLocation retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public AudienceTargetType offerLocation(OfferLocation offerLocation) {
    this.offerLocation = offerLocation;
    return this;
  }

   /**
   * Get offerLocation
   * @return offerLocation
  **/
  public OfferLocation getOfferLocation() {
    return offerLocation;
  }

  public void setOfferLocation(OfferLocation offerLocation) {
    this.offerLocation = offerLocation;
  }

  public AudienceTargetType account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public AudienceTargetType region(Region region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
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
    return Objects.equals(targetType, audienceTargetType.targetType) &&
        Objects.equals(targetDescription, audienceTargetType.targetDescription) &&
        Objects.equals(retailerLocation, audienceTargetType.retailerLocation) &&
        Objects.equals(offerLocation, audienceTargetType.offerLocation) &&
        Objects.equals(account, audienceTargetType.account) &&
        Objects.equals(region, audienceTargetType.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetType, targetDescription, retailerLocation, offerLocation, account, region);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

