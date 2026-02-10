import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.employee_response import EmployeeResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def assign_employee(version, account_id, manager_account_id, employee_account_id, role=None):  # noqa: E501
    """Assign Employee

    Assign An existing account to be an employee # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param manager_account_id: The account id of the manager to assign under
    :type manager_account_id: int
    :param employee_account_id: The account id of the user to be assigned as employee
    :type employee_account_id: int
    :param role: The role to assign to the employee (e.g. RETAILER or RETAILER_LIMITED)
    :type role: str

    :rtype: Union[EmployeeResponse, Tuple[EmployeeResponse, int], Tuple[EmployeeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def assign_to_location_employee(version, account_id, retailer_location_id, employee_account_id=None, assign=None):  # noqa: E501
    """Assign Employee to Location

    Assign or unassign the account to a retailer location. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param retailer_location_id: The retailer location to apply the change to
    :type retailer_location_id: int
    :param employee_account_id: The account id of the user to apply the change to
    :type employee_account_id: int
    :param assign: If true (default) assign to the location, otherwise remove from the retailer
    :type assign: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_employee(version, account_id, manager_account_id, username, password, name=None, prefix_name=None, first_name=None, middle_name=None, last_name=None, suffix_name=None, title=None, about_us=None, asset_id=None, gender=None, home_phone=None, cell_phone=None, cell_phone_carrier=None, business_phone=None, email_address=None, street_address=None, street_address2=None, city=None, state=None, zipcode=None, country=None, role=None, retailer_location_ids=None, settings_app_key=None, app_blob=None, assigned_device_id=None):  # noqa: E501
    """Create Employee

    Create a new account record with the provided information. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param manager_account_id: The account id of the manager to assign under
    :type manager_account_id: int
    :param username: The username/email for the new user. This must be unique across the entire the system.
    :type username: str
    :param password: The password for the new user
    :type password: str
    :param name: a name field
    :type name: str
    :param prefix_name: The name prefix; Mr, Mrs, etc
    :type prefix_name: str
    :param first_name: The first name
    :type first_name: str
    :param middle_name: The middle name
    :type middle_name: str
    :param last_name: The last name
    :type last_name: str
    :param suffix_name: The name suffix; Jr, Sr, III, etc
    :type suffix_name: str
    :param title: The title of the user
    :type title: str
    :param about_us: Additional about/biography text
    :type about_us: str
    :param asset_id: the asset id to set the user&#39;s profile image
    :type asset_id: int
    :param gender: The gender
    :type gender: str
    :param home_phone: The home phone number
    :type home_phone: str
    :param cell_phone: The cellular phone number
    :type cell_phone: str
    :param cell_phone_carrier: The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers.
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
    :param role: The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED
    :type role: str
    :param retailer_location_ids: the retailer location IDs the employee is associated with
    :type retailer_location_ids: str
    :param settings_app_key: Determines whether to return the application settings for the employee for a particular application
    :type settings_app_key: str
    :param app_blob: external custom client defined data (per Application)
    :type app_blob: str
    :param assigned_device_id: The device id to assign to the user (used for IPS beacon tracking)
    :type assigned_device_id: str

    :rtype: Union[EmployeeResponse, Tuple[EmployeeResponse, int], Tuple[EmployeeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_employee(version, account_id, employee_account_id):  # noqa: E501
    """Delete Employee

    Set the deleted date field which marks the record as deleted. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param employee_account_id: the id of the employee to delete
    :type employee_account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_employee(version, account_id, employee_account_id, settings_app_key=None):  # noqa: E501
    """Get Employee

    Get the account record for the account id provided. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of logged in user
    :type account_id: int
    :param employee_account_id: the id of the employee account to get
    :type employee_account_id: int
    :param settings_app_key: Determines whether to return the application settings for the employee for a particular application
    :type settings_app_key: str

    :rtype: Union[EmployeeResponse, Tuple[EmployeeResponse, int], Tuple[EmployeeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_employees(version, account_id, role=None, retailer_id=None, retailer_location_id=None, q=None, keyword=None, sort_field=None, descending=None, i=None, start=None, l=None, limit=None, active_only=None, managed_only=None, settings_app_key=None, category_ids=None, query=None):  # noqa: E501
    """Search Employees

    Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param role: The role to limit the search to: RETAILER or RETAILER_LIMITED. Leave empty to search on both roles.
    :type role: str
    :param retailer_id: Filters employees by retailer
    :type retailer_id: int
    :param retailer_location_id: Filter employees by retailer locations
    :type retailer_location_id: int
    :param q: Deprecated parameter
    :type q: str
    :param keyword: an optional keyword to search on; ignored if empty
    :type keyword: str
    :param sort_field: The field to sort by. Possible values include: DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, RETAILER_LOCATION_NAME, RETAILER_NAME
    :type sort_field: str
    :param descending: Determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param i: Deprecated parameter
    :type i: int
    :param start: Start the result set at some index
    :type start: int
    :param l: Deprecated parameter
    :type l: int
    :param limit: Limit the result to some number
    :type limit: int
    :param active_only: Filter results to only return active employees
    :type active_only: bool
    :param managed_only: Filter results to only employees that you manage
    :type managed_only: bool
    :param settings_app_key: Determines whether to return the application settings for the employee for a particular application
    :type settings_app_key: str
    :param category_ids: Comma separated list of category ids to filter results
    :type category_ids: str
    :param query: Legacy/reporting query parameter used for formatting employee responses
    :type query: str

    :rtype: Union[List[EmployeeResponse], Tuple[List[EmployeeResponse], int], Tuple[List[EmployeeResponse], int, Dict[str, str]]
    """
    return 'do some magic!'


def unassign_employee(version, account_id, employee_account_id):  # noqa: E501
    """Unassign Employee

    Unassign An existing account to be an employee # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param employee_account_id: The account id of the user to be unassigned
    :type employee_account_id: int

    :rtype: Union[EmployeeResponse, Tuple[EmployeeResponse, int], Tuple[EmployeeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_employee(version, account_id, employee_account_id, manager_account_id=None, name=None, prefix_name=None, first_name=None, middle_name=None, last_name=None, suffix_name=None, title=None, asset_id=None, gender=None, home_phone=None, cell_phone=None, cell_phone_carrier=None, business_phone=None, email_address=None, street_address=None, street_address2=None, city=None, state=None, zipcode=None, country=None, role=None, active=None, password=None, retailer_location_ids=None, settings_app_key=None, app_blob=None, assigned_device_id=None):  # noqa: E501
    """Update Employee

    Update the account record with the provided information. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the logged in user
    :type account_id: int
    :param employee_account_id: the id of the employee account
    :type employee_account_id: int
    :param manager_account_id: The account id of the manager to assign under
    :type manager_account_id: int
    :param name: a name field
    :type name: str
    :param prefix_name: The name prefix; Mr, Mrs, etc
    :type prefix_name: str
    :param first_name: The first name
    :type first_name: str
    :param middle_name: The middle name
    :type middle_name: str
    :param last_name: The last name
    :type last_name: str
    :param suffix_name: The name suffix; Jr, Sr, III, etc
    :type suffix_name: str
    :param title: The title of the user
    :type title: str
    :param asset_id: the asset id to set the user&#39;s profile image
    :type asset_id: int
    :param gender: The gender {MALE, FEMALE, ANY}
    :type gender: str
    :param home_phone: The home phone number
    :type home_phone: str
    :param cell_phone: The cellular phone number
    :type cell_phone: str
    :param cell_phone_carrier: The cellular service provider. This is required for sending SMS. Leave this empty if the provider is not on the list of supported carriers. Supported Carriers: {ATT, QWEST, T_MOBILE, VERIZON, SPRINT, VIRIGIN_MOBILE, NEXTEL, ALLTEL, METRO_PCS, POWERTEL, BOOST_MOBILE, SUNCOM, TRACFONE, US_CELLULAR}
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
    :param role: The role; RETAILER or RETAILER_LIMITED, defaulted to RETAILER_LIMITED
    :type role: str
    :param active: Sets whether the employee is active or inactive
    :type active: bool
    :param password: Sets the password for the employee
    :type password: str
    :param retailer_location_ids: Sets which retailer locations the employee is assigned to
    :type retailer_location_ids: str
    :param settings_app_key: Determines whether to return the application settings for the employee for a particular application
    :type settings_app_key: str
    :param app_blob: external custom client defined data (per Application)
    :type app_blob: str
    :param assigned_device_id: The device id to assign to the user (used for IPS beacon tracking)
    :type assigned_device_id: str

    :rtype: Union[EmployeeResponse, Tuple[EmployeeResponse, int], Tuple[EmployeeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
