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
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.GameLevel;
import org.openapitools.model.Pack;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Game   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
  private Application application;
  private String title;
  private String description;
  private Date startDate;
  private Date endDate;
  private List<@Valid Pack> packs = new ArrayList<>();

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    FIRST_AVAILABLE("FIRST_AVAILABLE"),

        ALL_AVAILABLE("ALL_AVAILABLE");
    private String value;

    SequenceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SequenceTypeEnum sequenceType;
  private String authorOverride;
  private Asset icon;
  private Asset image;
  private Long points;
  private String ticketType;
  private Long ticketCount;
  private Boolean allocateTickets;
  private List<@Valid GameLevel> allGameLevels = new ArrayList<>();
  private String contentName;
  private String contentType;

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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("packs")
  @Valid
  public List<@Valid Pack> getPacks() {
    return packs;
  }
  public void setPacks(List<@Valid Pack> packs) {
    this.packs = packs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sequenceType")
  public SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }
  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authorOverride")
  public String getAuthorOverride() {
    return authorOverride;
  }
  public void setAuthorOverride(String authorOverride) {
    this.authorOverride = authorOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("icon")
  @Valid
  public Asset getIcon() {
    return icon;
  }
  public void setIcon(Asset icon) {
    this.icon = icon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public Asset getImage() {
    return image;
  }
  public void setImage(Asset image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }
  public void setPoints(Long points) {
    this.points = points;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }
  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketCount")
  public Long getTicketCount() {
    return ticketCount;
  }
  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allocateTickets")
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }
  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allGameLevels")
  @Valid
  public List<@Valid GameLevel> getAllGameLevels() {
    return allGameLevels;
  }
  public void setAllGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

