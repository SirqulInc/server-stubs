package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiTechTuneResponse  {
  
  @ApiModelProperty(value = "")

  private String requestId;

  @ApiModelProperty(value = "")

  private Integer responseCode;

  @ApiModelProperty(value = "")

  private String responseRaw;

  @ApiModelProperty(value = "")

  private Integer people;

  @ApiModelProperty(value = "")

  private Boolean wasCutoff;

  @ApiModelProperty(value = "")

  private Integer frames;

  @ApiModelProperty(value = "")

  private Integer framesWithoutAFace;

  @ApiModelProperty(value = "")

  private Integer framesWithFaceOffscreen;

  @ApiModelProperty(value = "")

  private Integer framesWithWrongNumberOfPeople;

  @ApiModelProperty(value = "")

  private Integer height;

  @ApiModelProperty(value = "")

  private Integer width;

  @ApiModelProperty(value = "")

  private Integer fps;
 /**
   * Get requestId
   * @return requestId
  **/
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public OrsonAiTechTuneResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

 /**
   * Get responseCode
   * @return responseCode
  **/
  @JsonProperty("responseCode")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public OrsonAiTechTuneResponse responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
   * Get responseRaw
   * @return responseRaw
  **/
  @JsonProperty("responseRaw")
  public String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public OrsonAiTechTuneResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

 /**
   * Get people
   * @return people
  **/
  @JsonProperty("people")
  public Integer getPeople() {
    return people;
  }

  public void setPeople(Integer people) {
    this.people = people;
  }

  public OrsonAiTechTuneResponse people(Integer people) {
    this.people = people;
    return this;
  }

 /**
   * Get wasCutoff
   * @return wasCutoff
  **/
  @JsonProperty("wasCutoff")
  public Boolean getWasCutoff() {
    return wasCutoff;
  }

  public void setWasCutoff(Boolean wasCutoff) {
    this.wasCutoff = wasCutoff;
  }

  public OrsonAiTechTuneResponse wasCutoff(Boolean wasCutoff) {
    this.wasCutoff = wasCutoff;
    return this;
  }

 /**
   * Get frames
   * @return frames
  **/
  @JsonProperty("frames")
  public Integer getFrames() {
    return frames;
  }

  public void setFrames(Integer frames) {
    this.frames = frames;
  }

  public OrsonAiTechTuneResponse frames(Integer frames) {
    this.frames = frames;
    return this;
  }

 /**
   * Get framesWithoutAFace
   * @return framesWithoutAFace
  **/
  @JsonProperty("framesWithoutAFace")
  public Integer getFramesWithoutAFace() {
    return framesWithoutAFace;
  }

  public void setFramesWithoutAFace(Integer framesWithoutAFace) {
    this.framesWithoutAFace = framesWithoutAFace;
  }

  public OrsonAiTechTuneResponse framesWithoutAFace(Integer framesWithoutAFace) {
    this.framesWithoutAFace = framesWithoutAFace;
    return this;
  }

 /**
   * Get framesWithFaceOffscreen
   * @return framesWithFaceOffscreen
  **/
  @JsonProperty("framesWithFaceOffscreen")
  public Integer getFramesWithFaceOffscreen() {
    return framesWithFaceOffscreen;
  }

  public void setFramesWithFaceOffscreen(Integer framesWithFaceOffscreen) {
    this.framesWithFaceOffscreen = framesWithFaceOffscreen;
  }

  public OrsonAiTechTuneResponse framesWithFaceOffscreen(Integer framesWithFaceOffscreen) {
    this.framesWithFaceOffscreen = framesWithFaceOffscreen;
    return this;
  }

 /**
   * Get framesWithWrongNumberOfPeople
   * @return framesWithWrongNumberOfPeople
  **/
  @JsonProperty("framesWithWrongNumberOfPeople")
  public Integer getFramesWithWrongNumberOfPeople() {
    return framesWithWrongNumberOfPeople;
  }

  public void setFramesWithWrongNumberOfPeople(Integer framesWithWrongNumberOfPeople) {
    this.framesWithWrongNumberOfPeople = framesWithWrongNumberOfPeople;
  }

  public OrsonAiTechTuneResponse framesWithWrongNumberOfPeople(Integer framesWithWrongNumberOfPeople) {
    this.framesWithWrongNumberOfPeople = framesWithWrongNumberOfPeople;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public OrsonAiTechTuneResponse height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Get width
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public OrsonAiTechTuneResponse width(Integer width) {
    this.width = width;
    return this;
  }

 /**
   * Get fps
   * @return fps
  **/
  @JsonProperty("fps")
  public Integer getFps() {
    return fps;
  }

  public void setFps(Integer fps) {
    this.fps = fps;
  }

  public OrsonAiTechTuneResponse fps(Integer fps) {
    this.fps = fps;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

