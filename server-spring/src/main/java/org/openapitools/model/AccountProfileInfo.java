package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountProfileInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountProfileInfo {

  private @Nullable Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime updated;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account account;

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime birthday;

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

    private final String value;

    AgeGroupEnum(String value) {
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
    public static AgeGroupEnum fromValue(String value) {
      for (AgeGroupEnum b : AgeGroupEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable AgeGroupEnum ageGroup;

  private @Nullable Integer preferredMinAge;

  private @Nullable Integer preferredMaxAge;

  private @Nullable Integer preferredMinHeight;

  private @Nullable Integer preferredMaxHeight;

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

  private @Nullable String preferredEducation;

  private @Nullable Integer preferredEducationIndex;

  private @Nullable String preferredBodyType;

  private @Nullable String preferredEthnicity;

  private @Nullable String preferredLocation;

  private @Nullable Double preferredLocationRange;

  private @Nullable String height;

  private @Nullable Integer heightIndex;

  private @Nullable String ethnicity;

  private @Nullable String bodyType;

  private @Nullable String maritalStatus;

  private @Nullable String children;

  private @Nullable String religion;

  private @Nullable String education;

  private @Nullable Integer educationIndex;

  private @Nullable String smoke;

  private @Nullable String drink;

  private @Nullable String companionship;

  private @Nullable Integer companionshipIndex;

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

    private final String value;

    DevelopmentPlatformsEnum(String value) {
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
    public static DevelopmentPlatformsEnum fromValue(String value) {
      for (DevelopmentPlatformsEnum b : DevelopmentPlatformsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<DevelopmentPlatformsEnum> developmentPlatforms = new ArrayList<>();

  private @Nullable Long matchToken;

  private @Nullable String matchString;

  private @Nullable Long noneZeroMatchToken;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime preferredMaxBirthday;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime preferredMinBirthday;

  public AccountProfileInfo id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public AccountProfileInfo created(@Nullable OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @Valid 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(@Nullable OffsetDateTime created) {
    this.created = created;
  }

  public AccountProfileInfo updated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @Valid 
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
  }

  public AccountProfileInfo active(@Nullable Boolean active) {
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

  public AccountProfileInfo valid(@Nullable Boolean valid) {
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

  public AccountProfileInfo account(@Nullable Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public @Nullable Account getAccount() {
    return account;
  }

  public void setAccount(@Nullable Account account) {
    this.account = account;
  }

  public AccountProfileInfo gender(@Nullable GenderEnum gender) {
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

  public AccountProfileInfo birthday(@Nullable OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  @Valid 
  @Schema(name = "birthday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthday")
  public @Nullable OffsetDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(@Nullable OffsetDateTime birthday) {
    this.birthday = birthday;
  }

  public AccountProfileInfo ageGroup(@Nullable AgeGroupEnum ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

  /**
   * Get ageGroup
   * @return ageGroup
   */
  
  @Schema(name = "ageGroup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ageGroup")
  public @Nullable AgeGroupEnum getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(@Nullable AgeGroupEnum ageGroup) {
    this.ageGroup = ageGroup;
  }

  public AccountProfileInfo preferredMinAge(@Nullable Integer preferredMinAge) {
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

  public AccountProfileInfo preferredMaxAge(@Nullable Integer preferredMaxAge) {
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

  public AccountProfileInfo preferredMinHeight(@Nullable Integer preferredMinHeight) {
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

  public AccountProfileInfo preferredMaxHeight(@Nullable Integer preferredMaxHeight) {
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

  public AccountProfileInfo preferredGender(@Nullable PreferredGenderEnum preferredGender) {
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

  public AccountProfileInfo preferredEducation(@Nullable String preferredEducation) {
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

  public AccountProfileInfo preferredEducationIndex(@Nullable Integer preferredEducationIndex) {
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

  public AccountProfileInfo preferredBodyType(@Nullable String preferredBodyType) {
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

  public AccountProfileInfo preferredEthnicity(@Nullable String preferredEthnicity) {
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

  public AccountProfileInfo preferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
    return this;
  }

  /**
   * Get preferredLocation
   * @return preferredLocation
   */
  
  @Schema(name = "preferredLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredLocation")
  public @Nullable String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(@Nullable String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  public AccountProfileInfo preferredLocationRange(@Nullable Double preferredLocationRange) {
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

  public AccountProfileInfo height(@Nullable String height) {
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

  public AccountProfileInfo heightIndex(@Nullable Integer heightIndex) {
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

  public AccountProfileInfo ethnicity(@Nullable String ethnicity) {
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

  public AccountProfileInfo bodyType(@Nullable String bodyType) {
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

  public AccountProfileInfo maritalStatus(@Nullable String maritalStatus) {
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

  public AccountProfileInfo children(@Nullable String children) {
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

  public AccountProfileInfo religion(@Nullable String religion) {
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

  public AccountProfileInfo education(@Nullable String education) {
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

  public AccountProfileInfo educationIndex(@Nullable Integer educationIndex) {
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

  public AccountProfileInfo smoke(@Nullable String smoke) {
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

  public AccountProfileInfo drink(@Nullable String drink) {
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

  public AccountProfileInfo companionship(@Nullable String companionship) {
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

  public AccountProfileInfo companionshipIndex(@Nullable Integer companionshipIndex) {
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

  public AccountProfileInfo developmentPlatforms(List<DevelopmentPlatformsEnum> developmentPlatforms) {
    this.developmentPlatforms = developmentPlatforms;
    return this;
  }

  public AccountProfileInfo addDevelopmentPlatformsItem(DevelopmentPlatformsEnum developmentPlatformsItem) {
    if (this.developmentPlatforms == null) {
      this.developmentPlatforms = new ArrayList<>();
    }
    this.developmentPlatforms.add(developmentPlatformsItem);
    return this;
  }

  /**
   * Get developmentPlatforms
   * @return developmentPlatforms
   */
  
  @Schema(name = "developmentPlatforms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("developmentPlatforms")
  public List<DevelopmentPlatformsEnum> getDevelopmentPlatforms() {
    return developmentPlatforms;
  }

  public void setDevelopmentPlatforms(List<DevelopmentPlatformsEnum> developmentPlatforms) {
    this.developmentPlatforms = developmentPlatforms;
  }

  public AccountProfileInfo matchToken(@Nullable Long matchToken) {
    this.matchToken = matchToken;
    return this;
  }

  /**
   * Get matchToken
   * @return matchToken
   */
  
  @Schema(name = "matchToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchToken")
  public @Nullable Long getMatchToken() {
    return matchToken;
  }

  public void setMatchToken(@Nullable Long matchToken) {
    this.matchToken = matchToken;
  }

  public AccountProfileInfo matchString(@Nullable String matchString) {
    this.matchString = matchString;
    return this;
  }

  /**
   * Get matchString
   * @return matchString
   */
  
  @Schema(name = "matchString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchString")
  public @Nullable String getMatchString() {
    return matchString;
  }

  public void setMatchString(@Nullable String matchString) {
    this.matchString = matchString;
  }

  public AccountProfileInfo noneZeroMatchToken(@Nullable Long noneZeroMatchToken) {
    this.noneZeroMatchToken = noneZeroMatchToken;
    return this;
  }

  /**
   * Get noneZeroMatchToken
   * @return noneZeroMatchToken
   */
  
  @Schema(name = "noneZeroMatchToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noneZeroMatchToken")
  public @Nullable Long getNoneZeroMatchToken() {
    return noneZeroMatchToken;
  }

  public void setNoneZeroMatchToken(@Nullable Long noneZeroMatchToken) {
    this.noneZeroMatchToken = noneZeroMatchToken;
  }

  public AccountProfileInfo preferredMaxBirthday(@Nullable OffsetDateTime preferredMaxBirthday) {
    this.preferredMaxBirthday = preferredMaxBirthday;
    return this;
  }

  /**
   * Get preferredMaxBirthday
   * @return preferredMaxBirthday
   */
  @Valid 
  @Schema(name = "preferredMaxBirthday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredMaxBirthday")
  public @Nullable OffsetDateTime getPreferredMaxBirthday() {
    return preferredMaxBirthday;
  }

  public void setPreferredMaxBirthday(@Nullable OffsetDateTime preferredMaxBirthday) {
    this.preferredMaxBirthday = preferredMaxBirthday;
  }

  public AccountProfileInfo preferredMinBirthday(@Nullable OffsetDateTime preferredMinBirthday) {
    this.preferredMinBirthday = preferredMinBirthday;
    return this;
  }

  /**
   * Get preferredMinBirthday
   * @return preferredMinBirthday
   */
  @Valid 
  @Schema(name = "preferredMinBirthday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredMinBirthday")
  public @Nullable OffsetDateTime getPreferredMinBirthday() {
    return preferredMinBirthday;
  }

  public void setPreferredMinBirthday(@Nullable OffsetDateTime preferredMinBirthday) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

