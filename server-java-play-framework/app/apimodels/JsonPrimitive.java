package apimodels;

import apimodels.JsonArray;
import apimodels.JsonNull;
import apimodels.JsonObject;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * JsonPrimitive
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class JsonPrimitive   {
  @JsonProperty("asInt")
  
  private Integer asInt;

  @JsonProperty("number")
  
  private Boolean number;

  @JsonProperty("boolean")
  
  private Boolean _boolean;

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

  @JsonProperty("string")
  
  private Boolean string;

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

  public JsonPrimitive asInt(Integer asInt) {
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

  public JsonPrimitive number(Boolean number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  public Boolean getNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public JsonPrimitive _boolean(Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }

   /**
   * Get _boolean
   * @return _boolean
  **/
  public Boolean getBoolean() {
    return _boolean;
  }

  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }

  public JsonPrimitive asString(String asString) {
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

  public JsonPrimitive asBoolean(Boolean asBoolean) {
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

  public JsonPrimitive asNumber(Object asNumber) {
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

  public JsonPrimitive asDouble(Double asDouble) {
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

  public JsonPrimitive asFloat(Float asFloat) {
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

  public JsonPrimitive asLong(Long asLong) {
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

  public JsonPrimitive asByte(byte[] asByte) {
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

  public JsonPrimitive asCharacter(String asCharacter) {
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

  public JsonPrimitive asBigDecimal(BigDecimal asBigDecimal) {
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

  public JsonPrimitive asBigInteger(Integer asBigInteger) {
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

  public JsonPrimitive asShort(Integer asShort) {
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

  public JsonPrimitive string(Boolean string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  public Boolean getString() {
    return string;
  }

  public void setString(Boolean string) {
    this.string = string;
  }

  public JsonPrimitive asJsonObject(JsonObject asJsonObject) {
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

  public JsonPrimitive jsonNull(Boolean jsonNull) {
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

  public JsonPrimitive jsonArray(Boolean jsonArray) {
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

  public JsonPrimitive jsonObject(Boolean jsonObject) {
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

  public JsonPrimitive jsonPrimitive(Boolean jsonPrimitive) {
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

  public JsonPrimitive asJsonArray(JsonArray asJsonArray) {
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

  public JsonPrimitive asJsonPrimitive(JsonPrimitive asJsonPrimitive) {
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

  public JsonPrimitive asJsonNull(JsonNull asJsonNull) {
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
    JsonPrimitive jsonPrimitive = (JsonPrimitive) o;
    return Objects.equals(asInt, jsonPrimitive.asInt) &&
        Objects.equals(number, jsonPrimitive.number) &&
        Objects.equals(_boolean, jsonPrimitive._boolean) &&
        Objects.equals(asString, jsonPrimitive.asString) &&
        Objects.equals(asBoolean, jsonPrimitive.asBoolean) &&
        Objects.equals(asNumber, jsonPrimitive.asNumber) &&
        Objects.equals(asDouble, jsonPrimitive.asDouble) &&
        Objects.equals(asFloat, jsonPrimitive.asFloat) &&
        Objects.equals(asLong, jsonPrimitive.asLong) &&
        Objects.equals(asByte, jsonPrimitive.asByte) &&
        Objects.equals(asCharacter, jsonPrimitive.asCharacter) &&
        Objects.equals(asBigDecimal, jsonPrimitive.asBigDecimal) &&
        Objects.equals(asBigInteger, jsonPrimitive.asBigInteger) &&
        Objects.equals(asShort, jsonPrimitive.asShort) &&
        Objects.equals(string, jsonPrimitive.string) &&
        Objects.equals(asJsonObject, jsonPrimitive.asJsonObject) &&
        Objects.equals(jsonNull, jsonPrimitive.jsonNull) &&
        Objects.equals(jsonArray, jsonPrimitive.jsonArray) &&
        Objects.equals(jsonObject, jsonPrimitive.jsonObject) &&
        Objects.equals(jsonPrimitive, jsonPrimitive.jsonPrimitive) &&
        Objects.equals(asJsonArray, jsonPrimitive.asJsonArray) &&
        Objects.equals(asJsonPrimitive, jsonPrimitive.asJsonPrimitive) &&
        Objects.equals(asJsonNull, jsonPrimitive.asJsonNull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asInt, number, _boolean, asString, asBoolean, asNumber, asDouble, asFloat, asLong, asByte, asCharacter, asBigDecimal, asBigInteger, asShort, string, asJsonObject, jsonNull, jsonArray, jsonObject, jsonPrimitive, asJsonArray, asJsonPrimitive, asJsonNull);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

