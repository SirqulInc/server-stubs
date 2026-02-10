package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PreviewPersonaResponse  {
  
  @ApiModelProperty(value = "")

  private Long personaId;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AccountMiniResponse> previewAccounts = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Long date;

  @ApiModelProperty(value = "")

  private Integer age;

  @ApiModelProperty(value = "")

  private String gender;

  @ApiModelProperty(value = "")

  private String gameExperienceLevel;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;
 /**
   * Get personaId
   * @return personaId
  **/
  @JsonProperty("personaId")
  public Long getPersonaId() {
    return personaId;
  }

  public void setPersonaId(Long personaId) {
    this.personaId = personaId;
  }

  public PreviewPersonaResponse personaId(Long personaId) {
    this.personaId = personaId;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PreviewPersonaResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get previewAccounts
   * @return previewAccounts
  **/
  @JsonProperty("previewAccounts")
  public List<@Valid AccountMiniResponse> getPreviewAccounts() {
    return previewAccounts;
  }

  public void setPreviewAccounts(List<@Valid AccountMiniResponse> previewAccounts) {
    this.previewAccounts = previewAccounts;
  }

  public PreviewPersonaResponse previewAccounts(List<@Valid AccountMiniResponse> previewAccounts) {
    this.previewAccounts = previewAccounts;
    return this;
  }

  public PreviewPersonaResponse addPreviewAccountsItem(AccountMiniResponse previewAccountsItem) {
    this.previewAccounts.add(previewAccountsItem);
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

  public PreviewPersonaResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get date
   * @return date
  **/
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public PreviewPersonaResponse date(Long date) {
    this.date = date;
    return this;
  }

 /**
   * Get age
   * @return age
  **/
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public PreviewPersonaResponse age(Integer age) {
    this.age = age;
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PreviewPersonaResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
  **/
  @JsonProperty("gameExperienceLevel")
  public String getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  public PreviewPersonaResponse gameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public PreviewPersonaResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public PreviewPersonaResponse longitude(Double longitude) {
    this.longitude = longitude;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

