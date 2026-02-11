package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class YayOrNay   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
  private Boolean yayOrNay;
  private String likableObjectType;
  private Long likableObjectId;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("yayOrNay")
  public Boolean getYayOrNay() {
    return yayOrNay;
  }
  public void setYayOrNay(Boolean yayOrNay) {
    this.yayOrNay = yayOrNay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likableObjectType")
  public String getLikableObjectType() {
    return likableObjectType;
  }
  public void setLikableObjectType(String likableObjectType) {
    this.likableObjectType = likableObjectType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likableObjectId")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

