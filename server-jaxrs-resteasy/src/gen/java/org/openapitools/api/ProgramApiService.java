package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Program;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ProgramApiService {
      Response createProgram(Program body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteProgram(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getProgram(Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response postProgram(Long id,Program body,SecurityContext securityContext)
      throws NotFoundException;
      Response putProgram(Long id,Program body,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPrograms(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,SecurityContext securityContext)
      throws NotFoundException;


}
