package apimodels;

import apimodels.JsonNull;
import apimodels.JsonObject;
import apimodels.JsonPrimitive;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * JsonArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class JsonArray   {
  @JsonProperty("asInt")
  
  private Integer asInt;

  @JsonProperty("asString")
  
  private String asString;

  @JsonProperty("asBoolean")
  
  private Boolean asBoolean;

  @JsonProperty("asNumber")
  
  private Object asNumber;

  @JsonProperty("asDouble")
  
  private Double asDouble;

  @JsonProperty("asFloat")
  
  private Float asFloat;

  @JsonProperty("asLong")
  
  private Long asLong;

  @JsonProperty("asByte")
  @Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")

  private byte[] asByte;

  @JsonProperty("asCharacter")
  
  private String asCharacter;

  @JsonProperty("asBigDecimal")
  @Valid

  private BigDecimal asBigDecimal;

  @JsonProperty("asBigInteger")
  
  private Integer asBigInteger;

  @JsonProperty("asShort")
  
  private Integer asShort;

  @JsonProperty("asJsonObject")
  @Valid

  private JsonObject asJsonObject;

  @JsonProperty("jsonNull")
  
  private Boolean jsonNull;

  @JsonProperty("jsonArray")
  
  private Boolean jsonArray;

  @JsonProperty("jsonObject")
  
  private Boolean jsonObject;

  @JsonProperty("jsonPrimitive")
  
  private Boolean jsonPrimitive;

  @JsonProperty("asJsonArray")
  @Valid

  private JsonArray asJsonArray;

  @JsonProperty("asJsonPrimitive")
  @Valid

  private JsonPrimitive asJsonPrimitive;

  @JsonProperty("asJsonNull")
  @Valid

  private JsonNull asJsonNull;

  public JsonArray asInt(Integer asInt) {
    this.asInt = asInt;
    return this;
  }

   /**
   * Get asInt
   * @return asInt
  **/
  public Integer getAsInt() {
    return asInt;
  }

  public void setAsInt(Integer asInt) {
    this.asInt = asInt;
  }

  public JsonArray asString(String asString) {
    this.asString = asString;
    return this;
  }

   /**
   * Get asString
   * @return asString
  **/
  public String getAsString() {
    return asString;
  }

  public void setAsString(String asString) {
    this.asString = asString;
  }

  public JsonArray asBoolean(Boolean asBoolean) {
    this.asBoolean = asBoolean;
    return this;
  }

   /**
   * Get asBoolean
   * @return asBoolean
  **/
  public Boolean getAsBoolean() {
    return asBoolean;
  }

  public void setAsBoolean(Boolean asBoolean) {
    this.asBoolean = asBoolean;
  }

  public JsonArray asNumber(Object asNumber) {
    this.asNumber = asNumber;
    return this;
  }

   /**
   * Get asNumber
   * @return asNumber
  **/
  public Object getAsNumber() {
    return asNumber;
  }

  public void setAsNumber(Object asNumber) {
    this.asNumber = asNumber;
  }

  public JsonArray asDouble(Double asDouble) {
    this.asDouble = asDouble;
    return this;
  }

   /**
   * Get asDouble
   * @return asDouble
  **/
  public Double getAsDouble() {
    return asDouble;
  }

  public void setAsDouble(Double asDouble) {
    this.asDouble = asDouble;
  }

  public JsonArray asFloat(Float asFloat) {
    this.asFloat = asFloat;
    return this;
  }

   /**
   * Get asFloat
   * @return asFloat
  **/
  public Float getAsFloat() {
    return asFloat;
  }

  public void setAsFloat(Float asFloat) {
    this.asFloat = asFloat;
  }

  public JsonArray asLong(Long asLong) {
    this.asLong = asLong;
    return this;
  }

   /**
   * Get asLong
   * @return asLong
  **/
  public Long getAsLong() {
    return asLong;
  }

  public void setAsLong(Long asLong) {
    this.asLong = asLong;
  }

  public JsonArray asByte(byte[] asByte) {
    this.asByte = asByte;
    return this;
  }

   /**
   * Get asByte
   * @return asByte
  **/
  public byte[] getAsByte() {
    return asByte;
  }

  public void setAsByte(byte[] asByte) {
    this.asByte = asByte;
  }

  public JsonArray asCharacter(String asCharacter) {
    this.asCharacter = asCharacter;
    return this;
  }

   /**
   * Get asCharacter
   * @return asCharacter
  **/
  public String getAsCharacter() {
    return asCharacter;
  }

  public void setAsCharacter(String asCharacter) {
    this.asCharacter = asCharacter;
  }

  public JsonArray asBigDecimal(BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
    return this;
  }

   /**
   * Get asBigDecimal
   * @return asBigDecimal
  **/
  public BigDecimal getAsBigDecimal() {
    return asBigDecimal;
  }

  public void setAsBigDecimal(BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
  }

  public JsonArray asBigInteger(Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
    return this;
  }

   /**
   * Get asBigInteger
   * @return asBigInteger
  **/
  public Integer getAsBigInteger() {
    return asBigInteger;
  }

  public void setAsBigInteger(Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
  }

  public JsonArray asShort(Integer asShort) {
    this.asShort = asShort;
    return this;
  }

   /**
   * Get asShort
   * @return asShort
  **/
  public Integer getAsShort() {
    return asShort;
  }

  public void setAsShort(Integer asShort) {
    this.asShort = asShort;
  }

  public JsonArray asJsonObject(JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
    return this;
  }

   /**
   * Get asJsonObject
   * @return asJsonObject
  **/
  public JsonObject getAsJsonObject() {
    return asJsonObject;
  }

  public void setAsJsonObject(JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
  }

  public JsonArray jsonNull(Boolean jsonNull) {
    this.jsonNull = jsonNull;
    return this;
  }

   /**
   * Get jsonNull
   * @return jsonNull
  **/
  public Boolean getJsonNull() {
    return jsonNull;
  }

  public void setJsonNull(Boolean jsonNull) {
    this.jsonNull = jsonNull;
  }

  public JsonArray jsonArray(Boolean jsonArray) {
    this.jsonArray = jsonArray;
    return this;
  }

   /**
   * Get jsonArray
   * @return jsonArray
  **/
  public Boolean getJsonArray() {
    return jsonArray;
  }

  public void setJsonArray(Boolean jsonArray) {
    this.jsonArray = jsonArray;
  }

  public JsonArray jsonObject(Boolean jsonObject) {
    this.jsonObject = jsonObject;
    return this;
  }

   /**
   * Get jsonObject
   * @return jsonObject
  **/
  public Boolean getJsonObject() {
    return jsonObject;
  }

  public void setJsonObject(Boolean jsonObject) {
    this.jsonObject = jsonObject;
  }

  public JsonArray jsonPrimitive(Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
    return this;
  }

   /**
   * Get jsonPrimitive
   * @return jsonPrimitive
  **/
  public Boolean getJsonPrimitive() {
    return jsonPrimitive;
  }

  public void setJsonPrimitive(Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
  }

  public JsonArray asJsonArray(JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
    return this;
  }

   /**
   * Get asJsonArray
   * @return asJsonArray
  **/
  public JsonArray getAsJsonArray() {
    return asJsonArray;
  }

  public void setAsJsonArray(JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
  }

  public JsonArray asJsonPrimitive(JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
    return this;
  }

   /**
   * Get asJsonPrimitive
   * @return asJsonPrimitive
  **/
  public JsonPrimitive getAsJsonPrimitive() {
    return asJsonPrimitive;
  }

  public void setAsJsonPrimitive(JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
  }

  public JsonArray asJsonNull(JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
    return this;
  }

   /**
   * Get asJsonNull
   * @return asJsonNull
  **/
  public JsonNull getAsJsonNull() {
    return asJsonNull;
  }

  public void setAsJsonNull(JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonArray jsonArray = (JsonArray) o;
    return Objects.equals(asInt, jsonArray.asInt) &&
        Objects.equals(asString, jsonArray.asString) &&
        Objects.equals(asBoolean, jsonArray.asBoolean) &&
        Objects.equals(asNumber, jsonArray.asNumber) &&
        Objects.equals(asDouble, jsonArray.asDouble) &&
        Objects.equals(asFloat, jsonArray.asFloat) &&
        Objects.equals(asLong, jsonArray.asLong) &&
        Objects.equals(asByte, jsonArray.asByte) &&
        Objects.equals(asCharacter, jsonArray.asCharacter) &&
        Objects.equals(asBigDecimal, jsonArray.asBigDecimal) &&
        Objects.equals(asBigInteger, jsonArray.asBigInteger) &&
        Objects.equals(asShort, jsonArray.asShort) &&
        Objects.equals(asJsonObject, jsonArray.asJsonObject) &&
        Objects.equals(jsonNull, jsonArray.jsonNull) &&
        Objects.equals(jsonArray, jsonArray.jsonArray) &&
        Objects.equals(jsonObject, jsonArray.jsonObject) &&
        Objects.equals(jsonPrimitive, jsonArray.jsonPrimitive) &&
        Objects.equals(asJsonArray, jsonArray.asJsonArray) &&
        Objects.equals(asJsonPrimitive, jsonArray.asJsonPrimitive) &&
        Objects.equals(asJsonNull, jsonArray.asJsonNull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asInt, asString, asBoolean, asNumber, asDouble, asFloat, asLong, asByte, asCharacter, asBigDecimal, asBigInteger, asShort, asJsonObject, jsonNull, jsonArray, jsonObject, jsonPrimitive, asJsonArray, asJsonPrimitive, asJsonNull);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonArray {\n");
    
    sb.append("    asInt: ").append(toIndentedString(asInt)).append("\n");
    sb.append("    asString: ").append(toIndentedString(asString)).append("\n");
    sb.append("    asBoolean: ").append(toIndentedString(asBoolean)).append("\n");
    sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
    sb.append("    asDouble: ").append(toIndentedString(asDouble)).append("\n");
    sb.append("    asFloat: ").append(toIndentedString(asFloat)).append("\n");
    sb.append("    asLong: ").append(toIndentedString(asLong)).append("\n");
    sb.append("    asByte: ").append(toIndentedString(asByte)).append("\n");
    sb.append("    asCharacter: ").append(toIndentedString(asCharacter)).append("\n");
    sb.append("    asBigDecimal: ").append(toIndentedString(asBigDecimal)).append("\n");
    sb.append("    asBigInteger: ").append(toIndentedString(asBigInteger)).append("\n");
    sb.append("    asShort: ").append(toIndentedString(asShort)).append("\n");
    sb.append("    asJsonObject: ").append(toIndentedString(asJsonObject)).append("\n");
    sb.append("    jsonNull: ").append(toIndentedString(jsonNull)).append("\n");
    sb.append("    jsonArray: ").append(toIndentedString(jsonArray)).append("\n");
    sb.append("    jsonObject: ").append(toIndentedString(jsonObject)).append("\n");
    sb.append("    jsonPrimitive: ").append(toIndentedString(jsonPrimitive)).append("\n");
    sb.append("    asJsonArray: ").append(toIndentedString(asJsonArray)).append("\n");
    sb.append("    asJsonPrimitive: ").append(toIndentedString(asJsonPrimitive)).append("\n");
    sb.append("    asJsonNull: ").append(toIndentedString(asJsonNull)).append("\n");
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

