package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.Account;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Participant
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Participant {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account account;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime availableStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime availableEnd;

  private @Nullable String color1;

  private @Nullable String color2;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TEAM("TEAM"),
    
    LEAGUE("LEAGUE"),
    
    SPORT("SPORT");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable TypeEnum type;

  public Participant id(@Nullable Long id) {
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

  public Participant active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public Participant valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Participant account(@Nullable Account account) {
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
  public @Nullable Account getAccount() {
    return account;
  }

  public void setAccount(@Nullable Account account) {
    this.account = account;
  }

  public Participant availableStart(@Nullable OffsetDateTime availableStart) {
    this.availableStart = availableStart;
    return this;
  }

  /**
   * Get availableStart
   * @return availableStart
   */
  @Valid 
  @Schema(name = "availableStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableStart")
  public @Nullable OffsetDateTime getAvailableStart() {
    return availableStart;
  }

  public void setAvailableStart(@Nullable OffsetDateTime availableStart) {
    this.availableStart = availableStart;
  }

  public Participant availableEnd(@Nullable OffsetDateTime availableEnd) {
    this.availableEnd = availableEnd;
    return this;
  }

  /**
   * Get availableEnd
   * @return availableEnd
   */
  @Valid 
  @Schema(name = "availableEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableEnd")
  public @Nullable OffsetDateTime getAvailableEnd() {
    return availableEnd;
  }

  public void setAvailableEnd(@Nullable OffsetDateTime availableEnd) {
    this.availableEnd = availableEnd;
  }

  public Participant color1(@Nullable String color1) {
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

  public Participant color2(@Nullable String color2) {
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

  public Participant type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

