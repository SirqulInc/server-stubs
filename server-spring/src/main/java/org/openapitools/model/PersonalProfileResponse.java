package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PersonalProfileResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  /**
   * Gets or Sets preferredGender
   */
  public enum PreferredGenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    ANY("ANY");

    private final String value;

    PreferredGenderEnum(String value) {
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
    public static PreferredGenderEnum fromValue(String value) {
      for (PreferredGenderEnum b : PreferredGenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable PreferredGenderEnum preferredGender;

  private @Nullable String preferredEthnicity;

  private @Nullable String preferredEducation;

  private @Nullable Integer preferredEducationIndex;

  private @Nullable String preferredBodyType;

  private @Nullable Integer preferredMinAge;

  private @Nullable Integer preferredMaxAge;

  private @Nullable Integer preferredMinHeight;

  private @Nullable Integer preferredMaxHeight;

  private @Nullable Double preferredLocationRange;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    ANY("ANY");

    private final String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GenderEnum gender;

  private @Nullable String hometown;

  private @Nullable String height;

  private @Nullable Integer heightIndex;

  private @Nullable String ethnicity;

  private @Nullable String bodyType;

  private @Nullable String children;

  private @Nullable String companionship;

  private @Nullable Integer companionshipIndex;

  private @Nullable String drink;

  private @Nullable String education;

  private @Nullable Integer educationIndex;

  private @Nullable String maritalStatus;

  private @Nullable String smoke;

  private @Nullable String religion;

  private @Nullable Long birthday;

  private @Nullable String returning;

  public PersonalProfileResponse valid(@Nullable Boolean valid) {
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

  public PersonalProfileResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public PersonalProfileResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public PersonalProfileResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PersonalProfileResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PersonalProfileResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public PersonalProfileResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PersonalProfileResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PersonalProfileResponse preferredGender(@Nullable PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
    return this;
  }

  /**
   * Get preferredGender
   * @return preferredGender
   */
  
  @Schema(name = "preferredGender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredGender")
  public @Nullable PreferredGenderEnum getPreferredGender() {
    return preferredGender;
  }

  public void setPreferredGender(@Nullable PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
  }

  public PersonalProfileResponse preferredEthnicity(@Nullable String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
    return this;
  }

  /**
   * Get preferredEthnicity
   * @return preferredEthnicity
   */
  
  @Schema(name = "preferredEthnicity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredEthnicity")
  public @Nullable String getPreferredEthnicity() {
    return preferredEthnicity;
  }

  public void setPreferredEthnicity(@Nullable String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
  }

  public PersonalProfileResponse preferredEducation(@Nullable String preferredEducation) {
    this.preferredEducation = preferredEducation;
    return this;
  }

  /**
   * Get preferredEducation
   * @return preferredEducation
   */
  
  @Schema(name = "preferredEducation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredEducation")
  public @Nullable String getPreferredEducation() {
    return preferredEducation;
  }

  public void setPreferredEducation(@Nullable String preferredEducation) {
    this.preferredEducation = preferredEducation;
  }

  public PersonalProfileResponse preferredEducationIndex(@Nullable Integer preferredEducationIndex) {
    this.preferredEducationIndex = preferredEducationIndex;
    return this;
  }

  /**
   * Get preferredEducationIndex
   * @return preferredEducationIndex
   */
  
  @Schema(name = "preferredEducationIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredEducationIndex")
  public @Nullable Integer getPreferredEducationIndex() {
    return preferredEducationIndex;
  }

  public void setPreferredEducationIndex(@Nullable Integer preferredEducationIndex) {
    this.preferredEducationIndex = preferredEducationIndex;
  }

  public PersonalProfileResponse preferredBodyType(@Nullable String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
    return this;
  }

  /**
   * Get preferredBodyType
   * @return preferredBodyType
   */
  
  @Schema(name = "preferredBodyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredBodyType")
  public @Nullable String getPreferredBodyType() {
    return preferredBodyType;
  }

  public void setPreferredBodyType(@Nullable String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
  }

  public PersonalProfileResponse preferredMinAge(@Nullable Integer preferredMinAge) {
    this.preferredMinAge = preferredMinAge;
    return this;
  }

  /**
   * Get preferredMinAge
   * @return preferredMinAge
   */
  
  @Schema(name = "preferredMinAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredMinAge")
  public @Nullable Integer getPreferredMinAge() {
    return preferredMinAge;
  }

  public void setPreferredMinAge(@Nullable Integer preferredMinAge) {
    this.preferredMinAge = preferredMinAge;
  }

  public PersonalProfileResponse preferredMaxAge(@Nullable Integer preferredMaxAge) {
    this.preferredMaxAge = preferredMaxAge;
    return this;
  }

  /**
   * Get preferredMaxAge
   * @return preferredMaxAge
   */
  
  @Schema(name = "preferredMaxAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredMaxAge")
  public @Nullable Integer getPreferredMaxAge() {
    return preferredMaxAge;
  }

  public void setPreferredMaxAge(@Nullable Integer preferredMaxAge) {
    this.preferredMaxAge = preferredMaxAge;
  }

  public PersonalProfileResponse preferredMinHeight(@Nullable Integer preferredMinHeight) {
    this.preferredMinHeight = preferredMinHeight;
    return this;
  }

  /**
   * Get preferredMinHeight
   * @return preferredMinHeight
   */
  
  @Schema(name = "preferredMinHeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredMinHeight")
  public @Nullable Integer getPreferredMinHeight() {
    return preferredMinHeight;
  }

  public void setPreferredMinHeight(@Nullable Integer preferredMinHeight) {
    this.preferredMinHeight = preferredMinHeight;
  }

  public PersonalProfileResponse preferredMaxHeight(@Nullable Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
    return this;
  }

  /**
   * Get preferredMaxHeight
   * @return preferredMaxHeight
   */
  
  @Schema(name = "preferredMaxHeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredMaxHeight")
  public @Nullable Integer getPreferredMaxHeight() {
    return preferredMaxHeight;
  }

  public void setPreferredMaxHeight(@Nullable Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
  }

  public PersonalProfileResponse preferredLocationRange(@Nullable Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
    return this;
  }

  /**
   * Get preferredLocationRange
   * @return preferredLocationRange
   */
  
  @Schema(name = "preferredLocationRange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredLocationRange")
  public @Nullable Double getPreferredLocationRange() {
    return preferredLocationRange;
  }

  public void setPreferredLocationRange(@Nullable Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
  }

  public PersonalProfileResponse gender(@Nullable GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable GenderEnum getGender() {
    return gender;
  }

  public void setGender(@Nullable GenderEnum gender) {
    this.gender = gender;
  }

  public PersonalProfileResponse hometown(@Nullable String hometown) {
    this.hometown = hometown;
    return this;
  }

  /**
   * Get hometown
   * @return hometown
   */
  
  @Schema(name = "hometown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hometown")
  public @Nullable String getHometown() {
    return hometown;
  }

  public void setHometown(@Nullable String hometown) {
    this.hometown = hometown;
  }

  public PersonalProfileResponse height(@Nullable String height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public @Nullable String getHeight() {
    return height;
  }

  public void setHeight(@Nullable String height) {
    this.height = height;
  }

  public PersonalProfileResponse heightIndex(@Nullable Integer heightIndex) {
    this.heightIndex = heightIndex;
    return this;
  }

  /**
   * Get heightIndex
   * @return heightIndex
   */
  
  @Schema(name = "heightIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightIndex")
  public @Nullable Integer getHeightIndex() {
    return heightIndex;
  }

  public void setHeightIndex(@Nullable Integer heightIndex) {
    this.heightIndex = heightIndex;
  }

  public PersonalProfileResponse ethnicity(@Nullable String ethnicity) {
    this.ethnicity = ethnicity;
    return this;
  }

  /**
   * Get ethnicity
   * @return ethnicity
   */
  
  @Schema(name = "ethnicity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ethnicity")
  public @Nullable String getEthnicity() {
    return ethnicity;
  }

  public void setEthnicity(@Nullable String ethnicity) {
    this.ethnicity = ethnicity;
  }

  public PersonalProfileResponse bodyType(@Nullable String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

  /**
   * Get bodyType
   * @return bodyType
   */
  
  @Schema(name = "bodyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bodyType")
  public @Nullable String getBodyType() {
    return bodyType;
  }

  public void setBodyType(@Nullable String bodyType) {
    this.bodyType = bodyType;
  }

  public PersonalProfileResponse children(@Nullable String children) {
    this.children = children;
    return this;
  }

  /**
   * Get children
   * @return children
   */
  
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public @Nullable String getChildren() {
    return children;
  }

  public void setChildren(@Nullable String children) {
    this.children = children;
  }

  public PersonalProfileResponse companionship(@Nullable String companionship) {
    this.companionship = companionship;
    return this;
  }

  /**
   * Get companionship
   * @return companionship
   */
  
  @Schema(name = "companionship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companionship")
  public @Nullable String getCompanionship() {
    return companionship;
  }

  public void setCompanionship(@Nullable String companionship) {
    this.companionship = companionship;
  }

  public PersonalProfileResponse companionshipIndex(@Nullable Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
    return this;
  }

  /**
   * Get companionshipIndex
   * @return companionshipIndex
   */
  
  @Schema(name = "companionshipIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companionshipIndex")
  public @Nullable Integer getCompanionshipIndex() {
    return companionshipIndex;
  }

  public void setCompanionshipIndex(@Nullable Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
  }

  public PersonalProfileResponse drink(@Nullable String drink) {
    this.drink = drink;
    return this;
  }

  /**
   * Get drink
   * @return drink
   */
  
  @Schema(name = "drink", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drink")
  public @Nullable String getDrink() {
    return drink;
  }

  public void setDrink(@Nullable String drink) {
    this.drink = drink;
  }

  public PersonalProfileResponse education(@Nullable String education) {
    this.education = education;
    return this;
  }

  /**
   * Get education
   * @return education
   */
  
  @Schema(name = "education", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("education")
  public @Nullable String getEducation() {
    return education;
  }

  public void setEducation(@Nullable String education) {
    this.education = education;
  }

  public PersonalProfileResponse educationIndex(@Nullable Integer educationIndex) {
    this.educationIndex = educationIndex;
    return this;
  }

  /**
   * Get educationIndex
   * @return educationIndex
   */
  
  @Schema(name = "educationIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("educationIndex")
  public @Nullable Integer getEducationIndex() {
    return educationIndex;
  }

  public void setEducationIndex(@Nullable Integer educationIndex) {
    this.educationIndex = educationIndex;
  }

  public PersonalProfileResponse maritalStatus(@Nullable String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
   */
  
  @Schema(name = "maritalStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maritalStatus")
  public @Nullable String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(@Nullable String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public PersonalProfileResponse smoke(@Nullable String smoke) {
    this.smoke = smoke;
    return this;
  }

  /**
   * Get smoke
   * @return smoke
   */
  
  @Schema(name = "smoke", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smoke")
  public @Nullable String getSmoke() {
    return smoke;
  }

  public void setSmoke(@Nullable String smoke) {
    this.smoke = smoke;
  }

  public PersonalProfileResponse religion(@Nullable String religion) {
    this.religion = religion;
    return this;
  }

  /**
   * Get religion
   * @return religion
   */
  
  @Schema(name = "religion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("religion")
  public @Nullable String getReligion() {
    return religion;
  }

  public void setReligion(@Nullable String religion) {
    this.religion = religion;
  }

  public PersonalProfileResponse birthday(@Nullable Long birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  
  @Schema(name = "birthday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthday")
  public @Nullable Long getBirthday() {
    return birthday;
  }

  public void setBirthday(@Nullable Long birthday) {
    this.birthday = birthday;
  }

  public PersonalProfileResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
    this.returning = returning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalProfileResponse personalProfileResponse = (PersonalProfileResponse) o;
    return Objects.equals(this.valid, personalProfileResponse.valid) &&
        Objects.equals(this.message, personalProfileResponse.message) &&
        Objects.equals(this.version, personalProfileResponse.version) &&
        Objects.equals(this.serializeNulls, personalProfileResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, personalProfileResponse.startTimeLog) &&
        Objects.equals(this.errorCode, personalProfileResponse.errorCode) &&
        Objects.equals(this.request, personalProfileResponse.request) &&
        Objects.equals(this.preferredGender, personalProfileResponse.preferredGender) &&
        Objects.equals(this.preferredEthnicity, personalProfileResponse.preferredEthnicity) &&
        Objects.equals(this.preferredEducation, personalProfileResponse.preferredEducation) &&
        Objects.equals(this.preferredEducationIndex, personalProfileResponse.preferredEducationIndex) &&
        Objects.equals(this.preferredBodyType, personalProfileResponse.preferredBodyType) &&
        Objects.equals(this.preferredMinAge, personalProfileResponse.preferredMinAge) &&
        Objects.equals(this.preferredMaxAge, personalProfileResponse.preferredMaxAge) &&
        Objects.equals(this.preferredMinHeight, personalProfileResponse.preferredMinHeight) &&
        Objects.equals(this.preferredMaxHeight, personalProfileResponse.preferredMaxHeight) &&
        Objects.equals(this.preferredLocationRange, personalProfileResponse.preferredLocationRange) &&
        Objects.equals(this.gender, personalProfileResponse.gender) &&
        Objects.equals(this.hometown, personalProfileResponse.hometown) &&
        Objects.equals(this.height, personalProfileResponse.height) &&
        Objects.equals(this.heightIndex, personalProfileResponse.heightIndex) &&
        Objects.equals(this.ethnicity, personalProfileResponse.ethnicity) &&
        Objects.equals(this.bodyType, personalProfileResponse.bodyType) &&
        Objects.equals(this.children, personalProfileResponse.children) &&
        Objects.equals(this.companionship, personalProfileResponse.companionship) &&
        Objects.equals(this.companionshipIndex, personalProfileResponse.companionshipIndex) &&
        Objects.equals(this.drink, personalProfileResponse.drink) &&
        Objects.equals(this.education, personalProfileResponse.education) &&
        Objects.equals(this.educationIndex, personalProfileResponse.educationIndex) &&
        Objects.equals(this.maritalStatus, personalProfileResponse.maritalStatus) &&
        Objects.equals(this.smoke, personalProfileResponse.smoke) &&
        Objects.equals(this.religion, personalProfileResponse.religion) &&
        Objects.equals(this.birthday, personalProfileResponse.birthday) &&
        Objects.equals(this.returning, personalProfileResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, preferredGender, preferredEthnicity, preferredEducation, preferredEducationIndex, preferredBodyType, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredLocationRange, gender, hometown, height, heightIndex, ethnicity, bodyType, children, companionship, companionshipIndex, drink, education, educationIndex, maritalStatus, smoke, religion, birthday, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalProfileResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    preferredGender: ").append(toIndentedString(preferredGender)).append("\n");
    sb.append("    preferredEthnicity: ").append(toIndentedString(preferredEthnicity)).append("\n");
    sb.append("    preferredEducation: ").append(toIndentedString(preferredEducation)).append("\n");
    sb.append("    preferredEducationIndex: ").append(toIndentedString(preferredEducationIndex)).append("\n");
    sb.append("    preferredBodyType: ").append(toIndentedString(preferredBodyType)).append("\n");
    sb.append("    preferredMinAge: ").append(toIndentedString(preferredMinAge)).append("\n");
    sb.append("    preferredMaxAge: ").append(toIndentedString(preferredMaxAge)).append("\n");
    sb.append("    preferredMinHeight: ").append(toIndentedString(preferredMinHeight)).append("\n");
    sb.append("    preferredMaxHeight: ").append(toIndentedString(preferredMaxHeight)).append("\n");
    sb.append("    preferredLocationRange: ").append(toIndentedString(preferredLocationRange)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    hometown: ").append(toIndentedString(hometown)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightIndex: ").append(toIndentedString(heightIndex)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    companionship: ").append(toIndentedString(companionship)).append("\n");
    sb.append("    companionshipIndex: ").append(toIndentedString(companionshipIndex)).append("\n");
    sb.append("    drink: ").append(toIndentedString(drink)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    educationIndex: ").append(toIndentedString(educationIndex)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    smoke: ").append(toIndentedString(smoke)).append("\n");
    sb.append("    religion: ").append(toIndentedString(religion)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

