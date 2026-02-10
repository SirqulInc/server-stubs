package apimodels;

import apimodels.AccountMiniResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PreviewPersonaResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PreviewPersonaResponse   {
  @JsonProperty("personaId")
  
  private Long personaId;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("previewAccounts")
  @Valid

  private List<@Valid AccountMiniResponse> previewAccounts = null;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("date")
  
  private Long date;

  @JsonProperty("age")
  
  private Integer age;

  @JsonProperty("gender")
  
  private String gender;

  @JsonProperty("gameExperienceLevel")
  
  private String gameExperienceLevel;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  public PreviewPersonaResponse personaId(Long personaId) {
    this.personaId = personaId;
    return this;
  }

   /**
   * Get personaId
   * @return personaId
  **/
  public Long getPersonaId() {
    return personaId;
  }

  public void setPersonaId(Long personaId) {
    this.personaId = personaId;
  }

  public PreviewPersonaResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
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
  **/
  public List<@Valid AccountMiniResponse> getPreviewAccounts() {
    return previewAccounts;
  }

  public void setPreviewAccounts(List<@Valid AccountMiniResponse> previewAccounts) {
    this.previewAccounts = previewAccounts;
  }

  public PreviewPersonaResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PreviewPersonaResponse date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public PreviewPersonaResponse age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public PreviewPersonaResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PreviewPersonaResponse gameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

   /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
  **/
  public String getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  public PreviewPersonaResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public PreviewPersonaResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
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
    return Objects.equals(personaId, previewPersonaResponse.personaId) &&
        Objects.equals(title, previewPersonaResponse.title) &&
        Objects.equals(previewAccounts, previewPersonaResponse.previewAccounts) &&
        Objects.equals(active, previewPersonaResponse.active) &&
        Objects.equals(date, previewPersonaResponse.date) &&
        Objects.equals(age, previewPersonaResponse.age) &&
        Objects.equals(gender, previewPersonaResponse.gender) &&
        Objects.equals(gameExperienceLevel, previewPersonaResponse.gameExperienceLevel) &&
        Objects.equals(latitude, previewPersonaResponse.latitude) &&
        Objects.equals(longitude, previewPersonaResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaId, title, previewAccounts, active, date, age, gender, gameExperienceLevel, latitude, longitude);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

