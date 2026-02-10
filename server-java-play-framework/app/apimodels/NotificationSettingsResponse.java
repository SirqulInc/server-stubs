package apimodels;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NotificationSettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NotificationSettingsResponse   {
  /**
   * Gets or Sets blockedNotifications
   */
  public enum BlockedNotificationsEnum {
    REASSIGNMENT_REQUEST("REASSIGNMENT_REQUEST"),
    
    FEEDBACK("FEEDBACK"),
    
    SUGGESTION_RECEIVED("SUGGESTION_RECEIVED"),
    
    ASSIGNMENT_CHANGE("ASSIGNMENT_CHANGE"),
    
    WELCOME_PARTNER("WELCOME_PARTNER"),
    
    WELCOME_BUSINESS("WELCOME_BUSINESS"),
    
    PARTNER_INVITE("PARTNER_INVITE"),
    
    PARTNER_EXISTING_INVITE("PARTNER_EXISTING_INVITE"),
    
    PARTNER_CODE_INVITE("PARTNER_CODE_INVITE"),
    
    BATCH_REPORT_FINISHED("BATCH_REPORT_FINISHED"),
    
    WELCOME_BY_APP("WELCOME_BY_APP"),
    
    VALIDATE_MEMBER("VALIDATE_MEMBER"),
    
    NEW_SIGNUP("NEW_SIGNUP"),
    
    VOUCHER_PURCHASED("VOUCHER_PURCHASED"),
    
    PENDING_MISSION_REVIEW("PENDING_MISSION_REVIEW"),
    
    SEND_APP_KEYS("SEND_APP_KEYS"),
    
    RESET_PASSWORD("RESET_PASSWORD"),
    
    PASSWORD_CHANGED("PASSWORD_CHANGED"),
    
    OFFER_24_HR_EXPIRE_RETAILER("OFFER_24HR_EXPIRE_RETAILER"),
    
    OFFER_24_HR_EXPIRE_CONSUMER("OFFER_24HR_EXPIRE_CONSUMER"),
    
    DOWNLOADED_APP("DOWNLOADED_APP"),
    
    LEVEL_COMPLETED("LEVEL_COMPLETED"),
    
    LEVEL_CREATED("LEVEL_CREATED"),
    
    ALBUM_LIKE("ALBUM_LIKE"),
    
    ALBUM_CONTEST_LIKE("ALBUM_CONTEST_LIKE"),
    
    ASSET_LIKE("ASSET_LIKE"),
    
    COLLECTION_LIKE("COLLECTION_LIKE"),
    
    ACCOUNT_LIKE("ACCOUNT_LIKE"),
    
    NOTE_LIKE("NOTE_LIKE"),
    
    GAME_LEVEL_LIKE("GAME_LEVEL_LIKE"),
    
    LIKE("LIKE"),
    
    ALBUM_DISLIKE("ALBUM_DISLIKE"),
    
    ALBUM_CONTEST_DISLIKE("ALBUM_CONTEST_DISLIKE"),
    
    ASSET_DISLIKE("ASSET_DISLIKE"),
    
    COLLECTION_DISLIKE("COLLECTION_DISLIKE"),
    
    ACCOUNT_DISLIKE("ACCOUNT_DISLIKE"),
    
    NOTE_DISLIKE("NOTE_DISLIKE"),
    
    GAME_LEVEL_DISLIKE("GAME_LEVEL_DISLIKE"),
    
    ALBUM_NOTE("ALBUM_NOTE"),
    
    ALBUM_CONTEST_NOTE("ALBUM_CONTEST_NOTE"),
    
    ASSET_NOTE("ASSET_NOTE"),
    
    COLLECTION_NOTE("COLLECTION_NOTE"),
    
    GAME_LEVEL_NOTE("GAME_LEVEL_NOTE"),
    
    COMMENT("COMMENT"),
    
    ALBUM_SHARED("ALBUM_SHARED"),
    
    ALBUM_CONTEST_SHARED("ALBUM_CONTEST_SHARED"),
    
    COLLECTION_SHARED("COLLECTION_SHARED"),
    
    EVENT_SHARED("EVENT_SHARED"),
    
    RETAILER_LOCATION_SHARED("RETAILER_LOCATION_SHARED"),
    
    ANONYMOUS_ALBUM_SHARED("ANONYMOUS_ALBUM_SHARED"),
    
    OFFER_FAVORITE("OFFER_FAVORITE"),
    
    OFFER_LOCATION_FAVORITE("OFFER_LOCATION_FAVORITE"),
    
    RETAILER_LOCATION_FAVORITE("RETAILER_LOCATION_FAVORITE"),
    
    ALBUM_FAVORITE("ALBUM_FAVORITE"),
    
    CATEGORY_FAVORITE("CATEGORY_FAVORITE"),
    
    ALBUM_PENDING("ALBUM_PENDING"),
    
    ALBUM_CONTEST_PENDING("ALBUM_CONTEST_PENDING"),
    
    ALBUM_APPROVED("ALBUM_APPROVED"),
    
    ALBUM_CONTEST_APPROVED("ALBUM_CONTEST_APPROVED"),
    
    ALBUM_FEATURED("ALBUM_FEATURED"),
    
    ALBUM_CONTEST_FEATURED("ALBUM_CONTEST_FEATURED"),
    
    ALBUM_NEW("ALBUM_NEW"),
    
    ALBUM_CONTEST_NEW("ALBUM_CONTEST_NEW"),
    
    ALBUM_ASSETS_ADDED("ALBUM_ASSETS_ADDED"),
    
    COLLECTION_ASSETS_ADDED("COLLECTION_ASSETS_ADDED"),
    
    ALBUM_PHOTOS_ADDED("ALBUM_PHOTOS_ADDED"),
    
    ALBUM_CONTEST_ALBUM_ADD("ALBUM_CONTEST_ALBUM_ADD"),
    
    CHALLENGE("CHALLENGE"),
    
    EARN_COMMISSION_TICKETS("EARN_COMMISSION_TICKETS"),
    
    FRIEND_REQUESTED("FRIEND_REQUESTED"),
    
    FRIEND_REQUEST_ACCEPTED("FRIEND_REQUEST_ACCEPTED"),
    
    FRIEND_REQUEST_REJECTED("FRIEND_REQUEST_REJECTED"),
    
    FRIEND_REMOVED("FRIEND_REMOVED"),
    
    FRIEND_ADDED("FRIEND_ADDED"),
    
    FOLLOW("FOLLOW"),
    
    PURCHASE_ITEM_GIFTED("PURCHASE_ITEM_GIFTED"),
    
    PROFILE_PROXIMITY("PROFILE_PROXIMITY"),
    
    CUSTOM("CUSTOM"),
    
    ADMIN("ADMIN"),
    
    INVOICE("INVOICE"),
    
    SUGGESTIONS_SUMMARY("SUGGESTIONS_SUMMARY"),
    
    SUGGESTIONS_LINK("SUGGESTIONS_LINK"),
    
    EVENT_ATTENDANCE("EVENT_ATTENDANCE"),
    
    EVENTS_TODAY("EVENTS_TODAY"),
    
    OFFER_CREATE("OFFER_CREATE"),
    
    EVENT_CREATE("EVENT_CREATE"),
    
    MATCH_WINNER("MATCH_WINNER"),
    
    MATCH_LOSER("MATCH_LOSER"),
    
    MATCH_TIE("MATCH_TIE"),
    
    MATCH_TIE_WINNER("MATCH_TIE_WINNER"),
    
    MATCH_TIE_LOSER("MATCH_TIE_LOSER"),
    
    TOURNAMENT_REFUND("TOURNAMENT_REFUND"),
    
    TOURNAMENT_WON("TOURNAMENT_WON"),
    
    TOURNAMENT_WINNER("TOURNAMENT_WINNER"),
    
    ROUND_START_SOON("ROUND_START_SOON"),
    
    ROUND_END_SOON("ROUND_END_SOON"),
    
    ROUND_WINNER("ROUND_WINNER"),
    
    ROUND_SCORED("ROUND_SCORED");

    private final String value;

    BlockedNotificationsEnum(String value) {
      this.value = value;
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

  @JsonProperty("blockedNotifications")
  
  private Set<BlockedNotificationsEnum> blockedNotifications = null;

  public NotificationSettingsResponse blockedNotifications(Set<BlockedNotificationsEnum> blockedNotifications) {
    this.blockedNotifications = blockedNotifications;
    return this;
  }

  public NotificationSettingsResponse addBlockedNotificationsItem(BlockedNotificationsEnum blockedNotificationsItem) {
    if (this.blockedNotifications == null) {
      this.blockedNotifications = new LinkedHashSet<>();
    }
    this.blockedNotifications.add(blockedNotificationsItem);
    return this;
  }

   /**
   * Get blockedNotifications
   * @return blockedNotifications
  **/
  public Set<BlockedNotificationsEnum> getBlockedNotifications() {
    return blockedNotifications;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setBlockedNotifications(Set<BlockedNotificationsEnum> blockedNotifications) {
    this.blockedNotifications = blockedNotifications;
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
    return Objects.equals(blockedNotifications, notificationSettingsResponse.blockedNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedNotifications);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

