package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ParticipantResponse   {
  
  private Long id;
  private AccountMiniResponse account;
  private Long availableStart;
  private Long availableEnd;
  private String color1;
  private String color2;
  private String type;

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
  @JsonProperty("account")
  @Valid
  public AccountMiniResponse getAccount() {
    return account;
  }
  public void setAccount(AccountMiniResponse account) {
    this.account = account;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availableStart")
  public Long getAvailableStart() {
    return availableStart;
  }
  public void setAvailableStart(Long availableStart) {
    this.availableStart = availableStart;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availableEnd")
  public Long getAvailableEnd() {
    return availableEnd;
  }
  public void setAvailableEnd(Long availableEnd) {
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
  public String getType() {
    return type;
  }
  public void setType(String type) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

