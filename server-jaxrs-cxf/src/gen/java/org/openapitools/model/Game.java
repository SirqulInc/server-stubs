package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.GameLevel;
import org.openapitools.model.Pack;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Game  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Date startDate;

  @ApiModelProperty(value = "")

  private Date endDate;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Pack> packs = new ArrayList<>();

public enum SequenceTypeEnum {

FIRST_AVAILABLE(String.valueOf("FIRST_AVAILABLE")), ALL_AVAILABLE(String.valueOf("ALL_AVAILABLE"));


    private String value;

    SequenceTypeEnum (String v) {
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
    public static SequenceTypeEnum fromValue(String value) {
        for (SequenceTypeEnum b : SequenceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SequenceTypeEnum sequenceType;

  @ApiModelProperty(value = "")

  private String authorOverride;

  @ApiModelProperty(value = "")

  @Valid

  private Asset icon;

  @ApiModelProperty(value = "")

  @Valid

  private Asset image;

  @ApiModelProperty(value = "")

  private Long points;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid GameLevel> allGameLevels = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private String contentType;
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

  public Game id(Long id) {
    this.id = id;
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

  public Game active(Boolean active) {
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

  public Game valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Game owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Game application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Game title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Game description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get startDate
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Game startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get endDate
   * @return endDate
  **/
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Game endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Get packs
   * @return packs
  **/
  @JsonProperty("packs")
  public List<@Valid Pack> getPacks() {
    return packs;
  }

  public void setPacks(List<@Valid Pack> packs) {
    this.packs = packs;
  }

  public Game packs(List<@Valid Pack> packs) {
    this.packs = packs;
    return this;
  }

  public Game addPacksItem(Pack packsItem) {
    this.packs.add(packsItem);
    return this;
  }

 /**
   * Get sequenceType
   * @return sequenceType
  **/
  @JsonProperty("sequenceType")
  public String getSequenceType() {
    if (sequenceType == null) {
      return null;
    }
    return sequenceType.value();
  }

  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Game sequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

 /**
   * Get authorOverride
   * @return authorOverride
  **/
  @JsonProperty("authorOverride")
  public String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public Game authorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  @JsonProperty("icon")
  public Asset getIcon() {
    return icon;
  }

  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  public Game icon(Asset icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public Game image(Asset image) {
    this.image = image;
    return this;
  }

 /**
   * Get points
   * @return points
  **/
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }

  public Game points(Long points) {
    this.points = points;
    return this;
  }

 /**
   * Get ticketType
   * @return ticketType
  **/
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public Game ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

 /**
   * Get ticketCount
   * @return ticketCount
  **/
  @JsonProperty("ticketCount")
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Game ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

 /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  @JsonProperty("allocateTickets")
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Game allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

 /**
   * Get allGameLevels
   * @return allGameLevels
  **/
  @JsonProperty("allGameLevels")
  public List<@Valid GameLevel> getAllGameLevels() {
    return allGameLevels;
  }

  public void setAllGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
  }

  public Game allGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
    return this;
  }

  public Game addAllGameLevelsItem(GameLevel allGameLevelsItem) {
    this.allGameLevels.add(allGameLevelsItem);
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Game contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Game contentType(String contentType) {
    this.contentType = contentType;
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
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) &&
        Objects.equals(this.active, game.active) &&
        Objects.equals(this.valid, game.valid) &&
        Objects.equals(this.owner, game.owner) &&
        Objects.equals(this.application, game.application) &&
        Objects.equals(this.title, game.title) &&
        Objects.equals(this.description, game.description) &&
        Objects.equals(this.startDate, game.startDate) &&
        Objects.equals(this.endDate, game.endDate) &&
        Objects.equals(this.packs, game.packs) &&
        Objects.equals(this.sequenceType, game.sequenceType) &&
        Objects.equals(this.authorOverride, game.authorOverride) &&
        Objects.equals(this.icon, game.icon) &&
        Objects.equals(this.image, game.image) &&
        Objects.equals(this.points, game.points) &&
        Objects.equals(this.ticketType, game.ticketType) &&
        Objects.equals(this.ticketCount, game.ticketCount) &&
        Objects.equals(this.allocateTickets, game.allocateTickets) &&
        Objects.equals(this.allGameLevels, game.allGameLevels) &&
        Objects.equals(this.contentName, game.contentName) &&
        Objects.equals(this.contentType, game.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, application, title, description, startDate, endDate, packs, sequenceType, authorOverride, icon, image, points, ticketType, ticketCount, allocateTickets, allGameLevels, contentName, contentType);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

