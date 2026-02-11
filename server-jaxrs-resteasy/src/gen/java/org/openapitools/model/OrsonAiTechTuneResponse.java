package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiTechTuneResponse   {
  
  private String requestId;
  private Integer responseCode;
  private String responseRaw;
  private Integer people;
  private Boolean wasCutoff;
  private Integer frames;
  private Integer framesWithoutAFace;
  private Integer framesWithFaceOffscreen;
  private Integer framesWithWrongNumberOfPeople;
  private Integer height;
  private Integer width;
  private Integer fps;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responseCode")
  public Integer getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responseRaw")
  public String getResponseRaw() {
    return responseRaw;
  }
  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("people")
  public Integer getPeople() {
    return people;
  }
  public void setPeople(Integer people) {
    this.people = people;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wasCutoff")
  public Boolean getWasCutoff() {
    return wasCutoff;
  }
  public void setWasCutoff(Boolean wasCutoff) {
    this.wasCutoff = wasCutoff;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("frames")
  public Integer getFrames() {
    return frames;
  }
  public void setFrames(Integer frames) {
    this.frames = frames;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("framesWithoutAFace")
  public Integer getFramesWithoutAFace() {
    return framesWithoutAFace;
  }
  public void setFramesWithoutAFace(Integer framesWithoutAFace) {
    this.framesWithoutAFace = framesWithoutAFace;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("framesWithFaceOffscreen")
  public Integer getFramesWithFaceOffscreen() {
    return framesWithFaceOffscreen;
  }
  public void setFramesWithFaceOffscreen(Integer framesWithFaceOffscreen) {
    this.framesWithFaceOffscreen = framesWithFaceOffscreen;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("framesWithWrongNumberOfPeople")
  public Integer getFramesWithWrongNumberOfPeople() {
    return framesWithWrongNumberOfPeople;
  }
  public void setFramesWithWrongNumberOfPeople(Integer framesWithWrongNumberOfPeople) {
    this.framesWithWrongNumberOfPeople = framesWithWrongNumberOfPeople;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fps")
  public Integer getFps() {
    return fps;
  }
  public void setFps(Integer fps) {
    this.fps = fps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiTechTuneResponse orsonAiTechTuneResponse = (OrsonAiTechTuneResponse) o;
    return Objects.equals(this.requestId, orsonAiTechTuneResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiTechTuneResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiTechTuneResponse.responseRaw) &&
        Objects.equals(this.people, orsonAiTechTuneResponse.people) &&
        Objects.equals(this.wasCutoff, orsonAiTechTuneResponse.wasCutoff) &&
        Objects.equals(this.frames, orsonAiTechTuneResponse.frames) &&
        Objects.equals(this.framesWithoutAFace, orsonAiTechTuneResponse.framesWithoutAFace) &&
        Objects.equals(this.framesWithFaceOffscreen, orsonAiTechTuneResponse.framesWithFaceOffscreen) &&
        Objects.equals(this.framesWithWrongNumberOfPeople, orsonAiTechTuneResponse.framesWithWrongNumberOfPeople) &&
        Objects.equals(this.height, orsonAiTechTuneResponse.height) &&
        Objects.equals(this.width, orsonAiTechTuneResponse.width) &&
        Objects.equals(this.fps, orsonAiTechTuneResponse.fps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, people, wasCutoff, frames, framesWithoutAFace, framesWithFaceOffscreen, framesWithWrongNumberOfPeople, height, width, fps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiTechTuneResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    wasCutoff: ").append(toIndentedString(wasCutoff)).append("\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    framesWithoutAFace: ").append(toIndentedString(framesWithoutAFace)).append("\n");
    sb.append("    framesWithFaceOffscreen: ").append(toIndentedString(framesWithFaceOffscreen)).append("\n");
    sb.append("    framesWithWrongNumberOfPeople: ").append(toIndentedString(framesWithWrongNumberOfPeople)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
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

