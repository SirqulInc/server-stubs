package apimodels;

import apimodels.AssetShortResponse;
import apimodels.BillableEntityResponse;
import apimodels.ContactInfoResponse;
import apimodels.ProfileShortResponse;
import apimodels.RetailerCountResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RetailerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerResponse   {
  @JsonProperty("retailerId")
  
  private Long retailerId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("facebookUrl")
  
  private String facebookUrl;

  @JsonProperty("twitterUrl")
  
  private String twitterUrl;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("contact")
  @Valid

  private ContactInfoResponse contact;

  @JsonProperty("logo")
  @Valid

  private AssetShortResponse logo;

  @JsonProperty("picture1")
  @Valid

  private AssetShortResponse picture1;

  @JsonProperty("picture2")
  @Valid

  private AssetShortResponse picture2;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("visibility")
  
  private String visibility;

  @JsonProperty("responsible")
  @Valid

  private ProfileShortResponse responsible;

  @JsonProperty("manager")
  @Valid

  private ProfileShortResponse manager;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntityResponse billableEntity;

  @JsonProperty("counts")
  @Valid

  private RetailerCountResponse counts;

  public RetailerResponse retailerId(Long retailerId) {
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Get retailerId
   * @return retailerId
  **/
  public Long getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(Long retailerId) {
    this.retailerId = retailerId;
  }

  public RetailerResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RetailerResponse facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

   /**
   * Get facebookUrl
   * @return facebookUrl
  **/
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public RetailerResponse twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

   /**
   * Get twitterUrl
   * @return twitterUrl
  **/
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public RetailerResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public RetailerResponse contact(ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(ContactInfoResponse contact) {
    this.contact = contact;
  }

  public RetailerResponse logo(AssetShortResponse logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  public AssetShortResponse getLogo() {
    return logo;
  }

  public void setLogo(AssetShortResponse logo) {
    this.logo = logo;
  }

  public RetailerResponse picture1(AssetShortResponse picture1) {
    this.picture1 = picture1;
    return this;
  }

   /**
   * Get picture1
   * @return picture1
  **/
  public AssetShortResponse getPicture1() {
    return picture1;
  }

  public void setPicture1(AssetShortResponse picture1) {
    this.picture1 = picture1;
  }

  public RetailerResponse picture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
    return this;
  }

   /**
   * Get picture2
   * @return picture2
  **/
  public AssetShortResponse getPicture2() {
    return picture2;
  }

  public void setPicture2(AssetShortResponse picture2) {
    this.picture2 = picture2;
  }

  public RetailerResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public RetailerResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public RetailerResponse visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public RetailerResponse responsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
    return this;
  }

   /**
   * Get responsible
   * @return responsible
  **/
  public ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public RetailerResponse manager(ProfileShortResponse manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  public ProfileShortResponse getManager() {
    return manager;
  }

  public void setManager(ProfileShortResponse manager) {
    this.manager = manager;
  }

  public RetailerResponse billableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public RetailerResponse counts(RetailerCountResponse counts) {
    this.counts = counts;
    return this;
  }

   /**
   * Get counts
   * @return counts
  **/
  public RetailerCountResponse getCounts() {
    return counts;
  }

  public void setCounts(RetailerCountResponse counts) {
    this.counts = counts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailerResponse retailerResponse = (RetailerResponse) o;
    return Objects.equals(retailerId, retailerResponse.retailerId) &&
        Objects.equals(name, retailerResponse.name) &&
        Objects.equals(facebookUrl, retailerResponse.facebookUrl) &&
        Objects.equals(twitterUrl, retailerResponse.twitterUrl) &&
        Objects.equals(active, retailerResponse.active) &&
        Objects.equals(contact, retailerResponse.contact) &&
        Objects.equals(logo, retailerResponse.logo) &&
        Objects.equals(picture1, retailerResponse.picture1) &&
        Objects.equals(picture2, retailerResponse.picture2) &&
        Objects.equals(latitude, retailerResponse.latitude) &&
        Objects.equals(longitude, retailerResponse.longitude) &&
        Objects.equals(visibility, retailerResponse.visibility) &&
        Objects.equals(responsible, retailerResponse.responsible) &&
        Objects.equals(manager, retailerResponse.manager) &&
        Objects.equals(billableEntity, retailerResponse.billableEntity) &&
        Objects.equals(counts, retailerResponse.counts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, name, facebookUrl, twitterUrl, active, contact, logo, picture1, picture2, latitude, longitude, visibility, responsible, manager, billableEntity, counts);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerResponse {\n");
    
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    facebookUrl: ").append(toIndentedString(facebookUrl)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    picture1: ").append(toIndentedString(picture1)).append("\n");
    sb.append("    picture2: ").append(toIndentedString(picture2)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
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

