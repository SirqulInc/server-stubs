import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.payment_types_response import PaymentTypesResponse  # noqa: E501
from openapi_server import util


def add_payment_method(version, account_id, payment_method_id=None, account_name=None, first_name=None, last_name=None, address=None, city=None, state=None, postal_code=None, country=None, phone=None, credit_card_number=None, expiration_date=None, ccv=None, account_number=None, bank_name=None, routing_number=None, default_payment_method=None, payment_method_nickname=None, tax_id=None, provider_customer_profile_id=None, provider_payment_profile_id=None, meta_data=None):  # noqa: E501
    """Update Payment Method

    Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the the request
    :type account_id: int
    :param payment_method_id: Payment Method Id
    :type payment_method_id: int
    :param account_name: the name of the account
    :type account_name: str
    :param first_name: First Name that the account is filed as
    :type first_name: str
    :param last_name: Last Name that the account is filed as
    :type last_name: str
    :param address: Address that the account is filed as
    :type address: str
    :param city: City that the account is filed as
    :type city: str
    :param state: State that the account is filed as
    :type state: str
    :param postal_code: Postal Code that the account is filed as
    :type postal_code: str
    :param country: Country that the account is filed as
    :type country: str
    :param phone: Phone that the account is filed as
    :type phone: str
    :param credit_card_number: The full credit card number to store on file
    :type credit_card_number: str
    :param expiration_date: The credit card expiration date YYYY-MM
    :type expiration_date: str
    :param ccv: The 3 digit confirmation code
    :type ccv: str
    :param account_number: The bank account number
    :type account_number: str
    :param bank_name: The bank name
    :type bank_name: str
    :param routing_number: Routing Number
    :type routing_number: str
    :param default_payment_method: Default Payment Method
    :type default_payment_method: bool
    :param payment_method_nickname: Payment Method Nickname
    :type payment_method_nickname: str
    :param tax_id: Tax Id
    :type tax_id: str
    :param provider_customer_profile_id: Provider customer profile Id
    :type provider_customer_profile_id: str
    :param provider_payment_profile_id: Provider customer payment profile Id
    :type provider_payment_profile_id: str
    :param meta_data: Meta Data
    :type meta_data: str

    :rtype: Union[PaymentTypesResponse, Tuple[PaymentTypesResponse, int], Tuple[PaymentTypesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_payment_method(version, account_id, account_name=None, first_name=None, last_name=None, address=None, city=None, state=None, postal_code=None, country=None, phone=None, credit_card_number=None, expiration_date=None, ccv=None, account_number=None, bank_name=None, routing_number=None, payment_method_nickname=None, tax_id=None, default_payment_method=None, auth_token=None, provider=None, provider_customer_profile_id=None, provider_payment_profile_id=None, meta_data=None, app_key=None):  # noqa: E501
    """Create Payment Method

    Add a new method of payment. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the the request
    :type account_id: int
    :param account_name: Account Name of the credit card user
    :type account_name: str
    :param first_name: The first name on the credit card
    :type first_name: str
    :param last_name: The last name on the credit card
    :type last_name: str
    :param address: The billing address of the credit card
    :type address: str
    :param city: The billing city of the credit card
    :type city: str
    :param state: The billing state of the credit card
    :type state: str
    :param postal_code: The billing zip code of the credit card
    :type postal_code: str
    :param country: Country of the credit card
    :type country: str
    :param phone: The billing phone of the credit card
    :type phone: str
    :param credit_card_number: The full credit card number to store on file
    :type credit_card_number: str
    :param expiration_date: The credit card expiration date YYYY-MM
    :type expiration_date: str
    :param ccv: The 3 digit confirmation code
    :type ccv: str
    :param account_number: The bank account number
    :type account_number: str
    :param bank_name: The bank name
    :type bank_name: str
    :param routing_number: The bank routing number
    :type routing_number: str
    :param payment_method_nickname: The nickname to give the payment method
    :type payment_method_nickname: str
    :param tax_id: Tax Id
    :type tax_id: str
    :param default_payment_method: Whether this should be the default payment method
    :type default_payment_method: bool
    :param auth_token: An authorization token for providers that provide this (like Amazon Payments)
    :type auth_token: str
    :param provider: The payment provider (see PaymentMethodProvider)
    :type provider: str
    :param provider_customer_profile_id: Provider customer profile Id
    :type provider_customer_profile_id: str
    :param provider_payment_profile_id: Provider customer payment profile Id
    :type provider_payment_profile_id: str
    :param meta_data: Meta Data
    :type meta_data: str
    :param app_key: Application Key
    :type app_key: str

    :rtype: Union[PaymentTypesResponse, Tuple[PaymentTypesResponse, int], Tuple[PaymentTypesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_smart_contract(version, account_id, token_name, token_symbol, payment_method_id=None):  # noqa: E501
    """Create Smart Contract

    Adds a smart contract. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the the request
    :type account_id: int
    :param token_name: The token name
    :type token_name: str
    :param token_symbol: The token symbol
    :type token_symbol: str
    :param payment_method_id: The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    :type payment_method_id: int

    :rtype: Union[PaymentTypesResponse, Tuple[PaymentTypesResponse, int], Tuple[PaymentTypesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_crypto_balance(version, account_id, owner_account_id=None, payment_method_id=None):  # noqa: E501
    """Get Crypto Balances

    Get the cypto balance details for a user # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the the request
    :type account_id: int
    :param owner_account_id: The account to retreive balances for
    :type owner_account_id: int
    :param payment_method_id: The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    :type payment_method_id: int

    :rtype: Union[PaymentTypesResponse, Tuple[PaymentTypesResponse, int], Tuple[PaymentTypesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_payment_method(version, account_id, payment_method_id=None, get_current_balance=None):  # noqa: E501
    """Get Payment Method

    Get the details of the user&#39;s payment method or their current default method of payment # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account used to perform the the request
    :type account_id: int
    :param payment_method_id: The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    :type payment_method_id: int
    :param get_current_balance: Determines whether to get the user&#39;s current balance for the requested payment method option (not all payment method options support this)
    :type get_current_balance: bool

    :rtype: Union[PaymentTypesResponse, Tuple[PaymentTypesResponse, int], Tuple[PaymentTypesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_payment_method(version, account_id, provider=None, type=None, keyword=None, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search Payment Methods

    Search the payment methods of an account # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Account Id to search on
    :type account_id: int
    :param provider: Provider to search on
    :type provider: str
    :param type: the type to search on
    :type type: str
    :param keyword: the keyword to search on
    :type keyword: str
    :param sort_field: the sort field to use for the search
    :type sort_field: str
    :param descending: if the results should be in descending order
    :type descending: bool
    :param start: the start of the search
    :type start: int
    :param limit: the limit of the search
    :type limit: int

    :rtype: Union[PaymentTypesResponse, Tuple[PaymentTypesResponse, int], Tuple[PaymentTypesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
