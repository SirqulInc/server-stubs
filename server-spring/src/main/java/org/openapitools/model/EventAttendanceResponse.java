package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.OfferShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EventAttendanceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EventAttendanceResponse {

  private @Nullable OfferShortResponse event;

  @Valid
  private List<@Valid CategoryResponse> affiliatedCategories = new ArrayList<>();

  private @Nullable AccountShortResponse attendee;

  private @Nullable Boolean friend;

  public EventAttendanceResponse event(@Nullable OfferShortResponse event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public @Nullable OfferShortResponse getEvent() {
    return event;
  }

  public void setEvent(@Nullable OfferShortResponse event) {
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
   */
  @Valid 
  @Schema(name = "affiliatedCategories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("affiliatedCategories")
  public List<@Valid CategoryResponse> getAffiliatedCategories() {
    return affiliatedCategories;
  }

  public void setAffiliatedCategories(List<@Valid CategoryResponse> affiliatedCategories) {
    this.affiliatedCategories = affiliatedCategories;
  }

  public EventAttendanceResponse attendee(@Nullable AccountShortResponse attendee) {
    this.attendee = attendee;
    return this;
  }

  /**
   * Get attendee
   * @return attendee
   */
  @Valid 
  @Schema(name = "attendee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attendee")
  public @Nullable AccountShortResponse getAttendee() {
    return attendee;
  }

  public void setAttendee(@Nullable AccountShortResponse attendee) {
    this.attendee = attendee;
  }

  public EventAttendanceResponse friend(@Nullable Boolean friend) {
    this.friend = friend;
    return this;
  }

  /**
   * Get friend
   * @return friend
   */
  
  @Schema(name = "friend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("friend")
  public @Nullable Boolean getFriend() {
    return friend;
  }

  public void setFriend(@Nullable Boolean friend) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

