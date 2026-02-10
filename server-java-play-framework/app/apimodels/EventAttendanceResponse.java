package apimodels;

import apimodels.AccountShortResponse;
import apimodels.CategoryResponse;
import apimodels.OfferShortResponse;
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
 * EventAttendanceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EventAttendanceResponse   {
  @JsonProperty("event")
  @Valid

  private OfferShortResponse event;

  @JsonProperty("affiliatedCategories")
  @Valid

  private List<@Valid CategoryResponse> affiliatedCategories = null;

  @JsonProperty("attendee")
  @Valid

  private AccountShortResponse attendee;

  @JsonProperty("friend")
  
  private Boolean friend;

  public EventAttendanceResponse event(OfferShortResponse event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  public OfferShortResponse getEvent() {
    return event;
  }

  public void setEvent(OfferShortResponse event) {
    this.event = event;
  }

  public EventAttendanceResponse affiliatedCategories(List<@Valid CategoryResponse> affiliatedCategories) {
    this.affiliatedCategories = affiliatedCategories;
    return this;
  }

  public EventAttendanceResponse addAffiliatedCategoriesItem(CategoryResponse affiliatedCategoriesItem) {
    if (this.affiliatedCategories == null) {
      this.affiliatedCategories = new ArrayList<>();
    }
    this.affiliatedCategories.add(affiliatedCategoriesItem);
    return this;
  }

   /**
   * Get affiliatedCategories
   * @return affiliatedCategories
  **/
  public List<@Valid CategoryResponse> getAffiliatedCategories() {
    return affiliatedCategories;
  }

  public void setAffiliatedCategories(List<@Valid CategoryResponse> affiliatedCategories) {
    this.affiliatedCategories = affiliatedCategories;
  }

  public EventAttendanceResponse attendee(AccountShortResponse attendee) {
    this.attendee = attendee;
    return this;
  }

   /**
   * Get attendee
   * @return attendee
  **/
  public AccountShortResponse getAttendee() {
    return attendee;
  }

  public void setAttendee(AccountShortResponse attendee) {
    this.attendee = attendee;
  }

  public EventAttendanceResponse friend(Boolean friend) {
    this.friend = friend;
    return this;
  }

   /**
   * Get friend
   * @return friend
  **/
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
    return Objects.equals(event, eventAttendanceResponse.event) &&
        Objects.equals(affiliatedCategories, eventAttendanceResponse.affiliatedCategories) &&
        Objects.equals(attendee, eventAttendanceResponse.attendee) &&
        Objects.equals(friend, eventAttendanceResponse.friend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, affiliatedCategories, attendee, friend);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

