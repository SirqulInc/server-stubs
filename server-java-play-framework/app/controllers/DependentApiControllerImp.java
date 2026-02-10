package controllers;

import apimodels.Account;
import java.math.BigDecimal;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DependentApiControllerImp extends DependentApiControllerImpInterface {
    @Override
    public SirqulResponse create(Http.Request request, BigDecimal version, Long accountId, Account body) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse getDependents(Http.Request request, BigDecimal version, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public void removeDependent(Http.Request request, BigDecimal version, Long accountId, Long dependentId) throws Exception {
        //Do your magic!!!
    }

}
