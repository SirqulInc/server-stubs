package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PersonalProfileResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

public enum PreferredGenderEnum {

MALE(String.valueOf("MALE")), FEMALE(String.valueOf("FEMALE")), ANY(String.valueOf("ANY"));


    private String value;

    PreferredGenderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private PreferredGenderEnum preferredGender;

  @ApiModelProperty(value = "")

  private String preferredEthnicity;

  @ApiModelProperty(value = "")

  private String preferredEducation;

  @ApiModelProperty(value = "")

  private Integer preferredEducationIndex;

  @ApiModelProperty(value = "")

  private String preferredBodyType;

  @ApiModelProperty(value = "")

  private Integer preferredMinAge;

  @ApiModelProperty(value = "")

  private Integer preferredMaxAge;

  @ApiModelProperty(value = "")

  private Integer preferredMinHeight;

  @ApiModelProperty(value = "")

  private Integer preferredMaxHeight;

  @ApiModelProperty(value = "")

  private Double preferredLocationRange;

public enum GenderEnum {

MALE(String.valueOf("MALE")), FEMALE(String.valueOf("FEMALE")), ANY(String.valueOf("ANY"));


    private String value;

    GenderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private GenderEnum gender;

  @ApiModelProperty(value = "")

  private String hometown;

  @ApiModelProperty(value = "")

  private String height;

  @ApiModelProperty(value = "")

  private Integer heightIndex;

  @ApiModelProperty(value = "")

  private String ethnicity;

  @ApiModelProperty(value = "")

  private String bodyType;

  @ApiModelProperty(value = "")

  private String children;

  @ApiModelProperty(value = "")

  private String companionship;

  @ApiModelProperty(value = "")

  private Integer companionshipIndex;

  @ApiModelProperty(value = "")

  private String drink;

  @ApiModelProperty(value = "")

  private String education;

  @ApiModelProperty(value = "")

  private Integer educationIndex;

  @ApiModelProperty(value = "")

  private String maritalStatus;

  @ApiModelProperty(value = "")

  private String smoke;

  @ApiModelProperty(value = "")

  private String religion;

  @ApiModelProperty(value = "")

  private Long birthday;

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PersonalProfileResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PersonalProfileResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public PersonalProfileResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PersonalProfileResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PersonalProfileResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public PersonalProfileResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PersonalProfileResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PersonalProfileResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get preferredGender
   * @return preferredGender
  **/
  @JsonProperty("preferredGender")
  public String getPreferredGender() {
    if (preferredGender == null) {
      return null;
    }
    return preferredGender.value();
  }

  public void setPreferredGender(PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
  }

  public PersonalProfileResponse preferredGender(PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
    return this;
  }

 /**
   * Get preferredEthnicity
   * @return preferredEthnicity
  **/
  @JsonProperty("preferredEthnicity")
  public String getPreferredEthnicity() {
    return preferredEthnicity;
  }

  public void setPreferredEthnicity(String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
  }

  public PersonalProfileResponse preferredEthnicity(String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
    return this;
  }

 /**
   * Get preferredEducation
   * @return preferredEducation
  **/
  @JsonProperty("preferredEducation")
  public String getPreferredEducation() {
    return preferredEducation;
  }

  public void setPreferredEducation(String preferredEducation) {
    this.preferredEducation = preferredEducation;
  }

  public PersonalProfileResponse preferredEducation(String preferredEducation) {
    this.preferredEducation = preferredEducation;
    return this;
  }

 /**
   * Get preferredEducationIndex
   * @return preferredEducationIndex
  **/
  @JsonProperty("preferredEducationIndex")
  public Integer getPreferredEducationIndex() {
    return preferredEducationIndex;
  }

  public void setPreferredEducationIndex(Integer preferredEducationIndex) {
    this.preferredEducationIndex = preferredEducationIndex;
  }

  public PersonalProfileResponse preferredEducationIndex(Integer preferredEducationIndex) {
    this.preferredEducationIndex = preferredEducationIndex;
    return this;
  }

 /**
   * Get preferredBodyType
   * @return preferredBodyType
  **/
  @JsonProperty("preferredBodyType")
  public String getPreferredBodyType() {
    return preferredBodyType;
  }

  public void setPreferredBodyType(String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
  }

  public PersonalProfileResponse preferredBodyType(String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
    return this;
  }

 /**
   * Get preferredMinAge
   * @return preferredMinAge
  **/
  @JsonProperty("preferredMinAge")
  public Integer getPreferredMinAge() {
    return preferredMinAge;
  }

  public void setPreferredMinAge(Integer preferredMinAge) {
    this.preferredMinAge = preferredMinAge;
  }

  public PersonalProfileResponse preferredMinAge(Integer preferredMinAge) {
    this.preferredMinAge = preferredMinAge;
    return this;
  }

 /**
   * Get preferredMaxAge
   * @return preferredMaxAge
  **/
  @JsonProperty("preferredMaxAge")
  public Integer getPreferredMaxAge() {
    return preferredMaxAge;
  }

  public void setPreferredMaxAge(Integer preferredMaxAge) {
    this.preferredMaxAge = preferredMaxAge;
  }

  public PersonalProfileResponse preferredMaxAge(Integer preferredMaxAge) {
    this.preferredMaxAge = preferredMaxAge;
    return this;
  }

 /**
   * Get preferredMinHeight
   * @return preferredMinHeight
  **/
  @JsonProperty("preferredMinHeight")
  public Integer getPreferredMinHeight() {
    return preferredMinHeight;
  }

  public void setPreferredMinHeight(Integer preferredMinHeight) {
    this.preferredMinHeight = preferredMinHeight;
  }

  public PersonalProfileResponse preferredMinHeight(Integer preferredMinHeight) {
    this.preferredMinHeight = preferredMinHeight;
    return this;
  }

 /**
   * Get preferredMaxHeight
   * @return preferredMaxHeight
  **/
  @JsonProperty("preferredMaxHeight")
  public Integer getPreferredMaxHeight() {
    return preferredMaxHeight;
  }

  public void setPreferredMaxHeight(Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
  }

  public PersonalProfileResponse preferredMaxHeight(Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
    return this;
  }

 /**
   * Get preferredLocationRange
   * @return preferredLocationRange
  **/
  @JsonProperty("preferredLocationRange")
  public Double getPreferredLocationRange() {
    return preferredLocationRange;
  }

  public void setPreferredLocationRange(Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
  }

  public PersonalProfileResponse preferredLocationRange(Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    if (gender == null) {
      return null;
    }
    return gender.value();
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public PersonalProfileResponse gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get hometown
   * @return hometown
  **/
  @JsonProperty("hometown")
  public String getHometown() {
    return hometown;
  }

  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  public PersonalProfileResponse hometown(String hometown) {
    this.hometown = hometown;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public PersonalProfileResponse height(String height) {
    this.height = height;
    return this;
  }

 /**
   * Get heightIndex
   * @return heightIndex
  **/
  @JsonProperty("heightIndex")
  public Integer getHeightIndex() {
    return heightIndex;
  }

  public void setHeightIndex(Integer heightIndex) {
    this.heightIndex = heightIndex;
  }

  public PersonalProfileResponse heightIndex(Integer heightIndex) {
    this.heightIndex = heightIndex;
    return this;
  }

 /**
   * Get ethnicity
   * @return ethnicity
  **/
  @JsonProperty("ethnicity")
  public String getEthnicity() {
    return ethnicity;
  }

  public void setEthnicity(String ethnicity) {
    this.ethnicity = ethnicity;
  }

  public PersonalProfileResponse ethnicity(String ethnicity) {
    this.ethnicity = ethnicity;
    return this;
  }

 /**
   * Get bodyType
   * @return bodyType
  **/
  @JsonProperty("bodyType")
  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public PersonalProfileResponse bodyType(String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public String getChildren() {
    return children;
  }

  public void setChildren(String children) {
    this.children = children;
  }

  public PersonalProfileResponse children(String children) {
    this.children = children;
    return this;
  }

 /**
   * Get companionship
   * @return companionship
  **/
  @JsonProperty("companionship")
  public String getCompanionship() {
    return companionship;
  }

  public void setCompanionship(String companionship) {
    this.companionship = companionship;
  }

  public PersonalProfileResponse companionship(String companionship) {
    this.companionship = companionship;
    return this;
  }

 /**
   * Get companionshipIndex
   * @return companionshipIndex
  **/
  @JsonProperty("companionshipIndex")
  public Integer getCompanionshipIndex() {
    return companionshipIndex;
  }

  public void setCompanionshipIndex(Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
  }

  public PersonalProfileResponse companionshipIndex(Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
    return this;
  }

 /**
   * Get drink
   * @return drink
  **/
  @JsonProperty("drink")
  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public PersonalProfileResponse drink(String drink) {
    this.drink = drink;
    return this;
  }

 /**
   * Get education
   * @return education
  **/
  @JsonProperty("education")
  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  public PersonalProfileResponse education(String education) {
    this.education = education;
    return this;
  }

 /**
   * Get educationIndex
   * @return educationIndex
  **/
  @JsonProperty("educationIndex")
  public Integer getEducationIndex() {
    return educationIndex;
  }

  public void setEducationIndex(Integer educationIndex) {
    this.educationIndex = educationIndex;
  }

  public PersonalProfileResponse educationIndex(Integer educationIndex) {
    this.educationIndex = educationIndex;
    return this;
  }

 /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @JsonProperty("maritalStatus")
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public PersonalProfileResponse maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

 /**
   * Get smoke
   * @return smoke
  **/
  @JsonProperty("smoke")
  public String getSmoke() {
    return smoke;
  }

  public void setSmoke(String smoke) {
    this.smoke = smoke;
  }

  public PersonalProfileResponse smoke(String smoke) {
    this.smoke = smoke;
    return this;
  }

 /**
   * Get religion
   * @return religion
  **/
  @JsonProperty("religion")
  public String getReligion() {
    return religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }

  public PersonalProfileResponse religion(String religion) {
    this.religion = religion;
    return this;
  }

 /**
   * Get birthday
   * @return birthday
  **/
  @JsonProperty("birthday")
  public Long getBirthday() {
    return birthday;
  }

  public void setBirthday(Long birthday) {
    this.birthday = birthday;
  }

  public PersonalProfileResponse birthday(Long birthday) {
    this.birthday = birthday;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public PersonalProfileResponse returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

