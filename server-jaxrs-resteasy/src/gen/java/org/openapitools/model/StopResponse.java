package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LoadShortResponse;
import org.openapitools.model.NodeRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StopResponse   {
  
  private String geoId;
  private Double latitude;
  private Double longitude;
  private Long startWindow;
  private Long endWindow;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    PICKUP("PICKUP"),

        DROPOFF("DROPOFF"),

        START("START"),

        END("END"),

        ROUTING("ROUTING");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private Long eta;
  private Long etd;
  private Long score;
  private String errorCode;
  private String error;
  private String itemId;
  private Long itemSize;
  private LoadShortResponse load;
  private List<@Valid NodeRequest> floorPlanPath = new ArrayList<>();
  private Boolean valid;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("geoId")
  public String getGeoId() {
    return geoId;
  }
  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startWindow")
  public Long getStartWindow() {
    return startWindow;
  }
  public void setStartWindow(Long startWindow) {
    this.startWindow = startWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endWindow")
  public Long getEndWindow() {
    return endWindow;
  }
  public void setEndWindow(Long endWindow) {
    this.endWindow = endWindow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eta")
  public Long getEta() {
    return eta;
  }
  public void setEta(Long eta) {
    this.eta = eta;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("etd")
  public Long getEtd() {
    return etd;
  }
  public void setEtd(Long etd) {
    this.etd = etd;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemId")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemSize")
  public Long getItemSize() {
    return itemSize;
  }
  public void setItemSize(Long itemSize) {
    this.itemSize = itemSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("load")
  @Valid
  public LoadShortResponse getLoad() {
    return load;
  }
  public void setLoad(LoadShortResponse load) {
    this.load = load;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("floorPlanPath")
  @Valid
  public List<@Valid NodeRequest> getFloorPlanPath() {
    return floorPlanPath;
  }
  public void setFloorPlanPath(List<@Valid NodeRequest> floorPlanPath) {
    this.floorPlanPath = floorPlanPath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

