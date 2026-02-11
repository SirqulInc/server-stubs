package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PersonalProfileResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  /**
   * Gets or Sets preferredGender
   */
  public enum PreferredGenderEnum {
    MALE("MALE"),

        FEMALE("FEMALE"),

        ANY("ANY");
    private String value;

    PreferredGenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PreferredGenderEnum preferredGender;
  private String preferredEthnicity;
  private String preferredEducation;
  private Integer preferredEducationIndex;
  private String preferredBodyType;
  private Integer preferredMinAge;
  private Integer preferredMaxAge;
  private Integer preferredMinHeight;
  private Integer preferredMaxHeight;
  private Double preferredLocationRange;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),

        FEMALE("FEMALE"),

        ANY("ANY");
    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GenderEnum gender;
  private String hometown;
  private String height;
  private Integer heightIndex;
  private String ethnicity;
  private String bodyType;
  private String children;
  private String companionship;
  private Integer companionshipIndex;
  private String drink;
  private String education;
  private Integer educationIndex;
  private String maritalStatus;
  private String smoke;
  private String religion;
  private Long birthday;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredGender")
  public PreferredGenderEnum getPreferredGender() {
    return preferredGender;
  }
  public void setPreferredGender(PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredEthnicity")
  public String getPreferredEthnicity() {
    return preferredEthnicity;
  }
  public void setPreferredEthnicity(String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredEducation")
  public String getPreferredEducation() {
    return preferredEducation;
  }
  public void setPreferredEducation(String preferredEducation) {
    this.preferredEducation = preferredEducation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredEducationIndex")
  public Integer getPreferredEducationIndex() {
    return preferredEducationIndex;
  }
  public void setPreferredEducationIndex(Integer preferredEducationIndex) {
    this.preferredEducationIndex = preferredEducationIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredBodyType")
  public String getPreferredBodyType() {
    return preferredBodyType;
  }
  public void setPreferredBodyType(String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredMinAge")
  public Integer getPreferredMinAge() {
    return preferredMinAge;
  }
  public void setPreferredMinAge(Integer preferredMinAge) {
    this.preferredMinAge = preferredMinAge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredMaxAge")
  public Integer getPreferredMaxAge() {
    return preferredMaxAge;
  }
  public void setPreferredMaxAge(Integer preferredMaxAge) {
    this.preferredMaxAge = preferredMaxAge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredMinHeight")
  public Integer getPreferredMinHeight() {
    return preferredMinHeight;
  }
  public void setPreferredMinHeight(Integer preferredMinHeight) {
    this.preferredMinHeight = preferredMinHeight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredMaxHeight")
  public Integer getPreferredMaxHeight() {
    return preferredMaxHeight;
  }
  public void setPreferredMaxHeight(Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredLocationRange")
  public Double getPreferredLocationRange() {
    return preferredLocationRange;
  }
  public void setPreferredLocationRange(Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hometown")
  public String getHometown() {
    return hometown;
  }
  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("heightIndex")
  public Integer getHeightIndex() {
    return heightIndex;
  }
  public void setHeightIndex(Integer heightIndex) {
    this.heightIndex = heightIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ethnicity")
  public String getEthnicity() {
    return ethnicity;
  }
  public void setEthnicity(String ethnicity) {
    this.ethnicity = ethnicity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bodyType")
  public String getBodyType() {
    return bodyType;
  }
  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("children")
  public String getChildren() {
    return children;
  }
  public void setChildren(String children) {
    this.children = children;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("companionship")
  public String getCompanionship() {
    return companionship;
  }
  public void setCompanionship(String companionship) {
    this.companionship = companionship;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("companionshipIndex")
  public Integer getCompanionshipIndex() {
    return companionshipIndex;
  }
  public void setCompanionshipIndex(Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("drink")
  public String getDrink() {
    return drink;
  }
  public void setDrink(String drink) {
    this.drink = drink;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("education")
  public String getEducation() {
    return education;
  }
  public void setEducation(String education) {
    this.education = education;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("educationIndex")
  public Integer getEducationIndex() {
    return educationIndex;
  }
  public void setEducationIndex(Integer educationIndex) {
    this.educationIndex = educationIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maritalStatus")
  public String getMaritalStatus() {
    return maritalStatus;
  }
  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("smoke")
  public String getSmoke() {
    return smoke;
  }
  public void setSmoke(String smoke) {
    this.smoke = smoke;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("religion")
  public String getReligion() {
    return religion;
  }
  public void setReligion(String religion) {
    this.religion = religion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("birthday")
  public Long getBirthday() {
    return birthday;
  }
  public void setBirthday(Long birthday) {
    this.birthday = birthday;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }
  public void setReturning(String returning) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

