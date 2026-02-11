package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WeatherForecastResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WeatherResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WeatherResponse {

  private @Nullable Long id;

  private @Nullable Integer cloudcover;

  private @Nullable Integer humidity;

  private @Nullable Long observationTime;

  private @Nullable Double precipMM;

  private @Nullable Integer pressure;

  private @Nullable Integer tempC;

  private @Nullable Integer tempF;

  private @Nullable Integer visibility;

  private @Nullable Integer weatherCode;

  private @Nullable String weatherDesc;

  private @Nullable String weatherIconUrl;

  private @Nullable String winddir16Point;

  private @Nullable Integer winddirDegree;

  private @Nullable Integer windspeedKmph;

  private @Nullable Integer windspeedMiles;

  @Valid
  private List<@Valid WeatherForecastResponse> forecasts = new ArrayList<>();

  public WeatherResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public WeatherResponse cloudcover(@Nullable Integer cloudcover) {
    this.cloudcover = cloudcover;
    return this;
  }

  /**
   * Get cloudcover
   * @return cloudcover
   */
  
  @Schema(name = "cloudcover", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cloudcover")
  public @Nullable Integer getCloudcover() {
    return cloudcover;
  }

  public void setCloudcover(@Nullable Integer cloudcover) {
    this.cloudcover = cloudcover;
  }

  public WeatherResponse humidity(@Nullable Integer humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * Get humidity
   * @return humidity
   */
  
  @Schema(name = "humidity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("humidity")
  public @Nullable Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(@Nullable Integer humidity) {
    this.humidity = humidity;
  }

  public WeatherResponse observationTime(@Nullable Long observationTime) {
    this.observationTime = observationTime;
    return this;
  }

  /**
   * Get observationTime
   * @return observationTime
   */
  
  @Schema(name = "observationTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observationTime")
  public @Nullable Long getObservationTime() {
    return observationTime;
  }

  public void setObservationTime(@Nullable Long observationTime) {
    this.observationTime = observationTime;
  }

  public WeatherResponse precipMM(@Nullable Double precipMM) {
    this.precipMM = precipMM;
    return this;
  }

  /**
   * Get precipMM
   * @return precipMM
   */
  
  @Schema(name = "precipMM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precipMM")
  public @Nullable Double getPrecipMM() {
    return precipMM;
  }

  public void setPrecipMM(@Nullable Double precipMM) {
    this.precipMM = precipMM;
  }

  public WeatherResponse pressure(@Nullable Integer pressure) {
    this.pressure = pressure;
    return this;
  }

  /**
   * Get pressure
   * @return pressure
   */
  
  @Schema(name = "pressure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pressure")
  public @Nullable Integer getPressure() {
    return pressure;
  }

  public void setPressure(@Nullable Integer pressure) {
    this.pressure = pressure;
  }

  public WeatherResponse tempC(@Nullable Integer tempC) {
    this.tempC = tempC;
    return this;
  }

  /**
   * Get tempC
   * @return tempC
   */
  
  @Schema(name = "temp_C", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temp_C")
  public @Nullable Integer getTempC() {
    return tempC;
  }

  public void setTempC(@Nullable Integer tempC) {
    this.tempC = tempC;
  }

  public WeatherResponse tempF(@Nullable Integer tempF) {
    this.tempF = tempF;
    return this;
  }

  /**
   * Get tempF
   * @return tempF
   */
  
  @Schema(name = "temp_F", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temp_F")
  public @Nullable Integer getTempF() {
    return tempF;
  }

  public void setTempF(@Nullable Integer tempF) {
    this.tempF = tempF;
  }

  public WeatherResponse visibility(@Nullable Integer visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable Integer getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable Integer visibility) {
    this.visibility = visibility;
  }

  public WeatherResponse weatherCode(@Nullable Integer weatherCode) {
    this.weatherCode = weatherCode;
    return this;
  }

  /**
   * Get weatherCode
   * @return weatherCode
   */
  
  @Schema(name = "weatherCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherCode")
  public @Nullable Integer getWeatherCode() {
    return weatherCode;
  }

  public void setWeatherCode(@Nullable Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  public WeatherResponse weatherDesc(@Nullable String weatherDesc) {
    this.weatherDesc = weatherDesc;
    return this;
  }

  /**
   * Get weatherDesc
   * @return weatherDesc
   */
  
  @Schema(name = "weatherDesc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherDesc")
  public @Nullable String getWeatherDesc() {
    return weatherDesc;
  }

  public void setWeatherDesc(@Nullable String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  public WeatherResponse weatherIconUrl(@Nullable String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
    return this;
  }

  /**
   * Get weatherIconUrl
   * @return weatherIconUrl
   */
  
  @Schema(name = "weatherIconUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherIconUrl")
  public @Nullable String getWeatherIconUrl() {
    return weatherIconUrl;
  }

  public void setWeatherIconUrl(@Nullable String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  public WeatherResponse winddir16Point(@Nullable String winddir16Point) {
    this.winddir16Point = winddir16Point;
    return this;
  }

  /**
   * Get winddir16Point
   * @return winddir16Point
   */
  
  @Schema(name = "winddir16Point", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winddir16Point")
  public @Nullable String getWinddir16Point() {
    return winddir16Point;
  }

  public void setWinddir16Point(@Nullable String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  public WeatherResponse winddirDegree(@Nullable Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
    return this;
  }

  /**
   * Get winddirDegree
   * @return winddirDegree
   */
  
  @Schema(name = "winddirDegree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winddirDegree")
  public @Nullable Integer getWinddirDegree() {
    return winddirDegree;
  }

  public void setWinddirDegree(@Nullable Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  public WeatherResponse windspeedKmph(@Nullable Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
    return this;
  }

  /**
   * Get windspeedKmph
   * @return windspeedKmph
   */
  
  @Schema(name = "windspeedKmph", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windspeedKmph")
  public @Nullable Integer getWindspeedKmph() {
    return windspeedKmph;
  }

  public void setWindspeedKmph(@Nullable Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  public WeatherResponse windspeedMiles(@Nullable Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
    return this;
  }

  /**
   * Get windspeedMiles
   * @return windspeedMiles
   */
  
  @Schema(name = "windspeedMiles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windspeedMiles")
  public @Nullable Integer getWindspeedMiles() {
    return windspeedMiles;
  }

  public void setWindspeedMiles(@Nullable Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
  }

  public WeatherResponse forecasts(List<@Valid WeatherForecastResponse> forecasts) {
    this.forecasts = forecasts;
    return this;
  }

  public WeatherResponse addForecastsItem(WeatherForecastResponse forecastsItem) {
    if (this.forecasts == null) {
      this.forecasts = new ArrayList<>();
    }
    this.forecasts.add(forecastsItem);
    return this;
  }

  /**
   * Get forecasts
   * @return forecasts
   */
  @Valid 
  @Schema(name = "forecasts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forecasts")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

