package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.JsonArray;
import org.openapitools.model.JsonNull;
import org.openapitools.model.JsonObject;
import org.openapitools.model.JsonPrimitive;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class JsonElement  {
  
  @ApiModelProperty(value = "")

  private Integer asInt;

  @ApiModelProperty(value = "")

  @Valid

  private JsonObject asJsonObject;

  @ApiModelProperty(value = "")

  private Boolean jsonNull;

  @ApiModelProperty(value = "")

  private String asString;

  @ApiModelProperty(value = "")

  private Boolean asBoolean;

  @ApiModelProperty(value = "")

  private Boolean jsonArray;

  @ApiModelProperty(value = "")

  private Boolean jsonObject;

  @ApiModelProperty(value = "")

  private Boolean jsonPrimitive;

  @ApiModelProperty(value = "")

  @Valid

  private JsonArray asJsonArray;

  @ApiModelProperty(value = "")

  @Valid

  private JsonPrimitive asJsonPrimitive;

  @ApiModelProperty(value = "")

  @Valid

  private JsonNull asJsonNull;

  @ApiModelProperty(value = "")

  private Object asNumber;

  @ApiModelProperty(value = "")

  private Double asDouble;

  @ApiModelProperty(value = "")

  private Float asFloat;

  @ApiModelProperty(value = "")

  private Long asLong;

  @ApiModelProperty(value = "")

  private byte[] asByte;

  @ApiModelProperty(value = "")

  private String asCharacter;

  @ApiModelProperty(value = "")

  @Valid

  private BigDecimal asBigDecimal;

  @ApiModelProperty(value = "")

  private Integer asBigInteger;

  @ApiModelProperty(value = "")

  private Integer asShort;
 /**
   * Get asInt
   * @return asInt
  **/
  @JsonProperty("asInt")
  public Integer getAsInt() {
    return asInt;
  }

  public void setAsInt(Integer asInt) {
    this.asInt = asInt;
  }

  public JsonElement asInt(Integer asInt) {
    this.asInt = asInt;
    return this;
  }

 /**
   * Get asJsonObject
   * @return asJsonObject
  **/
  @JsonProperty("asJsonObject")
  public JsonObject getAsJsonObject() {
    return asJsonObject;
  }

  public void setAsJsonObject(JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
  }

  public JsonElement asJsonObject(JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
    return this;
  }

 /**
   * Get jsonNull
   * @return jsonNull
  **/
  @JsonProperty("jsonNull")
  public Boolean getJsonNull() {
    return jsonNull;
  }

  public void setJsonNull(Boolean jsonNull) {
    this.jsonNull = jsonNull;
  }

  public JsonElement jsonNull(Boolean jsonNull) {
    this.jsonNull = jsonNull;
    return this;
  }

 /**
   * Get asString
   * @return asString
  **/
  @JsonProperty("asString")
  public String getAsString() {
    return asString;
  }

  public void setAsString(String asString) {
    this.asString = asString;
  }

  public JsonElement asString(String asString) {
    this.asString = asString;
    return this;
  }

 /**
   * Get asBoolean
   * @return asBoolean
  **/
  @JsonProperty("asBoolean")
  public Boolean getAsBoolean() {
    return asBoolean;
  }

  public void setAsBoolean(Boolean asBoolean) {
    this.asBoolean = asBoolean;
  }

  public JsonElement asBoolean(Boolean asBoolean) {
    this.asBoolean = asBoolean;
    return this;
  }

 /**
   * Get jsonArray
   * @return jsonArray
  **/
  @JsonProperty("jsonArray")
  public Boolean getJsonArray() {
    return jsonArray;
  }

  public void setJsonArray(Boolean jsonArray) {
    this.jsonArray = jsonArray;
  }

  public JsonElement jsonArray(Boolean jsonArray) {
    this.jsonArray = jsonArray;
    return this;
  }

 /**
   * Get jsonObject
   * @return jsonObject
  **/
  @JsonProperty("jsonObject")
  public Boolean getJsonObject() {
    return jsonObject;
  }

  public void setJsonObject(Boolean jsonObject) {
    this.jsonObject = jsonObject;
  }

  public JsonElement jsonObject(Boolean jsonObject) {
    this.jsonObject = jsonObject;
    return this;
  }

 /**
   * Get jsonPrimitive
   * @return jsonPrimitive
  **/
  @JsonProperty("jsonPrimitive")
  public Boolean getJsonPrimitive() {
    return jsonPrimitive;
  }

  public void setJsonPrimitive(Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
  }

  public JsonElement jsonPrimitive(Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
    return this;
  }

 /**
   * Get asJsonArray
   * @return asJsonArray
  **/
  @JsonProperty("asJsonArray")
  public JsonArray getAsJsonArray() {
    return asJsonArray;
  }

  public void setAsJsonArray(JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
  }

  public JsonElement asJsonArray(JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
    return this;
  }

 /**
   * Get asJsonPrimitive
   * @return asJsonPrimitive
  **/
  @JsonProperty("asJsonPrimitive")
  public JsonPrimitive getAsJsonPrimitive() {
    return asJsonPrimitive;
  }

  public void setAsJsonPrimitive(JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
  }

  public JsonElement asJsonPrimitive(JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
    return this;
  }

 /**
   * Get asJsonNull
   * @return asJsonNull
  **/
  @JsonProperty("asJsonNull")
  public JsonNull getAsJsonNull() {
    return asJsonNull;
  }

  public void setAsJsonNull(JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
  }

  public JsonElement asJsonNull(JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
    return this;
  }

 /**
   * Get asNumber
   * @return asNumber
  **/
  @JsonProperty("asNumber")
  public Object getAsNumber() {
    return asNumber;
  }

  public void setAsNumber(Object asNumber) {
    this.asNumber = asNumber;
  }

  public JsonElement asNumber(Object asNumber) {
    this.asNumber = asNumber;
    return this;
  }

 /**
   * Get asDouble
   * @return asDouble
  **/
  @JsonProperty("asDouble")
  public Double getAsDouble() {
    return asDouble;
  }

  public void setAsDouble(Double asDouble) {
    this.asDouble = asDouble;
  }

  public JsonElement asDouble(Double asDouble) {
    this.asDouble = asDouble;
    return this;
  }

 /**
   * Get asFloat
   * @return asFloat
  **/
  @JsonProperty("asFloat")
  public Float getAsFloat() {
    return asFloat;
  }

  public void setAsFloat(Float asFloat) {
    this.asFloat = asFloat;
  }

  public JsonElement asFloat(Float asFloat) {
    this.asFloat = asFloat;
    return this;
  }

 /**
   * Get asLong
   * @return asLong
  **/
  @JsonProperty("asLong")
  public Long getAsLong() {
    return asLong;
  }

  public void setAsLong(Long asLong) {
    this.asLong = asLong;
  }

  public JsonElement asLong(Long asLong) {
    this.asLong = asLong;
    return this;
  }

 /**
   * Get asByte
   * @return asByte
  **/
  @JsonProperty("asByte")
  public byte[] getAsByte() {
    return asByte;
  }

  public void setAsByte(byte[] asByte) {
    this.asByte = asByte;
  }

  public JsonElement asByte(byte[] asByte) {
    this.asByte = asByte;
    return this;
  }

 /**
   * Get asCharacter
   * @return asCharacter
  **/
  @JsonProperty("asCharacter")
  public String getAsCharacter() {
    return asCharacter;
  }

  public void setAsCharacter(String asCharacter) {
    this.asCharacter = asCharacter;
  }

  public JsonElement asCharacter(String asCharacter) {
    this.asCharacter = asCharacter;
    return this;
  }

 /**
   * Get asBigDecimal
   * @return asBigDecimal
  **/
  @JsonProperty("asBigDecimal")
  public BigDecimal getAsBigDecimal() {
    return asBigDecimal;
  }

  public void setAsBigDecimal(BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
  }

  public JsonElement asBigDecimal(BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
    return this;
  }

 /**
   * Get asBigInteger
   * @return asBigInteger
  **/
  @JsonProperty("asBigInteger")
  public Integer getAsBigInteger() {
    return asBigInteger;
  }

  public void setAsBigInteger(Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
  }

  public JsonElement asBigInteger(Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
    return this;
  }

 /**
   * Get asShort
   * @return asShort
  **/
  @JsonProperty("asShort")
  public Integer getAsShort() {
    return asShort;
  }

  public void setAsShort(Integer asShort) {
    this.asShort = asShort;
  }

  public JsonElement asShort(Integer asShort) {
    this.asShort = asShort;
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
    JsonElement jsonElement = (JsonElement) o;
    return Objects.equals(this.asInt, jsonElement.asInt) &&
        Objects.equals(this.asJsonObject, jsonElement.asJsonObject) &&
        Objects.equals(this.jsonNull, jsonElement.jsonNull) &&
        Objects.equals(this.asString, jsonElement.asString) &&
        Objects.equals(this.asBoolean, jsonElement.asBoolean) &&
        Objects.equals(this.jsonArray, jsonElement.jsonArray) &&
        Objects.equals(this.jsonObject, jsonElement.jsonObject) &&
        Objects.equals(this.jsonPrimitive, jsonElement.jsonPrimitive) &&
        Objects.equals(this.asJsonArray, jsonElement.asJsonArray) &&
        Objects.equals(this.asJsonPrimitive, jsonElement.asJsonPrimitive) &&
        Objects.equals(this.asJsonNull, jsonElement.asJsonNull) &&
        Objects.equals(this.asNumber, jsonElement.asNumber) &&
        Objects.equals(this.asDouble, jsonElement.asDouble) &&
        Objects.equals(this.asFloat, jsonElement.asFloat) &&
        Objects.equals(this.asLong, jsonElement.asLong) &&
        Objects.equals(this.asByte, jsonElement.asByte) &&
        Objects.equals(this.asCharacter, jsonElement.asCharacter) &&
        Objects.equals(this.asBigDecimal, jsonElement.asBigDecimal) &&
        Objects.equals(this.asBigInteger, jsonElement.asBigInteger) &&
        Objects.equals(this.asShort, jsonElement.asShort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asInt, asJsonObject, jsonNull, asString, asBoolean, jsonArray, jsonObject, jsonPrimitive, asJsonArray, asJsonPrimitive, asJsonNull, asNumber, asDouble, asFloat, asLong, asByte, asCharacter, asBigDecimal, asBigInteger, asShort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonElement {\n");
    
    sb.append("    asInt: ").append(toIndentedString(asInt)).append("\n");
    sb.append("    asJsonObject: ").append(toIndentedString(asJsonObject)).append("\n");
    sb.append("    jsonNull: ").append(toIndentedString(jsonNull)).append("\n");
    sb.append("    asString: ").append(toIndentedString(asString)).append("\n");
    sb.append("    asBoolean: ").append(toIndentedString(asBoolean)).append("\n");
    sb.append("    jsonArray: ").append(toIndentedString(jsonArray)).append("\n");
    sb.append("    jsonObject: ").append(toIndentedString(jsonObject)).append("\n");
    sb.append("    jsonPrimitive: ").append(toIndentedString(jsonPrimitive)).append("\n");
    sb.append("    asJsonArray: ").append(toIndentedString(asJsonArray)).append("\n");
    sb.append("    asJsonPrimitive: ").append(toIndentedString(asJsonPrimitive)).append("\n");
    sb.append("    asJsonNull: ").append(toIndentedString(asJsonNull)).append("\n");
    sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
    sb.append("    asDouble: ").append(toIndentedString(asDouble)).append("\n");
    sb.append("    asFloat: ").append(toIndentedString(asFloat)).append("\n");
    sb.append("    asLong: ").append(toIndentedString(asLong)).append("\n");
    sb.append("    asByte: ").append(toIndentedString(asByte)).append("\n");
    sb.append("    asCharacter: ").append(toIndentedString(asCharacter)).append("\n");
    sb.append("    asBigDecimal: ").append(toIndentedString(asBigDecimal)).append("\n");
    sb.append("    asBigInteger: ").append(toIndentedString(asBigInteger)).append("\n");
    sb.append("    asShort: ").append(toIndentedString(asShort)).append("\n");
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

