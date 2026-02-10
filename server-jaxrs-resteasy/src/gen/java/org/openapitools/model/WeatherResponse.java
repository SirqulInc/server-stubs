package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WeatherForecastResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WeatherResponse   {
  
  private Long id;
  private Integer cloudcover;
  private Integer humidity;
  private Long observationTime;
  private Double precipMM;
  private Integer pressure;
  private Integer tempC;
  private Integer tempF;
  private Integer visibility;
  private Integer weatherCode;
  private String weatherDesc;
  private String weatherIconUrl;
  private String winddir16Point;
  private Integer winddirDegree;
  private Integer windspeedKmph;
  private Integer windspeedMiles;
  private List<@Valid WeatherForecastResponse> forecasts = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cloudcover")
  public Integer getCloudcover() {
    return cloudcover;
  }
  public void setCloudcover(Integer cloudcover) {
    this.cloudcover = cloudcover;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("humidity")
  public Integer getHumidity() {
    return humidity;
  }
  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("observationTime")
  public Long getObservationTime() {
    return observationTime;
  }
  public void setObservationTime(Long observationTime) {
    this.observationTime = observationTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("precipMM")
  public Double getPrecipMM() {
    return precipMM;
  }
  public void setPrecipMM(Double precipMM) {
    this.precipMM = precipMM;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pressure")
  public Integer getPressure() {
    return pressure;
  }
  public void setPressure(Integer pressure) {
    this.pressure = pressure;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("temp_C")
  public Integer getTempC() {
    return tempC;
  }
  public void setTempC(Integer tempC) {
    this.tempC = tempC;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("temp_F")
  public Integer getTempF() {
    return tempF;
  }
  public void setTempF(Integer tempF) {
    this.tempF = tempF;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public Integer getVisibility() {
    return visibility;
  }
  public void setVisibility(Integer visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weatherCode")
  public Integer getWeatherCode() {
    return weatherCode;
  }
  public void setWeatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weatherDesc")
  public String getWeatherDesc() {
    return weatherDesc;
  }
  public void setWeatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weatherIconUrl")
  public String getWeatherIconUrl() {
    return weatherIconUrl;
  }
  public void setWeatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("winddir16Point")
  public String getWinddir16Point() {
    return winddir16Point;
  }
  public void setWinddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("winddirDegree")
  public Integer getWinddirDegree() {
    return winddirDegree;
  }
  public void setWinddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("windspeedKmph")
  public Integer getWindspeedKmph() {
    return windspeedKmph;
  }
  public void setWindspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("windspeedMiles")
  public Integer getWindspeedMiles() {
    return windspeedMiles;
  }
  public void setWindspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("forecasts")
  @Valid
  public List<@Valid WeatherForecastResponse> getForecasts() {
    return forecasts;
  }
  public void setForecasts(List<@Valid WeatherForecastResponse> forecasts) {
    this.forecasts = forecasts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherResponse weatherResponse = (WeatherResponse) o;
    return Objects.equals(this.id, weatherResponse.id) &&
        Objects.equals(this.cloudcover, weatherResponse.cloudcover) &&
        Objects.equals(this.humidity, weatherResponse.humidity) &&
        Objects.equals(this.observationTime, weatherResponse.observationTime) &&
        Objects.equals(this.precipMM, weatherResponse.precipMM) &&
        Objects.equals(this.pressure, weatherResponse.pressure) &&
        Objects.equals(this.tempC, weatherResponse.tempC) &&
        Objects.equals(this.tempF, weatherResponse.tempF) &&
        Objects.equals(this.visibility, weatherResponse.visibility) &&
        Objects.equals(this.weatherCode, weatherResponse.weatherCode) &&
        Objects.equals(this.weatherDesc, weatherResponse.weatherDesc) &&
        Objects.equals(this.weatherIconUrl, weatherResponse.weatherIconUrl) &&
        Objects.equals(this.winddir16Point, weatherResponse.winddir16Point) &&
        Objects.equals(this.winddirDegree, weatherResponse.winddirDegree) &&
        Objects.equals(this.windspeedKmph, weatherResponse.windspeedKmph) &&
        Objects.equals(this.windspeedMiles, weatherResponse.windspeedMiles) &&
        Objects.equals(this.forecasts, weatherResponse.forecasts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cloudcover, humidity, observationTime, precipMM, pressure, tempC, tempF, visibility, weatherCode, weatherDesc, weatherIconUrl, winddir16Point, winddirDegree, windspeedKmph, windspeedMiles, forecasts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cloudcover: ").append(toIndentedString(cloudcover)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    observationTime: ").append(toIndentedString(observationTime)).append("\n");
    sb.append("    precipMM: ").append(toIndentedString(precipMM)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    tempC: ").append(toIndentedString(tempC)).append("\n");
    sb.append("    tempF: ").append(toIndentedString(tempF)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    weatherCode: ").append(toIndentedString(weatherCode)).append("\n");
    sb.append("    weatherDesc: ").append(toIndentedString(weatherDesc)).append("\n");
    sb.append("    weatherIconUrl: ").append(toIndentedString(weatherIconUrl)).append("\n");
    sb.append("    winddir16Point: ").append(toIndentedString(winddir16Point)).append("\n");
    sb.append("    winddirDegree: ").append(toIndentedString(winddirDegree)).append("\n");
    sb.append("    windspeedKmph: ").append(toIndentedString(windspeedKmph)).append("\n");
    sb.append("    windspeedMiles: ").append(toIndentedString(windspeedMiles)).append("\n");
    sb.append("    forecasts: ").append(toIndentedString(forecasts)).append("\n");
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

