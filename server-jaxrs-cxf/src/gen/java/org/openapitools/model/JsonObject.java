package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.JsonArray;
import org.openapitools.model.JsonNull;
import org.openapitools.model.JsonPrimitive;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class JsonObject  {
  
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

  public JsonObject asInt(Integer asInt) {
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

  public JsonObject asJsonObject(JsonObject asJsonObject) {
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

  public JsonObject jsonNull(Boolean jsonNull) {
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

  public JsonObject asString(String asString) {
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

  public JsonObject asBoolean(Boolean asBoolean) {
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

  public JsonObject jsonArray(Boolean jsonArray) {
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

  public JsonObject jsonObject(Boolean jsonObject) {
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

  public JsonObject jsonPrimitive(Boolean jsonPrimitive) {
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

  public JsonObject asJsonArray(JsonArray asJsonArray) {
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

  public JsonObject asJsonPrimitive(JsonPrimitive asJsonPrimitive) {
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

  public JsonObject asJsonNull(JsonNull asJsonNull) {
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

  public JsonObject asNumber(Object asNumber) {
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

  public JsonObject asDouble(Double asDouble) {
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

  public JsonObject asFloat(Float asFloat) {
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

  public JsonObject asLong(Long asLong) {
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

  public JsonObject asByte(byte[] asByte) {
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

  public JsonObject asCharacter(String asCharacter) {
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

  public JsonObject asBigDecimal(BigDecimal asBigDecimal) {
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

  public JsonObject asBigInteger(Integer asBigInteger) {
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

  public JsonObject asShort(Integer asShort) {
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
    JsonObject jsonObject = (JsonObject) o;
    return Objects.equals(this.asInt, jsonObject.asInt) &&
        Objects.equals(this.asJsonObject, jsonObject.asJsonObject) &&
        Objects.equals(this.jsonNull, jsonObject.jsonNull) &&
        Objects.equals(this.asString, jsonObject.asString) &&
        Objects.equals(this.asBoolean, jsonObject.asBoolean) &&
        Objects.equals(this.jsonArray, jsonObject.jsonArray) &&
        Objects.equals(this.jsonObject, jsonObject.jsonObject) &&
        Objects.equals(this.jsonPrimitive, jsonObject.jsonPrimitive) &&
        Objects.equals(this.asJsonArray, jsonObject.asJsonArray) &&
        Objects.equals(this.asJsonPrimitive, jsonObject.asJsonPrimitive) &&
        Objects.equals(this.asJsonNull, jsonObject.asJsonNull) &&
        Objects.equals(this.asNumber, jsonObject.asNumber) &&
        Objects.equals(this.asDouble, jsonObject.asDouble) &&
        Objects.equals(this.asFloat, jsonObject.asFloat) &&
        Objects.equals(this.asLong, jsonObject.asLong) &&
        Objects.equals(this.asByte, jsonObject.asByte) &&
        Objects.equals(this.asCharacter, jsonObject.asCharacter) &&
        Objects.equals(this.asBigDecimal, jsonObject.asBigDecimal) &&
        Objects.equals(this.asBigInteger, jsonObject.asBigInteger) &&
        Objects.equals(this.asShort, jsonObject.asShort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asInt, asJsonObject, jsonNull, asString, asBoolean, jsonArray, jsonObject, jsonPrimitive, asJsonArray, asJsonPrimitive, asJsonNull, asNumber, asDouble, asFloat, asLong, asByte, asCharacter, asBigDecimal, asBigInteger, asShort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonObject {\n");
    
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

