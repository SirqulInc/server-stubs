package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.JsonArray;
import org.openapitools.model.JsonNull;
import org.openapitools.model.JsonObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class JsonPrimitive  {
  
  @ApiModelProperty(value = "")

  private Integer asInt;

  @ApiModelProperty(value = "")

  private Boolean number;

  @ApiModelProperty(value = "")

  private Boolean _boolean;

  @ApiModelProperty(value = "")

  private String asString;

  @ApiModelProperty(value = "")

  private Boolean asBoolean;

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

  @ApiModelProperty(value = "")

  private Boolean string;

  @ApiModelProperty(value = "")

  @Valid

  private JsonObject asJsonObject;

  @ApiModelProperty(value = "")

  private Boolean jsonNull;

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

  public JsonPrimitive asInt(Integer asInt) {
    this.asInt = asInt;
    return this;
  }

 /**
   * Get number
   * @return number
  **/
  @JsonProperty("number")
  public Boolean getNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public JsonPrimitive number(Boolean number) {
    this.number = number;
    return this;
  }

 /**
   * Get _boolean
   * @return _boolean
  **/
  @JsonProperty("boolean")
  public Boolean getBoolean() {
    return _boolean;
  }

  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }

  public JsonPrimitive _boolean(Boolean _boolean) {
    this._boolean = _boolean;
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

  public JsonPrimitive asString(String asString) {
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

  public JsonPrimitive asBoolean(Boolean asBoolean) {
    this.asBoolean = asBoolean;
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

  public JsonPrimitive asNumber(Object asNumber) {
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

  public JsonPrimitive asDouble(Double asDouble) {
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

  public JsonPrimitive asFloat(Float asFloat) {
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

  public JsonPrimitive asLong(Long asLong) {
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

  public JsonPrimitive asByte(byte[] asByte) {
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

  public JsonPrimitive asCharacter(String asCharacter) {
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

  public JsonPrimitive asBigDecimal(BigDecimal asBigDecimal) {
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

  public JsonPrimitive asBigInteger(Integer asBigInteger) {
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

  public JsonPrimitive asShort(Integer asShort) {
    this.asShort = asShort;
    return this;
  }

 /**
   * Get string
   * @return string
  **/
  @JsonProperty("string")
  public Boolean getString() {
    return string;
  }

  public void setString(Boolean string) {
    this.string = string;
  }

  public JsonPrimitive string(Boolean string) {
    this.string = string;
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

  public JsonPrimitive asJsonObject(JsonObject asJsonObject) {
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

  public JsonPrimitive jsonNull(Boolean jsonNull) {
    this.jsonNull = jsonNull;
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

  public JsonPrimitive jsonArray(Boolean jsonArray) {
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

  public JsonPrimitive jsonObject(Boolean jsonObject) {
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

  public JsonPrimitive jsonPrimitive(Boolean jsonPrimitive) {
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

  public JsonPrimitive asJsonArray(JsonArray asJsonArray) {
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

  public JsonPrimitive asJsonPrimitive(JsonPrimitive asJsonPrimitive) {
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

  public JsonPrimitive asJsonNull(JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
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
    JsonPrimitive jsonPrimitive = (JsonPrimitive) o;
    return Objects.equals(this.asInt, jsonPrimitive.asInt) &&
        Objects.equals(this.number, jsonPrimitive.number) &&
        Objects.equals(this._boolean, jsonPrimitive._boolean) &&
        Objects.equals(this.asString, jsonPrimitive.asString) &&
        Objects.equals(this.asBoolean, jsonPrimitive.asBoolean) &&
        Objects.equals(this.asNumber, jsonPrimitive.asNumber) &&
        Objects.equals(this.asDouble, jsonPrimitive.asDouble) &&
        Objects.equals(this.asFloat, jsonPrimitive.asFloat) &&
        Objects.equals(this.asLong, jsonPrimitive.asLong) &&
        Objects.equals(this.asByte, jsonPrimitive.asByte) &&
        Objects.equals(this.asCharacter, jsonPrimitive.asCharacter) &&
        Objects.equals(this.asBigDecimal, jsonPrimitive.asBigDecimal) &&
        Objects.equals(this.asBigInteger, jsonPrimitive.asBigInteger) &&
        Objects.equals(this.asShort, jsonPrimitive.asShort) &&
        Objects.equals(this.string, jsonPrimitive.string) &&
        Objects.equals(this.asJsonObject, jsonPrimitive.asJsonObject) &&
        Objects.equals(this.jsonNull, jsonPrimitive.jsonNull) &&
        Objects.equals(this.jsonArray, jsonPrimitive.jsonArray) &&
        Objects.equals(this.jsonObject, jsonPrimitive.jsonObject) &&
        Objects.equals(this.jsonPrimitive, jsonPrimitive.jsonPrimitive) &&
        Objects.equals(this.asJsonArray, jsonPrimitive.asJsonArray) &&
        Objects.equals(this.asJsonPrimitive, jsonPrimitive.asJsonPrimitive) &&
        Objects.equals(this.asJsonNull, jsonPrimitive.asJsonNull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asInt, number, _boolean, asString, asBoolean, asNumber, asDouble, asFloat, asLong, asByte, asCharacter, asBigDecimal, asBigInteger, asShort, string, asJsonObject, jsonNull, jsonArray, jsonObject, jsonPrimitive, asJsonArray, asJsonPrimitive, asJsonNull);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonPrimitive {\n");
    
    sb.append("    asInt: ").append(toIndentedString(asInt)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
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
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

