package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NotificationSettingsResponse  {
  
public enum BlockedNotificationsEnum {

REASSIGNMENT_REQUEST(String.valueOf("REASSIGNMENT_REQUEST")), FEEDBACK(String.valueOf("FEEDBACK")), SUGGESTION_RECEIVED(String.valueOf("SUGGESTION_RECEIVED")), ASSIGNMENT_CHANGE(String.valueOf("ASSIGNMENT_CHANGE")), WELCOME_PARTNER(String.valueOf("WELCOME_PARTNER")), WELCOME_BUSINESS(String.valueOf("WELCOME_BUSINESS")), PARTNER_INVITE(String.valueOf("PARTNER_INVITE")), PARTNER_EXISTING_INVITE(String.valueOf("PARTNER_EXISTING_INVITE")), PARTNER_CODE_INVITE(String.valueOf("PARTNER_CODE_INVITE")), BATCH_REPORT_FINISHED(String.valueOf("BATCH_REPORT_FINISHED")), WELCOME_BY_APP(String.valueOf("WELCOME_BY_APP")), VALIDATE_MEMBER(String.valueOf("VALIDATE_MEMBER")), NEW_SIGNUP(String.valueOf("NEW_SIGNUP")), VOUCHER_PURCHASED(String.valueOf("VOUCHER_PURCHASED")), PENDING_MISSION_REVIEW(String.valueOf("PENDING_MISSION_REVIEW")), SEND_APP_KEYS(String.valueOf("SEND_APP_KEYS")), RESET_PASSWORD(String.valueOf("RESET_PASSWORD")), PASSWORD_CHANGED(String.valueOf("PASSWORD_CHANGED")), OFFER_24_HR_EXPIRE_RETAILER(String.valueOf("OFFER_24HR_EXPIRE_RETAILER")), OFFER_24_HR_EXPIRE_CONSUMER(String.valueOf("OFFER_24HR_EXPIRE_CONSUMER")), DOWNLOADED_APP(String.valueOf("DOWNLOADED_APP")), LEVEL_COMPLETED(String.valueOf("LEVEL_COMPLETED")), LEVEL_CREATED(String.valueOf("LEVEL_CREATED")), ALBUM_LIKE(String.valueOf("ALBUM_LIKE")), ALBUM_CONTEST_LIKE(String.valueOf("ALBUM_CONTEST_LIKE")), ASSET_LIKE(String.valueOf("ASSET_LIKE")), COLLECTION_LIKE(String.valueOf("COLLECTION_LIKE")), ACCOUNT_LIKE(String.valueOf("ACCOUNT_LIKE")), NOTE_LIKE(String.valueOf("NOTE_LIKE")), GAME_LEVEL_LIKE(String.valueOf("GAME_LEVEL_LIKE")), LIKE(String.valueOf("LIKE")), ALBUM_DISLIKE(String.valueOf("ALBUM_DISLIKE")), ALBUM_CONTEST_DISLIKE(String.valueOf("ALBUM_CONTEST_DISLIKE")), ASSET_DISLIKE(String.valueOf("ASSET_DISLIKE")), COLLECTION_DISLIKE(String.valueOf("COLLECTION_DISLIKE")), ACCOUNT_DISLIKE(String.valueOf("ACCOUNT_DISLIKE")), NOTE_DISLIKE(String.valueOf("NOTE_DISLIKE")), GAME_LEVEL_DISLIKE(String.valueOf("GAME_LEVEL_DISLIKE")), ALBUM_NOTE(String.valueOf("ALBUM_NOTE")), ALBUM_CONTEST_NOTE(String.valueOf("ALBUM_CONTEST_NOTE")), ASSET_NOTE(String.valueOf("ASSET_NOTE")), COLLECTION_NOTE(String.valueOf("COLLECTION_NOTE")), GAME_LEVEL_NOTE(String.valueOf("GAME_LEVEL_NOTE")), COMMENT(String.valueOf("COMMENT")), ALBUM_SHARED(String.valueOf("ALBUM_SHARED")), ALBUM_CONTEST_SHARED(String.valueOf("ALBUM_CONTEST_SHARED")), COLLECTION_SHARED(String.valueOf("COLLECTION_SHARED")), EVENT_SHARED(String.valueOf("EVENT_SHARED")), RETAILER_LOCATION_SHARED(String.valueOf("RETAILER_LOCATION_SHARED")), ANONYMOUS_ALBUM_SHARED(String.valueOf("ANONYMOUS_ALBUM_SHARED")), OFFER_FAVORITE(String.valueOf("OFFER_FAVORITE")), OFFER_LOCATION_FAVORITE(String.valueOf("OFFER_LOCATION_FAVORITE")), RETAILER_LOCATION_FAVORITE(String.valueOf("RETAILER_LOCATION_FAVORITE")), ALBUM_FAVORITE(String.valueOf("ALBUM_FAVORITE")), CATEGORY_FAVORITE(String.valueOf("CATEGORY_FAVORITE")), ALBUM_PENDING(String.valueOf("ALBUM_PENDING")), ALBUM_CONTEST_PENDING(String.valueOf("ALBUM_CONTEST_PENDING")), ALBUM_APPROVED(String.valueOf("ALBUM_APPROVED")), ALBUM_CONTEST_APPROVED(String.valueOf("ALBUM_CONTEST_APPROVED")), ALBUM_FEATURED(String.valueOf("ALBUM_FEATURED")), ALBUM_CONTEST_FEATURED(String.valueOf("ALBUM_CONTEST_FEATURED")), ALBUM_NEW(String.valueOf("ALBUM_NEW")), ALBUM_CONTEST_NEW(String.valueOf("ALBUM_CONTEST_NEW")), ALBUM_ASSETS_ADDED(String.valueOf("ALBUM_ASSETS_ADDED")), COLLECTION_ASSETS_ADDED(String.valueOf("COLLECTION_ASSETS_ADDED")), ALBUM_PHOTOS_ADDED(String.valueOf("ALBUM_PHOTOS_ADDED")), ALBUM_CONTEST_ALBUM_ADD(String.valueOf("ALBUM_CONTEST_ALBUM_ADD")), CHALLENGE(String.valueOf("CHALLENGE")), EARN_COMMISSION_TICKETS(String.valueOf("EARN_COMMISSION_TICKETS")), FRIEND_REQUESTED(String.valueOf("FRIEND_REQUESTED")), FRIEND_REQUEST_ACCEPTED(String.valueOf("FRIEND_REQUEST_ACCEPTED")), FRIEND_REQUEST_REJECTED(String.valueOf("FRIEND_REQUEST_REJECTED")), FRIEND_REMOVED(String.valueOf("FRIEND_REMOVED")), FRIEND_ADDED(String.valueOf("FRIEND_ADDED")), FOLLOW(String.valueOf("FOLLOW")), PURCHASE_ITEM_GIFTED(String.valueOf("PURCHASE_ITEM_GIFTED")), PROFILE_PROXIMITY(String.valueOf("PROFILE_PROXIMITY")), CUSTOM(String.valueOf("CUSTOM")), ADMIN(String.valueOf("ADMIN")), INVOICE(String.valueOf("INVOICE")), SUGGESTIONS_SUMMARY(String.valueOf("SUGGESTIONS_SUMMARY")), SUGGESTIONS_LINK(String.valueOf("SUGGESTIONS_LINK")), EVENT_ATTENDANCE(String.valueOf("EVENT_ATTENDANCE")), EVENTS_TODAY(String.valueOf("EVENTS_TODAY")), OFFER_CREATE(String.valueOf("OFFER_CREATE")), EVENT_CREATE(String.valueOf("EVENT_CREATE")), MATCH_WINNER(String.valueOf("MATCH_WINNER")), MATCH_LOSER(String.valueOf("MATCH_LOSER")), MATCH_TIE(String.valueOf("MATCH_TIE")), MATCH_TIE_WINNER(String.valueOf("MATCH_TIE_WINNER")), MATCH_TIE_LOSER(String.valueOf("MATCH_TIE_LOSER")), TOURNAMENT_REFUND(String.valueOf("TOURNAMENT_REFUND")), TOURNAMENT_WON(String.valueOf("TOURNAMENT_WON")), TOURNAMENT_WINNER(String.valueOf("TOURNAMENT_WINNER")), ROUND_START_SOON(String.valueOf("ROUND_START_SOON")), ROUND_END_SOON(String.valueOf("ROUND_END_SOON")), ROUND_WINNER(String.valueOf("ROUND_WINNER")), ROUND_SCORED(String.valueOf("ROUND_SCORED"));


    private String value;

    BlockedNotificationsEnum (String v) {
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
    public static BlockedNotificationsEnum fromValue(String value) {
        for (BlockedNotificationsEnum b : BlockedNotificationsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private Set<BlockedNotificationsEnum> blockedNotifications = new LinkedHashSet<>();
 /**
   * Get blockedNotifications
   * @return blockedNotifications
  **/
  @JsonProperty("blockedNotifications")
  public Set<BlockedNotificationsEnum> getBlockedNotifications() {
    return blockedNotifications;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setBlockedNotifications(Set<BlockedNotificationsEnum> blockedNotifications) {
    this.blockedNotifications = blockedNotifications;
  }

  public NotificationSettingsResponse blockedNotifications(Set<BlockedNotificationsEnum> blockedNotifications) {
    this.blockedNotifications = blockedNotifications;
    return this;
  }

  public NotificationSettingsResponse addBlockedNotificationsItem(BlockedNotificationsEnum blockedNotificationsItem) {
    this.blockedNotifications.add(blockedNotificationsItem);
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
    NotificationSettingsResponse notificationSettingsResponse = (NotificationSettingsResponse) o;
    return Objects.equals(this.blockedNotifications, notificationSettingsResponse.blockedNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedNotifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSettingsResponse {\n");
    
    sb.append("    blockedNotifications: ").append(toIndentedString(blockedNotifications)).append("\n");
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

