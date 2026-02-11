package org.openapitools.api;

import org.openapitools.api.PurchaseApiService;
import org.openapitools.api.factories.PurchaseApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/purchase")


@io.swagger.annotations.Api(description = "the purchase API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseApi  {
   private final PurchaseApiService delegate;

   public PurchaseApi(@Context ServletConfig servletContext) {
      PurchaseApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PurchaseApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PurchaseApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = PurchaseApiServiceFactory.getPurchaseApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Purchase", notes = "Creates a purchase item for in app purchases", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class)
    })
    public Response createPurchaseItem(@ApiParam(value = "The application key that the purchase can be used in", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the purchase item", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The purchase provider <ul> <li>SIRQUL - the Sirqul store to make purchases using tickets</li> <li>IOS - the iTunes store for iPhone, iPod, iPod Touch</li> <li>GOOGLE - the Google Play store</li> <li>AMAZON - the Amazon Android store</li> <li>MAC - the iTunes store for OSX</li> <li>WP8 - the Windows Phone 8 store</li> <li>FREE - used for purchase items that are free (can be used for development/testing purposes)</li> </ul>", required = true, allowableValues="SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE") @QueryParam("purchaseType") @NotNull  String purchaseType,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The description of the purchase item") @QueryParam("description")  String description,@ApiParam(value = "How much the purchase item is worth in tickets") @QueryParam("tickets")  Integer tickets,@ApiParam(value = "How much the purchase item will cost in real money") @QueryParam("price")  Float price,@ApiParam(value = "The unique identifier used by purchase providers to identify in-app-purchases") @QueryParam("purchaseCode")  String purchaseCode,@ApiParam(value = "A secret key from purchase providers that would be used for validation") @QueryParam("secretKey")  String secretKey,@ApiParam(value = "How many times a user acquire the same purchase item", defaultValue = "0") @DefaultValue("0") @QueryParam("purchaseLimit")  Integer purchaseLimit,@ApiParam(value = "Determines whether the purchase item will enable certain features <ul> <li>DAY_PREMIUM - subscribes a user for a day of membership</li> <li>WEEK_PREMIUM - subscribes a user for a week of membership</li> <li>MONTH_PREMIUM - subscribes a user for a month of membership</li> <li>ADD_TICKET - allows a user to add more tickets to their account</li> <li>ADD_GIFT - allows a user to send/recieve the purchase item as a gift</li> </ul>", allowableValues="DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS") @QueryParam("serviceAction")  String serviceAction,@ApiParam(value = "The cover image of the purchase item") @QueryParam("coverAssetId")  Long coverAssetId,@ApiParam(value = "An application specific asset that can be used to store/provide additional data") @QueryParam("promoAssetId")  Long promoAssetId,@ApiParam(value = "Determines whether the purchase item can be gifted to other users") @QueryParam("giftable")  Boolean giftable,@ApiParam(value = "Determines whether users can attach their own media/asset to the purchase item") @QueryParam("assetable")  Boolean assetable,@ApiParam(value = "Flag to indicate owner should receive tickets for completed missions", defaultValue = "false") @DefaultValue("false") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@ApiParam(value = "The offer location that will get added to the user's wallet after purchase.") @QueryParam("offerLocationId")  Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPurchaseItem(appKey, name, purchaseType, deviceId, accountId, description, tickets, price, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, allocateTickets, ticketType, points, offerLocationId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Purchase", notes = "Marks the purchase item as deleted", response = SirqulResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deletePurchaseItem(@ApiParam(value = "The purchase item id", required = true) @QueryParam("purchaseItemId") @NotNull  Long purchaseItemId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePurchaseItem(purchaseItemId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Purchase", notes = "Get detailed information about a purchase item", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class)
    })
    public Response getPurchaseItem(@ApiParam(value = "The purchase item id", required = true) @QueryParam("purchaseItemId") @NotNull  Long purchaseItemId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPurchaseItem(purchaseItemId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/gift")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Gift Tickets", notes = "Gift tickets to another user.", response = SirqulResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response giftPurchase(@ApiParam(value = "the id of the account receiving the tickets", required = true) @QueryParam("receiverAccountId") @NotNull  Long receiverAccountId,@ApiParam(value = "the id of the tickets", required = true) @QueryParam("ticketId") @NotNull  Long ticketId,@ApiParam(value = "the id of the device") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the id of the gift owner") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the id of the asset") @QueryParam("assetId")  Long assetId,@ApiParam(value = "a message that can be written to go along with the gift") @QueryParam("customMessage")  String customMessage,@ApiParam(value = "the type of game associated with the tickets") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.giftPurchase(receiverAccountId, ticketId, deviceId, accountId, assetId, customMessage, gameType, appKey, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Purchases", notes = "Search for purchasable items from the system", response = PurchaseItemResponse.class, responseContainer = "List", tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemResponse.class, responseContainer = "List")
    })
    public Response searchPurchaseItems(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application key to filter results by application") @QueryParam("appKey")  String appKey,@ApiParam(value = "Determines whether to filter results by the user's billable entity", defaultValue = "false") @DefaultValue("false") @QueryParam("filterByBillable")  Boolean filterByBillable,@ApiParam(value = "A comma separated list of purchase providers to filter by. Possible values include: <ul> <li>SIRQUL - purchases from the Sirqul store using tickets</li> <li>IOS - purchases from the iTunes store for iPhone, iPod, iPod Touch</li> <li>GOOGLE - purchases from the Google Play store</li> <li>AMAZON - purchases from the Amazon Android store</li> <li>MAC - purchases from the iTunes store for OSX</li> <li>WP8 - purchases from the Windows Phone 8 store</li> <li>FREE - purchases that are free (can be used for development/testing purposes)</li> </ul>") @QueryParam("purchaseType")  String purchaseType,@ApiParam(value = "A comma separated list of service actions to filter results by. Possible values include: <ul> <li>DAY_PREMIUM - purchases that subscribes a user for a day of membership</li> <li>WEEK_PREMIUM - purchases that subscribes a user for a week of membership</li> <li>MONTH_PREMIUM - purchases that subscribes a user for a month of membership</li> <li>ADD_TICKET - purchases that allow users to add more tickets</li> <li>ADD_GIFT - purchases that allow users to recieve gifts</li> </ul>") @QueryParam("serviceAction")  String serviceAction,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, TICKETS, PRICE, PURCHASE_TYPE, PURCHASE_CODE, PURCHASE_LIMIT, SERIVCE_ACTION, GIFTABLE, ASSETABLE, APPLICATION_ID, APPLICATION_NAME", defaultValue = "NAME") @DefaultValue("NAME") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The record to begin the return set on", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Return only active results", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPurchaseItems(deviceId, accountId, appKey, filterByBillable, purchaseType, serviceAction, keyword, sortField, descending, start, limit, activeOnly, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Purchase", notes = "Updates a purchase item for in app purchases", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class)
    })
    public Response updatePurchaseItem(@ApiParam(value = "The purchase item id", required = true) @QueryParam("purchaseItemId") @NotNull  Long purchaseItemId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The name of the purchase item") @QueryParam("name")  String name,@ApiParam(value = "The description of the purchase item") @QueryParam("description")  String description,@ApiParam(value = "How much the purchase item is worth in tickets") @QueryParam("tickets")  Integer tickets,@ApiParam(value = "How much the purchase item will cost in real money") @QueryParam("price")  Float price,@ApiParam(value = "The purchase provider <ul> <li>SIRQUL - the Sirqul store to make purchases using tickets</li> <li>IOS - the iTunes store for iPhone, iPod, iPod Touch</li> <li>GOOGLE - the Google Play store</li> <li>AMAZON - the Amazon Android store</li> <li>MAC - the iTunes store for OSX</li> <li>WP8 - the Windows Phone 8 store</li> <li>FREE - used for purchase items that are free (can be used for development/testing purposes)</li> </ul>", allowableValues="SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE") @QueryParam("purchaseType")  String purchaseType,@ApiParam(value = "The unique identifier used by purchase providers to identify in-app-purchases") @QueryParam("purchaseCode")  String purchaseCode,@ApiParam(value = "A secret key from purchase providers that would be used for validation") @QueryParam("secretKey")  String secretKey,@ApiParam(value = "How many times a user acquire the same purchase item") @QueryParam("purchaseLimit")  Integer purchaseLimit,@ApiParam(value = "Determines whether the purchase item will enable certain features <ul> <li>DAY_PREMIUM - subscribes a user for a day of membership</li> <li>WEEK_PREMIUM - subscribes a user for a week of membership</li> <li>MONTH_PREMIUM - subscribes a user for a month of membership</li> <li>ADD_TICKET - allows a user to add more tickets to their account</li> <li>ADD_GIFT - allows a user to send/recieve the purchase item as a gift</li> </ul>", allowableValues="DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS") @QueryParam("serviceAction")  String serviceAction,@ApiParam(value = "The cover image of the purchase item") @QueryParam("coverAssetId")  Long coverAssetId,@ApiParam(value = "An application specific asset that can be used to store/provide additional data") @QueryParam("promoAssetId")  Long promoAssetId,@ApiParam(value = "Determines whether the purchase item can be gifted to other users") @QueryParam("giftable")  Boolean giftable,@ApiParam(value = "Determines whether users can attach their own media/asset to the purchase item") @QueryParam("assetable")  Boolean assetable,@ApiParam(value = "Sets whether the purchase item is active or inactive (hidden from consumers)") @QueryParam("active")  Boolean active,@ApiParam(value = "Flag to indicate owner should receive tickets for completed missions", defaultValue = "false") @DefaultValue("false") @QueryParam("allocateTickets")  Boolean allocateTickets,@ApiParam(value = "The type of ticket to reward, null means default type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "The number of points to award for completing a mission") @QueryParam("points")  Long points,@ApiParam(value = "The offer location that will get added to the user's wallet after purchase.") @QueryParam("offerLocationId")  Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updatePurchaseItem(purchaseItemId, deviceId, accountId, name, description, tickets, price, purchaseType, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, active, allocateTickets, ticketType, points, offerLocationId, securityContext);
    }
}
