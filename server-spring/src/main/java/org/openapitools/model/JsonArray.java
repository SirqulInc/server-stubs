package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.model.JsonNull;
import org.openapitools.model.JsonObject;
import org.openapitools.model.JsonPrimitive;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JsonArray
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class JsonArray {

  private @Nullable Integer asInt;

  private @Nullable String asString;

  private @Nullable Boolean asBoolean;

  private @Nullable Object asNumber;

  private @Nullable Double asDouble;

  private @Nullable Float asFloat;

  private @Nullable Long asLong;

  private @Nullable byte[] asByte;

  private @Nullable String asCharacter;

  private @Nullable BigDecimal asBigDecimal;

  private @Nullable Integer asBigInteger;

  private @Nullable Integer asShort;

  private @Nullable JsonObject asJsonObject;

  private @Nullable Boolean jsonNull;

  private @Nullable Boolean jsonArray;

  private @Nullable Boolean jsonObject;

  private @Nullable Boolean jsonPrimitive;

  private @Nullable JsonArray asJsonArray;

  private @Nullable JsonPrimitive asJsonPrimitive;

  private @Nullable JsonNull asJsonNull;

  public JsonArray asInt(@Nullable Integer asInt) {
    this.asInt = asInt;
    return this;
  }

  /**
   * Get asInt
   * @return asInt
   */
  
  @Schema(name = "asInt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asInt")
  public @Nullable Integer getAsInt() {
    return asInt;
  }

  public void setAsInt(@Nullable Integer asInt) {
    this.asInt = asInt;
  }

  public JsonArray asString(@Nullable String asString) {
    this.asString = asString;
    return this;
  }

  /**
   * Get asString
   * @return asString
   */
  
  @Schema(name = "asString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asString")
  public @Nullable String getAsString() {
    return asString;
  }

  public void setAsString(@Nullable String asString) {
    this.asString = asString;
  }

  public JsonArray asBoolean(@Nullable Boolean asBoolean) {
    this.asBoolean = asBoolean;
    return this;
  }

  /**
   * Get asBoolean
   * @return asBoolean
   */
  
  @Schema(name = "asBoolean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asBoolean")
  public @Nullable Boolean getAsBoolean() {
    return asBoolean;
  }

  public void setAsBoolean(@Nullable Boolean asBoolean) {
    this.asBoolean = asBoolean;
  }

  public JsonArray asNumber(@Nullable Object asNumber) {
    this.asNumber = asNumber;
    return this;
  }

  /**
   * Get asNumber
   * @return asNumber
   */
  
  @Schema(name = "asNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asNumber")
  public @Nullable Object getAsNumber() {
    return asNumber;
  }

  public void setAsNumber(@Nullable Object asNumber) {
    this.asNumber = asNumber;
  }

  public JsonArray asDouble(@Nullable Double asDouble) {
    this.asDouble = asDouble;
    return this;
  }

  /**
   * Get asDouble
   * @return asDouble
   */
  
  @Schema(name = "asDouble", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asDouble")
  public @Nullable Double getAsDouble() {
    return asDouble;
  }

  public void setAsDouble(@Nullable Double asDouble) {
    this.asDouble = asDouble;
  }

  public JsonArray asFloat(@Nullable Float asFloat) {
    this.asFloat = asFloat;
    return this;
  }

  /**
   * Get asFloat
   * @return asFloat
   */
  
  @Schema(name = "asFloat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asFloat")
  public @Nullable Float getAsFloat() {
    return asFloat;
  }

  public void setAsFloat(@Nullable Float asFloat) {
    this.asFloat = asFloat;
  }

  public JsonArray asLong(@Nullable Long asLong) {
    this.asLong = asLong;
    return this;
  }

  /**
   * Get asLong
   * @return asLong
   */
  
  @Schema(name = "asLong", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asLong")
  public @Nullable Long getAsLong() {
    return asLong;
  }

  public void setAsLong(@Nullable Long asLong) {
    this.asLong = asLong;
  }

  public JsonArray asByte(@Nullable byte[] asByte) {
    this.asByte = asByte;
    return this;
  }

  /**
   * Get asByte
   * @return asByte
   */
  
  @Schema(name = "asByte", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asByte")
  public @Nullable byte[] getAsByte() {
    return asByte;
  }

  public void setAsByte(@Nullable byte[] asByte) {
    this.asByte = asByte;
  }

  public JsonArray asCharacter(@Nullable String asCharacter) {
    this.asCharacter = asCharacter;
    return this;
  }

  /**
   * Get asCharacter
   * @return asCharacter
   */
  
  @Schema(name = "asCharacter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asCharacter")
  public @Nullable String getAsCharacter() {
    return asCharacter;
  }

  public void setAsCharacter(@Nullable String asCharacter) {
    this.asCharacter = asCharacter;
  }

  public JsonArray asBigDecimal(@Nullable BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
    return this;
  }

  /**
   * Get asBigDecimal
   * @return asBigDecimal
   */
  @Valid 
  @Schema(name = "asBigDecimal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asBigDecimal")
  public @Nullable BigDecimal getAsBigDecimal() {
    return asBigDecimal;
  }

  public void setAsBigDecimal(@Nullable BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
  }

  public JsonArray asBigInteger(@Nullable Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
    return this;
  }

  /**
   * Get asBigInteger
   * @return asBigInteger
   */
  
  @Schema(name = "asBigInteger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asBigInteger")
  public @Nullable Integer getAsBigInteger() {
    return asBigInteger;
  }

  public void setAsBigInteger(@Nullable Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
  }

  public JsonArray asShort(@Nullable Integer asShort) {
    this.asShort = asShort;
    return this;
  }

  /**
   * Get asShort
   * @return asShort
   */
  
  @Schema(name = "asShort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asShort")
  public @Nullable Integer getAsShort() {
    return asShort;
  }

  public void setAsShort(@Nullable Integer asShort) {
    this.asShort = asShort;
  }

  public JsonArray asJsonObject(@Nullable JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
    return this;
  }

  /**
   * Get asJsonObject
   * @return asJsonObject
   */
  @Valid 
  @Schema(name = "asJsonObject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asJsonObject")
  public @Nullable JsonObject getAsJsonObject() {
    return asJsonObject;
  }

  public void setAsJsonObject(@Nullable JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
  }

  public JsonArray jsonNull(@Nullable Boolean jsonNull) {
    this.jsonNull = jsonNull;
    return this;
  }

  /**
   * Get jsonNull
   * @return jsonNull
   */
  
  @Schema(name = "jsonNull", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonNull")
  public @Nullable Boolean getJsonNull() {
    return jsonNull;
  }

  public void setJsonNull(@Nullable Boolean jsonNull) {
    this.jsonNull = jsonNull;
  }

  public JsonArray jsonArray(@Nullable Boolean jsonArray) {
    this.jsonArray = jsonArray;
    return this;
  }

  /**
   * Get jsonArray
   * @return jsonArray
   */
  
  @Schema(name = "jsonArray", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonArray")
  public @Nullable Boolean getJsonArray() {
    return jsonArray;
  }

  public void setJsonArray(@Nullable Boolean jsonArray) {
    this.jsonArray = jsonArray;
  }

  public JsonArray jsonObject(@Nullable Boolean jsonObject) {
    this.jsonObject = jsonObject;
    return this;
  }

  /**
   * Get jsonObject
   * @return jsonObject
   */
  
  @Schema(name = "jsonObject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonObject")
  public @Nullable Boolean getJsonObject() {
    return jsonObject;
  }

  public void setJsonObject(@Nullable Boolean jsonObject) {
    this.jsonObject = jsonObject;
  }

  public JsonArray jsonPrimitive(@Nullable Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
    return this;
  }

  /**
   * Get jsonPrimitive
   * @return jsonPrimitive
   */
  
  @Schema(name = "jsonPrimitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonPrimitive")
  public @Nullable Boolean getJsonPrimitive() {
    return jsonPrimitive;
  }

  public void setJsonPrimitive(@Nullable Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
  }

  public JsonArray asJsonArray(@Nullable JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
    return this;
  }

  /**
   * Get asJsonArray
   * @return asJsonArray
   */
  @Valid 
  @Schema(name = "asJsonArray", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asJsonArray")
  public @Nullable JsonArray getAsJsonArray() {
    return asJsonArray;
  }

  public void setAsJsonArray(@Nullable JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
  }

  public JsonArray asJsonPrimitive(@Nullable JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
    return this;
  }

  /**
   * Get asJsonPrimitive
   * @return asJsonPrimitive
   */
  @Valid 
  @Schema(name = "asJsonPrimitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asJsonPrimitive")
  public @Nullable JsonPrimitive getAsJsonPrimitive() {
    return asJsonPrimitive;
  }

  public void setAsJsonPrimitive(@Nullable JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
  }

  public JsonArray asJsonNull(@Nullable JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
    return this;
  }

  /**
   * Get asJsonNull
   * @return asJsonNull
   */
  @Valid 
  @Schema(name = "asJsonNull", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asJsonNull")
  public @Nullable JsonNull getAsJsonNull() {
    return asJsonNull;
  }

  public void setAsJsonNull(@Nullable JsonNull asJsonNull) {
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
    return Objects.equals(this.asInt, jsonArray.asInt) &&
        Objects.equals(this.asString, jsonArray.asString) &&
        Objects.equals(this.asBoolean, jsonArray.asBoolean) &&
        Objects.equals(this.asNumber, jsonArray.asNumber) &&
        Objects.equals(this.asDouble, jsonArray.asDouble) &&
        Objects.equals(this.asFloat, jsonArray.asFloat) &&
        Objects.equals(this.asLong, jsonArray.asLong) &&
        Arrays.equals(this.asByte, jsonArray.asByte) &&
        Objects.equals(this.asCharacter, jsonArray.asCharacter) &&
        Objects.equals(this.asBigDecimal, jsonArray.asBigDecimal) &&
        Objects.equals(this.asBigInteger, jsonArray.asBigInteger) &&
        Objects.equals(this.asShort, jsonArray.asShort) &&
        Objects.equals(this.asJsonObject, jsonArray.asJsonObject) &&
        Objects.equals(this.jsonNull, jsonArray.jsonNull) &&
        Objects.equals(this.jsonArray, jsonArray.jsonArray) &&
        Objects.equals(this.jsonObject, jsonArray.jsonObject) &&
        Objects.equals(this.jsonPrimitive, jsonArray.jsonPrimitive) &&
        Objects.equals(this.asJsonArray, jsonArray.asJsonArray) &&
        Objects.equals(this.asJsonPrimitive, jsonArray.asJsonPrimitive) &&
        Objects.equals(this.asJsonNull, jsonArray.asJsonNull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asInt, asString, asBoolean, asNumber, asDouble, asFloat, asLong, Arrays.hashCode(asByte), asCharacter, asBigDecimal, asBigInteger, asShort, asJsonObject, jsonNull, jsonArray, jsonObject, jsonPrimitive, asJsonArray, asJsonPrimitive, asJsonNull);
  }

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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

