package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountMiniResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PreviewPersonaResponse   {
  
  private Long personaId;
  private String title;
  private List<@Valid AccountMiniResponse> previewAccounts = new ArrayList<>();
  private Boolean active;
  private Long date;
  private Integer age;
  private String gender;
  private String gameExperienceLevel;
  private Double latitude;
  private Double longitude;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("personaId")
  public Long getPersonaId() {
    return personaId;
  }
  public void setPersonaId(Long personaId) {
    this.personaId = personaId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("previewAccounts")
  @Valid
  public List<@Valid AccountMiniResponse> getPreviewAccounts() {
    return previewAccounts;
  }
  public void setPreviewAccounts(List<@Valid AccountMiniResponse> previewAccounts) {
    this.previewAccounts = previewAccounts;
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
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }
  public void setDate(Long date) {
    this.date = date;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameExperienceLevel")
  public String getGameExperienceLevel() {
    return gameExperienceLevel;
  }
  public void setGameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

