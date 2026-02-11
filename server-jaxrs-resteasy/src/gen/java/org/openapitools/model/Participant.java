package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Participant   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account account;
  private Date availableStart;
  private Date availableEnd;
  private String color1;
  private String color2;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TEAM("TEAM"),

        LEAGUE("LEAGUE"),

        SPORT("SPORT");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;

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
  @JsonProperty("availableStart")
  public Date getAvailableStart() {
    return availableStart;
  }
  public void setAvailableStart(Date availableStart) {
    this.availableStart = availableStart;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availableEnd")
  public Date getAvailableEnd() {
    return availableEnd;
  }
  public void setAvailableEnd(Date availableEnd) {
    this.availableEnd = availableEnd;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("color1")
  public String getColor1() {
    return color1;
  }
  public void setColor1(String color1) {
    this.color1 = color1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("color2")
  public String getColor2() {
    return color2;
  }
  public void setColor2(String color2) {
    this.color2 = color2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.id, participant.id) &&
        Objects.equals(this.active, participant.active) &&
        Objects.equals(this.valid, participant.valid) &&
        Objects.equals(this.account, participant.account) &&
        Objects.equals(this.availableStart, participant.availableStart) &&
        Objects.equals(this.availableEnd, participant.availableEnd) &&
        Objects.equals(this.color1, participant.color1) &&
        Objects.equals(this.color2, participant.color2) &&
        Objects.equals(this.type, participant.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, account, availableStart, availableEnd, color1, color2, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    availableStart: ").append(toIndentedString(availableStart)).append("\n");
    sb.append("    availableEnd: ").append(toIndentedString(availableEnd)).append("\n");
    sb.append("    color1: ").append(toIndentedString(color1)).append("\n");
    sb.append("    color2: ").append(toIndentedString(color2)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

