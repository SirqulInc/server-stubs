package controllers;

import apimodels.AccountLoginResponse;
import apimodels.AssetListResponse;
import java.math.BigDecimal;
import apimodels.ProfileInfoResponse;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.UserLocationSearchResponse;
import apimodels.UserSettingsResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountApiController extends Controller {
    private final AccountApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AccountApiController(Config configuration, AccountApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result accountLocationSearch(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuerange = request.getQueryString("range");
        Double range;
        if (valuerange != null) {
            range = Double.parseDouble(valuerange);
        } else {
            range = 10;
        }
        String valuelocationLastUpdated = request.getQueryString("locationLastUpdated");
        Long locationLastUpdated;
        if (valuelocationLastUpdated != null) {
            locationLastUpdated = Long.parseLong(valuelocationLastUpdated);
        } else {
            locationLastUpdated = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valueminAge = request.getQueryString("minAge");
        Integer minAge;
        if (valueminAge != null) {
            minAge = Integer.parseInt(valueminAge);
        } else {
            minAge = null;
        }
        String valuemaxAge = request.getQueryString("maxAge");
        Integer maxAge;
        if (valuemaxAge != null) {
            maxAge = Integer.parseInt(valuemaxAge);
        } else {
            maxAge = null;
        }
        String valuecompanionshipIndex = request.getQueryString("companionshipIndex");
        Integer companionshipIndex;
        if (valuecompanionshipIndex != null) {
            companionshipIndex = Integer.parseInt(valuecompanionshipIndex);
        } else {
            companionshipIndex = null;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        String valuesearchMode = request.getQueryString("searchMode");
        String searchMode;
        if (valuesearchMode != null) {
            searchMode = valuesearchMode;
        } else {
            searchMode = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        String valueroles = request.getQueryString("roles");
        String roles;
        if (valueroles != null) {
            roles = valueroles;
        } else {
            roles = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueexperience = request.getQueryString("experience");
        String experience;
        if (valueexperience != null) {
            experience = valueexperience;
        } else {
            experience = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valueaudienceIds = request.getQueryString("audienceIds");
        String audienceIds;
        if (valueaudienceIds != null) {
            audienceIds = valueaudienceIds;
        } else {
            audienceIds = null;
        }
        String valueaudienceOperator = request.getQueryString("audienceOperator");
        String audienceOperator;
        if (valueaudienceOperator != null) {
            audienceOperator = valueaudienceOperator;
        } else {
            audienceOperator = "AND";
        }
        String valueupdateCurrentLocation = request.getQueryString("updateCurrentLocation");
        Boolean updateCurrentLocation;
        if (valueupdateCurrentLocation != null) {
            updateCurrentLocation = Boolean.valueOf(valueupdateCurrentLocation);
        } else {
            updateCurrentLocation = false;
        }
        String valueupdatePreferredSettings = request.getQueryString("updatePreferredSettings");
        Boolean updatePreferredSettings;
        if (valueupdatePreferredSettings != null) {
            updatePreferredSettings = Boolean.valueOf(valueupdatePreferredSettings);
        } else {
            updatePreferredSettings = false;
        }
        String valueshowExactLocations = request.getQueryString("showExactLocations");
        Boolean showExactLocations;
        if (valueshowExactLocations != null) {
            showExactLocations = Boolean.valueOf(valueshowExactLocations);
        } else {
            showExactLocations = true;
        }
        String valueshowConnectionToSearcher = request.getQueryString("showConnectionToSearcher");
        Boolean showConnectionToSearcher;
        if (valueshowConnectionToSearcher != null) {
            showConnectionToSearcher = Boolean.valueOf(valueshowConnectionToSearcher);
        } else {
            showConnectionToSearcher = false;
        }
        String valueflagCountMinimum = request.getQueryString("flagCountMinimum");
        Long flagCountMinimum;
        if (valueflagCountMinimum != null) {
            flagCountMinimum = Long.parseLong(valueflagCountMinimum);
        } else {
            flagCountMinimum = null;
        }
        String valueverifiedUserOnly = request.getQueryString("verifiedUserOnly");
        Boolean verifiedUserOnly;
        if (valueverifiedUserOnly != null) {
            verifiedUserOnly = Boolean.valueOf(valueverifiedUserOnly);
        } else {
            verifiedUserOnly = null;
        }
        String valuecontentAdminOnly = request.getQueryString("contentAdminOnly");
        Boolean contentAdminOnly;
        if (valuecontentAdminOnly != null) {
            contentAdminOnly = Boolean.valueOf(valuecontentAdminOnly);
        } else {
            contentAdminOnly = null;
        }
        return imp.accountLocationSearchHttp(request, version, deviceId, accountId, q, keyword, postalCode, latitude, longitude, appKey, range, locationLastUpdated, gender, minAge, maxAge, companionshipIndex, i, start, l, limit, searchMode, sortField, descending, roles, tags, experience, categoryIds, audienceIds, audienceOperator, updateCurrentLocation, updatePreferredSettings, showExactLocations, showConnectionToSearcher, flagCountMinimum, verifiedUserOnly, contentAdminOnly);
    }

    @ApiAction
    public Result blockAccount(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueaccountIdBeingBlocked = request.getQueryString("accountIdBeingBlocked");
        Long accountIdBeingBlocked;
        if (valueaccountIdBeingBlocked != null) {
            accountIdBeingBlocked = Long.parseLong(valueaccountIdBeingBlocked);
        } else {
            throw new IllegalArgumentException("'accountIdBeingBlocked' parameter is required");
        }
        String valueblockFlagValue = request.getQueryString("blockFlagValue");
        Boolean blockFlagValue;
        if (valueblockFlagValue != null) {
            blockFlagValue = Boolean.valueOf(valueblockFlagValue);
        } else {
            blockFlagValue = true;
        }
        String valueremoveFromGroupsIfBlocked = request.getQueryString("removeFromGroupsIfBlocked");
        Boolean removeFromGroupsIfBlocked;
        if (valueremoveFromGroupsIfBlocked != null) {
            removeFromGroupsIfBlocked = Boolean.valueOf(valueremoveFromGroupsIfBlocked);
        } else {
            removeFromGroupsIfBlocked = false;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.blockAccountHttp(request, version, accountIdBeingBlocked, deviceId, accountId, blockFlagValue, removeFromGroupsIfBlocked, latitude, longitude);
    }

    @ApiAction
    public Result createAccount(Http.Request request, BigDecimal version) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valueprefixName = request.getQueryString("prefixName");
        String prefixName;
        if (valueprefixName != null) {
            prefixName = valueprefixName;
        } else {
            prefixName = null;
        }
        String valuefirstName = request.getQueryString("firstName");
        String firstName;
        if (valuefirstName != null) {
            firstName = valuefirstName;
        } else {
            firstName = null;
        }
        String valuemiddleName = request.getQueryString("middleName");
        String middleName;
        if (valuemiddleName != null) {
            middleName = valuemiddleName;
        } else {
            middleName = null;
        }
        String valuelastName = request.getQueryString("lastName");
        String lastName;
        if (valuelastName != null) {
            lastName = valuelastName;
        } else {
            lastName = null;
        }
        String valuesuffixName = request.getQueryString("suffixName");
        String suffixName;
        if (valuesuffixName != null) {
            suffixName = valuesuffixName;
        } else {
            suffixName = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valuedeviceIdType = request.getQueryString("deviceIdType");
        String deviceIdType;
        if (valuedeviceIdType != null) {
            deviceIdType = valuedeviceIdType;
        } else {
            deviceIdType = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valueemailAddress = request.getQueryString("emailAddress");
        String emailAddress;
        if (valueemailAddress != null) {
            emailAddress = valueemailAddress;
        } else {
            emailAddress = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuezipcode = request.getQueryString("zipcode");
        String zipcode;
        if (valuezipcode != null) {
            zipcode = valuezipcode;
        } else {
            zipcode = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valuebirthday = request.getQueryString("birthday");
        Long birthday;
        if (valuebirthday != null) {
            birthday = Long.parseLong(valuebirthday);
        } else {
            birthday = null;
        }
        String valuehomePhone = request.getQueryString("homePhone");
        String homePhone;
        if (valuehomePhone != null) {
            homePhone = valuehomePhone;
        } else {
            homePhone = null;
        }
        String valuecellPhone = request.getQueryString("cellPhone");
        String cellPhone;
        if (valuecellPhone != null) {
            cellPhone = valuecellPhone;
        } else {
            cellPhone = null;
        }
        String valuecellPhoneCarrier = request.getQueryString("cellPhoneCarrier");
        String cellPhoneCarrier;
        if (valuecellPhoneCarrier != null) {
            cellPhoneCarrier = valuecellPhoneCarrier;
        } else {
            cellPhoneCarrier = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        String valueplatforms = request.getQueryString("platforms");
        String platforms;
        if (valueplatforms != null) {
            platforms = valueplatforms;
        } else {
            platforms = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueaboutUs = request.getQueryString("aboutUs");
        String aboutUs;
        if (valueaboutUs != null) {
            aboutUs = valueaboutUs;
        } else {
            aboutUs = null;
        }
        String valuegameExperience = request.getQueryString("gameExperience");
        String gameExperience;
        if (valuegameExperience != null) {
            gameExperience = valuegameExperience;
        } else {
            gameExperience = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuehometown = request.getQueryString("hometown");
        String hometown;
        if (valuehometown != null) {
            hometown = valuehometown;
        } else {
            hometown = null;
        }
        String valueheight = request.getQueryString("height");
        String height;
        if (valueheight != null) {
            height = valueheight;
        } else {
            height = null;
        }
        String valueheightIndex = request.getQueryString("heightIndex");
        Integer heightIndex;
        if (valueheightIndex != null) {
            heightIndex = Integer.parseInt(valueheightIndex);
        } else {
            heightIndex = null;
        }
        String valueethnicity = request.getQueryString("ethnicity");
        String ethnicity;
        if (valueethnicity != null) {
            ethnicity = valueethnicity;
        } else {
            ethnicity = null;
        }
        String valuebodyType = request.getQueryString("bodyType");
        String bodyType;
        if (valuebodyType != null) {
            bodyType = valuebodyType;
        } else {
            bodyType = null;
        }
        String valuemaritalStatus = request.getQueryString("maritalStatus");
        String maritalStatus;
        if (valuemaritalStatus != null) {
            maritalStatus = valuemaritalStatus;
        } else {
            maritalStatus = null;
        }
        String valuechildren = request.getQueryString("children");
        String children;
        if (valuechildren != null) {
            children = valuechildren;
        } else {
            children = null;
        }
        String valuereligion = request.getQueryString("religion");
        String religion;
        if (valuereligion != null) {
            religion = valuereligion;
        } else {
            religion = null;
        }
        String valueeducation = request.getQueryString("education");
        String education;
        if (valueeducation != null) {
            education = valueeducation;
        } else {
            education = null;
        }
        String valueeducationIndex = request.getQueryString("educationIndex");
        Integer educationIndex;
        if (valueeducationIndex != null) {
            educationIndex = Integer.parseInt(valueeducationIndex);
        } else {
            educationIndex = null;
        }
        String valuesmoke = request.getQueryString("smoke");
        String smoke;
        if (valuesmoke != null) {
            smoke = valuesmoke;
        } else {
            smoke = null;
        }
        String valuedrink = request.getQueryString("drink");
        String drink;
        if (valuedrink != null) {
            drink = valuedrink;
        } else {
            drink = null;
        }
        String valuecompanionship = request.getQueryString("companionship");
        String companionship;
        if (valuecompanionship != null) {
            companionship = valuecompanionship;
        } else {
            companionship = null;
        }
        String valuecompanionshipIndex = request.getQueryString("companionshipIndex");
        Integer companionshipIndex;
        if (valuecompanionshipIndex != null) {
            companionshipIndex = Integer.parseInt(valuecompanionshipIndex);
        } else {
            companionshipIndex = null;
        }
        String valuepreferredMinAge = request.getQueryString("preferredMinAge");
        Integer preferredMinAge;
        if (valuepreferredMinAge != null) {
            preferredMinAge = Integer.parseInt(valuepreferredMinAge);
        } else {
            preferredMinAge = null;
        }
        String valuepreferredMaxAge = request.getQueryString("preferredMaxAge");
        Integer preferredMaxAge;
        if (valuepreferredMaxAge != null) {
            preferredMaxAge = Integer.parseInt(valuepreferredMaxAge);
        } else {
            preferredMaxAge = null;
        }
        String valuepreferredMinHeight = request.getQueryString("preferredMinHeight");
        Integer preferredMinHeight;
        if (valuepreferredMinHeight != null) {
            preferredMinHeight = Integer.parseInt(valuepreferredMinHeight);
        } else {
            preferredMinHeight = null;
        }
        String valuepreferredMaxHeight = request.getQueryString("preferredMaxHeight");
        Integer preferredMaxHeight;
        if (valuepreferredMaxHeight != null) {
            preferredMaxHeight = Integer.parseInt(valuepreferredMaxHeight);
        } else {
            preferredMaxHeight = null;
        }
        String valuepreferredGender = request.getQueryString("preferredGender");
        String preferredGender;
        if (valuepreferredGender != null) {
            preferredGender = valuepreferredGender;
        } else {
            preferredGender = null;
        }
        String valuepreferredEducation = request.getQueryString("preferredEducation");
        String preferredEducation;
        if (valuepreferredEducation != null) {
            preferredEducation = valuepreferredEducation;
        } else {
            preferredEducation = null;
        }
        String valuepreferredEducationIndex = request.getQueryString("preferredEducationIndex");
        Integer preferredEducationIndex;
        if (valuepreferredEducationIndex != null) {
            preferredEducationIndex = Integer.parseInt(valuepreferredEducationIndex);
        } else {
            preferredEducationIndex = null;
        }
        String valuepreferredBodyType = request.getQueryString("preferredBodyType");
        String preferredBodyType;
        if (valuepreferredBodyType != null) {
            preferredBodyType = valuepreferredBodyType;
        } else {
            preferredBodyType = null;
        }
        String valuepreferredEthnicity = request.getQueryString("preferredEthnicity");
        String preferredEthnicity;
        if (valuepreferredEthnicity != null) {
            preferredEthnicity = valuepreferredEthnicity;
        } else {
            preferredEthnicity = null;
        }
        String valuepreferredLocation = request.getQueryString("preferredLocation");
        String preferredLocation;
        if (valuepreferredLocation != null) {
            preferredLocation = valuepreferredLocation;
        } else {
            preferredLocation = null;
        }
        String valuepreferredLocationRange = request.getQueryString("preferredLocationRange");
        Double preferredLocationRange;
        if (valuepreferredLocationRange != null) {
            preferredLocationRange = Double.parseDouble(valuepreferredLocationRange);
        } else {
            preferredLocationRange = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueacceptedTerms = request.getQueryString("acceptedTerms");
        Boolean acceptedTerms;
        if (valueacceptedTerms != null) {
            acceptedTerms = Boolean.valueOf(valueacceptedTerms);
        } else {
            acceptedTerms = null;
        }
        String valueinviteToken = request.getQueryString("inviteToken");
        String inviteToken;
        if (valueinviteToken != null) {
            inviteToken = valueinviteToken;
        } else {
            inviteToken = null;
        }
        String valuereferralAccountId = request.getQueryString("referralAccountId");
        Long referralAccountId;
        if (valuereferralAccountId != null) {
            referralAccountId = Long.parseLong(valuereferralAccountId);
        } else {
            referralAccountId = null;
        }
        String valuesendValidation = request.getQueryString("sendValidation");
        Boolean sendValidation;
        if (valuesendValidation != null) {
            sendValidation = Boolean.valueOf(valuesendValidation);
        } else {
            sendValidation = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueresponseType = request.getQueryString("responseType");
        String responseType;
        if (valueresponseType != null) {
            responseType = valueresponseType;
        } else {
            responseType = null;
        }
        String valueaudienceIdsToAdd = request.getQueryString("audienceIdsToAdd");
        String audienceIdsToAdd;
        if (valueaudienceIdsToAdd != null) {
            audienceIdsToAdd = valueaudienceIdsToAdd;
        } else {
            audienceIdsToAdd = null;
        }
        String valueappBlob = request.getQueryString("appBlob");
        String appBlob;
        if (valueappBlob != null) {
            appBlob = valueappBlob;
        } else {
            appBlob = null;
        }
        String valueappEnablePush = request.getQueryString("appEnablePush");
        Boolean appEnablePush;
        if (valueappEnablePush != null) {
            appEnablePush = Boolean.valueOf(valueappEnablePush);
        } else {
            appEnablePush = null;
        }
        String valueappEnableSMS = request.getQueryString("appEnableSMS");
        Boolean appEnableSMS;
        if (valueappEnableSMS != null) {
            appEnableSMS = Boolean.valueOf(valueappEnableSMS);
        } else {
            appEnableSMS = null;
        }
        String valueappEnableEmail = request.getQueryString("appEnableEmail");
        Boolean appEnableEmail;
        if (valueappEnableEmail != null) {
            appEnableEmail = Boolean.valueOf(valueappEnableEmail);
        } else {
            appEnableEmail = null;
        }
        String valuelocationVisibility = request.getQueryString("locationVisibility");
        String locationVisibility;
        if (valuelocationVisibility != null) {
            locationVisibility = valuelocationVisibility;
        } else {
            locationVisibility = null;
        }
        String valuehomeLatitude = request.getQueryString("homeLatitude");
        Double homeLatitude;
        if (valuehomeLatitude != null) {
            homeLatitude = Double.parseDouble(valuehomeLatitude);
        } else {
            homeLatitude = null;
        }
        String valuehomeLongitude = request.getQueryString("homeLongitude");
        Double homeLongitude;
        if (valuehomeLongitude != null) {
            homeLongitude = Double.parseDouble(valuehomeLongitude);
        } else {
            homeLongitude = null;
        }
        String valueappNickname = request.getQueryString("appNickname");
        String appNickname;
        if (valueappNickname != null) {
            appNickname = valueappNickname;
        } else {
            appNickname = null;
        }
        String valuepersonalAudienceId = request.getQueryString("personalAudienceId");
        Long personalAudienceId;
        if (valuepersonalAudienceId != null) {
            personalAudienceId = Long.parseLong(valuepersonalAudienceId);
        } else {
            personalAudienceId = null;
        }
        return imp.createAccountHttp(request, version, username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, deviceId, deviceIdType, emailAddress, assetId, streetAddress, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, inviteToken, referralAccountId, sendValidation, gameType, appKey, appVersion, responseType, audienceIdsToAdd, appBlob, appEnablePush, appEnableSMS, appEnableEmail, locationVisibility, homeLatitude, homeLongitude, appNickname, personalAudienceId);
    }

    @ApiAction
    public Result editAccount(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valueprefixName = request.getQueryString("prefixName");
        String prefixName;
        if (valueprefixName != null) {
            prefixName = valueprefixName;
        } else {
            prefixName = null;
        }
        String valuefirstName = request.getQueryString("firstName");
        String firstName;
        if (valuefirstName != null) {
            firstName = valuefirstName;
        } else {
            firstName = null;
        }
        String valuemiddleName = request.getQueryString("middleName");
        String middleName;
        if (valuemiddleName != null) {
            middleName = valuemiddleName;
        } else {
            middleName = null;
        }
        String valuelastName = request.getQueryString("lastName");
        String lastName;
        if (valuelastName != null) {
            lastName = valuelastName;
        } else {
            lastName = null;
        }
        String valuesuffixName = request.getQueryString("suffixName");
        String suffixName;
        if (valuesuffixName != null) {
            suffixName = valuesuffixName;
        } else {
            suffixName = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valueage = request.getQueryString("age");
        Integer age;
        if (valueage != null) {
            age = Integer.parseInt(valueage);
        } else {
            age = null;
        }
        String valuebirthday = request.getQueryString("birthday");
        Long birthday;
        if (valuebirthday != null) {
            birthday = Long.parseLong(valuebirthday);
        } else {
            birthday = null;
        }
        String valuehomePhone = request.getQueryString("homePhone");
        String homePhone;
        if (valuehomePhone != null) {
            homePhone = valuehomePhone;
        } else {
            homePhone = null;
        }
        String valuecellPhone = request.getQueryString("cellPhone");
        String cellPhone;
        if (valuecellPhone != null) {
            cellPhone = valuecellPhone;
        } else {
            cellPhone = null;
        }
        String valuecellPhoneCarrier = request.getQueryString("cellPhoneCarrier");
        String cellPhoneCarrier;
        if (valuecellPhoneCarrier != null) {
            cellPhoneCarrier = valuecellPhoneCarrier;
        } else {
            cellPhoneCarrier = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valueemailAddress = request.getQueryString("emailAddress");
        String emailAddress;
        if (valueemailAddress != null) {
            emailAddress = valueemailAddress;
        } else {
            emailAddress = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuezipcode = request.getQueryString("zipcode");
        String zipcode;
        if (valuezipcode != null) {
            zipcode = valuezipcode;
        } else {
            zipcode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuemakeProfileInfoPublic = request.getQueryString("makeProfileInfoPublic");
        Boolean makeProfileInfoPublic;
        if (valuemakeProfileInfoPublic != null) {
            makeProfileInfoPublic = Boolean.valueOf(valuemakeProfileInfoPublic);
        } else {
            makeProfileInfoPublic = null;
        }
        String valuemakeGameInfoPublic = request.getQueryString("makeGameInfoPublic");
        Boolean makeGameInfoPublic;
        if (valuemakeGameInfoPublic != null) {
            makeGameInfoPublic = Boolean.valueOf(valuemakeGameInfoPublic);
        } else {
            makeGameInfoPublic = null;
        }
        String valuemakeFriendsInfoPublic = request.getQueryString("makeFriendsInfoPublic");
        Boolean makeFriendsInfoPublic;
        if (valuemakeFriendsInfoPublic != null) {
            makeFriendsInfoPublic = Boolean.valueOf(valuemakeFriendsInfoPublic);
        } else {
            makeFriendsInfoPublic = null;
        }
        String valuehometown = request.getQueryString("hometown");
        String hometown;
        if (valuehometown != null) {
            hometown = valuehometown;
        } else {
            hometown = null;
        }
        String valueheight = request.getQueryString("height");
        String height;
        if (valueheight != null) {
            height = valueheight;
        } else {
            height = null;
        }
        String valueheightIndex = request.getQueryString("heightIndex");
        Integer heightIndex;
        if (valueheightIndex != null) {
            heightIndex = Integer.parseInt(valueheightIndex);
        } else {
            heightIndex = null;
        }
        String valueethnicity = request.getQueryString("ethnicity");
        String ethnicity;
        if (valueethnicity != null) {
            ethnicity = valueethnicity;
        } else {
            ethnicity = null;
        }
        String valuebodyType = request.getQueryString("bodyType");
        String bodyType;
        if (valuebodyType != null) {
            bodyType = valuebodyType;
        } else {
            bodyType = null;
        }
        String valuemaritalStatus = request.getQueryString("maritalStatus");
        String maritalStatus;
        if (valuemaritalStatus != null) {
            maritalStatus = valuemaritalStatus;
        } else {
            maritalStatus = null;
        }
        String valuechildren = request.getQueryString("children");
        String children;
        if (valuechildren != null) {
            children = valuechildren;
        } else {
            children = null;
        }
        String valuereligion = request.getQueryString("religion");
        String religion;
        if (valuereligion != null) {
            religion = valuereligion;
        } else {
            religion = null;
        }
        String valueeducation = request.getQueryString("education");
        String education;
        if (valueeducation != null) {
            education = valueeducation;
        } else {
            education = null;
        }
        String valueeducationIndex = request.getQueryString("educationIndex");
        Integer educationIndex;
        if (valueeducationIndex != null) {
            educationIndex = Integer.parseInt(valueeducationIndex);
        } else {
            educationIndex = null;
        }
        String valuesmoke = request.getQueryString("smoke");
        String smoke;
        if (valuesmoke != null) {
            smoke = valuesmoke;
        } else {
            smoke = null;
        }
        String valuedrink = request.getQueryString("drink");
        String drink;
        if (valuedrink != null) {
            drink = valuedrink;
        } else {
            drink = null;
        }
        String valuecompanionship = request.getQueryString("companionship");
        String companionship;
        if (valuecompanionship != null) {
            companionship = valuecompanionship;
        } else {
            companionship = null;
        }
        String valuecompanionshipIndex = request.getQueryString("companionshipIndex");
        Integer companionshipIndex;
        if (valuecompanionshipIndex != null) {
            companionshipIndex = Integer.parseInt(valuecompanionshipIndex);
        } else {
            companionshipIndex = null;
        }
        String valuepreferredMinAge = request.getQueryString("preferredMinAge");
        Integer preferredMinAge;
        if (valuepreferredMinAge != null) {
            preferredMinAge = Integer.parseInt(valuepreferredMinAge);
        } else {
            preferredMinAge = null;
        }
        String valuepreferredMaxAge = request.getQueryString("preferredMaxAge");
        Integer preferredMaxAge;
        if (valuepreferredMaxAge != null) {
            preferredMaxAge = Integer.parseInt(valuepreferredMaxAge);
        } else {
            preferredMaxAge = null;
        }
        String valuepreferredMinHeight = request.getQueryString("preferredMinHeight");
        Integer preferredMinHeight;
        if (valuepreferredMinHeight != null) {
            preferredMinHeight = Integer.parseInt(valuepreferredMinHeight);
        } else {
            preferredMinHeight = null;
        }
        String valuepreferredMaxHeight = request.getQueryString("preferredMaxHeight");
        Integer preferredMaxHeight;
        if (valuepreferredMaxHeight != null) {
            preferredMaxHeight = Integer.parseInt(valuepreferredMaxHeight);
        } else {
            preferredMaxHeight = null;
        }
        String valuepreferredGender = request.getQueryString("preferredGender");
        String preferredGender;
        if (valuepreferredGender != null) {
            preferredGender = valuepreferredGender;
        } else {
            preferredGender = null;
        }
        String valuepreferredEducation = request.getQueryString("preferredEducation");
        String preferredEducation;
        if (valuepreferredEducation != null) {
            preferredEducation = valuepreferredEducation;
        } else {
            preferredEducation = null;
        }
        String valuepreferredEducationIndex = request.getQueryString("preferredEducationIndex");
        Integer preferredEducationIndex;
        if (valuepreferredEducationIndex != null) {
            preferredEducationIndex = Integer.parseInt(valuepreferredEducationIndex);
        } else {
            preferredEducationIndex = null;
        }
        String valuepreferredBodyType = request.getQueryString("preferredBodyType");
        String preferredBodyType;
        if (valuepreferredBodyType != null) {
            preferredBodyType = valuepreferredBodyType;
        } else {
            preferredBodyType = null;
        }
        String valuepreferredEthnicity = request.getQueryString("preferredEthnicity");
        String preferredEthnicity;
        if (valuepreferredEthnicity != null) {
            preferredEthnicity = valuepreferredEthnicity;
        } else {
            preferredEthnicity = null;
        }
        String valuepreferredLocation = request.getQueryString("preferredLocation");
        String preferredLocation;
        if (valuepreferredLocation != null) {
            preferredLocation = valuepreferredLocation;
        } else {
            preferredLocation = null;
        }
        String valuepreferredLocationRange = request.getQueryString("preferredLocationRange");
        Double preferredLocationRange;
        if (valuepreferredLocationRange != null) {
            preferredLocationRange = Double.parseDouble(valuepreferredLocationRange);
        } else {
            preferredLocationRange = null;
        }
        String valueplatforms = request.getQueryString("platforms");
        String platforms;
        if (valueplatforms != null) {
            platforms = valueplatforms;
        } else {
            platforms = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueaboutUs = request.getQueryString("aboutUs");
        String aboutUs;
        if (valueaboutUs != null) {
            aboutUs = valueaboutUs;
        } else {
            aboutUs = null;
        }
        String valuematchToken = request.getQueryString("matchToken");
        String matchToken;
        if (valuematchToken != null) {
            matchToken = valuematchToken;
        } else {
            matchToken = null;
        }
        String valuegameExperience = request.getQueryString("gameExperience");
        String gameExperience;
        if (valuegameExperience != null) {
            gameExperience = valuegameExperience;
        } else {
            gameExperience = null;
        }
        String valuecategories = request.getQueryString("categories");
        String categories;
        if (valuecategories != null) {
            categories = valuecategories;
        } else {
            categories = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = "PROFILE,PROFILE_CONTACT";
        }
        String valueshowAsZipcode = request.getQueryString("showAsZipcode");
        Boolean showAsZipcode;
        if (valueshowAsZipcode != null) {
            showAsZipcode = Boolean.valueOf(valueshowAsZipcode);
        } else {
            showAsZipcode = null;
        }
        String valueshowExactLocation = request.getQueryString("showExactLocation");
        Boolean showExactLocation;
        if (valueshowExactLocation != null) {
            showExactLocation = Boolean.valueOf(valueshowExactLocation);
        } else {
            showExactLocation = null;
        }
        String valueshowOthersExactLocation = request.getQueryString("showOthersExactLocation");
        Boolean showOthersExactLocation;
        if (valueshowOthersExactLocation != null) {
            showOthersExactLocation = Boolean.valueOf(valueshowOthersExactLocation);
        } else {
            showOthersExactLocation = null;
        }
        String valueacceptedTerms = request.getQueryString("acceptedTerms");
        Boolean acceptedTerms;
        if (valueacceptedTerms != null) {
            acceptedTerms = Boolean.valueOf(valueacceptedTerms);
        } else {
            acceptedTerms = null;
        }
        String valuelocationVisibility = request.getQueryString("locationVisibility");
        String locationVisibility;
        if (valuelocationVisibility != null) {
            locationVisibility = valuelocationVisibility;
        } else {
            locationVisibility = null;
        }
        String valueappBlob = request.getQueryString("appBlob");
        String appBlob;
        if (valueappBlob != null) {
            appBlob = valueappBlob;
        } else {
            appBlob = null;
        }
        String valueappEnablePush = request.getQueryString("appEnablePush");
        Boolean appEnablePush;
        if (valueappEnablePush != null) {
            appEnablePush = Boolean.valueOf(valueappEnablePush);
        } else {
            appEnablePush = null;
        }
        String valueappEnableSMS = request.getQueryString("appEnableSMS");
        Boolean appEnableSMS;
        if (valueappEnableSMS != null) {
            appEnableSMS = Boolean.valueOf(valueappEnableSMS);
        } else {
            appEnableSMS = null;
        }
        String valueappEnableEmail = request.getQueryString("appEnableEmail");
        Boolean appEnableEmail;
        if (valueappEnableEmail != null) {
            appEnableEmail = Boolean.valueOf(valueappEnableEmail);
        } else {
            appEnableEmail = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuereturnProfile = request.getQueryString("returnProfile");
        Boolean returnProfile;
        if (valuereturnProfile != null) {
            returnProfile = Boolean.valueOf(valuereturnProfile);
        } else {
            returnProfile = null;
        }
        String valueaudienceIdsToAdd = request.getQueryString("audienceIdsToAdd");
        String audienceIdsToAdd;
        if (valueaudienceIdsToAdd != null) {
            audienceIdsToAdd = valueaudienceIdsToAdd;
        } else {
            audienceIdsToAdd = null;
        }
        String valueaudienceIdsToRemove = request.getQueryString("audienceIdsToRemove");
        String audienceIdsToRemove;
        if (valueaudienceIdsToRemove != null) {
            audienceIdsToRemove = valueaudienceIdsToRemove;
        } else {
            audienceIdsToRemove = null;
        }
        String valuereferralAccountId = request.getQueryString("referralAccountId");
        Long referralAccountId;
        if (valuereferralAccountId != null) {
            referralAccountId = Long.parseLong(valuereferralAccountId);
        } else {
            referralAccountId = null;
        }
        String valueappNickname = request.getQueryString("appNickname");
        String appNickname;
        if (valueappNickname != null) {
            appNickname = valueappNickname;
        } else {
            appNickname = null;
        }
        String valuepersonalAudienceId = request.getQueryString("personalAudienceId");
        Long personalAudienceId;
        if (valuepersonalAudienceId != null) {
            personalAudienceId = Long.parseLong(valuepersonalAudienceId);
        } else {
            personalAudienceId = null;
        }
        String valuenonGuestUsername = request.getQueryString("nonGuestUsername");
        String nonGuestUsername;
        if (valuenonGuestUsername != null) {
            nonGuestUsername = valuenonGuestUsername;
        } else {
            nonGuestUsername = null;
        }
        return imp.editAccountHttp(request, version, deviceId, accountId, connectionAccountId, role, assetId, name, prefixName, firstName, middleName, lastName, suffixName, title, gender, age, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, makeProfileInfoPublic, makeGameInfoPublic, makeFriendsInfoPublic, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, platforms, tags, aboutUs, matchToken, gameExperience, categories, categoryIds, responseFilters, showAsZipcode, showExactLocation, showOthersExactLocation, acceptedTerms, locationVisibility, appBlob, appEnablePush, appEnableSMS, appEnableEmail, gameType, appKey, latitude, longitude, returnProfile, audienceIdsToAdd, audienceIdsToRemove, referralAccountId, appNickname, personalAudienceId, nonGuestUsername);
    }

    @ApiAction
    public Result editUsername(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueemailAddress = request.getQueryString("emailAddress");
        String emailAddress;
        if (valueemailAddress != null) {
            emailAddress = valueemailAddress;
        } else {
            emailAddress = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            username = null;
        }
        return imp.editUsernameHttp(request, version, deviceId, accountId, emailAddress, username);
    }

    @ApiAction
    public Result getAccount(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            returnNulls = false;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueconnectionAccountEmail = request.getQueryString("connectionAccountEmail");
        String connectionAccountEmail;
        if (valueconnectionAccountEmail != null) {
            connectionAccountEmail = valueconnectionAccountEmail;
        } else {
            connectionAccountEmail = null;
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            connectionAccountId = 0;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = "PROFILE";
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = "SIRQUL";
        }
        String valueupdateViewedDate = request.getQueryString("updateViewedDate");
        Boolean updateViewedDate;
        if (valueupdateViewedDate != null) {
            updateViewedDate = Boolean.valueOf(valueupdateViewedDate);
        } else {
            updateViewedDate = false;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.getAccountHttp(request, version, returnNulls, deviceId, accountId, connectionAccountEmail, connectionAccountId, responseFilters, gameType, appKey, purchaseType, updateViewedDate, latitude, longitude);
    }

    @ApiAction
    public Result getProfileAssets(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            returnNulls = false;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueownerId = request.getQueryString("ownerId");
        Long ownerId;
        if (valueownerId != null) {
            ownerId = Long.parseLong(valueownerId);
        } else {
            ownerId = null;
        }
        String valuemediaTypes = request.getQueryString("mediaTypes");
        String mediaTypes;
        if (valuemediaTypes != null) {
            mediaTypes = valuemediaTypes;
        } else {
            mediaTypes = null;
        }
        String valuemimeTypes = request.getQueryString("mimeTypes");
        String mimeTypes;
        if (valuemimeTypes != null) {
            mimeTypes = valuemimeTypes;
        } else {
            mimeTypes = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "CREATED";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 0;
        }
        return imp.getProfileAssetsHttp(request, version, returnNulls, deviceId, accountId, ownerId, mediaTypes, mimeTypes, sortField, descending, latitude, longitude, i, start, l, limit);
    }

    @ApiAction
    public Result getReferralList(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueretrieveType = request.getQueryString("retrieveType");
        String retrieveType;
        if (valueretrieveType != null) {
            retrieveType = valueretrieveType;
        } else {
            retrieveType = null;
        }
        String valuelevelLimit = request.getQueryString("levelLimit");
        BigDecimal levelLimit;
        if (valuelevelLimit != null) {
            levelLimit = new BigDecimal(valuelevelLimit);
        } else {
            levelLimit = null;
        }
        String valueancestorLevelLimit = request.getQueryString("ancestorLevelLimit");
        BigDecimal ancestorLevelLimit;
        if (valueancestorLevelLimit != null) {
            ancestorLevelLimit = new BigDecimal(valueancestorLevelLimit);
        } else {
            ancestorLevelLimit = null;
        }
        String valuechildrenLevelLimit = request.getQueryString("childrenLevelLimit");
        BigDecimal childrenLevelLimit;
        if (valuechildrenLevelLimit != null) {
            childrenLevelLimit = new BigDecimal(valuechildrenLevelLimit);
        } else {
            childrenLevelLimit = null;
        }
        String valueancestorListStart = request.getQueryString("ancestorListStart");
        BigDecimal ancestorListStart;
        if (valueancestorListStart != null) {
            ancestorListStart = new BigDecimal(valueancestorListStart);
        } else {
            ancestorListStart = null;
        }
        String valueancestorListLimit = request.getQueryString("ancestorListLimit");
        BigDecimal ancestorListLimit;
        if (valueancestorListLimit != null) {
            ancestorListLimit = new BigDecimal(valueancestorListLimit);
        } else {
            ancestorListLimit = null;
        }
        String valuechildrenListStart = request.getQueryString("childrenListStart");
        BigDecimal childrenListStart;
        if (valuechildrenListStart != null) {
            childrenListStart = new BigDecimal(valuechildrenListStart);
        } else {
            childrenListStart = null;
        }
        String valuechildrenListLimit = request.getQueryString("childrenListLimit");
        BigDecimal childrenListLimit;
        if (valuechildrenListLimit != null) {
            childrenListLimit = new BigDecimal(valuechildrenListLimit);
        } else {
            childrenListLimit = null;
        }
        String valuechildrenChildren = request.getQueryString("childrenChildren");
        Boolean childrenChildren;
        if (valuechildrenChildren != null) {
            childrenChildren = Boolean.valueOf(valuechildrenChildren);
        } else {
            childrenChildren = true;
        }
        return imp.getReferralListHttp(request, version, accountId, appKey, retrieveType, levelLimit, ancestorLevelLimit, childrenLevelLimit, ancestorListStart, ancestorListLimit, childrenListStart, childrenListLimit, childrenChildren);
    }

    @ApiAction
    public Result getSettings(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.getSettingsHttp(request, version, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result loginDelegate(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccessToken = request.getQueryString("accessToken");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'accessToken' parameter is required");
        }
        String valueaccessTokenSecret = request.getQueryString("accessTokenSecret");
        String accessTokenSecret;
        if (valueaccessTokenSecret != null) {
            accessTokenSecret = valueaccessTokenSecret;
        } else {
            accessTokenSecret = null;
        }
        String valuedelegatedAccountId = request.getQueryString("delegatedAccountId");
        Long delegatedAccountId;
        if (valuedelegatedAccountId != null) {
            delegatedAccountId = Long.parseLong(valuedelegatedAccountId);
        } else {
            delegatedAccountId = null;
        }
        String valuedelegatedUsername = request.getQueryString("delegatedUsername");
        String delegatedUsername;
        if (valuedelegatedUsername != null) {
            delegatedUsername = valuedelegatedUsername;
        } else {
            delegatedUsername = null;
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            networkUID = "USERNAME";
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueageRestriction = request.getQueryString("ageRestriction");
        Integer ageRestriction;
        if (valueageRestriction != null) {
            ageRestriction = Integer.parseInt(valueageRestriction);
        } else {
            ageRestriction = 0;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = "PROFILE";
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.loginDelegateHttp(request, version, accessToken, appKey, deviceId, accessTokenSecret, delegatedAccountId, delegatedUsername, networkUID, ageRestriction, responseFilters, latitude, longitude);
    }

    @ApiAction
    public Result loginGeneral(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valuedeviceIdType = request.getQueryString("deviceIdType");
        String deviceIdType;
        if (valuedeviceIdType != null) {
            deviceIdType = valuedeviceIdType;
        } else {
            deviceIdType = null;
        }
        String valueaccessToken = request.getQueryString("accessToken");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'accessToken' parameter is required");
        }
        String valueaccessTokenSecret = request.getQueryString("accessTokenSecret");
        String accessTokenSecret;
        if (valueaccessTokenSecret != null) {
            accessTokenSecret = valueaccessTokenSecret;
        } else {
            accessTokenSecret = null;
        }
        String valuenetworkUID = request.getQueryString("networkUID");
        String networkUID;
        if (valuenetworkUID != null) {
            networkUID = valuenetworkUID;
        } else {
            throw new IllegalArgumentException("'networkUID' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueageRestriction = request.getQueryString("ageRestriction");
        Integer ageRestriction;
        if (valueageRestriction != null) {
            ageRestriction = Integer.parseInt(valueageRestriction);
        } else {
            ageRestriction = 0;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = "PROFILE";
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueemailMatch = request.getQueryString("emailMatch");
        Boolean emailMatch;
        if (valueemailMatch != null) {
            emailMatch = Boolean.valueOf(valueemailMatch);
        } else {
            emailMatch = false;
        }
        String valuechosenAccountId = request.getQueryString("chosenAccountId");
        Long chosenAccountId;
        if (valuechosenAccountId != null) {
            chosenAccountId = Long.parseLong(valuechosenAccountId);
        } else {
            chosenAccountId = 0;
        }
        String valuethirdPartyCredentialId = request.getQueryString("thirdPartyCredentialId");
        Long thirdPartyCredentialId;
        if (valuethirdPartyCredentialId != null) {
            thirdPartyCredentialId = Long.parseLong(valuethirdPartyCredentialId);
        } else {
            thirdPartyCredentialId = 0;
        }
        return imp.loginGeneralHttp(request, version, accessToken, networkUID, appKey, deviceId, deviceIdType, accessTokenSecret, ageRestriction, responseFilters, latitude, longitude, emailMatch, chosenAccountId, thirdPartyCredentialId);
    }

    @ApiAction
    public Result loginUsername(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueapp = request.getQueryString("app");
        String app;
        if (valueapp != null) {
            app = valueapp;
        } else {
            app = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuereturnProfile = request.getQueryString("returnProfile");
        Boolean returnProfile;
        if (valuereturnProfile != null) {
            returnProfile = Boolean.valueOf(valuereturnProfile);
        } else {
            returnProfile = null;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = null;
        }
        return imp.loginUsernameHttp(request, version, username, password, deviceId, latitude, longitude, app, gameType, appKey, returnProfile, responseFilters);
    }

    @ApiAction
    public Result logout(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valuedeviceIdType = request.getQueryString("deviceIdType");
        String deviceIdType;
        if (valuedeviceIdType != null) {
            deviceIdType = valuedeviceIdType;
        } else {
            deviceIdType = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.logoutHttp(request, version, deviceId, deviceIdType, accountId, latitude, longitude);
    }

    @ApiAction
    public Result mergeAccount(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuemergeAccountId = request.getQueryString("mergeAccountId");
        Long mergeAccountId;
        if (valuemergeAccountId != null) {
            mergeAccountId = Long.parseLong(valuemergeAccountId);
        } else {
            throw new IllegalArgumentException("'mergeAccountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        return imp.mergeAccountHttp(request, version, mergeAccountId, appKey, deviceId, accountId);
    }

    @ApiAction
    public Result passwordChange(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueoldPassword = request.getQueryString("oldPassword");
        String oldPassword;
        if (valueoldPassword != null) {
            oldPassword = valueoldPassword;
        } else {
            throw new IllegalArgumentException("'oldPassword' parameter is required");
        }
        String valuenewPassword = request.getQueryString("newPassword");
        String newPassword;
        if (valuenewPassword != null) {
            newPassword = valuenewPassword;
        } else {
            throw new IllegalArgumentException("'newPassword' parameter is required");
        }
        String valueconfirmPassword = request.getQueryString("confirmPassword");
        String confirmPassword;
        if (valueconfirmPassword != null) {
            confirmPassword = valueconfirmPassword;
        } else {
            throw new IllegalArgumentException("'confirmPassword' parameter is required");
        }
        return imp.passwordChangeHttp(request, version, accountId, oldPassword, newPassword, confirmPassword);
    }

    @ApiAction
    public Result passwordReset(Http.Request request, BigDecimal version) throws Exception {
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valueconfirm = request.getQueryString("confirm");
        String confirm;
        if (valueconfirm != null) {
            confirm = valueconfirm;
        } else {
            throw new IllegalArgumentException("'confirm' parameter is required");
        }
        return imp.passwordResetHttp(request, version, token, password, confirm);
    }

    @ApiAction
    public Result requestPasswordReset(Http.Request request, BigDecimal version) throws Exception {
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            throw new IllegalArgumentException("'email' parameter is required");
        }
        String valuefrom = request.getQueryString("from");
        String from;
        if (valuefrom != null) {
            from = valuefrom;
        } else {
            from = "Sirqul";
        }
        String valuedomain = request.getQueryString("domain");
        String domain;
        if (valuedomain != null) {
            domain = valuedomain;
        } else {
            domain = null;
        }
        String valuesubUrl = request.getQueryString("subUrl");
        String subUrl;
        if (valuesubUrl != null) {
            subUrl = valuesubUrl;
        } else {
            subUrl = null;
        }
        String valuereferer = request.getQueryString("referer");
        String referer;
        if (valuereferer != null) {
            referer = valuereferer;
        } else {
            referer = "http://dev.sirqul.com/resetpassword";
        }
        return imp.requestPasswordResetHttp(request, version, email, from, domain, subUrl, referer);
    }

    @ApiAction
    public Result requestValidateAccount(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.requestValidateAccountHttp(request, version, accountId);
    }

    @ApiAction
    public Result searchAccounts(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueradius = request.getQueryString("radius");
        Double radius;
        if (valueradius != null) {
            radius = Double.parseDouble(valueradius);
        } else {
            radius = 5;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valuegameExperience = request.getQueryString("gameExperience");
        String gameExperience;
        if (valuegameExperience != null) {
            gameExperience = valuegameExperience;
        } else {
            gameExperience = null;
        }
        String valueage = request.getQueryString("age");
        Integer age;
        if (valueage != null) {
            age = Integer.parseInt(valueage);
        } else {
            age = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            returnNulls = true;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = "PROFILE";
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = "SIRQUL";
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "id";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = false;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = false;
        }
        return imp.searchAccountsHttp(request, version, accountId, appKey, keyword, latitude, longitude, radius, gender, gameExperience, age, categoryIds, returnNulls, responseFilters, purchaseType, sortField, descending, start, limit, activeOnly);
    }

    @ApiAction
    public Result secureLogin(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            throw new IllegalArgumentException("'gameType' parameter is required");
        }
        String valuecharsetName = request.getQueryString("charsetName");
        String charsetName;
        if (valuecharsetName != null) {
            charsetName = valuecharsetName;
        } else {
            charsetName = "UTF-8";
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuereturnProfile = request.getQueryString("returnProfile");
        Boolean returnProfile;
        if (valuereturnProfile != null) {
            returnProfile = Boolean.valueOf(valuereturnProfile);
        } else {
            returnProfile = false;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = "PROFILE";
        }
        return imp.secureLoginHttp(request, version, username, password, gameType, deviceId, charsetName, latitude, longitude, returnProfile, responseFilters);
    }

    @ApiAction
    public Result secureSignup(Http.Request request, BigDecimal version) throws Exception {
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valueinviteToken = request.getQueryString("inviteToken");
        String inviteToken;
        if (valueinviteToken != null) {
            inviteToken = valueinviteToken;
        } else {
            inviteToken = null;
        }
        String valueprefixName = request.getQueryString("prefixName");
        String prefixName;
        if (valueprefixName != null) {
            prefixName = valueprefixName;
        } else {
            prefixName = null;
        }
        String valuefirstName = request.getQueryString("firstName");
        String firstName;
        if (valuefirstName != null) {
            firstName = valuefirstName;
        } else {
            firstName = null;
        }
        String valuemiddleName = request.getQueryString("middleName");
        String middleName;
        if (valuemiddleName != null) {
            middleName = valuemiddleName;
        } else {
            middleName = null;
        }
        String valuelastName = request.getQueryString("lastName");
        String lastName;
        if (valuelastName != null) {
            lastName = valuelastName;
        } else {
            lastName = null;
        }
        String valuesuffixName = request.getQueryString("suffixName");
        String suffixName;
        if (valuesuffixName != null) {
            suffixName = valuesuffixName;
        } else {
            suffixName = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            throw new IllegalArgumentException("'deviceId' parameter is required");
        }
        String valuedeviceIdType = request.getQueryString("deviceIdType");
        String deviceIdType;
        if (valuedeviceIdType != null) {
            deviceIdType = valuedeviceIdType;
        } else {
            deviceIdType = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valueemailAddress = request.getQueryString("emailAddress");
        String emailAddress;
        if (valueemailAddress != null) {
            emailAddress = valueemailAddress;
        } else {
            emailAddress = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valueaddress = request.getQueryString("address");
        String address;
        if (valueaddress != null) {
            address = valueaddress;
        } else {
            address = null;
        }
        String valuezipcode = request.getQueryString("zipcode");
        String zipcode;
        if (valuezipcode != null) {
            zipcode = valuezipcode;
        } else {
            zipcode = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valuebirthday = request.getQueryString("birthday");
        Long birthday;
        if (valuebirthday != null) {
            birthday = Long.parseLong(valuebirthday);
        } else {
            birthday = null;
        }
        String valuehomePhone = request.getQueryString("homePhone");
        String homePhone;
        if (valuehomePhone != null) {
            homePhone = valuehomePhone;
        } else {
            homePhone = null;
        }
        String valuecellPhone = request.getQueryString("cellPhone");
        String cellPhone;
        if (valuecellPhone != null) {
            cellPhone = valuecellPhone;
        } else {
            cellPhone = null;
        }
        String valuecellPhoneCarrier = request.getQueryString("cellPhoneCarrier");
        String cellPhoneCarrier;
        if (valuecellPhoneCarrier != null) {
            cellPhoneCarrier = valuecellPhoneCarrier;
        } else {
            cellPhoneCarrier = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuerole = request.getQueryString("role");
        String role;
        if (valuerole != null) {
            role = valuerole;
        } else {
            role = "MEMBER";
        }
        String valueplatforms = request.getQueryString("platforms");
        String platforms;
        if (valueplatforms != null) {
            platforms = valueplatforms;
        } else {
            platforms = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valueaboutUs = request.getQueryString("aboutUs");
        String aboutUs;
        if (valueaboutUs != null) {
            aboutUs = valueaboutUs;
        } else {
            aboutUs = null;
        }
        String valuegameExperience = request.getQueryString("gameExperience");
        String gameExperience;
        if (valuegameExperience != null) {
            gameExperience = valuegameExperience;
        } else {
            gameExperience = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuehometown = request.getQueryString("hometown");
        String hometown;
        if (valuehometown != null) {
            hometown = valuehometown;
        } else {
            hometown = null;
        }
        String valueheight = request.getQueryString("height");
        String height;
        if (valueheight != null) {
            height = valueheight;
        } else {
            height = null;
        }
        String valueheightIndex = request.getQueryString("heightIndex");
        Integer heightIndex;
        if (valueheightIndex != null) {
            heightIndex = Integer.parseInt(valueheightIndex);
        } else {
            heightIndex = null;
        }
        String valueethnicity = request.getQueryString("ethnicity");
        String ethnicity;
        if (valueethnicity != null) {
            ethnicity = valueethnicity;
        } else {
            ethnicity = null;
        }
        String valuebodyType = request.getQueryString("bodyType");
        String bodyType;
        if (valuebodyType != null) {
            bodyType = valuebodyType;
        } else {
            bodyType = null;
        }
        String valuemaritalStatus = request.getQueryString("maritalStatus");
        String maritalStatus;
        if (valuemaritalStatus != null) {
            maritalStatus = valuemaritalStatus;
        } else {
            maritalStatus = null;
        }
        String valuechildren = request.getQueryString("children");
        String children;
        if (valuechildren != null) {
            children = valuechildren;
        } else {
            children = null;
        }
        String valuereligion = request.getQueryString("religion");
        String religion;
        if (valuereligion != null) {
            religion = valuereligion;
        } else {
            religion = null;
        }
        String valueeducation = request.getQueryString("education");
        String education;
        if (valueeducation != null) {
            education = valueeducation;
        } else {
            education = null;
        }
        String valueeducationIndex = request.getQueryString("educationIndex");
        Integer educationIndex;
        if (valueeducationIndex != null) {
            educationIndex = Integer.parseInt(valueeducationIndex);
        } else {
            educationIndex = null;
        }
        String valuesmoke = request.getQueryString("smoke");
        String smoke;
        if (valuesmoke != null) {
            smoke = valuesmoke;
        } else {
            smoke = null;
        }
        String valuedrink = request.getQueryString("drink");
        String drink;
        if (valuedrink != null) {
            drink = valuedrink;
        } else {
            drink = null;
        }
        String valuecompanionship = request.getQueryString("companionship");
        String companionship;
        if (valuecompanionship != null) {
            companionship = valuecompanionship;
        } else {
            companionship = null;
        }
        String valuecompanionshipIndex = request.getQueryString("companionshipIndex");
        Integer companionshipIndex;
        if (valuecompanionshipIndex != null) {
            companionshipIndex = Integer.parseInt(valuecompanionshipIndex);
        } else {
            companionshipIndex = null;
        }
        String valuepreferredMinAge = request.getQueryString("preferredMinAge");
        Integer preferredMinAge;
        if (valuepreferredMinAge != null) {
            preferredMinAge = Integer.parseInt(valuepreferredMinAge);
        } else {
            preferredMinAge = null;
        }
        String valuepreferredMaxAge = request.getQueryString("preferredMaxAge");
        Integer preferredMaxAge;
        if (valuepreferredMaxAge != null) {
            preferredMaxAge = Integer.parseInt(valuepreferredMaxAge);
        } else {
            preferredMaxAge = null;
        }
        String valuepreferredMinHeight = request.getQueryString("preferredMinHeight");
        Integer preferredMinHeight;
        if (valuepreferredMinHeight != null) {
            preferredMinHeight = Integer.parseInt(valuepreferredMinHeight);
        } else {
            preferredMinHeight = null;
        }
        String valuepreferredMaxHeight = request.getQueryString("preferredMaxHeight");
        Integer preferredMaxHeight;
        if (valuepreferredMaxHeight != null) {
            preferredMaxHeight = Integer.parseInt(valuepreferredMaxHeight);
        } else {
            preferredMaxHeight = null;
        }
        String valuepreferredGender = request.getQueryString("preferredGender");
        String preferredGender;
        if (valuepreferredGender != null) {
            preferredGender = valuepreferredGender;
        } else {
            preferredGender = null;
        }
        String valuepreferredEducation = request.getQueryString("preferredEducation");
        String preferredEducation;
        if (valuepreferredEducation != null) {
            preferredEducation = valuepreferredEducation;
        } else {
            preferredEducation = null;
        }
        String valuepreferredEducationIndex = request.getQueryString("preferredEducationIndex");
        Integer preferredEducationIndex;
        if (valuepreferredEducationIndex != null) {
            preferredEducationIndex = Integer.parseInt(valuepreferredEducationIndex);
        } else {
            preferredEducationIndex = null;
        }
        String valuepreferredBodyType = request.getQueryString("preferredBodyType");
        String preferredBodyType;
        if (valuepreferredBodyType != null) {
            preferredBodyType = valuepreferredBodyType;
        } else {
            preferredBodyType = null;
        }
        String valuepreferredEthnicity = request.getQueryString("preferredEthnicity");
        String preferredEthnicity;
        if (valuepreferredEthnicity != null) {
            preferredEthnicity = valuepreferredEthnicity;
        } else {
            preferredEthnicity = null;
        }
        String valuepreferredLocation = request.getQueryString("preferredLocation");
        String preferredLocation;
        if (valuepreferredLocation != null) {
            preferredLocation = valuepreferredLocation;
        } else {
            preferredLocation = null;
        }
        String valuepreferredLocationRange = request.getQueryString("preferredLocationRange");
        Double preferredLocationRange;
        if (valuepreferredLocationRange != null) {
            preferredLocationRange = Double.parseDouble(valuepreferredLocationRange);
        } else {
            preferredLocationRange = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueacceptedTerms = request.getQueryString("acceptedTerms");
        Boolean acceptedTerms;
        if (valueacceptedTerms != null) {
            acceptedTerms = Boolean.valueOf(valueacceptedTerms);
        } else {
            acceptedTerms = true;
        }
        String valuecharsetName = request.getQueryString("charsetName");
        String charsetName;
        if (valuecharsetName != null) {
            charsetName = valuecharsetName;
        } else {
            charsetName = "UTF-8";
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valueresponseType = request.getQueryString("responseType");
        String responseType;
        if (valueresponseType != null) {
            responseType = valueresponseType;
        } else {
            responseType = null;
        }
        return imp.secureSignupHttp(request, version, deviceId, username, password, name, inviteToken, prefixName, firstName, middleName, lastName, suffixName, title, deviceIdType, emailAddress, assetId, address, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, charsetName, gameType, appKey, appVersion, responseType);
    }

    @ApiAction
    public Result setMatchToken(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuematchToken = request.getQueryString("matchToken");
        String matchToken;
        if (valuematchToken != null) {
            matchToken = valuematchToken;
        } else {
            matchToken = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = "BOOPY";
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.setMatchTokenHttp(request, version, deviceId, accountId, matchToken, gameType, appKey, latitude, longitude);
    }

    @ApiAction
    public Result updateActveStatus(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueconnectionAccountId = request.getQueryString("connectionAccountId");
        Long connectionAccountId;
        if (valueconnectionAccountId != null) {
            connectionAccountId = Long.parseLong(valueconnectionAccountId);
        } else {
            throw new IllegalArgumentException("'connectionAccountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            throw new IllegalArgumentException("'active' parameter is required");
        }
        return imp.updateActveStatusHttp(request, version, accountId, connectionAccountId, active, deviceId, appKey);
    }

    @ApiAction
    public Result updateLocation(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valueclientTime = request.getQueryString("clientTime");
        Long clientTime;
        if (valueclientTime != null) {
            clientTime = Long.parseLong(valueclientTime);
        } else {
            clientTime = null;
        }
        return imp.updateLocationHttp(request, version, deviceId, accountId, latitude, longitude, clientTime);
    }

    @ApiAction
    public Result updateSettings(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueblockedNotifications = request.getQueryString("blockedNotifications");
        String blockedNotifications;
        if (valueblockedNotifications != null) {
            blockedNotifications = valueblockedNotifications;
        } else {
            blockedNotifications = null;
        }
        String valuesuggestionMethod = request.getQueryString("suggestionMethod");
        String suggestionMethod;
        if (valuesuggestionMethod != null) {
            suggestionMethod = valuesuggestionMethod;
        } else {
            suggestionMethod = null;
        }
        String valuesuggestionCount = request.getQueryString("suggestionCount");
        Integer suggestionCount;
        if (valuesuggestionCount != null) {
            suggestionCount = Integer.parseInt(valuesuggestionCount);
        } else {
            suggestionCount = null;
        }
        String valuesuggestionTimeFrame = request.getQueryString("suggestionTimeFrame");
        Integer suggestionTimeFrame;
        if (valuesuggestionTimeFrame != null) {
            suggestionTimeFrame = Integer.parseInt(valuesuggestionTimeFrame);
        } else {
            suggestionTimeFrame = null;
        }
        String valueshowOthersExactLocation = request.getQueryString("showOthersExactLocation");
        Boolean showOthersExactLocation;
        if (valueshowOthersExactLocation != null) {
            showOthersExactLocation = Boolean.valueOf(valueshowOthersExactLocation);
        } else {
            showOthersExactLocation = null;
        }
        String valueshowAsZipcode = request.getQueryString("showAsZipcode");
        Boolean showAsZipcode;
        if (valueshowAsZipcode != null) {
            showAsZipcode = Boolean.valueOf(valueshowAsZipcode);
        } else {
            showAsZipcode = null;
        }
        String valueshowExactLocation = request.getQueryString("showExactLocation");
        Boolean showExactLocation;
        if (valueshowExactLocation != null) {
            showExactLocation = Boolean.valueOf(valueshowExactLocation);
        } else {
            showExactLocation = null;
        }
        String valuefavoriteVisibility = request.getQueryString("favoriteVisibility");
        String favoriteVisibility;
        if (valuefavoriteVisibility != null) {
            favoriteVisibility = valuefavoriteVisibility;
        } else {
            favoriteVisibility = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.updateSettingsHttp(request, version, deviceId, accountId, blockedNotifications, suggestionMethod, suggestionCount, suggestionTimeFrame, showOthersExactLocation, showAsZipcode, showExactLocation, favoriteVisibility, latitude, longitude);
    }

    @ApiAction
    public Result validateAccountSignup(Http.Request request, BigDecimal version) throws Exception {
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        return imp.validateAccountSignupHttp(request, version, token);
    }

    @ApiAction
    public Result validatePasswordReset(Http.Request request, BigDecimal version) throws Exception {
        String valuetoken = request.getQueryString("token");
        String token;
        if (valuetoken != null) {
            token = valuetoken;
        } else {
            throw new IllegalArgumentException("'token' parameter is required");
        }
        return imp.validatePasswordResetHttp(request, version, token);
    }

}
