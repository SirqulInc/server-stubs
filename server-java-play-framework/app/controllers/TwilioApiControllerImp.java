package controllers;

import java.math.BigDecimal;
import apimodels.TwiMLResponse;

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
public class TwilioApiControllerImp extends TwilioApiControllerImpInterface {
    @Override
    public TwiMLResponse smsBuyOffer(Http.Request request, BigDecimal version, String appKey, @NotNull String body, @NotNull String from, @NotNull String currencyType) throws Exception {
        //Do your magic!!!
        return new TwiMLResponse();
    }

}
