package apimodels;

import apimodels.Account;
import java.time.OffsetDateTime;
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
 * AccountProfileInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AccountProfileInfo   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("created")
  @Valid

  private OffsetDateTime created;

  @JsonProperty("updated")
  @Valid

  private OffsetDateTime updated;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("account")
  @Valid

  private Account account;

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

  @JsonProperty("birthday")
  @Valid

  private OffsetDateTime birthday;

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

  @JsonProperty("ageGroup")
  
  private AgeGroupEnum ageGroup;

  @JsonProperty("preferredMinAge")
  
  private Integer preferredMinAge;

  @JsonProperty("preferredMaxAge")
  
  private Integer preferredMaxAge;

  @JsonProperty("preferredMinHeight")
  
  private Integer preferredMinHeight;

  @JsonProperty("preferredMaxHeight")
  
  private Integer preferredMaxHeight;

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

  @JsonProperty("preferredEducation")
  
  private String preferredEducation;

  @JsonProperty("preferredEducationIndex")
  
  private Integer preferredEducationIndex;

  @JsonProperty("preferredBodyType")
  
  private String preferredBodyType;

  @JsonProperty("preferredEthnicity")
  
  private String preferredEthnicity;

  @JsonProperty("preferredLocation")
  
  private String preferredLocation;

  @JsonProperty("preferredLocationRange")
  
  private Double preferredLocationRange;

  @JsonProperty("height")
  
  private String height;

  @JsonProperty("heightIndex")
  
  private Integer heightIndex;

  @JsonProperty("ethnicity")
  
  private String ethnicity;

  @JsonProperty("bodyType")
  
  private String bodyType;

  @JsonProperty("maritalStatus")
  
  private String maritalStatus;

  @JsonProperty("children")
  
  private String children;

  @JsonProperty("religion")
  
  private String religion;

  @JsonProperty("education")
  
  private String education;

  @JsonProperty("educationIndex")
  
  private Integer educationIndex;

  @JsonProperty("smoke")
  
  private String smoke;

  @JsonProperty("drink")
  
  private String drink;

  @JsonProperty("companionship")
  
  private String companionship;

  @JsonProperty("companionshipIndex")
  
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

    private final String value;

    DevelopmentPlatformsEnum(String value) {
      this.value = value;
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

  @JsonProperty("developmentPlatforms")
  
  private List<DevelopmentPlatformsEnum> developmentPlatforms = null;

  @JsonProperty("matchToken")
  
  private Long matchToken;

  @JsonProperty("matchString")
  
  private String matchString;

  @JsonProperty("noneZeroMatchToken")
  
  private Long noneZeroMatchToken;

  @JsonProperty("preferredMaxBirthday")
  @Valid

  private OffsetDateTime preferredMaxBirthday;

  @JsonProperty("preferredMinBirthday")
  @Valid

  private OffsetDateTime preferredMinBirthday;

  public AccountProfileInfo id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AccountProfileInfo created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AccountProfileInfo updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public AccountProfileInfo active(Boolean active) {
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

  public AccountProfileInfo valid(Boolean valid) {
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

  public AccountProfileInfo account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public AccountProfileInfo gender(GenderEnum gender) {
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

  public AccountProfileInfo birthday(OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Get birthday
   * @return birthday
  **/
  public OffsetDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(OffsetDateTime birthday) {
    this.birthday = birthday;
  }

  public AccountProfileInfo ageGroup(AgeGroupEnum ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

   /**
   * Get ageGroup
   * @return ageGroup
  **/
  public AgeGroupEnum getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(AgeGroupEnum ageGroup) {
    this.ageGroup = ageGroup;
  }

  public AccountProfileInfo preferredMinAge(Integer preferredMinAge) {
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

  public AccountProfileInfo preferredMaxAge(Integer preferredMaxAge) {
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

  public AccountProfileInfo preferredMinHeight(Integer preferredMinHeight) {
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

  public AccountProfileInfo preferredMaxHeight(Integer preferredMaxHeight) {
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

  public AccountProfileInfo preferredGender(PreferredGenderEnum preferredGender) {
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

  public AccountProfileInfo preferredEducation(String preferredEducation) {
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

  public AccountProfileInfo preferredEducationIndex(Integer preferredEducationIndex) {
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

  public AccountProfileInfo preferredBodyType(String preferredBodyType) {
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

  public AccountProfileInfo preferredEthnicity(String preferredEthnicity) {
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

  public AccountProfileInfo preferredLocation(String preferredLocation) {
    this.preferredLocation = preferredLocation;
    return this;
  }

   /**
   * Get preferredLocation
   * @return preferredLocation
  **/
  public String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  public AccountProfileInfo preferredLocationRange(Double preferredLocationRange) {
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

  public AccountProfileInfo height(String height) {
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

  public AccountProfileInfo heightIndex(Integer heightIndex) {
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

  public AccountProfileInfo ethnicity(String ethnicity) {
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

  public AccountProfileInfo bodyType(String bodyType) {
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

  public AccountProfileInfo maritalStatus(String maritalStatus) {
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

  public AccountProfileInfo children(String children) {
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

  public AccountProfileInfo religion(String religion) {
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

  public AccountProfileInfo education(String education) {
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

  public AccountProfileInfo educationIndex(Integer educationIndex) {
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

  public AccountProfileInfo smoke(String smoke) {
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

  public AccountProfileInfo drink(String drink) {
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

  public AccountProfileInfo companionship(String companionship) {
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

  public AccountProfileInfo companionshipIndex(Integer companionshipIndex) {
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
  **/
  public List<DevelopmentPlatformsEnum> getDevelopmentPlatforms() {
    return developmentPlatforms;
  }

  public void setDevelopmentPlatforms(List<DevelopmentPlatformsEnum> developmentPlatforms) {
    this.developmentPlatforms = developmentPlatforms;
  }

  public AccountProfileInfo matchToken(Long matchToken) {
    this.matchToken = matchToken;
    return this;
  }

   /**
   * Get matchToken
   * @return matchToken
  **/
  public Long getMatchToken() {
    return matchToken;
  }

  public void setMatchToken(Long matchToken) {
    this.matchToken = matchToken;
  }

  public AccountProfileInfo matchString(String matchString) {
    this.matchString = matchString;
    return this;
  }

   /**
   * Get matchString
   * @return matchString
  **/
  public String getMatchString() {
    return matchString;
  }

  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }

  public AccountProfileInfo noneZeroMatchToken(Long noneZeroMatchToken) {
    this.noneZeroMatchToken = noneZeroMatchToken;
    return this;
  }

   /**
   * Get noneZeroMatchToken
   * @return noneZeroMatchToken
  **/
  public Long getNoneZeroMatchToken() {
    return noneZeroMatchToken;
  }

  public void setNoneZeroMatchToken(Long noneZeroMatchToken) {
    this.noneZeroMatchToken = noneZeroMatchToken;
  }

  public AccountProfileInfo preferredMaxBirthday(OffsetDateTime preferredMaxBirthday) {
    this.preferredMaxBirthday = preferredMaxBirthday;
    return this;
  }

   /**
   * Get preferredMaxBirthday
   * @return preferredMaxBirthday
  **/
  public OffsetDateTime getPreferredMaxBirthday() {
    return preferredMaxBirthday;
  }

  public void setPreferredMaxBirthday(OffsetDateTime preferredMaxBirthday) {
    this.preferredMaxBirthday = preferredMaxBirthday;
  }

  public AccountProfileInfo preferredMinBirthday(OffsetDateTime preferredMinBirthday) {
    this.preferredMinBirthday = preferredMinBirthday;
    return this;
  }

   /**
   * Get preferredMinBirthday
   * @return preferredMinBirthday
  **/
  public OffsetDateTime getPreferredMinBirthday() {
    return preferredMinBirthday;
  }

  public void setPreferredMinBirthday(OffsetDateTime preferredMinBirthday) {
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
    return Objects.equals(id, accountProfileInfo.id) &&
        Objects.equals(created, accountProfileInfo.created) &&
        Objects.equals(updated, accountProfileInfo.updated) &&
        Objects.equals(active, accountProfileInfo.active) &&
        Objects.equals(valid, accountProfileInfo.valid) &&
        Objects.equals(account, accountProfileInfo.account) &&
        Objects.equals(gender, accountProfileInfo.gender) &&
        Objects.equals(birthday, accountProfileInfo.birthday) &&
        Objects.equals(ageGroup, accountProfileInfo.ageGroup) &&
        Objects.equals(preferredMinAge, accountProfileInfo.preferredMinAge) &&
        Objects.equals(preferredMaxAge, accountProfileInfo.preferredMaxAge) &&
        Objects.equals(preferredMinHeight, accountProfileInfo.preferredMinHeight) &&
        Objects.equals(preferredMaxHeight, accountProfileInfo.preferredMaxHeight) &&
        Objects.equals(preferredGender, accountProfileInfo.preferredGender) &&
        Objects.equals(preferredEducation, accountProfileInfo.preferredEducation) &&
        Objects.equals(preferredEducationIndex, accountProfileInfo.preferredEducationIndex) &&
        Objects.equals(preferredBodyType, accountProfileInfo.preferredBodyType) &&
        Objects.equals(preferredEthnicity, accountProfileInfo.preferredEthnicity) &&
        Objects.equals(preferredLocation, accountProfileInfo.preferredLocation) &&
        Objects.equals(preferredLocationRange, accountProfileInfo.preferredLocationRange) &&
        Objects.equals(height, accountProfileInfo.height) &&
        Objects.equals(heightIndex, accountProfileInfo.heightIndex) &&
        Objects.equals(ethnicity, accountProfileInfo.ethnicity) &&
        Objects.equals(bodyType, accountProfileInfo.bodyType) &&
        Objects.equals(maritalStatus, accountProfileInfo.maritalStatus) &&
        Objects.equals(children, accountProfileInfo.children) &&
        Objects.equals(religion, accountProfileInfo.religion) &&
        Objects.equals(education, accountProfileInfo.education) &&
        Objects.equals(educationIndex, accountProfileInfo.educationIndex) &&
        Objects.equals(smoke, accountProfileInfo.smoke) &&
        Objects.equals(drink, accountProfileInfo.drink) &&
        Objects.equals(companionship, accountProfileInfo.companionship) &&
        Objects.equals(companionshipIndex, accountProfileInfo.companionshipIndex) &&
        Objects.equals(developmentPlatforms, accountProfileInfo.developmentPlatforms) &&
        Objects.equals(matchToken, accountProfileInfo.matchToken) &&
        Objects.equals(matchString, accountProfileInfo.matchString) &&
        Objects.equals(noneZeroMatchToken, accountProfileInfo.noneZeroMatchToken) &&
        Objects.equals(preferredMaxBirthday, accountProfileInfo.preferredMaxBirthday) &&
        Objects.equals(preferredMinBirthday, accountProfileInfo.preferredMinBirthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, active, valid, account, gender, birthday, ageGroup, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, developmentPlatforms, matchToken, matchString, noneZeroMatchToken, preferredMaxBirthday, preferredMinBirthday);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

