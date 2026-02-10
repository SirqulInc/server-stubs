import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.csv_import_response import CsvImportResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def get_status_csv(version, account_id, batch_id, response_group, start, limit):  # noqa: E501
    """Detail Status

     # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param batch_id: the id of the batch
    :type batch_id: int
    :param response_group: The group of categories to return: SUMMARY, DETAILS, ERRORS, OR ALL
    :type response_group: str
    :param start: the start of the pagination
    :type start: int
    :param limit: the limit of the pagination
    :type limit: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_status_csv(version, account_id, start, limit):  # noqa: E501
    """Search Status

    Retrieves batches for a user. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account
    :type account_id: int
    :param start: the start of the pagination
    :type start: int
    :param limit: the limit of the pagination
    :type limit: int

    :rtype: Union[CsvImportResponse, Tuple[CsvImportResponse, int], Tuple[CsvImportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def status_csv(version, account_id, batch_id):  # noqa: E501
    """Batch Status

    Checks status of batch upload. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account
    :type account_id: int
    :param batch_id: the id of the batch to get its status
    :type batch_id: int

    :rtype: Union[CsvImportResponse, Tuple[CsvImportResponse, int], Tuple[CsvImportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def upload_csv(version, account_id, upload_type, import_file, file_format, app_key=None):  # noqa: E501
    """Upload CSV

    Uploads a CSV import file. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account
    :type account_id: int
    :param upload_type: the upload type: OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, OR FILTERS
    :type upload_type: str
    :param import_file: the import file to reference
    :type import_file: str
    :param file_format: the format of the file
    :type file_format: str
    :param app_key: the application key
    :type app_key: str

    :rtype: Union[CsvImportResponse, Tuple[CsvImportResponse, int], Tuple[CsvImportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
