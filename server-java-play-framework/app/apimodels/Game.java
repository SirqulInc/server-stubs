package apimodels;

import apimodels.Account;
import apimodels.Application;
import apimodels.Asset;
import apimodels.GameLevel;
import apimodels.Pack;
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
 * Game
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Game   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("application")
  @Valid

  private Application application;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("startDate")
  @Valid

  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @Valid

  private OffsetDateTime endDate;

  @JsonProperty("packs")
  @Valid

  private List<@Valid Pack> packs = null;

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    FIRST_AVAILABLE("FIRST_AVAILABLE"),
    
    ALL_AVAILABLE("ALL_AVAILABLE");

    private final String value;

    SequenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SequenceTypeEnum fromValue(String value) {
      for (SequenceTypeEnum b : SequenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("sequenceType")
  
  private SequenceTypeEnum sequenceType;

  @JsonProperty("authorOverride")
  
  private String authorOverride;

  @JsonProperty("icon")
  @Valid

  private Asset icon;

  @JsonProperty("image")
  @Valid

  private Asset image;

  @JsonProperty("points")
  
  private Long points;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("allGameLevels")
  @Valid

  private List<@Valid GameLevel> allGameLevels = null;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("contentType")
  
  private String contentType;

  public Game id(Long id) {
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

  public Game active(Boolean active) {
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

  public Game valid(Boolean valid) {
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

  public Game owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Game application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Game title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Game description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Game startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Game endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Game packs(List<@Valid Pack> packs) {
    this.packs = packs;
    return this;
  }

  public Game addPacksItem(Pack packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<>();
    }
    this.packs.add(packsItem);
    return this;
  }

   /**
   * Get packs
   * @return packs
  **/
  public List<@Valid Pack> getPacks() {
    return packs;
  }

  public void setPacks(List<@Valid Pack> packs) {
    this.packs = packs;
  }

  public Game sequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

   /**
   * Get sequenceType
   * @return sequenceType
  **/
  public SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Game authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

   /**
   * Get authorOverride
   * @return authorOverride
  **/
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public Game icon(Asset icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  public Asset getIcon() {
    return icon;
  }

  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  public Game image(Asset image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public Game points(Long points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }

  public Game ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

   /**
   * Get ticketType
   * @return ticketType
  **/
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public Game ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

   /**
   * Get ticketCount
   * @return ticketCount
  **/
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Game allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

   /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Game allGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
    return this;
  }

  public Game addAllGameLevelsItem(GameLevel allGameLevelsItem) {
    if (this.allGameLevels == null) {
      this.allGameLevels = new ArrayList<>();
    }
    this.allGameLevels.add(allGameLevelsItem);
    return this;
  }

   /**
   * Get allGameLevels
   * @return allGameLevels
  **/
  public List<@Valid GameLevel> getAllGameLevels() {
    return allGameLevels;
  }

  public void setAllGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
  }

  public Game contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Game contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(id, game.id) &&
        Objects.equals(active, game.active) &&
        Objects.equals(valid, game.valid) &&
        Objects.equals(owner, game.owner) &&
        Objects.equals(application, game.application) &&
        Objects.equals(title, game.title) &&
        Objects.equals(description, game.description) &&
        Objects.equals(startDate, game.startDate) &&
        Objects.equals(endDate, game.endDate) &&
        Objects.equals(packs, game.packs) &&
        Objects.equals(sequenceType, game.sequenceType) &&
        Objects.equals(authorOverride, game.authorOverride) &&
        Objects.equals(icon, game.icon) &&
        Objects.equals(image, game.image) &&
        Objects.equals(points, game.points) &&
        Objects.equals(ticketType, game.ticketType) &&
        Objects.equals(ticketCount, game.ticketCount) &&
        Objects.equals(allocateTickets, game.allocateTickets) &&
        Objects.equals(allGameLevels, game.allGameLevels) &&
        Objects.equals(contentName, game.contentName) &&
        Objects.equals(contentType, game.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, application, title, description, startDate, endDate, packs, sequenceType, authorOverride, icon, image, points, ticketType, ticketCount, allocateTickets, allGameLevels, contentName, contentType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    allGameLevels: ").append(toIndentedString(allGameLevels)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

