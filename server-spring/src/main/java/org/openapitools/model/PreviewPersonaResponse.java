package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * PreviewPersonaResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PreviewPersonaResponse {

  private @Nullable Long personaId;

  private @Nullable String title;

  @Valid
  private List<@Valid AccountMiniResponse> previewAccounts = new ArrayList<>();

  private @Nullable Boolean active;

  private @Nullable Long date;

  private @Nullable Integer age;

  private @Nullable String gender;

  private @Nullable String gameExperienceLevel;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  public PreviewPersonaResponse personaId(@Nullable Long personaId) {
    this.personaId = personaId;
    return this;
  }

  /**
   * Get personaId
   * @return personaId
   */
  
  @Schema(name = "personaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personaId")
  public @Nullable Long getPersonaId() {
    return personaId;
  }

  public void setPersonaId(@Nullable Long personaId) {
    this.personaId = personaId;
  }

  public PreviewPersonaResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public PreviewPersonaResponse previewAccounts(List<@Valid AccountMiniResponse> previewAccounts) {
    this.previewAccounts = previewAccounts;
    return this;
  }

  public PreviewPersonaResponse addPreviewAccountsItem(AccountMiniResponse previewAccountsItem) {
    if (this.previewAccounts == null) {
      this.previewAccounts = new ArrayList<>();
    }
    this.previewAccounts.add(previewAccountsItem);
    return this;
  }

  /**
   * Get previewAccounts
   * @return previewAccounts
   */
  @Valid 
  @Schema(name = "previewAccounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previewAccounts")
  public List<@Valid AccountMiniResponse> getPreviewAccounts() {
    return previewAccounts;
  }

  public void setPreviewAccounts(List<@Valid AccountMiniResponse> previewAccounts) {
    this.previewAccounts = previewAccounts;
  }

  public PreviewPersonaResponse active(@Nullable Boolean active) {
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

  public PreviewPersonaResponse date(@Nullable Long date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public @Nullable Long getDate() {
    return date;
  }

  public void setDate(@Nullable Long date) {
    this.date = date;
  }

  public PreviewPersonaResponse age(@Nullable Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   */
  
  @Schema(name = "age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public @Nullable Integer getAge() {
    return age;
  }

  public void setAge(@Nullable Integer age) {
    this.age = age;
  }

  public PreviewPersonaResponse gender(@Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable String getGender() {
    return gender;
  }

  public void setGender(@Nullable String gender) {
    this.gender = gender;
  }

  public PreviewPersonaResponse gameExperienceLevel(@Nullable String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

  /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
   */
  
  @Schema(name = "gameExperienceLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameExperienceLevel")
  public @Nullable String getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(@Nullable String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  public PreviewPersonaResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public PreviewPersonaResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewPersonaResponse previewPersonaResponse = (PreviewPersonaResponse) o;
    return Objects.equals(this.personaId, previewPersonaResponse.personaId) &&
        Objects.equals(this.title, previewPersonaResponse.title) &&
        Objects.equals(this.previewAccounts, previewPersonaResponse.previewAccounts) &&
        Objects.equals(this.active, previewPersonaResponse.active) &&
        Objects.equals(this.date, previewPersonaResponse.date) &&
        Objects.equals(this.age, previewPersonaResponse.age) &&
        Objects.equals(this.gender, previewPersonaResponse.gender) &&
        Objects.equals(this.gameExperienceLevel, previewPersonaResponse.gameExperienceLevel) &&
        Objects.equals(this.latitude, previewPersonaResponse.latitude) &&
        Objects.equals(this.longitude, previewPersonaResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaId, title, previewAccounts, active, date, age, gender, gameExperienceLevel, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewPersonaResponse {\n");
    sb.append("    personaId: ").append(toIndentedString(personaId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    previewAccounts: ").append(toIndentedString(previewAccounts)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    gameExperienceLevel: ").append(toIndentedString(gameExperienceLevel)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

