package org.openapitools.model;

import org.openapitools.model.AccountMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ParticipantResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  @Valid

  private AccountMiniResponse account;

  @ApiModelProperty(value = "")

  private Long availableStart;

  @ApiModelProperty(value = "")

  private Long availableEnd;

  @ApiModelProperty(value = "")

  private String color1;

  @ApiModelProperty(value = "")

  private String color2;

  @ApiModelProperty(value = "")

  private String type;
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

  public ParticipantResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public AccountMiniResponse getAccount() {
    return account;
  }

  public void setAccount(AccountMiniResponse account) {
    this.account = account;
  }

  public ParticipantResponse account(AccountMiniResponse account) {
    this.account = account;
    return this;
  }

 /**
   * Get availableStart
   * @return availableStart
  **/
  @JsonProperty("availableStart")
  public Long getAvailableStart() {
    return availableStart;
  }

  public void setAvailableStart(Long availableStart) {
    this.availableStart = availableStart;
  }

  public ParticipantResponse availableStart(Long availableStart) {
    this.availableStart = availableStart;
    return this;
  }

 /**
   * Get availableEnd
   * @return availableEnd
  **/
  @JsonProperty("availableEnd")
  public Long getAvailableEnd() {
    return availableEnd;
  }

  public void setAvailableEnd(Long availableEnd) {
    this.availableEnd = availableEnd;
  }

  public ParticipantResponse availableEnd(Long availableEnd) {
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

  public ParticipantResponse color1(String color1) {
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

  public ParticipantResponse color2(String color2) {
    this.color2 = color2;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ParticipantResponse type(String type) {
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
    ParticipantResponse participantResponse = (ParticipantResponse) o;
    return Objects.equals(this.id, participantResponse.id) &&
        Objects.equals(this.account, participantResponse.account) &&
        Objects.equals(this.availableStart, participantResponse.availableStart) &&
        Objects.equals(this.availableEnd, participantResponse.availableEnd) &&
        Objects.equals(this.color1, participantResponse.color1) &&
        Objects.equals(this.color2, participantResponse.color2) &&
        Objects.equals(this.type, participantResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, availableStart, availableEnd, color1, color2, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

