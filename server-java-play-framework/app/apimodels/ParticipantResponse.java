package apimodels;

import apimodels.AccountMiniResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ParticipantResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ParticipantResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("account")
  @Valid

  private AccountMiniResponse account;

  @JsonProperty("availableStart")
  
  private Long availableStart;

  @JsonProperty("availableEnd")
  
  private Long availableEnd;

  @JsonProperty("color1")
  
  private String color1;

  @JsonProperty("color2")
  
  private String color2;

  @JsonProperty("type")
  
  private String type;

  public ParticipantResponse id(Long id) {
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

  public ParticipantResponse account(AccountMiniResponse account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  public AccountMiniResponse getAccount() {
    return account;
  }

  public void setAccount(AccountMiniResponse account) {
    this.account = account;
  }

  public ParticipantResponse availableStart(Long availableStart) {
    this.availableStart = availableStart;
    return this;
  }

   /**
   * Get availableStart
   * @return availableStart
  **/
  public Long getAvailableStart() {
    return availableStart;
  }

  public void setAvailableStart(Long availableStart) {
    this.availableStart = availableStart;
  }

  public ParticipantResponse availableEnd(Long availableEnd) {
    this.availableEnd = availableEnd;
    return this;
  }

   /**
   * Get availableEnd
   * @return availableEnd
  **/
  public Long getAvailableEnd() {
    return availableEnd;
  }

  public void setAvailableEnd(Long availableEnd) {
    this.availableEnd = availableEnd;
  }

  public ParticipantResponse color1(String color1) {
    this.color1 = color1;
    return this;
  }

   /**
   * Get color1
   * @return color1
  **/
  public String getColor1() {
    return color1;
  }

  public void setColor1(String color1) {
    this.color1 = color1;
  }

  public ParticipantResponse color2(String color2) {
    this.color2 = color2;
    return this;
  }

   /**
   * Get color2
   * @return color2
  **/
  public String getColor2() {
    return color2;
  }

  public void setColor2(String color2) {
    this.color2 = color2;
  }

  public ParticipantResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
    return Objects.equals(id, participantResponse.id) &&
        Objects.equals(account, participantResponse.account) &&
        Objects.equals(availableStart, participantResponse.availableStart) &&
        Objects.equals(availableEnd, participantResponse.availableEnd) &&
        Objects.equals(color1, participantResponse.color1) &&
        Objects.equals(color2, participantResponse.color2) &&
        Objects.equals(type, participantResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, availableStart, availableEnd, color1, color2, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

