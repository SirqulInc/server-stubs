package apimodels;

import apimodels.Account;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Participant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Participant   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("account")
  @Valid

  private Account account;

  @JsonProperty("availableStart")
  @Valid

  private OffsetDateTime availableStart;

  @JsonProperty("availableEnd")
  @Valid

  private OffsetDateTime availableEnd;

  @JsonProperty("color1")
  
  private String color1;

  @JsonProperty("color2")
  
  private String color2;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TEAM("TEAM"),
    
    LEAGUE("LEAGUE"),
    
    SPORT("SPORT");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  
  private TypeEnum type;

  public Participant id(Long id) {
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

  public Participant active(Boolean active) {
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

  public Participant valid(Boolean valid) {
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

  public Participant account(Account account) {
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

  public Participant availableStart(OffsetDateTime availableStart) {
    this.availableStart = availableStart;
    return this;
  }

   /**
   * Get availableStart
   * @return availableStart
  **/
  public OffsetDateTime getAvailableStart() {
    return availableStart;
  }

  public void setAvailableStart(OffsetDateTime availableStart) {
    this.availableStart = availableStart;
  }

  public Participant availableEnd(OffsetDateTime availableEnd) {
    this.availableEnd = availableEnd;
    return this;
  }

   /**
   * Get availableEnd
   * @return availableEnd
  **/
  public OffsetDateTime getAvailableEnd() {
    return availableEnd;
  }

  public void setAvailableEnd(OffsetDateTime availableEnd) {
    this.availableEnd = availableEnd;
  }

  public Participant color1(String color1) {
    this.color1 = color1;
    return this;
  }

   /**
   * Get color1
   * @return color1
  **/
  public String getColor1() {
    return color1;
  }

  public void setColor1(String color1) {
    this.color1 = color1;
  }

  public Participant color2(String color2) {
    this.color2 = color2;
    return this;
  }

   /**
   * Get color2
   * @return color2
  **/
  public String getColor2() {
    return color2;
  }

  public void setColor2(String color2) {
    this.color2 = color2;
  }

  public Participant type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(id, participant.id) &&
        Objects.equals(active, participant.active) &&
        Objects.equals(valid, participant.valid) &&
        Objects.equals(account, participant.account) &&
        Objects.equals(availableStart, participant.availableStart) &&
        Objects.equals(availableEnd, participant.availableEnd) &&
        Objects.equals(color1, participant.color1) &&
        Objects.equals(color2, participant.color2) &&
        Objects.equals(type, participant.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, account, availableStart, availableEnd, color1, color2, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    availableStart: ").append(toIndentedString(availableStart)).append("\n");
    sb.append("    availableEnd: ").append(toIndentedString(availableEnd)).append("\n");
    sb.append("    color1: ").append(toIndentedString(color1)).append("\n");
    sb.append("    color2: ").append(toIndentedString(color2)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

