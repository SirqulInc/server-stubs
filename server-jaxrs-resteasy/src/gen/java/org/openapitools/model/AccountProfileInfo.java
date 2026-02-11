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
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountProfileInfo   {
  
  private Long id;
  private Date created;
  private Date updated;
  private Boolean active;
  private Boolean valid;
  private Account account;

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
  private Date birthday;

  /**
   * Gets or Sets ageGroup
   */
  public enum AgeGroupEnum {
    AGE_0_13("AGE_0_13"),

        AGE_14_17("AGE_14_17"),

        AGE_18_22("AGE_18_22"),

        AGE_23_30("AGE_23_30"),

        AGE_31_54("AGE_31_54"),

        AGE_55_PLUS("AGE_55_PLUS");
    private String value;

    AgeGroupEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AgeGroupEnum ageGroup;
  private Integer preferredMinAge;
  private Integer preferredMaxAge;
  private Integer preferredMinHeight;
  private Integer preferredMaxHeight;

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
  private String preferredEducation;
  private Integer preferredEducationIndex;
  private String preferredBodyType;
  private String preferredEthnicity;
  private String preferredLocation;
  private Double preferredLocationRange;
  private String height;
  private Integer heightIndex;
  private String ethnicity;
  private String bodyType;
  private String maritalStatus;
  private String children;
  private String religion;
  private String education;
  private Integer educationIndex;
  private String smoke;
  private String drink;
  private String companionship;
  private Integer companionshipIndex;

  /**
   * Gets or Sets developmentPlatforms
   */
  public enum DevelopmentPlatformsEnum {
    MAC("MAC"),

        WINDOWS("WINDOWS"),

        IOS("IOS"),

        ANDROID("ANDROID"),

        WINDOWSPHONE("WINDOWSPHONE"),

        KINDLE("KINDLE"),

        UNITY3_D("UNITY3D"),

        COCOS2_D("COCOS2D"),

        HTML5("HTML5"),

        FACEBOOK("FACEBOOK");
    private String value;

    DevelopmentPlatformsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<DevelopmentPlatformsEnum> developmentPlatforms = new ArrayList<>();
  private Long matchToken;
  private String matchString;
  private Long noneZeroMatchToken;
  private Date preferredMaxBirthday;
  private Date preferredMinBirthday;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
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
  @JsonProperty("account")
  @Valid
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
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
  @JsonProperty("birthday")
  public Date getBirthday() {
    return birthday;
  }
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ageGroup")
  public AgeGroupEnum getAgeGroup() {
    return ageGroup;
  }
  public void setAgeGroup(AgeGroupEnum ageGroup) {
    this.ageGroup = ageGroup;
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
  @JsonProperty("preferredLocation")
  public String getPreferredLocation() {
    return preferredLocation;
  }
  public void setPreferredLocation(String preferredLocation) {
    this.preferredLocation = preferredLocation;
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
  @JsonProperty("developmentPlatforms")
  public List<DevelopmentPlatformsEnum> getDevelopmentPlatforms() {
    return developmentPlatforms;
  }
  public void setDevelopmentPlatforms(List<DevelopmentPlatformsEnum> developmentPlatforms) {
    this.developmentPlatforms = developmentPlatforms;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matchToken")
  public Long getMatchToken() {
    return matchToken;
  }
  public void setMatchToken(Long matchToken) {
    this.matchToken = matchToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("matchString")
  public String getMatchString() {
    return matchString;
  }
  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noneZeroMatchToken")
  public Long getNoneZeroMatchToken() {
    return noneZeroMatchToken;
  }
  public void setNoneZeroMatchToken(Long noneZeroMatchToken) {
    this.noneZeroMatchToken = noneZeroMatchToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredMaxBirthday")
  public Date getPreferredMaxBirthday() {
    return preferredMaxBirthday;
  }
  public void setPreferredMaxBirthday(Date preferredMaxBirthday) {
    this.preferredMaxBirthday = preferredMaxBirthday;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preferredMinBirthday")
  public Date getPreferredMinBirthday() {
    return preferredMinBirthday;
  }
  public void setPreferredMinBirthday(Date preferredMinBirthday) {
    this.preferredMinBirthday = preferredMinBirthday;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountProfileInfo accountProfileInfo = (AccountProfileInfo) o;
    return Objects.equals(this.id, accountProfileInfo.id) &&
        Objects.equals(this.created, accountProfileInfo.created) &&
        Objects.equals(this.updated, accountProfileInfo.updated) &&
        Objects.equals(this.active, accountProfileInfo.active) &&
        Objects.equals(this.valid, accountProfileInfo.valid) &&
        Objects.equals(this.account, accountProfileInfo.account) &&
        Objects.equals(this.gender, accountProfileInfo.gender) &&
        Objects.equals(this.birthday, accountProfileInfo.birthday) &&
        Objects.equals(this.ageGroup, accountProfileInfo.ageGroup) &&
        Objects.equals(this.preferredMinAge, accountProfileInfo.preferredMinAge) &&
        Objects.equals(this.preferredMaxAge, accountProfileInfo.preferredMaxAge) &&
        Objects.equals(this.preferredMinHeight, accountProfileInfo.preferredMinHeight) &&
        Objects.equals(this.preferredMaxHeight, accountProfileInfo.preferredMaxHeight) &&
        Objects.equals(this.preferredGender, accountProfileInfo.preferredGender) &&
        Objects.equals(this.preferredEducation, accountProfileInfo.preferredEducation) &&
        Objects.equals(this.preferredEducationIndex, accountProfileInfo.preferredEducationIndex) &&
        Objects.equals(this.preferredBodyType, accountProfileInfo.preferredBodyType) &&
        Objects.equals(this.preferredEthnicity, accountProfileInfo.preferredEthnicity) &&
        Objects.equals(this.preferredLocation, accountProfileInfo.preferredLocation) &&
        Objects.equals(this.preferredLocationRange, accountProfileInfo.preferredLocationRange) &&
        Objects.equals(this.height, accountProfileInfo.height) &&
        Objects.equals(this.heightIndex, accountProfileInfo.heightIndex) &&
        Objects.equals(this.ethnicity, accountProfileInfo.ethnicity) &&
        Objects.equals(this.bodyType, accountProfileInfo.bodyType) &&
        Objects.equals(this.maritalStatus, accountProfileInfo.maritalStatus) &&
        Objects.equals(this.children, accountProfileInfo.children) &&
        Objects.equals(this.religion, accountProfileInfo.religion) &&
        Objects.equals(this.education, accountProfileInfo.education) &&
        Objects.equals(this.educationIndex, accountProfileInfo.educationIndex) &&
        Objects.equals(this.smoke, accountProfileInfo.smoke) &&
        Objects.equals(this.drink, accountProfileInfo.drink) &&
        Objects.equals(this.companionship, accountProfileInfo.companionship) &&
        Objects.equals(this.companionshipIndex, accountProfileInfo.companionshipIndex) &&
        Objects.equals(this.developmentPlatforms, accountProfileInfo.developmentPlatforms) &&
        Objects.equals(this.matchToken, accountProfileInfo.matchToken) &&
        Objects.equals(this.matchString, accountProfileInfo.matchString) &&
        Objects.equals(this.noneZeroMatchToken, accountProfileInfo.noneZeroMatchToken) &&
        Objects.equals(this.preferredMaxBirthday, accountProfileInfo.preferredMaxBirthday) &&
        Objects.equals(this.preferredMinBirthday, accountProfileInfo.preferredMinBirthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, active, valid, account, gender, birthday, ageGroup, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, developmentPlatforms, matchToken, matchString, noneZeroMatchToken, preferredMaxBirthday, preferredMinBirthday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountProfileInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
    sb.append("    preferredMinAge: ").append(toIndentedString(preferredMinAge)).append("\n");
    sb.append("    preferredMaxAge: ").append(toIndentedString(preferredMaxAge)).append("\n");
    sb.append("    preferredMinHeight: ").append(toIndentedString(preferredMinHeight)).append("\n");
    sb.append("    preferredMaxHeight: ").append(toIndentedString(preferredMaxHeight)).append("\n");
    sb.append("    preferredGender: ").append(toIndentedString(preferredGender)).append("\n");
    sb.append("    preferredEducation: ").append(toIndentedString(preferredEducation)).append("\n");
    sb.append("    preferredEducationIndex: ").append(toIndentedString(preferredEducationIndex)).append("\n");
    sb.append("    preferredBodyType: ").append(toIndentedString(preferredBodyType)).append("\n");
    sb.append("    preferredEthnicity: ").append(toIndentedString(preferredEthnicity)).append("\n");
    sb.append("    preferredLocation: ").append(toIndentedString(preferredLocation)).append("\n");
    sb.append("    preferredLocationRange: ").append(toIndentedString(preferredLocationRange)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightIndex: ").append(toIndentedString(heightIndex)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    religion: ").append(toIndentedString(religion)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    educationIndex: ").append(toIndentedString(educationIndex)).append("\n");
    sb.append("    smoke: ").append(toIndentedString(smoke)).append("\n");
    sb.append("    drink: ").append(toIndentedString(drink)).append("\n");
    sb.append("    companionship: ").append(toIndentedString(companionship)).append("\n");
    sb.append("    companionshipIndex: ").append(toIndentedString(companionshipIndex)).append("\n");
    sb.append("    developmentPlatforms: ").append(toIndentedString(developmentPlatforms)).append("\n");
    sb.append("    matchToken: ").append(toIndentedString(matchToken)).append("\n");
    sb.append("    matchString: ").append(toIndentedString(matchString)).append("\n");
    sb.append("    noneZeroMatchToken: ").append(toIndentedString(noneZeroMatchToken)).append("\n");
    sb.append("    preferredMaxBirthday: ").append(toIndentedString(preferredMaxBirthday)).append("\n");
    sb.append("    preferredMinBirthday: ").append(toIndentedString(preferredMinBirthday)).append("\n");
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

