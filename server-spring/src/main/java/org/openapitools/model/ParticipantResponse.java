package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccountMiniResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ParticipantResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ParticipantResponse {

  private @Nullable Long id;

  private @Nullable AccountMiniResponse account;

  private @Nullable Long availableStart;

  private @Nullable Long availableEnd;

  private @Nullable String color1;

  private @Nullable String color2;

  private @Nullable String type;

  public ParticipantResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ParticipantResponse account(@Nullable AccountMiniResponse account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public @Nullable AccountMiniResponse getAccount() {
    return account;
  }

  public void setAccount(@Nullable AccountMiniResponse account) {
    this.account = account;
  }

  public ParticipantResponse availableStart(@Nullable Long availableStart) {
    this.availableStart = availableStart;
    return this;
  }

  /**
   * Get availableStart
   * @return availableStart
   */
  
  @Schema(name = "availableStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableStart")
  public @Nullable Long getAvailableStart() {
    return availableStart;
  }

  public void setAvailableStart(@Nullable Long availableStart) {
    this.availableStart = availableStart;
  }

  public ParticipantResponse availableEnd(@Nullable Long availableEnd) {
    this.availableEnd = availableEnd;
    return this;
  }

  /**
   * Get availableEnd
   * @return availableEnd
   */
  
  @Schema(name = "availableEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableEnd")
  public @Nullable Long getAvailableEnd() {
    return availableEnd;
  }

  public void setAvailableEnd(@Nullable Long availableEnd) {
    this.availableEnd = availableEnd;
  }

  public ParticipantResponse color1(@Nullable String color1) {
    this.color1 = color1;
    return this;
  }

  /**
   * Get color1
   * @return color1
   */
  
  @Schema(name = "color1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color1")
  public @Nullable String getColor1() {
    return color1;
  }

  public void setColor1(@Nullable String color1) {
    this.color1 = color1;
  }

  public ParticipantResponse color2(@Nullable String color2) {
    this.color2 = color2;
    return this;
  }

  /**
   * Get color2
   * @return color2
   */
  
  @Schema(name = "color2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color2")
  public @Nullable String getColor2() {
    return color2;
  }

  public void setColor2(@Nullable String color2) {
    this.color2 = color2;
  }

  public ParticipantResponse type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

