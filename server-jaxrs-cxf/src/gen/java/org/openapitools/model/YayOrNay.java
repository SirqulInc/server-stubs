package org.openapitools.model;

import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class YayOrNay  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private Boolean yayOrNay;

  @ApiModelProperty(value = "")

  private String likableObjectType;

  @ApiModelProperty(value = "")

  private Long likableObjectId;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public YayOrNay id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public YayOrNay active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public YayOrNay valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public YayOrNay owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get yayOrNay
   * @return yayOrNay
  **/
  @JsonProperty("yayOrNay")
  public Boolean getYayOrNay() {
    return yayOrNay;
  }

  public void setYayOrNay(Boolean yayOrNay) {
    this.yayOrNay = yayOrNay;
  }

  public YayOrNay yayOrNay(Boolean yayOrNay) {
    this.yayOrNay = yayOrNay;
    return this;
  }

 /**
   * Get likableObjectType
   * @return likableObjectType
  **/
  @JsonProperty("likableObjectType")
  public String getLikableObjectType() {
    return likableObjectType;
  }

  public void setLikableObjectType(String likableObjectType) {
    this.likableObjectType = likableObjectType;
  }

  public YayOrNay likableObjectType(String likableObjectType) {
    this.likableObjectType = likableObjectType;
    return this;
  }

 /**
   * Get likableObjectId
   * @return likableObjectId
  **/
  @JsonProperty("likableObjectId")
  public Long getLikableObjectId() {
    return likableObjectId;
  }

  public void setLikableObjectId(Long likableObjectId) {
    this.likableObjectId = likableObjectId;
  }

  public YayOrNay likableObjectId(Long likableObjectId) {
    this.likableObjectId = likableObjectId;
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
    YayOrNay yayOrNay = (YayOrNay) o;
    return Objects.equals(this.id, yayOrNay.id) &&
        Objects.equals(this.active, yayOrNay.active) &&
        Objects.equals(this.valid, yayOrNay.valid) &&
        Objects.equals(this.owner, yayOrNay.owner) &&
        Objects.equals(this.yayOrNay, yayOrNay.yayOrNay) &&
        Objects.equals(this.likableObjectType, yayOrNay.likableObjectType) &&
        Objects.equals(this.likableObjectId, yayOrNay.likableObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, yayOrNay, likableObjectType, likableObjectId);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

