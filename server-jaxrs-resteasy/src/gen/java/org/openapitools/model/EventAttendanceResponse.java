package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.OfferShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EventAttendanceResponse   {
  
  private OfferShortResponse event;
  private List<@Valid CategoryResponse> affiliatedCategories = new ArrayList<>();
  private AccountShortResponse attendee;
  private Boolean friend;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event")
  @Valid
  public OfferShortResponse getEvent() {
    return event;
  }
  public void setEvent(OfferShortResponse event) {
    this.event = event;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("affiliatedCategories")
  @Valid
  public List<@Valid CategoryResponse> getAffiliatedCategories() {
    return affiliatedCategories;
  }
  public void setAffiliatedCategories(List<@Valid CategoryResponse> affiliatedCategories) {
    this.affiliatedCategories = affiliatedCategories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attendee")
  @Valid
  public AccountShortResponse getAttendee() {
    return attendee;
  }
  public void setAttendee(AccountShortResponse attendee) {
    this.attendee = attendee;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("friend")
  public Boolean getFriend() {
    return friend;
  }
  public void setFriend(Boolean friend) {
    this.friend = friend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventAttendanceResponse eventAttendanceResponse = (EventAttendanceResponse) o;
    return Objects.equals(this.event, eventAttendanceResponse.event) &&
        Objects.equals(this.affiliatedCategories, eventAttendanceResponse.affiliatedCategories) &&
        Objects.equals(this.attendee, eventAttendanceResponse.attendee) &&
        Objects.equals(this.friend, eventAttendanceResponse.friend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, affiliatedCategories, attendee, friend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventAttendanceResponse {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    affiliatedCategories: ").append(toIndentedString(affiliatedCategories)).append("\n");
    sb.append("    attendee: ").append(toIndentedString(attendee)).append("\n");
    sb.append("    friend: ").append(toIndentedString(friend)).append("\n");
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

