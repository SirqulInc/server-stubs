package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.OfferShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EventAttendanceResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private OfferShortResponse event;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid CategoryResponse> affiliatedCategories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse attendee;

  @ApiModelProperty(value = "")

  private Boolean friend;
 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  public OfferShortResponse getEvent() {
    return event;
  }

  public void setEvent(OfferShortResponse event) {
    this.event = event;
  }

  public EventAttendanceResponse event(OfferShortResponse event) {
    this.event = event;
    return this;
  }

 /**
   * Get affiliatedCategories
   * @return affiliatedCategories
  **/
  @JsonProperty("affiliatedCategories")
  public List<@Valid CategoryResponse> getAffiliatedCategories() {
    return affiliatedCategories;
  }

  public void setAffiliatedCategories(List<@Valid CategoryResponse> affiliatedCategories) {
    this.affiliatedCategories = affiliatedCategories;
  }

  public EventAttendanceResponse affiliatedCategories(List<@Valid CategoryResponse> affiliatedCategories) {
    this.affiliatedCategories = affiliatedCategories;
    return this;
  }

  public EventAttendanceResponse addAffiliatedCategoriesItem(CategoryResponse affiliatedCategoriesItem) {
    this.affiliatedCategories.add(affiliatedCategoriesItem);
    return this;
  }

 /**
   * Get attendee
   * @return attendee
  **/
  @JsonProperty("attendee")
  public AccountShortResponse getAttendee() {
    return attendee;
  }

  public void setAttendee(AccountShortResponse attendee) {
    this.attendee = attendee;
  }

  public EventAttendanceResponse attendee(AccountShortResponse attendee) {
    this.attendee = attendee;
    return this;
  }

 /**
   * Get friend
   * @return friend
  **/
  @JsonProperty("friend")
  public Boolean getFriend() {
    return friend;
  }

  public void setFriend(Boolean friend) {
    this.friend = friend;
  }

  public EventAttendanceResponse friend(Boolean friend) {
    this.friend = friend;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

