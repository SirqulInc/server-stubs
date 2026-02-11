package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.PreviewPersonaResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface PersonaApiService {
      Response createPersona(Long accountId,String title,String previewAccounts,Long date,Integer age,String gender,String gameExperienceLevel,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePersona(Long accountId,Long personaId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPersonaList(Long accountId,Long personaId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPersona(Long accountId,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePersona(Long accountId,Long personaId,String title,String previewAccounts,Boolean active,Long date,Integer age,String gender,String gameExperienceLevel,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;


}
