package apimodels;

import apimodels.Account;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * YayOrNay
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class YayOrNay   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("yayOrNay")
  
  private Boolean yayOrNay;

  @JsonProperty("likableObjectType")
  
  private String likableObjectType;

  @JsonProperty("likableObjectId")
  
  private Long likableObjectId;

  public YayOrNay id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public YayOrNay active(Boolean active) {
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

  public YayOrNay valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public YayOrNay owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public YayOrNay yayOrNay(Boolean yayOrNay) {
    this.yayOrNay = yayOrNay;
    return this;
  }

   /**
   * Get yayOrNay
   * @return yayOrNay
  **/
  public Boolean getYayOrNay() {
    return yayOrNay;
  }

  public void setYayOrNay(Boolean yayOrNay) {
    this.yayOrNay = yayOrNay;
  }

  public YayOrNay likableObjectType(String likableObjectType) {
    this.likableObjectType = likableObjectType;
    return this;
  }

   /**
   * Get likableObjectType
   * @return likableObjectType
  **/
  public String getLikableObjectType() {
    return likableObjectType;
  }

  public void setLikableObjectType(String likableObjectType) {
    this.likableObjectType = likableObjectType;
  }

  public YayOrNay likableObjectId(Long likableObjectId) {
    this.likableObjectId = likableObjectId;
    return this;
  }

   /**
   * Get likableObjectId
   * @return likableObjectId
  **/
  public Long getLikableObjectId() {
    return likableObjectId;
  }

  public void setLikableObjectId(Long likableObjectId) {
    this.likableObjectId = likableObjectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YayOrNay yayOrNay = (YayOrNay) o;
    return Objects.equals(id, yayOrNay.id) &&
        Objects.equals(active, yayOrNay.active) &&
        Objects.equals(valid, yayOrNay.valid) &&
        Objects.equals(owner, yayOrNay.owner) &&
        Objects.equals(yayOrNay, yayOrNay.yayOrNay) &&
        Objects.equals(likableObjectType, yayOrNay.likableObjectType) &&
        Objects.equals(likableObjectId, yayOrNay.likableObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, yayOrNay, likableObjectType, likableObjectId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YayOrNay {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    yayOrNay: ").append(toIndentedString(yayOrNay)).append("\n");
    sb.append("    likableObjectType: ").append(toIndentedString(likableObjectType)).append("\n");
    sb.append("    likableObjectId: ").append(toIndentedString(likableObjectId)).append("\n");
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

