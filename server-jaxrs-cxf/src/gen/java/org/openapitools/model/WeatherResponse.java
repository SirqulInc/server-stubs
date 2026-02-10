package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WeatherForecastResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WeatherResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Integer cloudcover;

  @ApiModelProperty(value = "")

  private Integer humidity;

  @ApiModelProperty(value = "")

  private Long observationTime;

  @ApiModelProperty(value = "")

  private Double precipMM;

  @ApiModelProperty(value = "")

  private Integer pressure;

  @ApiModelProperty(value = "")

  private Integer tempC;

  @ApiModelProperty(value = "")

  private Integer tempF;

  @ApiModelProperty(value = "")

  private Integer visibility;

  @ApiModelProperty(value = "")

  private Integer weatherCode;

  @ApiModelProperty(value = "")

  private String weatherDesc;

  @ApiModelProperty(value = "")

  private String weatherIconUrl;

  @ApiModelProperty(value = "")

  private String winddir16Point;

  @ApiModelProperty(value = "")

  private Integer winddirDegree;

  @ApiModelProperty(value = "")

  private Integer windspeedKmph;

  @ApiModelProperty(value = "")

  private Integer windspeedMiles;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid WeatherForecastResponse> forecasts = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WeatherResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get cloudcover
   * @return cloudcover
  **/
  @JsonProperty("cloudcover")
  public Integer getCloudcover() {
    return cloudcover;
  }

  public void setCloudcover(Integer cloudcover) {
    this.cloudcover = cloudcover;
  }

  public WeatherResponse cloudcover(Integer cloudcover) {
    this.cloudcover = cloudcover;
    return this;
  }

 /**
   * Get humidity
   * @return humidity
  **/
  @JsonProperty("humidity")
  public Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  public WeatherResponse humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }

 /**
   * Get observationTime
   * @return observationTime
  **/
  @JsonProperty("observationTime")
  public Long getObservationTime() {
    return observationTime;
  }

  public void setObservationTime(Long observationTime) {
    this.observationTime = observationTime;
  }

  public WeatherResponse observationTime(Long observationTime) {
    this.observationTime = observationTime;
    return this;
  }

 /**
   * Get precipMM
   * @return precipMM
  **/
  @JsonProperty("precipMM")
  public Double getPrecipMM() {
    return precipMM;
  }

  public void setPrecipMM(Double precipMM) {
    this.precipMM = precipMM;
  }

  public WeatherResponse precipMM(Double precipMM) {
    this.precipMM = precipMM;
    return this;
  }

 /**
   * Get pressure
   * @return pressure
  **/
  @JsonProperty("pressure")
  public Integer getPressure() {
    return pressure;
  }

  public void setPressure(Integer pressure) {
    this.pressure = pressure;
  }

  public WeatherResponse pressure(Integer pressure) {
    this.pressure = pressure;
    return this;
  }

 /**
   * Get tempC
   * @return tempC
  **/
  @JsonProperty("temp_C")
  public Integer getTempC() {
    return tempC;
  }

  public void setTempC(Integer tempC) {
    this.tempC = tempC;
  }

  public WeatherResponse tempC(Integer tempC) {
    this.tempC = tempC;
    return this;
  }

 /**
   * Get tempF
   * @return tempF
  **/
  @JsonProperty("temp_F")
  public Integer getTempF() {
    return tempF;
  }

  public void setTempF(Integer tempF) {
    this.tempF = tempF;
  }

  public WeatherResponse tempF(Integer tempF) {
    this.tempF = tempF;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public Integer getVisibility() {
    return visibility;
  }

  public void setVisibility(Integer visibility) {
    this.visibility = visibility;
  }

  public WeatherResponse visibility(Integer visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get weatherCode
   * @return weatherCode
  **/
  @JsonProperty("weatherCode")
  public Integer getWeatherCode() {
    return weatherCode;
  }

  public void setWeatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  public WeatherResponse weatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
    return this;
  }

 /**
   * Get weatherDesc
   * @return weatherDesc
  **/
  @JsonProperty("weatherDesc")
  public String getWeatherDesc() {
    return weatherDesc;
  }

  public void setWeatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  public WeatherResponse weatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
    return this;
  }

 /**
   * Get weatherIconUrl
   * @return weatherIconUrl
  **/
  @JsonProperty("weatherIconUrl")
  public String getWeatherIconUrl() {
    return weatherIconUrl;
  }

  public void setWeatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  public WeatherResponse weatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
    return this;
  }

 /**
   * Get winddir16Point
   * @return winddir16Point
  **/
  @JsonProperty("winddir16Point")
  public String getWinddir16Point() {
    return winddir16Point;
  }

  public void setWinddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  public WeatherResponse winddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
    return this;
  }

 /**
   * Get winddirDegree
   * @return winddirDegree
  **/
  @JsonProperty("winddirDegree")
  public Integer getWinddirDegree() {
    return winddirDegree;
  }

  public void setWinddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  public WeatherResponse winddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
    return this;
  }

 /**
   * Get windspeedKmph
   * @return windspeedKmph
  **/
  @JsonProperty("windspeedKmph")
  public Integer getWindspeedKmph() {
    return windspeedKmph;
  }

  public void setWindspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  public WeatherResponse windspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
    return this;
  }

 /**
   * Get windspeedMiles
   * @return windspeedMiles
  **/
  @JsonProperty("windspeedMiles")
  public Integer getWindspeedMiles() {
    return windspeedMiles;
  }

  public void setWindspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
  }

  public WeatherResponse windspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
    return this;
  }

 /**
   * Get forecasts
   * @return forecasts
  **/
  @JsonProperty("forecasts")
  public List<@Valid WeatherForecastResponse> getForecasts() {
    return forecasts;
  }

  public void setForecasts(List<@Valid WeatherForecastResponse> forecasts) {
    this.forecasts = forecasts;
  }

  public WeatherResponse forecasts(List<@Valid WeatherForecastResponse> forecasts) {
    this.forecasts = forecasts;
    return this;
  }

  public WeatherResponse addForecastsItem(WeatherForecastResponse forecastsItem) {
    this.forecasts.add(forecastsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

