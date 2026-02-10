package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.JsonArray;
import org.openapitools.model.JsonNull;
import org.openapitools.model.JsonPrimitive;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class JsonObject   {
  
  private Integer asInt;
  private JsonObject asJsonObject;
  private Boolean jsonNull;
  private String asString;
  private Boolean asBoolean;
  private Boolean jsonArray;
  private Boolean jsonObject;
  private Boolean jsonPrimitive;
  private JsonArray asJsonArray;
  private JsonPrimitive asJsonPrimitive;
  private JsonNull asJsonNull;
  private Object asNumber;
  private Double asDouble;
  private Float asFloat;
  private Long asLong;
  private byte[] asByte;
  private String asCharacter;
  private BigDecimal asBigDecimal;
  private Integer asBigInteger;
  private Integer asShort;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asInt")
  public Integer getAsInt() {
    return asInt;
  }
  public void setAsInt(Integer asInt) {
    this.asInt = asInt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asJsonObject")
  @Valid
  public JsonObject getAsJsonObject() {
    return asJsonObject;
  }
  public void setAsJsonObject(JsonObject asJsonObject) {
    this.asJsonObject = asJsonObject;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jsonNull")
  public Boolean getJsonNull() {
    return jsonNull;
  }
  public void setJsonNull(Boolean jsonNull) {
    this.jsonNull = jsonNull;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asString")
  public String getAsString() {
    return asString;
  }
  public void setAsString(String asString) {
    this.asString = asString;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asBoolean")
  public Boolean getAsBoolean() {
    return asBoolean;
  }
  public void setAsBoolean(Boolean asBoolean) {
    this.asBoolean = asBoolean;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jsonArray")
  public Boolean getJsonArray() {
    return jsonArray;
  }
  public void setJsonArray(Boolean jsonArray) {
    this.jsonArray = jsonArray;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jsonObject")
  public Boolean getJsonObject() {
    return jsonObject;
  }
  public void setJsonObject(Boolean jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jsonPrimitive")
  public Boolean getJsonPrimitive() {
    return jsonPrimitive;
  }
  public void setJsonPrimitive(Boolean jsonPrimitive) {
    this.jsonPrimitive = jsonPrimitive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asJsonArray")
  @Valid
  public JsonArray getAsJsonArray() {
    return asJsonArray;
  }
  public void setAsJsonArray(JsonArray asJsonArray) {
    this.asJsonArray = asJsonArray;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asJsonPrimitive")
  @Valid
  public JsonPrimitive getAsJsonPrimitive() {
    return asJsonPrimitive;
  }
  public void setAsJsonPrimitive(JsonPrimitive asJsonPrimitive) {
    this.asJsonPrimitive = asJsonPrimitive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asJsonNull")
  @Valid
  public JsonNull getAsJsonNull() {
    return asJsonNull;
  }
  public void setAsJsonNull(JsonNull asJsonNull) {
    this.asJsonNull = asJsonNull;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asNumber")
  public Object getAsNumber() {
    return asNumber;
  }
  public void setAsNumber(Object asNumber) {
    this.asNumber = asNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asDouble")
  public Double getAsDouble() {
    return asDouble;
  }
  public void setAsDouble(Double asDouble) {
    this.asDouble = asDouble;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asFloat")
  public Float getAsFloat() {
    return asFloat;
  }
  public void setAsFloat(Float asFloat) {
    this.asFloat = asFloat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asLong")
  public Long getAsLong() {
    return asLong;
  }
  public void setAsLong(Long asLong) {
    this.asLong = asLong;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asByte")
  public byte[] getAsByte() {
    return asByte;
  }
  public void setAsByte(byte[] asByte) {
    this.asByte = asByte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asCharacter")
  public String getAsCharacter() {
    return asCharacter;
  }
  public void setAsCharacter(String asCharacter) {
    this.asCharacter = asCharacter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asBigDecimal")
  @Valid
  public BigDecimal getAsBigDecimal() {
    return asBigDecimal;
  }
  public void setAsBigDecimal(BigDecimal asBigDecimal) {
    this.asBigDecimal = asBigDecimal;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asBigInteger")
  public Integer getAsBigInteger() {
    return asBigInteger;
  }
  public void setAsBigInteger(Integer asBigInteger) {
    this.asBigInteger = asBigInteger;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asShort")
  public Integer getAsShort() {
    return asShort;
  }
  public void setAsShort(Integer asShort) {
    this.asShort = asShort;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

