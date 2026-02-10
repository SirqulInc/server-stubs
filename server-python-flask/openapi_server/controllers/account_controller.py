import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_login_response import AccountLoginResponse  # noqa: E501
from openapi_server.models.asset_list_response import AssetListResponse  # noqa: E501
from openapi_server.models.profile_info_response import ProfileInfoResponse  # noqa: E501
from openapi_server.models.profile_response import ProfileResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.user_location_search_response import UserLocationSearchResponse  # noqa: E501
from openapi_server.models.user_settings_response import UserSettingsResponse  # noqa: E501
from openapi_server import util


def account_location_search(version, device_id=None, account_id=None, q=None, keyword=None, postal_code=None, latitude=None, longitude=None, app_key=None, range=None, location_last_updated=None, gender=None, min_age=None, max_age=None, companionship_index=None, i=None, start=None, l=None, limit=None, search_mode=None, sort_field=None, descending=None, roles=None, tags=None, experience=None, category_ids=None, audience_ids=None, audience_operator=None, update_current_location=None, update_preferred_settings=None, show_exact_locations=None, show_connection_to_searcher=None, flag_count_minimum=None, verified_user_only=None, content_admin_only=None):  # noqa: E501
    """Search Accounts by Location

    Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param q: Deprecated - legacy query parameter
    :type q: str
    :param keyword: An optional keyword to search on, will be ignore if empty (NOT implemented yet)
    :type keyword: str
    :param postal_code: The postal code to search on, either postalCode or the user&#39;s exact location is required
    :type postal_code: str
    :param latitude: The latitude of the user, either postalCode or the user&#39;s exact location is required
    :type latitude: float
    :param longitude: The longitude of the user, either postalCode or the user&#39;s exact location is required
    :type longitude: float
    :param app_key: The application key
    :type app_key: str
    :param range: The range to search on
    :type range: float
    :param location_last_updated: Searches for user&#39;s that has updated their location since this date
    :type location_last_updated: int
    :param gender: The preferred gender
    :type gender: str
    :param min_age: The preferred min age
    :type min_age: int
    :param max_age: The preferred max age
    :type max_age: int
    :param companionship_index: The preferred companionship index
    :type companionship_index: int
    :param i: this is the start index of a query
    :type i: int
    :param start: Start of the pagination
    :type start: int
    :param l: this is the limit index of a query
    :type l: int
    :param limit: Limit of the pagination
    :type limit: int
    :param search_mode: Search mode to use for index searches (e.g. CLOUDINDEX, OPENSEARCH)
    :type search_mode: str
    :param sort_field: Sorting field for results (default: DISTANCE)
    :type sort_field: str
    :param descending: Whether to sort descending (default: false)
    :type descending: bool
    :param roles: Roles to filter on
    :type roles: str
    :param tags: Tags to filter on
    :type tags: str
    :param experience: The experience to filter on
    :type experience: str
    :param category_ids: The category ids to filter on (comma separated)
    :type category_ids: str
    :param audience_ids: The audience ids to filter on (comma separated)
    :type audience_ids: str
    :param audience_operator: Operator used to combine audience filters (default: AND)
    :type audience_operator: str
    :param update_current_location: Whether to use the given lat &amp; long to update the user&#39;s current location
    :type update_current_location: bool
    :param update_preferred_settings: Whether to use the given parameters to update the user&#39;s preferred settings
    :type update_preferred_settings: bool
    :param show_exact_locations: Determines whether to always display user exact locations
    :type show_exact_locations: bool
    :param show_connection_to_searcher: Return connection of the accounts in the result to the passed in account if there exists any
    :type show_connection_to_searcher: bool
    :param flag_count_minimum: Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)
    :type flag_count_minimum: int
    :param verified_user_only: Returns only verified users
    :type verified_user_only: bool
    :param content_admin_only: Returns only content admin users
    :type content_admin_only: bool

    :rtype: Union[UserLocationSearchResponse, Tuple[UserLocationSearchResponse, int], Tuple[UserLocationSearchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def block_account(version, account_id_being_blocked, device_id=None, account_id=None, block_flag_value=None, remove_from_groups_if_blocked=None, latitude=None, longitude=None):  # noqa: E501
    """Block Account

    Moves or removes an account into the user&#39;s blocked group. # noqa: E501

    :param version: 
    :type version: 
    :param account_id_being_blocked: The id of the account to be blocked/unblocked
    :type account_id_being_blocked: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param block_flag_value: Determines whether the account is blocked or unblocked
    :type block_flag_value: bool
    :param remove_from_groups_if_blocked: Determines whether the account is removed from all other groups if blocked
    :type remove_from_groups_if_blocked: bool
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_account(version, username, password, name=None, prefix_name=None, first_name=None, middle_name=None, last_name=None, suffix_name=None, title=None, device_id=None, device_id_type=None, email_address=None, asset_id=None, street_address=None, zipcode=None, gender=None, birthday=None, home_phone=None, cell_phone=None, cell_phone_carrier=None, business_phone=None, role=None, platforms=None, tags=None, about_us=None, game_experience=None, category_ids=None, hometown=None, height=None, height_index=None, ethnicity=None, body_type=None, marital_status=None, children=None, religion=None, education=None, education_index=None, smoke=None, drink=None, companionship=None, companionship_index=None, preferred_min_age=None, preferred_max_age=None, preferred_min_height=None, preferred_max_height=None, preferred_gender=None, preferred_education=None, preferred_education_index=None, preferred_body_type=None, preferred_ethnicity=None, preferred_location=None, preferred_location_range=None, latitude=None, longitude=None, accepted_terms=None, invite_token=None, referral_account_id=None, send_validation=None, game_type=None, app_key=None, app_version=None, response_type=None, audience_ids_to_add=None, app_blob=None, app_enable_push=None, app_enable_sms=None, app_enable_email=None, location_visibility=None, home_latitude=None, home_longitude=None, app_nickname=None, personal_audience_id=None):  # noqa: E501
    """Create Account

    Create a new account by role. # noqa: E501

    :param version: 
    :type version: 
    :param username: The access token to authenticate with (ex: username)
    :type username: str
    :param password: The secret to authenticate with (ex: password)
    :type password: str
    :param name: The full name of the user. If this parameter is NOT empty, the following parameters will be ignored: prefixName, firstName, middleName, lastName, and suffixName
    :type name: str
    :param prefix_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    :type prefix_name: str
    :param first_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    :type first_name: str
    :param middle_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    :type middle_name: str
    :param last_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    :type last_name: str
    :param suffix_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    :type suffix_name: str
    :param title: This field will be used to set the user&#39;s job title
    :type title: str
    :param device_id: The unique id of the device making the request
    :type device_id: str
    :param device_id_type: The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc
    :type device_id_type: str
    :param email_address: The user&#39;s contact email address (NOT the username)
    :type email_address: str
    :param asset_id: The asset id to set the user&#39;s profile image
    :type asset_id: int
    :param street_address: The street address of the user&#39;s contact location
    :type street_address: str
    :param zipcode: The zipcode of the user&#39;s contact location
    :type zipcode: str
    :param gender: The gender of the user (AudienceGender)
    :type gender: str
    :param birthday: The birthday date of the user in UTC milliseconds
    :type birthday: int
    :param home_phone: The home phone number
    :type home_phone: str
    :param cell_phone: The cellular phone number
    :type cell_phone: str
    :param cell_phone_carrier: The cellular service provider
    :type cell_phone_carrier: str
    :param business_phone: The business phone number
    :type business_phone: str
    :param role: The account role (default: MEMBER)
    :type role: str
    :param platforms: Comma separated list of development platforms
    :type platforms: str
    :param tags: Search tags
    :type tags: str
    :param about_us: About us information
    :type about_us: str
    :param game_experience: Game experience of the user
    :type game_experience: str
    :param category_ids: A list of category ids that represent interests and associations
    :type category_ids: str
    :param hometown: The user&#39;s hometown
    :type hometown: str
    :param height: The user&#39;s height
    :type height: str
    :param height_index: The user&#39;s height in a numerical value that can be used for ordering/searching
    :type height_index: int
    :param ethnicity: The user&#39;s ethnicity
    :type ethnicity: str
    :param body_type: The user&#39;s body type
    :type body_type: str
    :param marital_status: The user&#39;s marital status
    :type marital_status: str
    :param children: The user&#39;s children status
    :type children: str
    :param religion: The user&#39;s religion
    :type religion: str
    :param education: The user&#39;s education
    :type education: str
    :param education_index: The user&#39;s education in a numerical value that can be used for ordering/searching
    :type education_index: int
    :param smoke: The user&#39;s smoke status
    :type smoke: str
    :param drink: The user&#39;s drink status
    :type drink: str
    :param companionship: The user&#39;s companionship status
    :type companionship: str
    :param companionship_index: The user&#39;s companionship index
    :type companionship_index: int
    :param preferred_min_age: The preferred minimum age in the account location search
    :type preferred_min_age: int
    :param preferred_max_age: The preferred maximum age in the account location search
    :type preferred_max_age: int
    :param preferred_min_height: The preferred minimum height in the account location search
    :type preferred_min_height: int
    :param preferred_max_height: The preferred maximum height in the account location search
    :type preferred_max_height: int
    :param preferred_gender: The preferred gender in the account location search
    :type preferred_gender: str
    :param preferred_education: The preferred education in the account location search
    :type preferred_education: str
    :param preferred_education_index: The preferred education in a numerical value that can be used for ordering/searching
    :type preferred_education_index: int
    :param preferred_body_type: The preferred body type in the account location search
    :type preferred_body_type: str
    :param preferred_ethnicity: The preferred ethnicity in the account location search
    :type preferred_ethnicity: str
    :param preferred_location: The preferred location in the account location search
    :type preferred_location: str
    :param preferred_location_range: The preferred location range in the account location search
    :type preferred_location_range: float
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float
    :param accepted_terms: Accepted Terms
    :type accepted_terms: bool
    :param invite_token: The inviteToken that the referrer used for this account to sign up
    :type invite_token: str
    :param referral_account_id: The accountId of the referrer (used if there is no inviteToken)
    :type referral_account_id: int
    :param send_validation: Whether to send validation email
    :type send_validation: bool
    :param game_type: Deprecated: use appKey
    :type game_type: str
    :param app_key: The application key
    :type app_key: str
    :param app_version: The application version
    :type app_version: str
    :param response_type: Returns an AccountLoginResponse if \&quot;AccountLoginResponse\&quot; is passed in
    :type response_type: str
    :param audience_ids_to_add: Comma separated list of audience ids to assign to the user
    :type audience_ids_to_add: str
    :param app_blob: Application blob data
    :type app_blob: str
    :param app_enable_push: Enable push for the app
    :type app_enable_push: bool
    :param app_enable_sms: Enable SMS for the app
    :type app_enable_sms: bool
    :param app_enable_email: Enable email for the app
    :type app_enable_email: bool
    :param location_visibility: Location visibility setting
    :type location_visibility: str
    :param home_latitude: Home latitude
    :type home_latitude: float
    :param home_longitude: Home longitude
    :type home_longitude: float
    :param app_nickname: The nickname used in the application for this account
    :type app_nickname: str
    :param personal_audience_id: Personal audience id to associate with this account
    :type personal_audience_id: int

    :rtype: Union[AccountLoginResponse, Tuple[AccountLoginResponse, int], Tuple[AccountLoginResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def edit_account(version, device_id=None, account_id=None, connection_account_id=None, role=None, asset_id=None, name=None, prefix_name=None, first_name=None, middle_name=None, last_name=None, suffix_name=None, title=None, gender=None, age=None, birthday=None, home_phone=None, cell_phone=None, cell_phone_carrier=None, business_phone=None, email_address=None, street_address=None, street_address2=None, city=None, state=None, zipcode=None, country=None, make_profile_info_public=None, make_game_info_public=None, make_friends_info_public=None, hometown=None, height=None, height_index=None, ethnicity=None, body_type=None, marital_status=None, children=None, religion=None, education=None, education_index=None, smoke=None, drink=None, companionship=None, companionship_index=None, preferred_min_age=None, preferred_max_age=None, preferred_min_height=None, preferred_max_height=None, preferred_gender=None, preferred_education=None, preferred_education_index=None, preferred_body_type=None, preferred_ethnicity=None, preferred_location=None, preferred_location_range=None, platforms=None, tags=None, about_us=None, match_token=None, game_experience=None, categories=None, category_ids=None, response_filters=None, show_as_zipcode=None, show_exact_location=None, show_others_exact_location=None, accepted_terms=None, location_visibility=None, app_blob=None, app_enable_push=None, app_enable_sms=None, app_enable_email=None, game_type=None, app_key=None, latitude=None, longitude=None, return_profile=None, audience_ids_to_add=None, audience_ids_to_remove=None, referral_account_id=None, app_nickname=None, personal_audience_id=None, non_guest_username=None):  # noqa: E501
    """Update Account

    Edit the user&#39;s profile information # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: The account id used to edit another person&#39;s account
    :type connection_account_id: int
    :param role: The account role to change to
    :type role: str
    :param asset_id: The asset id to set the user&#39;s profile image
    :type asset_id: int
    :param name: The full name of the user. If this parameter is NOT empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName 
    :type name: str
    :param prefix_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    :type prefix_name: str
    :param first_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    :type first_name: str
    :param middle_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    :type middle_name: str
    :param last_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    :type last_name: str
    :param suffix_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    :type suffix_name: str
    :param title: This field will be used to set the user&#39;s job title
    :type title: str
    :param gender: The gender of the user AudienceGender
    :type gender: str
    :param age: This is deperecated, use the birthday parameter
    :type age: int
    :param birthday: The birthday date of the user in UTC milliseconds
    :type birthday: int
    :param home_phone: The home phone number
    :type home_phone: str
    :param cell_phone: The cellular phone number
    :type cell_phone: str
    :param cell_phone_carrier: The cellular service provider
    :type cell_phone_carrier: str
    :param business_phone: The business phone number
    :type business_phone: str
    :param email_address: The user&#39;s contact email address (NOT the username)
    :type email_address: str
    :param street_address: The street address of the user&#39;s contact location
    :type street_address: str
    :param street_address2: Additional address information (such as a suite number, floor number, building name, or PO Box)
    :type street_address2: str
    :param city: The city of the user&#39;s contact location
    :type city: str
    :param state: The state of the user&#39;s contact location
    :type state: str
    :param zipcode: The zipcode of the user&#39;s contact location
    :type zipcode: str
    :param country: The country of the user&#39;s contact location
    :type country: str
    :param make_profile_info_public: Allow anyone to view the user&#39;s personal profile
    :type make_profile_info_public: bool
    :param make_game_info_public: Allow anyone to view the user&#39;s game/app info
    :type make_game_info_public: bool
    :param make_friends_info_public: Allow anyone to view the user&#39;s friends list
    :type make_friends_info_public: bool
    :param hometown: The user&#39;s hometown
    :type hometown: str
    :param height: The user&#39;s height
    :type height: str
    :param height_index: The user&#39;s height in a numerical value that can be used for ordering/searching
    :type height_index: int
    :param ethnicity: The user&#39;s ethnicity
    :type ethnicity: str
    :param body_type: The user&#39;s body type
    :type body_type: str
    :param marital_status: The user&#39;s marital status
    :type marital_status: str
    :param children: The user&#39;s children status
    :type children: str
    :param religion: The user&#39;s religion
    :type religion: str
    :param education: The user&#39;s education
    :type education: str
    :param education_index: The user&#39;s education in a numerical value that can be used for ordering/searching
    :type education_index: int
    :param smoke: The user&#39;s smoke status
    :type smoke: str
    :param drink: The user&#39;s drink status
    :type drink: str
    :param companionship: The user&#39;s companionship status
    :type companionship: str
    :param companionship_index: The user&#39;s companionship index
    :type companionship_index: int
    :param preferred_min_age: The preferred minimum age in the account location search
    :type preferred_min_age: int
    :param preferred_max_age: The preferred maximum age in the account location search
    :type preferred_max_age: int
    :param preferred_min_height: The preferred minimum height in the account location search
    :type preferred_min_height: int
    :param preferred_max_height: The preferred maximum height in the account location search
    :type preferred_max_height: int
    :param preferred_gender: The preferred gender in the account location search
    :type preferred_gender: str
    :param preferred_education: The preferred education in the account location search
    :type preferred_education: str
    :param preferred_education_index: The preferred education in a numerical value that can be used for ordering/searching
    :type preferred_education_index: int
    :param preferred_body_type: The preferred body type in the account location search
    :type preferred_body_type: str
    :param preferred_ethnicity: The preferred ethnicity in the account location search
    :type preferred_ethnicity: str
    :param preferred_location: The preferred education in the account location search
    :type preferred_location: str
    :param preferred_location_range: The preferred location range in the account location search
    :type preferred_location_range: float
    :param platforms: Platforms
    :type platforms: str
    :param tags: Tags
    :type tags: str
    :param about_us: About Us
    :type about_us: str
    :param match_token: Match Token
    :type match_token: str
    :param game_experience: Game Experience
    :type game_experience: str
    :param categories: Deprecated use categoryIds
    :type categories: str
    :param category_ids: A list of category ids that represent interests and associations
    :type category_ids: str
    :param response_filters: A comma separated list of ProfileFilters for filtering the returned response data
    :type response_filters: str
    :param show_as_zipcode: The user&#39;s preference if they want to be shown by zipcode on a map
    :type show_as_zipcode: bool
    :param show_exact_location: The user&#39;s preference if they want to be shown by their exact location on a map
    :type show_exact_location: bool
    :param show_others_exact_location: The user&#39;s preference if they want to see others exact location on a map
    :type show_others_exact_location: bool
    :param accepted_terms: Accepted Terms
    :type accepted_terms: bool
    :param location_visibility: Location Visibility
    :type location_visibility: str
    :param app_blob: App Blob
    :type app_blob: str
    :param app_enable_push: App Enable Push
    :type app_enable_push: bool
    :param app_enable_sms: App Enable SMS
    :type app_enable_sms: bool
    :param app_enable_email: App Enable Email
    :type app_enable_email: bool
    :param game_type: Game Type
    :type game_type: str
    :param app_key: The application key
    :type app_key: str
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float
    :param return_profile: Return Profile
    :type return_profile: bool
    :param audience_ids_to_add: Audience Ids to add
    :type audience_ids_to_add: str
    :param audience_ids_to_remove: Audience Ids to remove
    :type audience_ids_to_remove: str
    :param referral_account_id: The account id of the referrer
    :type referral_account_id: int
    :param app_nickname: App nickname
    :type app_nickname: str
    :param personal_audience_id: Personal Audience
    :type personal_audience_id: int
    :param non_guest_username: The user&#39;s username to update with if they currently have a guest username
    :type non_guest_username: str

    :rtype: Union[ProfileInfoResponse, Tuple[ProfileInfoResponse, int], Tuple[ProfileInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def edit_username(version, device_id=None, account_id=None, email_address=None, username=None):  # noqa: E501
    """Update Username and Email

    Update account&#39;s own username and/or emailAddress # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param email_address: the user&#39;s contact email address (NOT the username) which is also used for email validation
    :type email_address: str
    :param username: the user&#39;s username to update with if they currently have a guest username
    :type username: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_account(version, return_nulls=None, device_id=None, account_id=None, connection_account_email=None, connection_account_id=None, response_filters=None, game_type=None, app_key=None, purchase_type=None, update_viewed_date=None, latitude=None, longitude=None):  # noqa: E501
    """Get Account

    Gets a user&#39;s account profile. Application settings and account settings will also be returned for the owner of the account. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: Return Nulls
    :type return_nulls: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_email: Connection Account Email
    :type connection_account_email: str
    :param connection_account_id: The account id used to view another person&#39;s account
    :type connection_account_id: int
    :param response_filters: A comma separated list of ProfileFilters for filtering the returned response data
    :type response_filters: str
    :param game_type: Game Type
    :type game_type: str
    :param app_key: The application key
    :type app_key: str
    :param purchase_type: Purchase Type
    :type purchase_type: str
    :param update_viewed_date: Determines whether to track if a person has viewed someone&#39;s profile
    :type update_viewed_date: bool
    :param latitude: Latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Longitude used to update the user&#39;s current location
    :type longitude: float

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_profile_assets(version, return_nulls=None, device_id=None, account_id=None, owner_id=None, media_types=None, mime_types=None, sort_field=None, descending=None, latitude=None, longitude=None, i=None, start=None, l=None, limit=None):  # noqa: E501
    """Get Profile Assets

    Get a list of assets a person has ever uploaded. Filters the list based on parameters. # noqa: E501

    :param version: 
    :type version: 
    :param return_nulls: Determines whether to return null fields in the response
    :type return_nulls: bool
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param owner_id: The account id of the person the user wants to view
    :type owner_id: int
    :param media_types: Comma separated list of MediaType
    :type media_types: str
    :param mime_types: Comma separated list of mime types
    :type mime_types: str
    :param sort_field: Determines what the returning list will be sorted by (see AssetApiMap)
    :type sort_field: str
    :param descending: Determines whether to return the resulting list in descending or ascending order
    :type descending: bool
    :param latitude: Latitude used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Longitude used to update the user&#39;s current location
    :type longitude: float
    :param i: _i
    :type i: int
    :param start: Start of the pagination
    :type start: int
    :param l: _l
    :type l: int
    :param limit: Limit of the pagination
    :type limit: int

    :rtype: Union[AssetListResponse, Tuple[AssetListResponse, int], Tuple[AssetListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_referral_list(version, account_id=None, app_key=None, retrieve_type=None, level_limit=None, ancestor_level_limit=None, children_level_limit=None, ancestor_list_start=None, ancestor_list_limit=None, children_list_start=None, children_list_limit=None, children_children=None):  # noqa: E501
    """Search Accounts

    Gets a user&#39;s account profile and their referral List. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param app_key: The application key
    :type app_key: str
    :param retrieve_type: one of these option - GET_CHILDREN will get all accounts that had signed up using the current account invite link - GET_ANCESTOR will get all accounts that referred the current account and it&#39;s parents, recursively - GET_ALL will get all of the above
    :type retrieve_type: str
    :param level_limit: level limit for children and ancestors of current account, starts from current account
    :type level_limit: 
    :param ancestor_level_limit: level limit for ancestors, will override levelLimit if this is set
    :type ancestor_level_limit: 
    :param children_level_limit: level limit for children, will override levelLimit if this is set
    :type children_level_limit: 
    :param ancestor_list_start: pagination start for children list
    :type ancestor_list_start: 
    :param ancestor_list_limit: pagination limit for children list
    :type ancestor_list_limit: 
    :param children_list_start: pagination start for children list
    :type children_list_start: 
    :param children_list_limit: pagination limit for children list
    :type children_list_limit: 
    :param children_children: if true, on each item in ancestor and children list, return the childrenTotalNumber and ancestorTotalNumber for that item
    :type children_children: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_settings(version, device_id=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Get Account Settings

    Get the account settings for a user # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    :rtype: Union[UserSettingsResponse, Tuple[UserSettingsResponse, int], Tuple[UserSettingsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def login_delegate(version, access_token, app_key, device_id=None, access_token_secret=None, delegated_account_id=None, delegated_username=None, network_uid=None, age_restriction=None, response_filters=None, latitude=None, longitude=None):  # noqa: E501
    """Login as Account

    A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now. # noqa: E501

    :param version: 
    :type version: 
    :param access_token: 
    :type access_token: str
    :param app_key: 
    :type app_key: str
    :param device_id: 
    :type device_id: str
    :param access_token_secret: 
    :type access_token_secret: str
    :param delegated_account_id: 
    :type delegated_account_id: int
    :param delegated_username: 
    :type delegated_username: str
    :param network_uid: The access provider to authenticate against (default: USERNAME). Supported values: FACEBOOK, TWITTER, USERNAME, PHONE
    :type network_uid: str
    :param age_restriction: Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    :type age_restriction: int
    :param response_filters: This determines how much of the profile should be returned, see ProfileFilters
    :type response_filters: str
    :param latitude: 
    :type latitude: float
    :param longitude: 
    :type longitude: float

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def login_general(version, access_token, network_uid, app_key, device_id=None, device_id_type=None, access_token_secret=None, age_restriction=None, response_filters=None, latitude=None, longitude=None, email_match=None, chosen_account_id=None, third_party_credential_id=None):  # noqa: E501
    """Login Account

    General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi} # noqa: E501

    :param version: 
    :type version: 
    :param access_token: The access token to authenticate with (ex: username or fb token)
    :type access_token: str
    :param network_uid: The access provider to authenticate against. This can be custom  networks created using the ThirdPartyApi as well. Supported values by default  include: FACEBOOK, TWITTER, USERNAME, PHONE 
    :type network_uid: str
    :param app_key: The application key
    :type app_key: str
    :param device_id: The unique id of the device making the request
    :type device_id: str
    :param device_id_type: The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc
    :type device_id_type: str
    :param access_token_secret: The secret to authenticate with (ex: password)
    :type access_token_secret: str
    :param age_restriction: Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    :type age_restriction: int
    :param response_filters: This determines how much of the profile should be returned, see ProfileFilters
    :type response_filters: str
    :param latitude: Used to update the user&#39;s current location
    :type latitude: float
    :param longitude: Used to update the user&#39;s current location
    :type longitude: float
    :param email_match: Option to check for email if username doesn&#39;t match, also support multiple accounts
    :type email_match: bool
    :param chosen_account_id: Chosen account Id sent from the app - pass in the 2nd request to choose an account from multiple accounts matching the email - use one of the account id from the previous request
    :type chosen_account_id: int
    :param third_party_credential_id: Third-party credential Id, pass in the 2nd request to choose an account from multiple accounts matching the email - use the id from the previous call ThirdPartyCredential object
    :type third_party_credential_id: int

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def login_username(version, username, password, device_id=None, latitude=None, longitude=None, app=None, game_type=None, app_key=None, return_profile=None, response_filters=None):  # noqa: E501
    """Login Account (Username)

    Login to system with an account # noqa: E501

    :param version: 
    :type version: 
    :param username: the user&#39;s email address they used to sign-up
    :type username: str
    :param password: the password
    :type password: str
    :param device_id: the device id
    :type device_id: str
    :param latitude: the current latitude of the user
    :type latitude: float
    :param longitude: the current longitude of the user
    :type longitude: float
    :param app: the app
    :type app: str
    :param game_type: This parameter is deprecated. This is deprecated, use appKey.
    :type game_type: str
    :param app_key: the application key
    :type app_key: str
    :param return_profile: the profile to return
    :type return_profile: bool
    :param response_filters: a comma separated list of ProfileFilters for filtering the returned response data
    :type response_filters: str

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def logout(version, device_id=None, device_id_type=None, account_id=None, latitude=None, longitude=None):  # noqa: E501
    """Logout Account

    Cleans up the users data for logging out. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param device_id_type: Device Id Type
    :type device_id_type: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def merge_account(version, merge_account_id, app_key, device_id=None, account_id=None):  # noqa: E501
    """Merge Account

    Merges the analytics, achievements, leaderboards of two accounts. # noqa: E501

    :param version: 
    :type version: 
    :param merge_account_id: The id of the account to being merged
    :type merge_account_id: int
    :param app_key: The application key
    :type app_key: str
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def password_change(version, account_id, old_password, new_password, confirm_password):  # noqa: E501
    """Update Password

    Update the account password. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account to update
    :type account_id: int
    :param old_password: The current password, used to validate access
    :type old_password: str
    :param new_password: The new password to set, cannot be empty
    :type new_password: str
    :param confirm_password: The new password to confirm, must match newPassword
    :type confirm_password: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def password_reset(version, token, password, confirm):  # noqa: E501
    """Reset Password

    Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. # noqa: E501

    :param version: 
    :type version: 
    :param token: The token associated with the account to update, good for 24 hours
    :type token: str
    :param password: The new password to set, cannot be empty
    :type password: str
    :param confirm: The new password to confirm, must match newPassword
    :type confirm: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def request_password_reset(version, email, _from=None, domain=None, sub_url=None, referer=None):  # noqa: E501
    """Request Password Reset

    Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours. # noqa: E501

    :param version: 
    :type version: 
    :param email: The email/username of the account
    :type email: str
    :param _from: this is the sender email
    :type _from: str
    :param domain: this is the domain (like dev.sirqul.com) used to generate the password reset link
    :type domain: str
    :param sub_url: this is the the subUrl (like resetpassword) used to generate a password reset link
    :type sub_url: str
    :param referer: this is used to generate a password reset link
    :type referer: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def request_validate_account(version, account_id):  # noqa: E501
    """Send Validation Request

    Send an email to validate a user&#39;s account. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_accounts(version, account_id, app_key, keyword=None, latitude=None, longitude=None, radius=None, gender=None, game_experience=None, age=None, category_ids=None, return_nulls=None, response_filters=None, purchase_type=None, sort_field=None, descending=None, start=None, limit=None, active_only=None):  # noqa: E501
    """Search Accounts

    Search for account profiles. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The id of the account requesting
    :type account_id: int
    :param app_key: The application key
    :type app_key: str
    :param keyword: The keyword for for querying the account
    :type keyword: str
    :param latitude: the latitude
    :type latitude: float
    :param longitude: the longitude
    :type longitude: float
    :param radius: the radius
    :type radius: float
    :param gender: the user&#39;s gender
    :type gender: str
    :param game_experience: the user&#39;s Game Experience
    :type game_experience: str
    :param age: the user&#39;s age
    :type age: int
    :param category_ids: the user&#39;s Category Ids
    :type category_ids: str
    :param return_nulls: Return Nulls
    :type return_nulls: bool
    :param response_filters: A comma separated list of ProfileFilters for filtering the returned response data
    :type response_filters: str
    :param purchase_type: A comma separated list of PurchaseType
    :type purchase_type: str
    :param sort_field: The field to sort by
    :type sort_field: str
    :param descending: The order to return the results. Default is false, which will return the results in ascending order.
    :type descending: bool
    :param start: The index into the record set to start with.
    :type start: int
    :param limit: The total number of record to return.
    :type limit: int
    :param active_only: Determines whether to return only active results. Default is false.
    :type active_only: bool

    :rtype: Union[List[ProfileResponse], Tuple[List[ProfileResponse], int], Tuple[List[ProfileResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def secure_login(version, username, password, game_type, device_id=None, charset_name=None, latitude=None, longitude=None, return_profile=None, response_filters=None):  # noqa: E501
    """Login Account (Encrypted Username)

    ogin with encrypted user-name and password. # noqa: E501

    :param version: 
    :type version: 
    :param username: The user&#39;s encrypted email address they used to sign-up
    :type username: str
    :param password: The encrypted password
    :type password: str
    :param game_type: The application key
    :type game_type: str
    :param device_id: The device id
    :type device_id: str
    :param charset_name: Charset Name
    :type charset_name: str
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float
    :param return_profile: Return Profile
    :type return_profile: bool
    :param response_filters: A comma separated list of ProfileFilters for filtering the returned response data
    :type response_filters: str

    :rtype: Union[ProfileResponse, Tuple[ProfileResponse, int], Tuple[ProfileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def secure_signup(version, device_id, username, password, name=None, invite_token=None, prefix_name=None, first_name=None, middle_name=None, last_name=None, suffix_name=None, title=None, device_id_type=None, email_address=None, asset_id=None, address=None, zipcode=None, gender=None, birthday=None, home_phone=None, cell_phone=None, cell_phone_carrier=None, business_phone=None, role=None, platforms=None, tags=None, about_us=None, game_experience=None, category_ids=None, hometown=None, height=None, height_index=None, ethnicity=None, body_type=None, marital_status=None, children=None, religion=None, education=None, education_index=None, smoke=None, drink=None, companionship=None, companionship_index=None, preferred_min_age=None, preferred_max_age=None, preferred_min_height=None, preferred_max_height=None, preferred_gender=None, preferred_education=None, preferred_education_index=None, preferred_body_type=None, preferred_ethnicity=None, preferred_location=None, preferred_location_range=None, latitude=None, longitude=None, accepted_terms=None, charset_name=None, game_type=None, app_key=None, app_version=None, response_type=None):  # noqa: E501
    """Create Account (Encrypted Username)

    Create a new account by role (with encrypted user-name and password) # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id
    :type device_id: str
    :param username: The encrypted email of the user, this is what will be used when they login
    :type username: str
    :param password: The encrypted password of the user
    :type password: str
    :param name: The full name of the user. If this parameter is not empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName 
    :type name: str
    :param invite_token: the inviteToken that the referrer use for this account to sign up
    :type invite_token: str
    :param prefix_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    :type prefix_name: str
    :param first_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    :type first_name: str
    :param middle_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    :type middle_name: str
    :param last_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    :type last_name: str
    :param suffix_name: If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    :type suffix_name: str
    :param title: Title
    :type title: str
    :param device_id_type: Device Id Type
    :type device_id_type: str
    :param email_address: The user&#39;s contact email address (NOT the username) which is also used for email validation
    :type email_address: str
    :param asset_id: The asset id to set the user&#39;s profile image
    :type asset_id: int
    :param address: the user&#39;s address
    :type address: str
    :param zipcode: The street zipcode of the user&#39;s contact location
    :type zipcode: str
    :param gender: The gender of the user AudienceGender
    :type gender: str
    :param birthday: The birthday date of the user in milliseconds
    :type birthday: int
    :param home_phone: the user&#39;s home phone number
    :type home_phone: str
    :param cell_phone: the user&#39;s cell phone number
    :type cell_phone: str
    :param cell_phone_carrier: the user&#39;s Cell Phone Carrier
    :type cell_phone_carrier: str
    :param business_phone: the user&#39;s Business Phone Number
    :type business_phone: str
    :param role: The type of account being created {RETAILER, MEMBER, DEVELOPER, GUEST
    :type role: str
    :param platforms: Comma separated list of development platforms: MAC, WINDOWS, IOS, ANDROID, WINDOWSPHONE, KINDLE, UNITY3D, COCOS2D, HTML5, FACEBOOK
    :type platforms: str
    :param tags: Search tags
    :type tags: str
    :param about_us: About Us information
    :type about_us: str
    :param game_experience: Game experience level of the user {ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    :type game_experience: str
    :param category_ids: A list of category ids that represent interests and associations
    :type category_ids: str
    :param hometown: The user&#39;s hometown
    :type hometown: str
    :param height: The user&#39;s height
    :type height: str
    :param height_index: The user&#39;s height in a numerical value that can be used for ordering/searching
    :type height_index: int
    :param ethnicity: The user&#39;s ethnicity
    :type ethnicity: str
    :param body_type: The user&#39;s body type
    :type body_type: str
    :param marital_status: The user&#39;s maritial status
    :type marital_status: str
    :param children: The user&#39;s children status
    :type children: str
    :param religion: The user&#39;s religion
    :type religion: str
    :param education: The user&#39;s education
    :type education: str
    :param education_index: The user&#39;s education in a numerical value that can be used for ordering/searching
    :type education_index: int
    :param smoke: The user&#39;s smoke status
    :type smoke: str
    :param drink: The user&#39;s drink status
    :type drink: str
    :param companionship: The user&#39;s companionship status
    :type companionship: str
    :param companionship_index: The user&#39;s companionship index
    :type companionship_index: int
    :param preferred_min_age: The preferred minimum age in the account location search
    :type preferred_min_age: int
    :param preferred_max_age: The preferred maximum age in the account location search
    :type preferred_max_age: int
    :param preferred_min_height: The preferred minimum height in the account location search
    :type preferred_min_height: int
    :param preferred_max_height: The preferred maximum height in the account location search
    :type preferred_max_height: int
    :param preferred_gender: The preferred gender in the account location search
    :type preferred_gender: str
    :param preferred_education: The preferred education in the account location search
    :type preferred_education: str
    :param preferred_education_index: The preferred education in a numerical value that can be used for ordering/searching
    :type preferred_education_index: int
    :param preferred_body_type: The preferred body type in the account location search
    :type preferred_body_type: str
    :param preferred_ethnicity: The preferred ethnicity in the account location search
    :type preferred_ethnicity: str
    :param preferred_location: The preferred education in the account location search
    :type preferred_location: str
    :param preferred_location_range: The preferred location range in the account location search
    :type preferred_location_range: float
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float
    :param accepted_terms: Accepted Terms
    :type accepted_terms: bool
    :param charset_name: Charset Name
    :type charset_name: str
    :param game_type: Game Type
    :type game_type: str
    :param app_key: The application key
    :type app_key: str
    :param app_version: App Version
    :type app_version: str
    :param response_type: Response Type
    :type response_type: str

    :rtype: Union[ProfileInfoResponse, Tuple[ProfileInfoResponse, int], Tuple[ProfileInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_match_token(version, device_id=None, account_id=None, match_token=None, game_type=None, app_key=None, latitude=None, longitude=None):  # noqa: E501
    """Save Match Token

    Save user&#39;s match token to be used for profile match making # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param match_token: A string of numbers
    :type match_token: str
    :param game_type: Game Type (deprecated)
    :type game_type: str
    :param app_key: The application key
    :type app_key: str
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_actve_status(version, account_id, connection_account_id, active, device_id=None, app_key=None):  # noqa: E501
    """Update Account Active Status

    Activate or deactivate an account (requires appropriate permissions). # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: The account id of the user you want to modify (if this is not set, then the accountId parameter will be used instead)
    :type connection_account_id: int
    :param active: true will activate the user and false will deactivate
    :type active: bool
    :param device_id: the device id (deviceId or accountId required)
    :type device_id: str
    :param app_key: the application key that the user belongs to
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_location(version, device_id=None, account_id=None, latitude=None, longitude=None, client_time=None):  # noqa: E501
    """Update Location

    Update the account location # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float
    :param client_time: The time of the update
    :type client_time: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_settings(version, device_id=None, account_id=None, blocked_notifications=None, suggestion_method=None, suggestion_count=None, suggestion_time_frame=None, show_others_exact_location=None, show_as_zipcode=None, show_exact_location=None, favorite_visibility=None, latitude=None, longitude=None):  # noqa: E501
    """Update Account Settings

    Update the account settings for a user # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param blocked_notifications: The notifications to be blocked
    :type blocked_notifications: str
    :param suggestion_method: How suggestions are to be sent (APNS, MOBILE_NOTIFICATION, SMS)
    :type suggestion_method: str
    :param suggestion_count: How many suggestions to receive per time frame
    :type suggestion_count: int
    :param suggestion_time_frame: The time frame in seconds, 3600 would be a 1 hour time frame
    :type suggestion_time_frame: int
    :param show_others_exact_location: Show Others Exact Location
    :type show_others_exact_location: bool
    :param show_as_zipcode: Show As Zipcode
    :type show_as_zipcode: bool
    :param show_exact_location: Show Exact Location
    :type show_exact_location: bool
    :param favorite_visibility: Show favorites
    :type favorite_visibility: str
    :param latitude: The current latitude of the user
    :type latitude: float
    :param longitude: The current longitude of the user
    :type longitude: float

    :rtype: Union[UserSettingsResponse, Tuple[UserSettingsResponse, int], Tuple[UserSettingsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def validate_account_signup(version, token):  # noqa: E501
    """Save Validation Status

    Validate the account&#39;s email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token. # noqa: E501

    :param version: 
    :type version: 
    :param token: The token associated with the account to update, good for 24 hours
    :type token: str

    :rtype: Union[AccountLoginResponse, Tuple[AccountLoginResponse, int], Tuple[AccountLoginResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def validate_password_reset(version, token):  # noqa: E501
    """Validate Password Reset Token

    Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password. # noqa: E501

    :param version: 
    :type version: 
    :param token: The token associated with the account to update, good for 24 hours
    :type token: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
