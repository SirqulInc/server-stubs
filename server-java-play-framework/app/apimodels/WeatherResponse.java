package apimodels;

import apimodels.WeatherForecastResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * WeatherResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WeatherResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("cloudcover")
  
  private Integer cloudcover;

  @JsonProperty("humidity")
  
  private Integer humidity;

  @JsonProperty("observationTime")
  
  private Long observationTime;

  @JsonProperty("precipMM")
  
  private Double precipMM;

  @JsonProperty("pressure")
  
  private Integer pressure;

  @JsonProperty("temp_C")
  
  private Integer tempC;

  @JsonProperty("temp_F")
  
  private Integer tempF;

  @JsonProperty("visibility")
  
  private Integer visibility;

  @JsonProperty("weatherCode")
  
  private Integer weatherCode;

  @JsonProperty("weatherDesc")
  
  private String weatherDesc;

  @JsonProperty("weatherIconUrl")
  
  private String weatherIconUrl;

  @JsonProperty("winddir16Point")
  
  private String winddir16Point;

  @JsonProperty("winddirDegree")
  
  private Integer winddirDegree;

  @JsonProperty("windspeedKmph")
  
  private Integer windspeedKmph;

  @JsonProperty("windspeedMiles")
  
  private Integer windspeedMiles;

  @JsonProperty("forecasts")
  @Valid

  private List<@Valid WeatherForecastResponse> forecasts = null;

  public WeatherResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WeatherResponse cloudcover(Integer cloudcover) {
    this.cloudcover = cloudcover;
    return this;
  }

   /**
   * Get cloudcover
   * @return cloudcover
  **/
  public Integer getCloudcover() {
    return cloudcover;
  }

  public void setCloudcover(Integer cloudcover) {
    this.cloudcover = cloudcover;
  }

  public WeatherResponse humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }

   /**
   * Get humidity
   * @return humidity
  **/
  public Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  public WeatherResponse observationTime(Long observationTime) {
    this.observationTime = observationTime;
    return this;
  }

   /**
   * Get observationTime
   * @return observationTime
  **/
  public Long getObservationTime() {
    return observationTime;
  }

  public void setObservationTime(Long observationTime) {
    this.observationTime = observationTime;
  }

  public WeatherResponse precipMM(Double precipMM) {
    this.precipMM = precipMM;
    return this;
  }

   /**
   * Get precipMM
   * @return precipMM
  **/
  public Double getPrecipMM() {
    return precipMM;
  }

  public void setPrecipMM(Double precipMM) {
    this.precipMM = precipMM;
  }

  public WeatherResponse pressure(Integer pressure) {
    this.pressure = pressure;
    return this;
  }

   /**
   * Get pressure
   * @return pressure
  **/
  public Integer getPressure() {
    return pressure;
  }

  public void setPressure(Integer pressure) {
    this.pressure = pressure;
  }

  public WeatherResponse tempC(Integer tempC) {
    this.tempC = tempC;
    return this;
  }

   /**
   * Get tempC
   * @return tempC
  **/
  public Integer getTempC() {
    return tempC;
  }

  public void setTempC(Integer tempC) {
    this.tempC = tempC;
  }

  public WeatherResponse tempF(Integer tempF) {
    this.tempF = tempF;
    return this;
  }

   /**
   * Get tempF
   * @return tempF
  **/
  public Integer getTempF() {
    return tempF;
  }

  public void setTempF(Integer tempF) {
    this.tempF = tempF;
  }

  public WeatherResponse visibility(Integer visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public Integer getVisibility() {
    return visibility;
  }

  public void setVisibility(Integer visibility) {
    this.visibility = visibility;
  }

  public WeatherResponse weatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
    return this;
  }

   /**
   * Get weatherCode
   * @return weatherCode
  **/
  public Integer getWeatherCode() {
    return weatherCode;
  }

  public void setWeatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  public WeatherResponse weatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
    return this;
  }

   /**
   * Get weatherDesc
   * @return weatherDesc
  **/
  public String getWeatherDesc() {
    return weatherDesc;
  }

  public void setWeatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  public WeatherResponse weatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
    return this;
  }

   /**
   * Get weatherIconUrl
   * @return weatherIconUrl
  **/
  public String getWeatherIconUrl() {
    return weatherIconUrl;
  }

  public void setWeatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  public WeatherResponse winddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
    return this;
  }

   /**
   * Get winddir16Point
   * @return winddir16Point
  **/
  public String getWinddir16Point() {
    return winddir16Point;
  }

  public void setWinddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  public WeatherResponse winddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
    return this;
  }

   /**
   * Get winddirDegree
   * @return winddirDegree
  **/
  public Integer getWinddirDegree() {
    return winddirDegree;
  }

  public void setWinddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  public WeatherResponse windspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
    return this;
  }

   /**
   * Get windspeedKmph
   * @return windspeedKmph
  **/
  public Integer getWindspeedKmph() {
    return windspeedKmph;
  }

  public void setWindspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  public WeatherResponse windspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
    return this;
  }

   /**
   * Get windspeedMiles
   * @return windspeedMiles
  **/
  public Integer getWindspeedMiles() {
    return windspeedMiles;
  }

  public void setWindspeedMiles(Integer windspeedMiles) {
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
  **/
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
    return Objects.equals(id, weatherResponse.id) &&
        Objects.equals(cloudcover, weatherResponse.cloudcover) &&
        Objects.equals(humidity, weatherResponse.humidity) &&
        Objects.equals(observationTime, weatherResponse.observationTime) &&
        Objects.equals(precipMM, weatherResponse.precipMM) &&
        Objects.equals(pressure, weatherResponse.pressure) &&
        Objects.equals(tempC, weatherResponse.tempC) &&
        Objects.equals(tempF, weatherResponse.tempF) &&
        Objects.equals(visibility, weatherResponse.visibility) &&
        Objects.equals(weatherCode, weatherResponse.weatherCode) &&
        Objects.equals(weatherDesc, weatherResponse.weatherDesc) &&
        Objects.equals(weatherIconUrl, weatherResponse.weatherIconUrl) &&
        Objects.equals(winddir16Point, weatherResponse.winddir16Point) &&
        Objects.equals(winddirDegree, weatherResponse.winddirDegree) &&
        Objects.equals(windspeedKmph, weatherResponse.windspeedKmph) &&
        Objects.equals(windspeedMiles, weatherResponse.windspeedMiles) &&
        Objects.equals(forecasts, weatherResponse.forecasts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cloudcover, humidity, observationTime, precipMM, pressure, tempC, tempF, visibility, weatherCode, weatherDesc, weatherIconUrl, winddir16Point, winddirDegree, windspeedKmph, windspeedMiles, forecasts);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

