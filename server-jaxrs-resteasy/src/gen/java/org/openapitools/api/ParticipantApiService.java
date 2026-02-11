package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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
public interface ParticipantApiService {
      Response processAllParticipants(Long accountId,String appKey,Boolean useShortNameAsID,SecurityContext securityContext)
      throws NotFoundException;
      Response processParticipants(Long accountId,String league,String appKey,Boolean useShortNameAsID,File _file,SecurityContext securityContext)
      throws NotFoundException;


}
