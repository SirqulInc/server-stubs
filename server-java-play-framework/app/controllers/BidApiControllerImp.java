package controllers;

import apimodels.BidResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BidApiControllerImp extends BidApiControllerImpInterface {
    @Override
    public BidResponse createBid(Http.Request request, @NotNull String biddableType, @NotNull Long biddableId, @NotNull Double amountPerView, @NotNull Double amountPerAction, @NotNull Double budgetAmount, @NotNull String budgetSchedule, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new BidResponse();
    }

    @Override
    public SirqulResponse deleteBid(Http.Request request, @NotNull Long bidId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public BidResponse getBid(Http.Request request, @NotNull Long bidId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new BidResponse();
    }

    @Override
    public BidResponse updateBid(Http.Request request, @NotNull Long bidId, String deviceId, Long accountId, Double amountPerView, Double amountPerAction, Double budgetAmount, String budgetSchedule) throws Exception {
        //Do your magic!!!
        return new BidResponse();
    }

}
