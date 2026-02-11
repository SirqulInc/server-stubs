package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CsvImportResponse;
import java.io.File;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface CsvimportApiService {
      Response getStatusCSV(Long accountId,Long batchId,String responseGroup,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response listStatusCSV(Long accountId,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response statusCSV(Long accountId,Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadCSV(Long accountId,String uploadType,File importFile,String fileFormat,String appKey,SecurityContext securityContext)
      throws NotFoundException;


}
