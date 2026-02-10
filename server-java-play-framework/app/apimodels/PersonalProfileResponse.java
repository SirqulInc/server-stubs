package apimodels;

import apimodels.NameStringValueResponse;
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
 * PersonalProfileResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PersonalProfileResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

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

  @JsonProperty("preferredGender")
  
  private PreferredGenderEnum preferredGender;

  @JsonProperty("preferredEthnicity")
  
  private String preferredEthnicity;

  @JsonProperty("preferredEducation")
  
  private String preferredEducation;

  @JsonProperty("preferredEducationIndex")
  
  private Integer preferredEducationIndex;

  @JsonProperty("preferredBodyType")
  
  private String preferredBodyType;

  @JsonProperty("preferredMinAge")
  
  private Integer preferredMinAge;

  @JsonProperty("preferredMaxAge")
  
  private Integer preferredMaxAge;

  @JsonProperty("preferredMinHeight")
  
  private Integer preferredMinHeight;

  @JsonProperty("preferredMaxHeight")
  
  private Integer preferredMaxHeight;

  @JsonProperty("preferredLocationRange")
  
  private Double preferredLocationRange;

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

  @JsonProperty("gender")
  
  private GenderEnum gender;

  @JsonProperty("hometown")
  
  private String hometown;

  @JsonProperty("height")
  
  private String height;

  @JsonProperty("heightIndex")
  
  private Integer heightIndex;

  @JsonProperty("ethnicity")
  
  private String ethnicity;

  @JsonProperty("bodyType")
  
  private String bodyType;

  @JsonProperty("children")
  
  private String children;

  @JsonProperty("companionship")
  
  private String companionship;

  @JsonProperty("companionshipIndex")
  
  private Integer companionshipIndex;

  @JsonProperty("drink")
  
  private String drink;

  @JsonProperty("education")
  
  private String education;

  @JsonProperty("educationIndex")
  
  private Integer educationIndex;

  @JsonProperty("maritalStatus")
  
  private String maritalStatus;

  @JsonProperty("smoke")
  
  private String smoke;

  @JsonProperty("religion")
  
  private String religion;

  @JsonProperty("birthday")
  
  private Long birthday;

  @JsonProperty("returning")
  
  private String returning;

  public PersonalProfileResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PersonalProfileResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PersonalProfileResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public PersonalProfileResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PersonalProfileResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PersonalProfileResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PersonalProfileResponse preferredGender(PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
    return this;
  }

   /**
   * Get preferredGender
   * @return preferredGender
  **/
  public PreferredGenderEnum getPreferredGender() {
    return preferredGender;
  }

  public void setPreferredGender(PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
  }

  public PersonalProfileResponse preferredEthnicity(String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
    return this;
  }

   /**
   * Get preferredEthnicity
   * @return preferredEthnicity
  **/
  public String getPreferredEthnicity() {
    return preferredEthnicity;
  }

  public void setPreferredEthnicity(String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
  }

  public PersonalProfileResponse preferredEducation(String preferredEducation) {
    this.preferredEducation = preferredEducation;
    return this;
  }

   /**
   * Get preferredEducation
   * @return preferredEducation
  **/
  public String getPreferredEducation() {
    return preferredEducation;
  }

  public void setPreferredEducation(String preferredEducation) {
    this.preferredEducation = preferredEducation;
  }

  public PersonalProfileResponse preferredEducationIndex(Integer preferredEducationIndex) {
    this.preferredEducationIndex = preferredEducationIndex;
    return this;
  }

   /**
   * Get preferredEducationIndex
   * @return preferredEducationIndex
  **/
  public Integer getPreferredEducationIndex() {
    return preferredEducationIndex;
  }

  public void setPreferredEducationIndex(Integer preferredEducationIndex) {
    this.preferredEducationIndex = preferredEducationIndex;
  }

  public PersonalProfileResponse preferredBodyType(String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
    return this;
  }

   /**
   * Get preferredBodyType
   * @return preferredBodyType
  **/
  public String getPreferredBodyType() {
    return preferredBodyType;
  }

  public void setPreferredBodyType(String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
  }

  public PersonalProfileResponse preferredMinAge(Integer preferredMinAge) {
    this.preferredMinAge = preferredMinAge;
    return this;
  }

   /**
   * Get preferredMinAge
   * @return preferredMinAge
  **/
  public Integer getPreferredMinAge() {
    return preferredMinAge;
  }

  public void setPreferredMinAge(Integer preferredMinAge) {
    this.preferredMinAge = preferredMinAge;
  }

  public PersonalProfileResponse preferredMaxAge(Integer preferredMaxAge) {
    this.preferredMaxAge = preferredMaxAge;
    return this;
  }

   /**
   * Get preferredMaxAge
   * @return preferredMaxAge
  **/
  public Integer getPreferredMaxAge() {
    return preferredMaxAge;
  }

  public void setPreferredMaxAge(Integer preferredMaxAge) {
    this.preferredMaxAge = preferredMaxAge;
  }

  public PersonalProfileResponse preferredMinHeight(Integer preferredMinHeight) {
    this.preferredMinHeight = preferredMinHeight;
    return this;
  }

   /**
   * Get preferredMinHeight
   * @return preferredMinHeight
  **/
  public Integer getPreferredMinHeight() {
    return preferredMinHeight;
  }

  public void setPreferredMinHeight(Integer preferredMinHeight) {
    this.preferredMinHeight = preferredMinHeight;
  }

  public PersonalProfileResponse preferredMaxHeight(Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
    return this;
  }

   /**
   * Get preferredMaxHeight
   * @return preferredMaxHeight
  **/
  public Integer getPreferredMaxHeight() {
    return preferredMaxHeight;
  }

  public void setPreferredMaxHeight(Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
  }

  public PersonalProfileResponse preferredLocationRange(Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
    return this;
  }

   /**
   * Get preferredLocationRange
   * @return preferredLocationRange
  **/
  public Double getPreferredLocationRange() {
    return preferredLocationRange;
  }

  public void setPreferredLocationRange(Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
  }

  public PersonalProfileResponse gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public PersonalProfileResponse hometown(String hometown) {
    this.hometown = hometown;
    return this;
  }

   /**
   * Get hometown
   * @return hometown
  **/
  public String getHometown() {
    return hometown;
  }

  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  public PersonalProfileResponse height(String height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public PersonalProfileResponse heightIndex(Integer heightIndex) {
    this.heightIndex = heightIndex;
    return this;
  }

   /**
   * Get heightIndex
   * @return heightIndex
  **/
  public Integer getHeightIndex() {
    return heightIndex;
  }

  public void setHeightIndex(Integer heightIndex) {
    this.heightIndex = heightIndex;
  }

  public PersonalProfileResponse ethnicity(String ethnicity) {
    this.ethnicity = ethnicity;
    return this;
  }

   /**
   * Get ethnicity
   * @return ethnicity
  **/
  public String getEthnicity() {
    return ethnicity;
  }

  public void setEthnicity(String ethnicity) {
    this.ethnicity = ethnicity;
  }

  public PersonalProfileResponse bodyType(String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

   /**
   * Get bodyType
   * @return bodyType
  **/
  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public PersonalProfileResponse children(String children) {
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  public String getChildren() {
    return children;
  }

  public void setChildren(String children) {
    this.children = children;
  }

  public PersonalProfileResponse companionship(String companionship) {
    this.companionship = companionship;
    return this;
  }

   /**
   * Get companionship
   * @return companionship
  **/
  public String getCompanionship() {
    return companionship;
  }

  public void setCompanionship(String companionship) {
    this.companionship = companionship;
  }

  public PersonalProfileResponse companionshipIndex(Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
    return this;
  }

   /**
   * Get companionshipIndex
   * @return companionshipIndex
  **/
  public Integer getCompanionshipIndex() {
    return companionshipIndex;
  }

  public void setCompanionshipIndex(Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
  }

  public PersonalProfileResponse drink(String drink) {
    this.drink = drink;
    return this;
  }

   /**
   * Get drink
   * @return drink
  **/
  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public PersonalProfileResponse education(String education) {
    this.education = education;
    return this;
  }

   /**
   * Get education
   * @return education
  **/
  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  public PersonalProfileResponse educationIndex(Integer educationIndex) {
    this.educationIndex = educationIndex;
    return this;
  }

   /**
   * Get educationIndex
   * @return educationIndex
  **/
  public Integer getEducationIndex() {
    return educationIndex;
  }

  public void setEducationIndex(Integer educationIndex) {
    this.educationIndex = educationIndex;
  }

  public PersonalProfileResponse maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public PersonalProfileResponse smoke(String smoke) {
    this.smoke = smoke;
    return this;
  }

   /**
   * Get smoke
   * @return smoke
  **/
  public String getSmoke() {
    return smoke;
  }

  public void setSmoke(String smoke) {
    this.smoke = smoke;
  }

  public PersonalProfileResponse religion(String religion) {
    this.religion = religion;
    return this;
  }

   /**
   * Get religion
   * @return religion
  **/
  public String getReligion() {
    return religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }

  public PersonalProfileResponse birthday(Long birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Get birthday
   * @return birthday
  **/
  public Long getBirthday() {
    return birthday;
  }

  public void setBirthday(Long birthday) {
    this.birthday = birthday;
  }

  public PersonalProfileResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    return Objects.equals(valid, personalProfileResponse.valid) &&
        Objects.equals(message, personalProfileResponse.message) &&
        Objects.equals(version, personalProfileResponse.version) &&
        Objects.equals(serializeNulls, personalProfileResponse.serializeNulls) &&
        Objects.equals(startTimeLog, personalProfileResponse.startTimeLog) &&
        Objects.equals(errorCode, personalProfileResponse.errorCode) &&
        Objects.equals(request, personalProfileResponse.request) &&
        Objects.equals(preferredGender, personalProfileResponse.preferredGender) &&
        Objects.equals(preferredEthnicity, personalProfileResponse.preferredEthnicity) &&
        Objects.equals(preferredEducation, personalProfileResponse.preferredEducation) &&
        Objects.equals(preferredEducationIndex, personalProfileResponse.preferredEducationIndex) &&
        Objects.equals(preferredBodyType, personalProfileResponse.preferredBodyType) &&
        Objects.equals(preferredMinAge, personalProfileResponse.preferredMinAge) &&
        Objects.equals(preferredMaxAge, personalProfileResponse.preferredMaxAge) &&
        Objects.equals(preferredMinHeight, personalProfileResponse.preferredMinHeight) &&
        Objects.equals(preferredMaxHeight, personalProfileResponse.preferredMaxHeight) &&
        Objects.equals(preferredLocationRange, personalProfileResponse.preferredLocationRange) &&
        Objects.equals(gender, personalProfileResponse.gender) &&
        Objects.equals(hometown, personalProfileResponse.hometown) &&
        Objects.equals(height, personalProfileResponse.height) &&
        Objects.equals(heightIndex, personalProfileResponse.heightIndex) &&
        Objects.equals(ethnicity, personalProfileResponse.ethnicity) &&
        Objects.equals(bodyType, personalProfileResponse.bodyType) &&
        Objects.equals(children, personalProfileResponse.children) &&
        Objects.equals(companionship, personalProfileResponse.companionship) &&
        Objects.equals(companionshipIndex, personalProfileResponse.companionshipIndex) &&
        Objects.equals(drink, personalProfileResponse.drink) &&
        Objects.equals(education, personalProfileResponse.education) &&
        Objects.equals(educationIndex, personalProfileResponse.educationIndex) &&
        Objects.equals(maritalStatus, personalProfileResponse.maritalStatus) &&
        Objects.equals(smoke, personalProfileResponse.smoke) &&
        Objects.equals(religion, personalProfileResponse.religion) &&
        Objects.equals(birthday, personalProfileResponse.birthday) &&
        Objects.equals(returning, personalProfileResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, preferredGender, preferredEthnicity, preferredEducation, preferredEducationIndex, preferredBodyType, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredLocationRange, gender, hometown, height, heightIndex, ethnicity, bodyType, children, companionship, companionshipIndex, drink, education, educationIndex, maritalStatus, smoke, religion, birthday, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

