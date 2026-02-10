import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.account_list_response import AccountListResponse  # noqa: E501
from openapi_server.models.application_response import ApplicationResponse  # noqa: E501
from openapi_server.models.application_settings_response import ApplicationSettingsResponse  # noqa: E501
from openapi_server.models.application_short_response import ApplicationShortResponse  # noqa: E501
from openapi_server.models.placement_response import PlacementResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_application(version, app_name, device_id=None, account_id=None, about=None, bundle_id=None, app_icon_asset_id=None, app_logo_asset_id=None, facebook_app_id=None, facebook_app_secret=None, google_api_key=None, update_eula_date=None, eula_version=None, landing_page_url=None, show_in_activities=None, activity_description=None, invite_welcome_text=None, invite_page_url=None, url_scheme=None, platforms=None, download_urls=None, category_ids=None, scoring_type=None, hint_cost=None, max_score=None, tickets_per_point=None, has_game_data=None, public_notifications=None, use_matching_algorithm=None, global_tickets=None, build_version=None, api_version=None, placement_name=None, placement_description=None, placement_size=None, placement_height=None, placement_width=None, placement_refresh_interval=None, create_object_store=None, public_content_approval=None, production_mode=None, minimum_session_length=None, session_gap_length=None, local_ads_enabled=None, sqoot_api_key=None, trilat_processing_type=None, max_sample_size=None, min_rssi=None, modules=None, authorized_count=None, authorized_servers=None, default_timezone=None, smtp_pass=None, meta_data=None, placement_meta_data=None, ips_floor=None, enable_apns_badge=None, include_in_report=None, default_app_filter_id=None, enable_welcome_email=None, apple_app_id=None, apple_team_id=None, apple_auth_key_id=None, apple_auth_key=None, apple_issuer_id=None, app_store_key_id=None, app_store_key=None, google_private_key_file=None, authorize_net_api_key=None, authorize_net_transaction_key=None, email_sender=None, smtp_user=None, smtp_host=None, vatom_business_id=None, vatom_rest_client_id=None, vatom_rest_secret_key=None, twilio_account_sid=None, twilio_auth_token=None, twilio_sender_phone_number=None, open_ai_secret_key=None):  # noqa: E501
    """Create Application

    Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}. # noqa: E501

    :param version: 
    :type version: 
    :param app_name: The name of the application
    :type app_name: str
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param about: The description of the application
    :type about: str
    :param bundle_id: The application bundle identifier (format - com.company.appName)
    :type bundle_id: str
    :param app_icon_asset_id: The application icon asset id
    :type app_icon_asset_id: int
    :param app_logo_asset_id: The application logo asset id
    :type app_logo_asset_id: int
    :param facebook_app_id: The Facebook application id
    :type facebook_app_id: str
    :param facebook_app_secret: The Facebook application secret
    :type facebook_app_secret: str
    :param google_api_key: This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging
    :type google_api_key: str
    :param update_eula_date: Determines whether to update the EULA date
    :type update_eula_date: bool
    :param eula_version: The EULA version
    :type eula_version: str
    :param landing_page_url: The landing page URL
    :type landing_page_url: str
    :param show_in_activities: Determines whether to show the application in the activity feed
    :type show_in_activities: bool
    :param activity_description: The description of the application in the activity feed
    :type activity_description: str
    :param invite_welcome_text: The text to display on the invite page
    :type invite_welcome_text: str
    :param invite_page_url: The url to the application invite page
    :type invite_page_url: str
    :param url_scheme: The protocal the app uses to load the app via a browser
    :type url_scheme: str
    :param platforms: A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; 
    :type platforms: str
    :param download_urls: Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  
    :type download_urls: str
    :param category_ids: List of categories to apply
    :type category_ids: str
    :param scoring_type: The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT
    :type scoring_type: str
    :param hint_cost: The cost of hints
    :type hint_cost: int
    :param max_score: The maximum score that will be possible
    :type max_score: int
    :param tickets_per_point: The point-to-ticket conversion ratio
    :type tickets_per_point: float
    :param has_game_data: Determines whether the application uses services to save custom game objects
    :type has_game_data: bool
    :param public_notifications: Public Notifications
    :type public_notifications: bool
    :param use_matching_algorithm: Use Matching Algorithm
    :type use_matching_algorithm: bool
    :param global_tickets: Determines whether earned tickets are applied across all applications
    :type global_tickets: bool
    :param build_version: The current build version of the application
    :type build_version: float
    :param api_version: The current API version the application uses
    :type api_version: float
    :param placement_name: The name of the placement
    :type placement_name: str
    :param placement_description: The description of the placement
    :type placement_description: str
    :param placement_size: The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)
    :type placement_size: str
    :param placement_height: The height of a custom ad size
    :type placement_height: int
    :param placement_width: The width of a custom ad size
    :type placement_width: int
    :param placement_refresh_interval: The refresh interval in seconds
    :type placement_refresh_interval: int
    :param create_object_store: Generate a custom object store to use
    :type create_object_store: bool
    :param public_content_approval: Determine whether or not public content requires admin approval before it becomes public
    :type public_content_approval: bool
    :param production_mode: Determines whether the application uses production or sandbox services
    :type production_mode: bool
    :param minimum_session_length: Minimum Session Length
    :type minimum_session_length: int
    :param session_gap_length: Session Gap Length
    :type session_gap_length: int
    :param local_ads_enabled: Local Ads Enabled
    :type local_ads_enabled: bool
    :param sqoot_api_key: Sqoot Api Key
    :type sqoot_api_key: str
    :param trilat_processing_type: Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT
    :type trilat_processing_type: str
    :param max_sample_size: Determines what the maximum sample size during trilateration
    :type max_sample_size: int
    :param min_rssi: Determines what the minimum acceptable RSSI value
    :type min_rssi: float
    :param modules: List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL
    :type modules: str
    :param authorized_count: How many servers the license will support
    :type authorized_count: int
    :param authorized_servers: The list of ip addresses of servers the license will support, leave null for any server
    :type authorized_servers: str
    :param default_timezone: Sets the default timezone for the app (used for leaderboards and other time specific content)
    :type default_timezone: str
    :param smtp_pass: SMTP Pass
    :type smtp_pass: str
    :param meta_data: The application meta data. Defined by the client
    :type meta_data: str
    :param placement_meta_data: The ad placement meta data. Defined by the client
    :type placement_meta_data: str
    :param ips_floor: Create floor tables for Ips
    :type ips_floor: bool
    :param enable_apns_badge: Enables setting the APNS badge value in the payload
    :type enable_apns_badge: bool
    :param include_in_report: Enables using the application in session reports
    :type include_in_report: bool
    :param default_app_filter_id: Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.
    :type default_app_filter_id: int
    :param enable_welcome_email: Enables whether the default welcome email will be sent for new app users
    :type enable_welcome_email: bool
    :param apple_app_id: The Apple Application ID
    :type apple_app_id: str
    :param apple_team_id: The Apple Team ID
    :type apple_team_id: str
    :param apple_auth_key_id: The Apple Auth Key ID
    :type apple_auth_key_id: str
    :param apple_auth_key: The Apple Auth Signin Key (p8) File
    :type apple_auth_key: str
    :param apple_issuer_id: The Apple Issuer ID
    :type apple_issuer_id: str
    :param app_store_key_id: The Apple App Store Key ID
    :type app_store_key_id: str
    :param app_store_key: The Apple App Store Key (p8) File
    :type app_store_key: str
    :param google_private_key_file: This is the private key file for your Google service account.
    :type google_private_key_file: str
    :param authorize_net_api_key: Authorize Net Api Key
    :type authorize_net_api_key: str
    :param authorize_net_transaction_key: Authorize Net Transaction Key
    :type authorize_net_transaction_key: str
    :param email_sender: Email Sender
    :type email_sender: str
    :param smtp_user: SMTP User
    :type smtp_user: str
    :param smtp_host: SMTP Host
    :type smtp_host: str
    :param vatom_business_id: Vatom Business Id
    :type vatom_business_id: str
    :param vatom_rest_client_id: Vatom REST Client Id
    :type vatom_rest_client_id: str
    :param vatom_rest_secret_key: Vatom Secret Key
    :type vatom_rest_secret_key: str
    :param twilio_account_sid: Twilio Account SID
    :type twilio_account_sid: str
    :param twilio_auth_token: Twilio Auth Token
    :type twilio_auth_token: str
    :param twilio_sender_phone_number: Twilio Sender Phone Number
    :type twilio_sender_phone_number: str
    :param open_ai_secret_key: OpenAI Secret API Key
    :type open_ai_secret_key: str

    :rtype: Union[ApplicationResponse, Tuple[ApplicationResponse, int], Tuple[ApplicationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_application_placement(version, app_key, size, device_id=None, account_id=None, name=None, description=None, height=None, width=None, refresh_interval=None, default_image_id=None, active=None):  # noqa: E501
    """Create Ad Placement

    Creates a new ad placement for an application. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The appKey of the application the ad placement is for
    :type app_key: str
    :param size: The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM
    :type size: str
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param name: The name of the placement
    :type name: str
    :param description: The description of the placement
    :type description: str
    :param height: The height of a custom ad size
    :type height: int
    :param width: The width of a custom ad size
    :type width: int
    :param refresh_interval: The refresh interval in seconds
    :type refresh_interval: int
    :param default_image_id: Default Image Id
    :type default_image_id: int
    :param active: Active
    :type active: bool

    :rtype: Union[PlacementResponse, Tuple[PlacementResponse, int], Tuple[PlacementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_application(version, account_id=None, app_key=None):  # noqa: E501
    """Delete Application

    Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the delete, must have rights to edit the application.
    :type account_id: int
    :param app_key: The key of the application to be deleted
    :type app_key: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_application_placement(version, placement_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Ad Placement

    Deletes an ad placement for an application. # noqa: E501

    :param version: 
    :type version: 
    :param placement_id: The id of the placement to delete, the user must have rights to the application the ad placement is for
    :type placement_id: int
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[PlacementResponse, Tuple[PlacementResponse, int], Tuple[PlacementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_application(version, app_key=None, application_id=None):  # noqa: E501
    """Get Application

    Get a specific application by appKey # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The key of the application
    :type app_key: str
    :param application_id: Application Id
    :type application_id: int

    :rtype: Union[ApplicationResponse, Tuple[ApplicationResponse, int], Tuple[ApplicationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_application_placement(version, placement_id, device_id=None, account_id=None):  # noqa: E501
    """Get Ad Placement

    Get details of an ad placement # noqa: E501

    :param version: 
    :type version: 
    :param placement_id: The id of the placement
    :type placement_id: int
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    :rtype: Union[PlacementResponse, Tuple[PlacementResponse, int], Tuple[PlacementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_application_versions(version):  # noqa: E501
    """Get API versions

    Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8 # noqa: E501

    :param version: 
    :type version: 

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_unique_users_by_app(version, app_key, q=None, keyword=None, since=None, i=None, start=None, l=None, limit=None):  # noqa: E501
    """Search Application Users

    Get a list of users per application # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key
    :type app_key: str
    :param q: Q
    :type q: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param since: Return accounts that have been active after this date (UNIX time-stamp in milliseconds)
    :type since: int
    :param i: the start of the index
    :type i: int
    :param start: The start of the pagination
    :type start: int
    :param l: the limit of the index
    :type l: int
    :param limit: The limit of the pagination
    :type limit: int

    :rtype: Union[AccountListResponse, Tuple[AccountListResponse, int], Tuple[AccountListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_applications(version, account_id=None, q=None, keyword=None, platforms=None, device_ids=None, device_versions=None, category_ids=None, sort_field=None, has_ads=None, public_notifications=None, filter_billable=None, filter_content_admin=None, descending=None, i=None, start=None, l=None, limit=None, application_ids=None, has_object_store=None, active_only=None):  # noqa: E501
    """List Applications

    List active applications matching the criteria (as a consumer) # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the application owner/manager
    :type account_id: int
    :param q: Q
    :type q: str
    :param keyword: The keyword used to search for title, about, and description fields
    :type keyword: str
    :param platforms: Deprecated, use deviceIds and deviceVersions
    :type platforms: str
    :param device_ids: The list of targeted device ids, comma separated; possible values are retreived via /api/{version/audience/devices com.sirqul.geoapps.common.service.AudienceApi#getDevices getDevices (pass in deviceId values)
    :type device_ids: str
    :param device_versions: The list of targeted device version ranges that are aligned  with the provided devices list (see devices param for possible values),  comma separated; examples are: 2.3-X, 0-5.1.4, 4.3.1-6.1.4 where X  is no maximum and 0 is no minimum. 
    :type device_versions: str
    :param category_ids: The list of category ids to filter the list by
    :type category_ids: str
    :param sort_field: The column to sort the search on, possible values include: UPDATED (default), CREATED, TITLE
    :type sort_field: str
    :param has_ads: Filter results on whether the application supports ads or not. Ignore this parameter to return all results.
    :type has_ads: bool
    :param public_notifications: Filter results on whether the application is available for public trigger notifications
    :type public_notifications: bool
    :param filter_billable: Determines whether to only return applications that the user has access to
    :type filter_billable: bool
    :param filter_content_admin: Determines whether to only return applications that the user is a content admin of
    :type filter_content_admin: bool
    :param descending: The order to return the search results
    :type descending: bool
    :param i: the start of the index
    :type i: int
    :param start: The start of the pagination
    :type start: int
    :param l: The limit of the index
    :type l: int
    :param limit: The limit of the pagination
    :type limit: int
    :param application_ids: The list of application ids, comma separated. If provided will ignore all other params.
    :type application_ids: str
    :param has_object_store: Only include applications with a object store (default is false)
    :type has_object_store: bool
    :param active_only: Return only active results
    :type active_only: bool

    :rtype: Union[List[ApplicationShortResponse], Tuple[List[ApplicationShortResponse], int], Tuple[List[ApplicationShortResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_application_placement(version, app_key, device_id=None, account_id=None, start=None, limit=None):  # noqa: E501
    """Search for Ad Placements

    Searches placements for an application. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The key of the application
    :type app_key: str
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param start: The start of the pagination
    :type start: int
    :param limit: The limit of the pagination
    :type limit: int

    :rtype: Union[List[PlacementResponse], Tuple[List[PlacementResponse], int], Tuple[List[PlacementResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def search_application_settings(version, device_id=None, account_id=None, connection_account_id=None, keyword=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search for Application Settings

    Returns a list of applications that the user has logged into before, and returns specific settings for that application and user # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param connection_account_id: The account id used to view another person&#39;s account
    :type connection_account_id: int
    :param keyword: The string to search applications on
    :type keyword: str
    :param sort_field: The column to sort the search on. Possible values include: CREATED, UPDATED, APPLICATION_TITLE
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param start: The start index for pagination
    :type start: int
    :param limit: The limit per result set for pagination
    :type limit: int

    :rtype: Union[ApplicationSettingsResponse, Tuple[ApplicationSettingsResponse, int], Tuple[ApplicationSettingsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_applications(version, device_id=None, account_id=None, latitude=None, longitude=None, q=None, keyword=None, q_search_fields=None, sort_field=None, descending=None, i=None, start=None, l=None, limit=None, has_ads=None, public_notifications=None, active_only=None):  # noqa: E501
    """Search Applications

    Search for applications matching the criteria that the logged in user has access to # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param latitude: The location of the device
    :type latitude: float
    :param longitude: The location of the device
    :type longitude: float
    :param q: Q
    :type q: str
    :param keyword: The keyword used to search
    :type keyword: str
    :param q_search_fields: The columns to applied the keyword search to
    :type q_search_fields: str
    :param sort_field: The column to sort the search on
    :type sort_field: str
    :param descending: The order to return the search results
    :type descending: bool
    :param i: the start of the index
    :type i: int
    :param start: The start of the pagination
    :type start: int
    :param l: the limit of the index
    :type l: int
    :param limit: The limit of the pagination
    :type limit: int
    :param has_ads: Filter results on whether the application supports ads or not. Ignore this parameter to return all results.
    :type has_ads: bool
    :param public_notifications: Filter results on whether the application is available for public trigger notifications
    :type public_notifications: bool
    :param active_only: Return only active results
    :type active_only: bool

    :rtype: Union[List[ApplicationResponse], Tuple[List[ApplicationResponse], int], Tuple[List[ApplicationResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_application(version, app_key, app_name, device_id=None, account_id=None, about=None, bundle_id=None, app_icon_asset_id=None, app_logo_asset_id=None, facebook_app_id=None, facebook_app_secret=None, google_api_key=None, update_eula_date=None, eula_version=None, landing_page_url=None, show_in_activities=None, activity_description=None, invite_welcome_text=None, invite_page_url=None, url_scheme=None, platforms=None, download_urls=None, category_ids=None, scoring_type=None, hint_cost=None, max_score=None, tickets_per_point=None, has_game_data=None, public_notifications=None, use_matching_algorithm=None, global_tickets=None, build_version=None, api_version=None, placement_name=None, placement_description=None, placement_size=None, placement_height=None, placement_width=None, placement_refresh_interval=None, create_object_store=None, public_content_approval=None, production_mode=None, minimum_session_length=None, session_gap_length=None, local_ads_enabled=None, sqoot_api_key=None, trilat_processing_type=None, max_sample_size=None, min_rssi=None, modules=None, authorized_count=None, authorized_servers=None, default_timezone=None, smtp_pass=None, meta_data=None, placement_meta_data=None, ips_floor=None, enable_apns_badge=None, include_in_report=None, default_app_filter_id=None, enable_welcome_email=None, apple_app_id=None, apple_team_id=None, apple_auth_key_id=None, apple_auth_key=None, apple_issuer_id=None, app_store_key_id=None, app_store_key=None, google_private_key_file=None, authorize_net_api_key=None, authorize_net_transaction_key=None, email_sender=None, smtp_user=None, smtp_host=None, vatom_business_id=None, vatom_rest_client_id=None, vatom_rest_secret_key=None, twilio_account_sid=None, twilio_auth_token=None, twilio_sender_phone_number=None, open_ai_secret_key=None):  # noqa: E501
    """Update Application

    Update an application record # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key for updating an existing application
    :type app_key: str
    :param app_name: The name of the application
    :type app_name: str
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param about: The description of the application
    :type about: str
    :param bundle_id: The application bundle identifier (format - com.company.appName)
    :type bundle_id: str
    :param app_icon_asset_id: The application icon asset id
    :type app_icon_asset_id: int
    :param app_logo_asset_id: The application logo asset id
    :type app_logo_asset_id: int
    :param facebook_app_id: The Facebook application id
    :type facebook_app_id: str
    :param facebook_app_secret: The Facebook application secret
    :type facebook_app_secret: str
    :param google_api_key: This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging
    :type google_api_key: str
    :param update_eula_date: Determines whether to update the EULA date
    :type update_eula_date: bool
    :param eula_version: The EULA version
    :type eula_version: str
    :param landing_page_url: The landing page URL
    :type landing_page_url: str
    :param show_in_activities: Determines whether to show the application in the activity feed
    :type show_in_activities: bool
    :param activity_description: The description of the application in the activity feed
    :type activity_description: str
    :param invite_welcome_text: The text to display on the invite page
    :type invite_welcome_text: str
    :param invite_page_url: The url to the application invite page
    :type invite_page_url: str
    :param url_scheme: The protocal the app uses to load the app via a browser
    :type url_scheme: str
    :param platforms: A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; 
    :type platforms: str
    :param download_urls: Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  
    :type download_urls: str
    :param category_ids: List of categories to apply
    :type category_ids: str
    :param scoring_type: The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT
    :type scoring_type: str
    :param hint_cost: The cost of hints
    :type hint_cost: int
    :param max_score: The maximum score that will be possible
    :type max_score: int
    :param tickets_per_point: The point-to-ticket conversion ratio
    :type tickets_per_point: float
    :param has_game_data: Determines whether the application uses services to save custom game objects
    :type has_game_data: bool
    :param public_notifications: Public Notifications
    :type public_notifications: bool
    :param use_matching_algorithm: Use Matching Algorithm
    :type use_matching_algorithm: bool
    :param global_tickets: Determines whether earned tickets are applied across all applications
    :type global_tickets: bool
    :param build_version: The current build version of the application
    :type build_version: float
    :param api_version: The current API version the application uses
    :type api_version: float
    :param placement_name: The name of the placement
    :type placement_name: str
    :param placement_description: The description of the placement
    :type placement_description: str
    :param placement_size: The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)
    :type placement_size: str
    :param placement_height: The height of a custom ad size
    :type placement_height: int
    :param placement_width: The width of a custom ad size
    :type placement_width: int
    :param placement_refresh_interval: The refresh interval in seconds
    :type placement_refresh_interval: int
    :param create_object_store: Generate a custom object store to use
    :type create_object_store: bool
    :param public_content_approval: Determine whether or not public content requires admin approval before it becomes public
    :type public_content_approval: bool
    :param production_mode: Determines whether the application uses production or sandbox services
    :type production_mode: bool
    :param minimum_session_length: Minimum Session Length
    :type minimum_session_length: int
    :param session_gap_length: Session Gap Length
    :type session_gap_length: int
    :param local_ads_enabled: Local Ads Enabled
    :type local_ads_enabled: bool
    :param sqoot_api_key: Sqoot Api Key
    :type sqoot_api_key: str
    :param trilat_processing_type: Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT
    :type trilat_processing_type: str
    :param max_sample_size: Determines what the maximum sample size during trilateration
    :type max_sample_size: int
    :param min_rssi: Determines what the minimum acceptable RSSI value
    :type min_rssi: float
    :param modules: List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL
    :type modules: str
    :param authorized_count: How many servers the license will support
    :type authorized_count: int
    :param authorized_servers: The list of ip addresses of servers the license will support, leave null for any server
    :type authorized_servers: str
    :param default_timezone: Sets the default timezone for the app (used for leaderboards and other time specific content)
    :type default_timezone: str
    :param smtp_pass: SMTP Pass
    :type smtp_pass: str
    :param meta_data: The application meta data. Defined by the client
    :type meta_data: str
    :param placement_meta_data: The ad placement meta data. Defined by the client
    :type placement_meta_data: str
    :param ips_floor: Create floor tables for Ips
    :type ips_floor: bool
    :param enable_apns_badge: Enables setting the APNS badge value in the payload
    :type enable_apns_badge: bool
    :param include_in_report: Enables using the application in session reports
    :type include_in_report: bool
    :param default_app_filter_id: Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.
    :type default_app_filter_id: int
    :param enable_welcome_email: Enables whether the default welcome email will be sent for new app users
    :type enable_welcome_email: bool
    :param apple_app_id: The Apple Application ID
    :type apple_app_id: str
    :param apple_team_id: The Apple Team ID
    :type apple_team_id: str
    :param apple_auth_key_id: The Apple Auth Key ID
    :type apple_auth_key_id: str
    :param apple_auth_key: The Apple Auth Signin Key (p8) File
    :type apple_auth_key: str
    :param apple_issuer_id: The Apple Issuer ID
    :type apple_issuer_id: str
    :param app_store_key_id: The Apple App Store Key ID
    :type app_store_key_id: str
    :param app_store_key: The Apple App Store Key (p8) File
    :type app_store_key: str
    :param google_private_key_file: This is the private key file for your Google service account.
    :type google_private_key_file: str
    :param authorize_net_api_key: Authorize Net Api Key
    :type authorize_net_api_key: str
    :param authorize_net_transaction_key: Authorize Net Transaction Key
    :type authorize_net_transaction_key: str
    :param email_sender: Email Sender
    :type email_sender: str
    :param smtp_user: SMTP User
    :type smtp_user: str
    :param smtp_host: SMTP Host
    :type smtp_host: str
    :param vatom_business_id: Vatom Business Id
    :type vatom_business_id: str
    :param vatom_rest_client_id: Vatom REST Client Id
    :type vatom_rest_client_id: str
    :param vatom_rest_secret_key: Vatom Secret Key
    :type vatom_rest_secret_key: str
    :param twilio_account_sid: Twilio Account SID
    :type twilio_account_sid: str
    :param twilio_auth_token: Twilio Auth Token
    :type twilio_auth_token: str
    :param twilio_sender_phone_number: Twilio Sender Phone Number
    :type twilio_sender_phone_number: str
    :param open_ai_secret_key: OpenAI Secret API Key
    :type open_ai_secret_key: str

    :rtype: Union[ApplicationResponse, Tuple[ApplicationResponse, int], Tuple[ApplicationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_application_active(version, account_id, app_key, active):  # noqa: E501
    """Change Appliation Status

    Set the application&#39;s active flag to true/false. This effectively activates or deactivates the application. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the delete, must have rights to edit the application.
    :type account_id: int
    :param app_key: The key of the application to be deleted
    :type app_key: str
    :param active: If true then set to active, false otherwise
    :type active: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_application_placement(version, placement_id, device_id=None, account_id=None, name=None, description=None, size=None, height=None, width=None, refresh_interval=None, default_image_id=None, active=None):  # noqa: E501
    """Update Ad Placement

    Updates an ad placement for an application. # noqa: E501

    :param version: 
    :type version: 
    :param placement_id: The id of the placement to update, the user must have rights to the application the ad placement is for
    :type placement_id: int
    :param device_id: The unique id of the device making the request (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param name: The name of the placement
    :type name: str
    :param description: The description of the placement
    :type description: str
    :param size: The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM
    :type size: str
    :param height: The height of a custom ad size
    :type height: int
    :param width: The width of a custom ad size
    :type width: int
    :param refresh_interval: The refresh interval in seconds
    :type refresh_interval: int
    :param default_image_id: Default Image Id
    :type default_image_id: int
    :param active: Active
    :type active: bool

    :rtype: Union[PlacementResponse, Tuple[PlacementResponse, int], Tuple[PlacementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def upload_application_certificate(version, app_key, device_id=None, account_id=None, certificate=None):  # noqa: E501
    """Create Application Certificate

    Uploads a certificate for an application that the user has access to. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The key of the application
    :type app_key: str
    :param device_id: Device Id
    :type device_id: str
    :param account_id: The account used to perform the delete, must have rights to edit the application.
    :type account_id: int
    :param certificate: Certificate
    :type certificate: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
