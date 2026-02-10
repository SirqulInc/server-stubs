package apimodels;

import apimodels.AccountShortResponse;
import apimodels.ApplicationShortResponse;
import apimodels.AssetShortResponse;
import apimodels.PurchaseItemShortResponse;
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
 * TicketResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TicketResponse   {
  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DATA("DATA"),
    
    SAVE("SAVE"),
    
    DELETE("DELETE"),
    
    GET("GET");

    private final String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("action")
  
  private ActionEnum action;

  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("accountId")
  
  private Long accountId;

  @JsonProperty("objectId")
  
  private Long objectId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    GAME_OBJECT("GAME_OBJECT"),
    
    GAME_LEVEL("GAME_LEVEL"),
    
    PACK("PACK"),
    
    GAME("GAME"),
    
    MISSION("MISSION"),
    
    PROFILE("PROFILE"),
    
    APPLICATION("APPLICATION"),
    
    TICKETS("TICKETS"),
    
    ASSET("ASSET"),
    
    CUSTOM("CUSTOM");

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

  /**
   * Gets or Sets actionType
   */
  public enum ActionTypeEnum {
    COMPLETED("COMPLETED"),
    
    REDEEMED("REDEEMED"),
    
    USERS_PLAYED("USERS_PLAYED"),
    
    TOURNAMENT_OWNER("TOURNAMENT_OWNER"),
    
    PURCHASED("PURCHASED"),
    
    SUMATION("SUMATION"),
    
    GIFTED("GIFTED"),
    
    REFUNDED("REFUNDED");

    private final String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionTypeEnum fromValue(String value) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("actionType")
  
  private ActionTypeEnum actionType;

  @JsonProperty("used")
  
  private Long used;

  @JsonProperty("count")
  
  private Long count;

  @JsonProperty("purchaseItem")
  @Valid

  private PurchaseItemShortResponse purchaseItem;

  @JsonProperty("customMessage")
  
  private String customMessage;

  @JsonProperty("sender")
  @Valid

  private AccountShortResponse sender;

  @JsonProperty("receiver")
  @Valid

  private List<@Valid AccountShortResponse> receiver = null;

  @JsonProperty("customAsset")
  @Valid

  private AssetShortResponse customAsset;

  @JsonProperty("receiptToken")
  
  private String receiptToken;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("application")
  @Valid

  private ApplicationShortResponse application;

  public TicketResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public TicketResponse id(Long id) {
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

  public TicketResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public TicketResponse objectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  public Long getObjectId() {
    return objectId;
  }

  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }

  public TicketResponse type(TypeEnum type) {
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

  public TicketResponse actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public TicketResponse used(Long used) {
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }

  public TicketResponse count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public TicketResponse purchaseItem(PurchaseItemShortResponse purchaseItem) {
    this.purchaseItem = purchaseItem;
    return this;
  }

   /**
   * Get purchaseItem
   * @return purchaseItem
  **/
  public PurchaseItemShortResponse getPurchaseItem() {
    return purchaseItem;
  }

  public void setPurchaseItem(PurchaseItemShortResponse purchaseItem) {
    this.purchaseItem = purchaseItem;
  }

  public TicketResponse customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

   /**
   * Get customMessage
   * @return customMessage
  **/
  public String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  public TicketResponse sender(AccountShortResponse sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  public AccountShortResponse getSender() {
    return sender;
  }

  public void setSender(AccountShortResponse sender) {
    this.sender = sender;
  }

  public TicketResponse receiver(List<@Valid AccountShortResponse> receiver) {
    this.receiver = receiver;
    return this;
  }

  public TicketResponse addReceiverItem(AccountShortResponse receiverItem) {
    if (this.receiver == null) {
      this.receiver = new ArrayList<>();
    }
    this.receiver.add(receiverItem);
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  public List<@Valid AccountShortResponse> getReceiver() {
    return receiver;
  }

  public void setReceiver(List<@Valid AccountShortResponse> receiver) {
    this.receiver = receiver;
  }

  public TicketResponse customAsset(AssetShortResponse customAsset) {
    this.customAsset = customAsset;
    return this;
  }

   /**
   * Get customAsset
   * @return customAsset
  **/
  public AssetShortResponse getCustomAsset() {
    return customAsset;
  }

  public void setCustomAsset(AssetShortResponse customAsset) {
    this.customAsset = customAsset;
  }

  public TicketResponse receiptToken(String receiptToken) {
    this.receiptToken = receiptToken;
    return this;
  }

   /**
   * Get receiptToken
   * @return receiptToken
  **/
  public String getReceiptToken() {
    return receiptToken;
  }

  public void setReceiptToken(String receiptToken) {
    this.receiptToken = receiptToken;
  }

  public TicketResponse ticketType(String ticketType) {
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

  public TicketResponse application(ApplicationShortResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketResponse ticketResponse = (TicketResponse) o;
    return Objects.equals(action, ticketResponse.action) &&
        Objects.equals(id, ticketResponse.id) &&
        Objects.equals(accountId, ticketResponse.accountId) &&
        Objects.equals(objectId, ticketResponse.objectId) &&
        Objects.equals(type, ticketResponse.type) &&
        Objects.equals(actionType, ticketResponse.actionType) &&
        Objects.equals(used, ticketResponse.used) &&
        Objects.equals(count, ticketResponse.count) &&
        Objects.equals(purchaseItem, ticketResponse.purchaseItem) &&
        Objects.equals(customMessage, ticketResponse.customMessage) &&
        Objects.equals(sender, ticketResponse.sender) &&
        Objects.equals(receiver, ticketResponse.receiver) &&
        Objects.equals(customAsset, ticketResponse.customAsset) &&
        Objects.equals(receiptToken, ticketResponse.receiptToken) &&
        Objects.equals(ticketType, ticketResponse.ticketType) &&
        Objects.equals(application, ticketResponse.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, id, accountId, objectId, type, actionType, used, count, purchaseItem, customMessage, sender, receiver, customAsset, receiptToken, ticketType, application);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    purchaseItem: ").append(toIndentedString(purchaseItem)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    customAsset: ").append(toIndentedString(customAsset)).append("\n");
    sb.append("    receiptToken: ").append(toIndentedString(receiptToken)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

