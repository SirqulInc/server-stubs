package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountProfileInfo  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Date created;

  @ApiModelProperty(value = "")

  private Date updated;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account account;

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

  private Date birthday;

public enum AgeGroupEnum {

AGE_0_13(String.valueOf("AGE_0_13")), AGE_14_17(String.valueOf("AGE_14_17")), AGE_18_22(String.valueOf("AGE_18_22")), AGE_23_30(String.valueOf("AGE_23_30")), AGE_31_54(String.valueOf("AGE_31_54")), AGE_55_PLUS(String.valueOf("AGE_55_PLUS"));


    private String value;

    AgeGroupEnum (String v) {
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
    public static AgeGroupEnum fromValue(String value) {
        for (AgeGroupEnum b : AgeGroupEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private AgeGroupEnum ageGroup;

  @ApiModelProperty(value = "")

  private Integer preferredMinAge;

  @ApiModelProperty(value = "")

  private Integer preferredMaxAge;

  @ApiModelProperty(value = "")

  private Integer preferredMinHeight;

  @ApiModelProperty(value = "")

  private Integer preferredMaxHeight;

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

  private String preferredEducation;

  @ApiModelProperty(value = "")

  private Integer preferredEducationIndex;

  @ApiModelProperty(value = "")

  private String preferredBodyType;

  @ApiModelProperty(value = "")

  private String preferredEthnicity;

  @ApiModelProperty(value = "")

  private String preferredLocation;

  @ApiModelProperty(value = "")

  private Double preferredLocationRange;

  @ApiModelProperty(value = "")

  private String height;

  @ApiModelProperty(value = "")

  private Integer heightIndex;

  @ApiModelProperty(value = "")

  private String ethnicity;

  @ApiModelProperty(value = "")

  private String bodyType;

  @ApiModelProperty(value = "")

  private String maritalStatus;

  @ApiModelProperty(value = "")

  private String children;

  @ApiModelProperty(value = "")

  private String religion;

  @ApiModelProperty(value = "")

  private String education;

  @ApiModelProperty(value = "")

  private Integer educationIndex;

  @ApiModelProperty(value = "")

  private String smoke;

  @ApiModelProperty(value = "")

  private String drink;

  @ApiModelProperty(value = "")

  private String companionship;

  @ApiModelProperty(value = "")

  private Integer companionshipIndex;

public enum DevelopmentPlatformsEnum {

MAC(String.valueOf("MAC")), WINDOWS(String.valueOf("WINDOWS")), IOS(String.valueOf("IOS")), ANDROID(String.valueOf("ANDROID")), WINDOWSPHONE(String.valueOf("WINDOWSPHONE")), KINDLE(String.valueOf("KINDLE")), UNITY3_D(String.valueOf("UNITY3D")), COCOS2_D(String.valueOf("COCOS2D")), HTML5(String.valueOf("HTML5")), FACEBOOK(String.valueOf("FACEBOOK"));


    private String value;

    DevelopmentPlatformsEnum (String v) {
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
    public static DevelopmentPlatformsEnum fromValue(String value) {
        for (DevelopmentPlatformsEnum b : DevelopmentPlatformsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private List<DevelopmentPlatformsEnum> developmentPlatforms = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long matchToken;

  @ApiModelProperty(value = "")

  private String matchString;

  @ApiModelProperty(value = "")

  private Long noneZeroMatchToken;

  @ApiModelProperty(value = "")

  private Date preferredMaxBirthday;

  @ApiModelProperty(value = "")

  private Date preferredMinBirthday;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AccountProfileInfo id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public AccountProfileInfo created(Date created) {
    this.created = created;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public AccountProfileInfo updated(Date updated) {
    this.updated = updated;
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

  public AccountProfileInfo active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public AccountProfileInfo valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public AccountProfileInfo account(Account account) {
    this.account = account;
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

  public AccountProfileInfo gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get birthday
   * @return birthday
  **/
  @JsonProperty("birthday")
  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public AccountProfileInfo birthday(Date birthday) {
    this.birthday = birthday;
    return this;
  }

 /**
   * Get ageGroup
   * @return ageGroup
  **/
  @JsonProperty("ageGroup")
  public String getAgeGroup() {
    if (ageGroup == null) {
      return null;
    }
    return ageGroup.value();
  }

  public void setAgeGroup(AgeGroupEnum ageGroup) {
    this.ageGroup = ageGroup;
  }

  public AccountProfileInfo ageGroup(AgeGroupEnum ageGroup) {
    this.ageGroup = ageGroup;
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

  public AccountProfileInfo preferredMinAge(Integer preferredMinAge) {
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

  public AccountProfileInfo preferredMaxAge(Integer preferredMaxAge) {
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

  public AccountProfileInfo preferredMinHeight(Integer preferredMinHeight) {
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

  public AccountProfileInfo preferredMaxHeight(Integer preferredMaxHeight) {
    this.preferredMaxHeight = preferredMaxHeight;
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

  public AccountProfileInfo preferredGender(PreferredGenderEnum preferredGender) {
    this.preferredGender = preferredGender;
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

  public AccountProfileInfo preferredEducation(String preferredEducation) {
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

  public AccountProfileInfo preferredEducationIndex(Integer preferredEducationIndex) {
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

  public AccountProfileInfo preferredBodyType(String preferredBodyType) {
    this.preferredBodyType = preferredBodyType;
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

  public AccountProfileInfo preferredEthnicity(String preferredEthnicity) {
    this.preferredEthnicity = preferredEthnicity;
    return this;
  }

 /**
   * Get preferredLocation
   * @return preferredLocation
  **/
  @JsonProperty("preferredLocation")
  public String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  public AccountProfileInfo preferredLocation(String preferredLocation) {
    this.preferredLocation = preferredLocation;
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

  public AccountProfileInfo preferredLocationRange(Double preferredLocationRange) {
    this.preferredLocationRange = preferredLocationRange;
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

  public AccountProfileInfo height(String height) {
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

  public AccountProfileInfo heightIndex(Integer heightIndex) {
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

  public AccountProfileInfo ethnicity(String ethnicity) {
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

  public AccountProfileInfo bodyType(String bodyType) {
    this.bodyType = bodyType;
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

  public AccountProfileInfo maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
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

  public AccountProfileInfo children(String children) {
    this.children = children;
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

  public AccountProfileInfo religion(String religion) {
    this.religion = religion;
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

  public AccountProfileInfo education(String education) {
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

  public AccountProfileInfo educationIndex(Integer educationIndex) {
    this.educationIndex = educationIndex;
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

  public AccountProfileInfo smoke(String smoke) {
    this.smoke = smoke;
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

  public AccountProfileInfo drink(String drink) {
    this.drink = drink;
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

  public AccountProfileInfo companionship(String companionship) {
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

  public AccountProfileInfo companionshipIndex(Integer companionshipIndex) {
    this.companionshipIndex = companionshipIndex;
    return this;
  }

 /**
   * Get developmentPlatforms
   * @return developmentPlatforms
  **/
  @JsonProperty("developmentPlatforms")
  public List<DevelopmentPlatformsEnum> getDevelopmentPlatforms() {
    return developmentPlatforms;
  }

  public void setDevelopmentPlatforms(List<DevelopmentPlatformsEnum> developmentPlatforms) {
    this.developmentPlatforms = developmentPlatforms;
  }

  public AccountProfileInfo developmentPlatforms(List<DevelopmentPlatformsEnum> developmentPlatforms) {
    this.developmentPlatforms = developmentPlatforms;
    return this;
  }

  public AccountProfileInfo addDevelopmentPlatformsItem(DevelopmentPlatformsEnum developmentPlatformsItem) {
    this.developmentPlatforms.add(developmentPlatformsItem);
    return this;
  }

 /**
   * Get matchToken
   * @return matchToken
  **/
  @JsonProperty("matchToken")
  public Long getMatchToken() {
    return matchToken;
  }

  public void setMatchToken(Long matchToken) {
    this.matchToken = matchToken;
  }

  public AccountProfileInfo matchToken(Long matchToken) {
    this.matchToken = matchToken;
    return this;
  }

 /**
   * Get matchString
   * @return matchString
  **/
  @JsonProperty("matchString")
  public String getMatchString() {
    return matchString;
  }

  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }

  public AccountProfileInfo matchString(String matchString) {
    this.matchString = matchString;
    return this;
  }

 /**
   * Get noneZeroMatchToken
   * @return noneZeroMatchToken
  **/
  @JsonProperty("noneZeroMatchToken")
  public Long getNoneZeroMatchToken() {
    return noneZeroMatchToken;
  }

  public void setNoneZeroMatchToken(Long noneZeroMatchToken) {
    this.noneZeroMatchToken = noneZeroMatchToken;
  }

  public AccountProfileInfo noneZeroMatchToken(Long noneZeroMatchToken) {
    this.noneZeroMatchToken = noneZeroMatchToken;
    return this;
  }

 /**
   * Get preferredMaxBirthday
   * @return preferredMaxBirthday
  **/
  @JsonProperty("preferredMaxBirthday")
  public Date getPreferredMaxBirthday() {
    return preferredMaxBirthday;
  }

  public void setPreferredMaxBirthday(Date preferredMaxBirthday) {
    this.preferredMaxBirthday = preferredMaxBirthday;
  }

  public AccountProfileInfo preferredMaxBirthday(Date preferredMaxBirthday) {
    this.preferredMaxBirthday = preferredMaxBirthday;
    return this;
  }

 /**
   * Get preferredMinBirthday
   * @return preferredMinBirthday
  **/
  @JsonProperty("preferredMinBirthday")
  public Date getPreferredMinBirthday() {
    return preferredMinBirthday;
  }

  public void setPreferredMinBirthday(Date preferredMinBirthday) {
    this.preferredMinBirthday = preferredMinBirthday;
  }

  public AccountProfileInfo preferredMinBirthday(Date preferredMinBirthday) {
    this.preferredMinBirthday = preferredMinBirthday;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

