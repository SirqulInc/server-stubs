package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.SubscriptionPlan;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Subscription  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private SubscriptionPlan subscriptionPlan;

  @ApiModelProperty(value = "")

  private String remoteSubscriptionId;

  @ApiModelProperty(value = "")

  private String promoCode;

  @ApiModelProperty(value = "")

  private Boolean failed;

public enum MessageEnum {

_400(String.valueOf("_400")), _403(String.valueOf("_403")), _500(String.valueOf("_500")), _600(String.valueOf("_600")), _1000(String.valueOf("_1000")), _1001(String.valueOf("_1001")), _1002(String.valueOf("_1002")), _1003(String.valueOf("_1003")), _1004(String.valueOf("_1004")), _1005(String.valueOf("_1005")), _1006(String.valueOf("_1006")), _1007(String.valueOf("_1007")), _1008(String.valueOf("_1008")), _1009(String.valueOf("_1009")), _1010(String.valueOf("_1010")), _1011(String.valueOf("_1011")), _1012(String.valueOf("_1012")), _1013(String.valueOf("_1013")), _1014(String.valueOf("_1014")), _1015(String.valueOf("_1015")), _1016(String.valueOf("_1016")), _1017(String.valueOf("_1017")), _1018(String.valueOf("_1018")), _1019(String.valueOf("_1019")), _1020(String.valueOf("_1020")), _1021(String.valueOf("_1021")), _1022(String.valueOf("_1022")), _1023(String.valueOf("_1023")), _1024(String.valueOf("_1024")), _1025(String.valueOf("_1025")), _1026(String.valueOf("_1026")), _1027(String.valueOf("_1027")), _1028(String.valueOf("_1028")), _1029(String.valueOf("_1029")), _1030(String.valueOf("_1030")), _1031(String.valueOf("_1031")), _1032(String.valueOf("_1032")), _1033(String.valueOf("_1033")), _1034(String.valueOf("_1034")), _1035(String.valueOf("_1035")), _1036(String.valueOf("_1036")), _1037(String.valueOf("_1037")), _1038(String.valueOf("_1038")), _1100(String.valueOf("_1100")), _1101(String.valueOf("_1101")), _1102(String.valueOf("_1102")), _1103(String.valueOf("_1103")), _1104(String.valueOf("_1104")), _1105(String.valueOf("_1105")), _1106(String.valueOf("_1106")), _1107(String.valueOf("_1107")), _1108(String.valueOf("_1108")), _1109(String.valueOf("_1109")), _1110(String.valueOf("_1110")), _2000(String.valueOf("_2000")), _2001(String.valueOf("_2001")), _2002(String.valueOf("_2002")), _2003(String.valueOf("_2003")), _2004(String.valueOf("_2004")), _2005(String.valueOf("_2005")), _2006(String.valueOf("_2006")), _2007(String.valueOf("_2007")), _2008(String.valueOf("_2008")), _2009(String.valueOf("_2009")), _2010(String.valueOf("_2010")), _2011(String.valueOf("_2011")), _2012(String.valueOf("_2012")), _2013(String.valueOf("_2013")), _2100(String.valueOf("_2100")), _2101(String.valueOf("_2101")), _2102(String.valueOf("_2102")), _2103(String.valueOf("_2103")), _2200(String.valueOf("_2200")), _2201(String.valueOf("_2201")), _2202(String.valueOf("_2202")), _2203(String.valueOf("_2203")), _2204(String.valueOf("_2204")), _2205(String.valueOf("_2205")), _2206(String.valueOf("_2206")), _2207(String.valueOf("_2207")), _2208(String.valueOf("_2208")), _2209(String.valueOf("_2209")), _2210(String.valueOf("_2210")), _2211(String.valueOf("_2211")), _2212(String.valueOf("_2212")), _2300(String.valueOf("_2300")), _2301(String.valueOf("_2301")), _2302(String.valueOf("_2302")), _2303(String.valueOf("_2303")), _2400(String.valueOf("_2400")), _2401(String.valueOf("_2401")), _2402(String.valueOf("_2402")), _2500(String.valueOf("_2500")), _2501(String.valueOf("_2501")), _2502(String.valueOf("_2502")), _2503(String.valueOf("_2503")), _2504(String.valueOf("_2504")), _2505(String.valueOf("_2505")), _2506(String.valueOf("_2506")), _2507(String.valueOf("_2507")), _2508(String.valueOf("_2508")), _2509(String.valueOf("_2509")), _2510(String.valueOf("_2510")), _2511(String.valueOf("_2511")), _2512(String.valueOf("_2512")), _2513(String.valueOf("_2513")), _2514(String.valueOf("_2514")), _2515(String.valueOf("_2515")), _2600(String.valueOf("_2600")), _2601(String.valueOf("_2601")), _2602(String.valueOf("_2602")), _2603(String.valueOf("_2603")), _2604(String.valueOf("_2604")), _2700(String.valueOf("_2700")), _2701(String.valueOf("_2701")), _2702(String.valueOf("_2702")), _2703(String.valueOf("_2703")), _2704(String.valueOf("_2704")), _2705(String.valueOf("_2705")), _2800(String.valueOf("_2800")), _2801(String.valueOf("_2801")), _2900(String.valueOf("_2900")), _2901(String.valueOf("_2901")), _2902(String.valueOf("_2902")), _2903(String.valueOf("_2903")), _2904(String.valueOf("_2904")), _2905(String.valueOf("_2905")), _2906(String.valueOf("_2906")), _3000(String.valueOf("_3000")), _3001(String.valueOf("_3001")), _3002(String.valueOf("_3002")), _3100(String.valueOf("_3100")), _3101(String.valueOf("_3101")), _3102(String.valueOf("_3102")), _3103(String.valueOf("_3103")), _3104(String.valueOf("_3104")), _3200(String.valueOf("_3200")), _3201(String.valueOf("_3201")), _3300(String.valueOf("_3300")), _3301(String.valueOf("_3301")), _3302(String.valueOf("_3302")), _3303(String.valueOf("_3303")), _3304(String.valueOf("_3304")), _3305(String.valueOf("_3305")), _3306(String.valueOf("_3306")), _3307(String.valueOf("_3307")), _3308(String.valueOf("_3308")), _3309(String.valueOf("_3309")), _3310(String.valueOf("_3310")), _3311(String.valueOf("_3311")), _3312(String.valueOf("_3312")), _3313(String.valueOf("_3313")), _3314(String.valueOf("_3314")), _3315(String.valueOf("_3315")), _3316(String.valueOf("_3316")), _3400(String.valueOf("_3400")), _3401(String.valueOf("_3401")), _3500(String.valueOf("_3500")), _3501(String.valueOf("_3501")), _3502(String.valueOf("_3502")), _3503(String.valueOf("_3503")), _3504(String.valueOf("_3504")), _3505(String.valueOf("_3505")), _3506(String.valueOf("_3506")), _3507(String.valueOf("_3507")), _3508(String.valueOf("_3508")), _3600(String.valueOf("_3600")), _3601(String.valueOf("_3601")), _3602(String.valueOf("_3602")), _3603(String.valueOf("_3603")), _3700(String.valueOf("_3700")), _3701(String.valueOf("_3701")), _3702(String.valueOf("_3702")), _3703(String.valueOf("_3703")), _3800(String.valueOf("_3800")), _3801(String.valueOf("_3801")), _3802(String.valueOf("_3802")), _3803(String.valueOf("_3803")), _3804(String.valueOf("_3804")), _3805(String.valueOf("_3805")), _3806(String.valueOf("_3806")), _3807(String.valueOf("_3807")), _3900(String.valueOf("_3900")), _3901(String.valueOf("_3901")), _3902(String.valueOf("_3902")), _3903(String.valueOf("_3903")), _3904(String.valueOf("_3904")), _3905(String.valueOf("_3905")), _4000(String.valueOf("_4000")), _4001(String.valueOf("_4001")), _4002(String.valueOf("_4002")), _4100(String.valueOf("_4100")), _4101(String.valueOf("_4101")), _4102(String.valueOf("_4102")), _4103(String.valueOf("_4103")), _4200(String.valueOf("_4200")), _4201(String.valueOf("_4201")), _4202(String.valueOf("_4202")), _4203(String.valueOf("_4203")), _4204(String.valueOf("_4204")), _4205(String.valueOf("_4205")), _4300(String.valueOf("_4300")), _4301(String.valueOf("_4301")), _4302(String.valueOf("_4302")), _4303(String.valueOf("_4303")), _4304(String.valueOf("_4304")), _4400(String.valueOf("_4400")), _4401(String.valueOf("_4401")), _4500(String.valueOf("_4500")), _4501(String.valueOf("_4501")), _4502(String.valueOf("_4502")), _4503(String.valueOf("_4503")), _4504(String.valueOf("_4504")), _4505(String.valueOf("_4505")), _4600(String.valueOf("_4600")), _4700(String.valueOf("_4700")), _4701(String.valueOf("_4701")), _4702(String.valueOf("_4702")), _4800(String.valueOf("_4800")), _4801(String.valueOf("_4801")), _4900(String.valueOf("_4900")), _4901(String.valueOf("_4901")), _4902(String.valueOf("_4902")), _4903(String.valueOf("_4903")), _4904(String.valueOf("_4904")), _4905(String.valueOf("_4905")), _4906(String.valueOf("_4906")), _5000(String.valueOf("_5000")), _5001(String.valueOf("_5001")), _5002(String.valueOf("_5002")), _5003(String.valueOf("_5003")), _5100(String.valueOf("_5100")), _5101(String.valueOf("_5101")), _5102(String.valueOf("_5102")), _5103(String.valueOf("_5103")), _5104(String.valueOf("_5104")), _5200(String.valueOf("_5200")), _5300(String.valueOf("_5300")), _5301(String.valueOf("_5301")), _5302(String.valueOf("_5302")), _5303(String.valueOf("_5303")), _5400(String.valueOf("_5400")), _5500(String.valueOf("_5500")), _5501(String.valueOf("_5501")), _5600(String.valueOf("_5600")), _5601(String.valueOf("_5601")), _5602(String.valueOf("_5602")), _5603(String.valueOf("_5603")), _5604(String.valueOf("_5604")), _5606(String.valueOf("_5606")), _5607(String.valueOf("_5607")), _5608(String.valueOf("_5608")), _5609(String.valueOf("_5609")), _5700(String.valueOf("_5700")), _5701(String.valueOf("_5701")), _5702(String.valueOf("_5702")), _5703(String.valueOf("_5703")), _5704(String.valueOf("_5704")), _5705(String.valueOf("_5705")), _5800(String.valueOf("_5800")), _5801(String.valueOf("_5801")), _5802(String.valueOf("_5802")), _5803(String.valueOf("_5803")), _5804(String.valueOf("_5804")), _5805(String.valueOf("_5805")), _5806(String.valueOf("_5806")), _5807(String.valueOf("_5807")), _5900(String.valueOf("_5900")), _5901(String.valueOf("_5901")), _5902(String.valueOf("_5902")), _5903(String.valueOf("_5903")), _5904(String.valueOf("_5904")), _5905(String.valueOf("_5905")), _5906(String.valueOf("_5906")), _5907(String.valueOf("_5907")), _5908(String.valueOf("_5908")), _5909(String.valueOf("_5909")), _5910(String.valueOf("_5910")), _5911(String.valueOf("_5911")), _5912(String.valueOf("_5912")), _5913(String.valueOf("_5913")), _5914(String.valueOf("_5914")), _5915(String.valueOf("_5915")), _5916(String.valueOf("_5916")), _6000(String.valueOf("_6000")), _6001(String.valueOf("_6001")), _6100(String.valueOf("_6100")), _6101(String.valueOf("_6101")), _6102(String.valueOf("_6102")), _6103(String.valueOf("_6103")), _6200(String.valueOf("_6200")), _6201(String.valueOf("_6201")), _6202(String.valueOf("_6202")), _6300(String.valueOf("_6300")), _6301(String.valueOf("_6301")), _6302(String.valueOf("_6302")), _6303(String.valueOf("_6303")), _6304(String.valueOf("_6304")), _6305(String.valueOf("_6305")), _6306(String.valueOf("_6306")), _6307(String.valueOf("_6307")), _6308(String.valueOf("_6308")), _6309(String.valueOf("_6309")), _6310(String.valueOf("_6310")), _6311(String.valueOf("_6311")), _6312(String.valueOf("_6312")), _6400(String.valueOf("_6400")), _6401(String.valueOf("_6401")), _6402(String.valueOf("_6402")), _6403(String.valueOf("_6403")), _6404(String.valueOf("_6404")), _6500(String.valueOf("_6500")), _6501(String.valueOf("_6501")), _6502(String.valueOf("_6502")), _6600(String.valueOf("_6600")), _6601(String.valueOf("_6601")), _6602(String.valueOf("_6602")), _6603(String.valueOf("_6603")), _6700(String.valueOf("_6700")), _6701(String.valueOf("_6701")), _6702(String.valueOf("_6702")), _6703(String.valueOf("_6703")), _6704(String.valueOf("_6704")), _6705(String.valueOf("_6705")), _6706(String.valueOf("_6706")), _6707(String.valueOf("_6707")), _6708(String.valueOf("_6708")), _6709(String.valueOf("_6709")), _6800(String.valueOf("_6800")), _6801(String.valueOf("_6801")), _6802(String.valueOf("_6802")), _6803(String.valueOf("_6803")), _6900(String.valueOf("_6900")), _6901(String.valueOf("_6901")), _6902(String.valueOf("_6902")), _6903(String.valueOf("_6903")), _7000(String.valueOf("_7000")), _7100(String.valueOf("_7100")), _7101(String.valueOf("_7101")), _7102(String.valueOf("_7102")), _7200(String.valueOf("_7200")), _7201(String.valueOf("_7201")), _7300(String.valueOf("_7300")), _7301(String.valueOf("_7301")), _7302(String.valueOf("_7302")), _7303(String.valueOf("_7303")), _7400(String.valueOf("_7400")), _7401(String.valueOf("_7401")), _7402(String.valueOf("_7402")), _7403(String.valueOf("_7403")), _7404(String.valueOf("_7404")), _7405(String.valueOf("_7405")), _7500(String.valueOf("_7500")), _7501(String.valueOf("_7501")), _7600(String.valueOf("_7600")), _7601(String.valueOf("_7601")), _7602(String.valueOf("_7602")), _7603(String.valueOf("_7603")), _7604(String.valueOf("_7604")), _7605(String.valueOf("_7605")), _7606(String.valueOf("_7606")), _7700(String.valueOf("_7700")), _7701(String.valueOf("_7701")), _7702(String.valueOf("_7702")), _7703(String.valueOf("_7703")), _7704(String.valueOf("_7704")), _7705(String.valueOf("_7705")), _7706(String.valueOf("_7706")), _7707(String.valueOf("_7707")), _7800(String.valueOf("_7800")), _7801(String.valueOf("_7801")), _7802(String.valueOf("_7802")), _7803(String.valueOf("_7803")), _7804(String.valueOf("_7804")), _7805(String.valueOf("_7805")), _7806(String.valueOf("_7806")), _7807(String.valueOf("_7807")), _7808(String.valueOf("_7808")), _7809(String.valueOf("_7809")), _7810(String.valueOf("_7810")), _7811(String.valueOf("_7811")), _7812(String.valueOf("_7812")), _7813(String.valueOf("_7813")), _7814(String.valueOf("_7814")), _7815(String.valueOf("_7815")), _7817(String.valueOf("_7817")), _7818(String.valueOf("_7818")), _7819(String.valueOf("_7819")), _7900(String.valueOf("_7900")), _7901(String.valueOf("_7901")), _7902(String.valueOf("_7902")), _7903(String.valueOf("_7903")), _7904(String.valueOf("_7904")), _7905(String.valueOf("_7905")), _7906(String.valueOf("_7906")), _8000(String.valueOf("_8000")), _8001(String.valueOf("_8001")), _8100(String.valueOf("_8100")), _8101(String.valueOf("_8101")), _8102(String.valueOf("_8102")), _8103(String.valueOf("_8103")), _8104(String.valueOf("_8104")), _8105(String.valueOf("_8105")), _8107(String.valueOf("_8107")), _8108(String.valueOf("_8108")), _8200(String.valueOf("_8200")), _8201(String.valueOf("_8201")), _10000(String.valueOf("_10000")), _10001(String.valueOf("_10001")), _10002(String.valueOf("_10002")), _10003(String.valueOf("_10003")), _10004(String.valueOf("_10004")), _10005(String.valueOf("_10005")), _10006(String.valueOf("_10006")), _10020(String.valueOf("_10020")), _10021(String.valueOf("_10021")), _10022(String.valueOf("_10022")), _10040(String.valueOf("_10040")), _10041(String.valueOf("_10041")), _10042(String.valueOf("_10042")), _10043(String.valueOf("_10043")), _11000(String.valueOf("_11000")), _11001(String.valueOf("_11001")), _11002(String.valueOf("_11002")), _11003(String.valueOf("_11003")), _11004(String.valueOf("_11004")), _11005(String.valueOf("_11005")), _12000(String.valueOf("_12000")), _12001(String.valueOf("_12001")), _12002(String.valueOf("_12002")), _12003(String.valueOf("_12003")), _12004(String.valueOf("_12004")), _12005(String.valueOf("_12005")), _13000(String.valueOf("_13000")), _13001(String.valueOf("_13001")), _13002(String.valueOf("_13002")), _14000(String.valueOf("_14000")), _14001(String.valueOf("_14001")), _14002(String.valueOf("_14002")), _14003(String.valueOf("_14003")), _14004(String.valueOf("_14004")), _14005(String.valueOf("_14005")), _14006(String.valueOf("_14006")), _14007(String.valueOf("_14007")), _14008(String.valueOf("_14008")), _14009(String.valueOf("_14009")), _14010(String.valueOf("_14010")), _14011(String.valueOf("_14011")), _14012(String.valueOf("_14012"));


    private String value;

    MessageEnum (String v) {
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
    public static MessageEnum fromValue(String value) {
        for (MessageEnum b : MessageEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private MessageEnum message;
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

  public Subscription id(Long id) {
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

  public Subscription active(Boolean active) {
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

  public Subscription valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get subscriptionPlan
   * @return subscriptionPlan
  **/
  @JsonProperty("subscriptionPlan")
  public SubscriptionPlan getSubscriptionPlan() {
    return subscriptionPlan;
  }

  public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
  }

  public Subscription subscriptionPlan(SubscriptionPlan subscriptionPlan) {
    this.subscriptionPlan = subscriptionPlan;
    return this;
  }

 /**
   * Get remoteSubscriptionId
   * @return remoteSubscriptionId
  **/
  @JsonProperty("remoteSubscriptionId")
  public String getRemoteSubscriptionId() {
    return remoteSubscriptionId;
  }

  public void setRemoteSubscriptionId(String remoteSubscriptionId) {
    this.remoteSubscriptionId = remoteSubscriptionId;
  }

  public Subscription remoteSubscriptionId(String remoteSubscriptionId) {
    this.remoteSubscriptionId = remoteSubscriptionId;
    return this;
  }

 /**
   * Get promoCode
   * @return promoCode
  **/
  @JsonProperty("promoCode")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public Subscription promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

 /**
   * Get failed
   * @return failed
  **/
  @JsonProperty("failed")
  public Boolean getFailed() {
    return failed;
  }

  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  public Subscription failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    if (message == null) {
      return null;
    }
    return message.value();
  }

  public void setMessage(MessageEnum message) {
    this.message = message;
  }

  public Subscription message(MessageEnum message) {
    this.message = message;
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
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.active, subscription.active) &&
        Objects.equals(this.valid, subscription.valid) &&
        Objects.equals(this.subscriptionPlan, subscription.subscriptionPlan) &&
        Objects.equals(this.remoteSubscriptionId, subscription.remoteSubscriptionId) &&
        Objects.equals(this.promoCode, subscription.promoCode) &&
        Objects.equals(this.failed, subscription.failed) &&
        Objects.equals(this.message, subscription.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, subscriptionPlan, remoteSubscriptionId, promoCode, failed, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    subscriptionPlan: ").append(toIndentedString(subscriptionPlan)).append("\n");
    sb.append("    remoteSubscriptionId: ").append(toIndentedString(remoteSubscriptionId)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

