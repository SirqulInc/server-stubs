package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BlobFile  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  private String folderUri;

  @ApiModelProperty(value = "")

  private String fileName;

  @ApiModelProperty(value = "")

  private List<byte[]> _file = new ArrayList<>();
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

  public BlobFile id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public BlobFile active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public BlobFile valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public BlobFile owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public BlobFile application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get folderUri
   * @return folderUri
  **/
  @JsonProperty("folderUri")
  public String getFolderUri() {
    return folderUri;
  }

  public void setFolderUri(String folderUri) {
    this.folderUri = folderUri;
  }

  public BlobFile folderUri(String folderUri) {
    this.folderUri = folderUri;
    return this;
  }

 /**
   * Get fileName
   * @return fileName
  **/
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public BlobFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

 /**
   * Get _file
   * @return _file
  **/
  @JsonProperty("file")
  public List<byte[]> getFile() {
    return _file;
  }

  public void setFile(List<byte[]> _file) {
    this._file = _file;
  }

  public BlobFile _file(List<byte[]> _file) {
    this._file = _file;
    return this;
  }

  public BlobFile addFileItem(byte[] _fileItem) {
    this._file.add(_fileItem);
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
    BlobFile blobFile = (BlobFile) o;
    return Objects.equals(this.id, blobFile.id) &&
        Objects.equals(this.active, blobFile.active) &&
        Objects.equals(this.valid, blobFile.valid) &&
        Objects.equals(this.owner, blobFile.owner) &&
        Objects.equals(this.application, blobFile.application) &&
        Objects.equals(this.folderUri, blobFile.folderUri) &&
        Objects.equals(this.fileName, blobFile.fileName) &&
        Objects.equals(this._file, blobFile._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, application, folderUri, fileName, _file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlobFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

