package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Participant  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account account;

  @ApiModelProperty(value = "")

  private Date availableStart;

  @ApiModelProperty(value = "")

  private Date availableEnd;

  @ApiModelProperty(value = "")

  private String color1;

  @ApiModelProperty(value = "")

  private String color2;

public enum TypeEnum {

TEAM(String.valueOf("TEAM")), LEAGUE(String.valueOf("LEAGUE")), SPORT(String.valueOf("SPORT"));


    private String value;

    TypeEnum (String v) {
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
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TypeEnum type;
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

  public Participant id(Long id) {
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

  public Participant active(Boolean active) {
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

  public Participant valid(Boolean valid) {
    this.valid = valid;
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

  public Participant account(Account account) {
    this.account = account;
    return this;
  }

 /**
   * Get availableStart
   * @return availableStart
  **/
  @JsonProperty("availableStart")
  public Date getAvailableStart() {
    return availableStart;
  }

  public void setAvailableStart(Date availableStart) {
    this.availableStart = availableStart;
  }

  public Participant availableStart(Date availableStart) {
    this.availableStart = availableStart;
    return this;
  }

 /**
   * Get availableEnd
   * @return availableEnd
  **/
  @JsonProperty("availableEnd")
  public Date getAvailableEnd() {
    return availableEnd;
  }

  public void setAvailableEnd(Date availableEnd) {
    this.availableEnd = availableEnd;
  }

  public Participant availableEnd(Date availableEnd) {
    this.availableEnd = availableEnd;
    return this;
  }

 /**
   * Get color1
   * @return color1
  **/
  @JsonProperty("color1")
  public String getColor1() {
    return color1;
  }

  public void setColor1(String color1) {
    this.color1 = color1;
  }

  public Participant color1(String color1) {
    this.color1 = color1;
    return this;
  }

 /**
   * Get color2
   * @return color2
  **/
  @JsonProperty("color2")
  public String getColor2() {
    return color2;
  }

  public void setColor2(String color2) {
    this.color2 = color2;
  }

  public Participant color2(String color2) {
    this.color2 = color2;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Participant type(TypeEnum type) {
    this.type = type;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

