package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LoadShortResponse;
import org.openapitools.model.NodeRequest;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StopResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StopResponse {

  private @Nullable String geoId;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Long startWindow;

  private @Nullable Long endWindow;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    PICKUP("PICKUP"),
    
    DROPOFF("DROPOFF"),
    
    START("START"),
    
    END("END"),
    
    ROUTING("ROUTING");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable TypeEnum type;

  private @Nullable Long eta;

  private @Nullable Long etd;

  private @Nullable Long score;

  private @Nullable String errorCode;

  private @Nullable String error;

  private @Nullable String itemId;

  private @Nullable Long itemSize;

  private @Nullable LoadShortResponse load;

  @Valid
  private List<@Valid NodeRequest> floorPlanPath = new ArrayList<>();

  private @Nullable Boolean valid;

  public StopResponse geoId(@Nullable String geoId) {
    this.geoId = geoId;
    return this;
  }

  /**
   * Get geoId
   * @return geoId
   */
  
  @Schema(name = "geoId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geoId")
  public @Nullable String getGeoId() {
    return geoId;
  }

  public void setGeoId(@Nullable String geoId) {
    this.geoId = geoId;
  }

  public StopResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public StopResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public StopResponse startWindow(@Nullable Long startWindow) {
    this.startWindow = startWindow;
    return this;
  }

  /**
   * Get startWindow
   * @return startWindow
   */
  
  @Schema(name = "startWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startWindow")
  public @Nullable Long getStartWindow() {
    return startWindow;
  }

  public void setStartWindow(@Nullable Long startWindow) {
    this.startWindow = startWindow;
  }

  public StopResponse endWindow(@Nullable Long endWindow) {
    this.endWindow = endWindow;
    return this;
  }

  /**
   * Get endWindow
   * @return endWindow
   */
  
  @Schema(name = "endWindow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endWindow")
  public @Nullable Long getEndWindow() {
    return endWindow;
  }

  public void setEndWindow(@Nullable Long endWindow) {
    this.endWindow = endWindow;
  }

  public StopResponse type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public StopResponse eta(@Nullable Long eta) {
    this.eta = eta;
    return this;
  }

  /**
   * Get eta
   * @return eta
   */
  
  @Schema(name = "eta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eta")
  public @Nullable Long getEta() {
    return eta;
  }

  public void setEta(@Nullable Long eta) {
    this.eta = eta;
  }

  public StopResponse etd(@Nullable Long etd) {
    this.etd = etd;
    return this;
  }

  /**
   * Get etd
   * @return etd
   */
  
  @Schema(name = "etd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("etd")
  public @Nullable Long getEtd() {
    return etd;
  }

  public void setEtd(@Nullable Long etd) {
    this.etd = etd;
  }

  public StopResponse score(@Nullable Long score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
   */
  
  @Schema(name = "score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public @Nullable Long getScore() {
    return score;
  }

  public void setScore(@Nullable Long score) {
    this.score = score;
  }

  public StopResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public StopResponse error(@Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public @Nullable String getError() {
    return error;
  }

  public void setError(@Nullable String error) {
    this.error = error;
  }

  public StopResponse itemId(@Nullable String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
   */
  
  @Schema(name = "itemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemId")
  public @Nullable String getItemId() {
    return itemId;
  }

  public void setItemId(@Nullable String itemId) {
    this.itemId = itemId;
  }

  public StopResponse itemSize(@Nullable Long itemSize) {
    this.itemSize = itemSize;
    return this;
  }

  /**
   * Get itemSize
   * @return itemSize
   */
  
  @Schema(name = "itemSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemSize")
  public @Nullable Long getItemSize() {
    return itemSize;
  }

  public void setItemSize(@Nullable Long itemSize) {
    this.itemSize = itemSize;
  }

  public StopResponse load(@Nullable LoadShortResponse load) {
    this.load = load;
    return this;
  }

  /**
   * Get load
   * @return load
   */
  @Valid 
  @Schema(name = "load", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("load")
  public @Nullable LoadShortResponse getLoad() {
    return load;
  }

  public void setLoad(@Nullable LoadShortResponse load) {
    this.load = load;
  }

  public StopResponse floorPlanPath(List<@Valid NodeRequest> floorPlanPath) {
    this.floorPlanPath = floorPlanPath;
    return this;
  }

  public StopResponse addFloorPlanPathItem(NodeRequest floorPlanPathItem) {
    if (this.floorPlanPath == null) {
      this.floorPlanPath = new ArrayList<>();
    }
    this.floorPlanPath.add(floorPlanPathItem);
    return this;
  }

  /**
   * Get floorPlanPath
   * @return floorPlanPath
   */
  @Valid 
  @Schema(name = "floorPlanPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("floorPlanPath")
  public List<@Valid NodeRequest> getFloorPlanPath() {
    return floorPlanPath;
  }

  public void setFloorPlanPath(List<@Valid NodeRequest> floorPlanPath) {
    this.floorPlanPath = floorPlanPath;
  }

  public StopResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopResponse stopResponse = (StopResponse) o;
    return Objects.equals(this.geoId, stopResponse.geoId) &&
        Objects.equals(this.latitude, stopResponse.latitude) &&
        Objects.equals(this.longitude, stopResponse.longitude) &&
        Objects.equals(this.startWindow, stopResponse.startWindow) &&
        Objects.equals(this.endWindow, stopResponse.endWindow) &&
        Objects.equals(this.type, stopResponse.type) &&
        Objects.equals(this.eta, stopResponse.eta) &&
        Objects.equals(this.etd, stopResponse.etd) &&
        Objects.equals(this.score, stopResponse.score) &&
        Objects.equals(this.errorCode, stopResponse.errorCode) &&
        Objects.equals(this.error, stopResponse.error) &&
        Objects.equals(this.itemId, stopResponse.itemId) &&
        Objects.equals(this.itemSize, stopResponse.itemSize) &&
        Objects.equals(this.load, stopResponse.load) &&
        Objects.equals(this.floorPlanPath, stopResponse.floorPlanPath) &&
        Objects.equals(this.valid, stopResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoId, latitude, longitude, startWindow, endWindow, type, eta, etd, score, errorCode, error, itemId, itemSize, load, floorPlanPath, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopResponse {\n");
    sb.append("    geoId: ").append(toIndentedString(geoId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    startWindow: ").append(toIndentedString(startWindow)).append("\n");
    sb.append("    endWindow: ").append(toIndentedString(endWindow)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
    sb.append("    etd: ").append(toIndentedString(etd)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemSize: ").append(toIndentedString(itemSize)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
    sb.append("    floorPlanPath: ").append(toIndentedString(floorPlanPath)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

