package controllers;

import java.math.BigDecimal;
import apimodels.PackResponse;
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
public class PackApiControllerImp extends PackApiControllerImpInterface {
    @Override
    public PackResponse createPack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, @NotNull Long packOrder, @NotNull Integer price, @NotNull Boolean highest, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, String priceType, String gameLevelIds, Boolean inGame, String ticketType, Long points) throws Exception {
        //Do your magic!!!
        return new PackResponse();
    }

    @Override
    public SirqulResponse deletePack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public PackResponse getPack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean includeGameData) throws Exception {
        //Do your magic!!!
        return new PackResponse();
    }

    @Override
    public List<PackResponse> searchPacks(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, String keyword, String packType, Integer start, Integer limit, Boolean includeGameData, Boolean includeInactive, String appKey) throws Exception {
        //Do your magic!!!
        return new ArrayList<PackResponse>();
    }

    @Override
    public PackResponse updatePack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String title, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, Long packOrder, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, Integer price, String priceType, String gameLevelIds, Boolean inGame, Boolean highest, String ticketType, Long points) throws Exception {
        //Do your magic!!!
        return new PackResponse();
    }

}
