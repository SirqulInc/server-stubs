import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.region_leg_summary import RegionLegSummary  # noqa: E501
from openapi_server.models.report_batch_response import ReportBatchResponse  # noqa: E501
from openapi_server.models.report_region_leg_summary_batch_response import ReportRegionLegSummaryBatchResponse  # noqa: E501
from openapi_server.models.report_response import ReportResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def create_batch(version, account_id, status, preview_limit, app_key=None, endpoint=None, parameters=None, name=None, start_date=None, end_date=None, description=None, page_url=None):  # noqa: E501
    """Create Offline Report

    Create an entry for the batch for offline report # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The account id of the user for passing account related params
    :type account_id: int
    :param status: the status of the report
    :type status: str
    :param preview_limit: the limit on how much you can preview of the batch report
    :type preview_limit: int
    :param app_key: The application key for passing application related params
    :type app_key: str
    :param endpoint: 
    :type endpoint: str
    :param parameters: a json structure list of the parameter values, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    :type parameters: str
    :param name: name of the batch report
    :type name: str
    :param start_date: the start date of the batch report
    :type start_date: int
    :param end_date: the end date of the batch report
    :type end_date: int
    :param description: the description of the batch report
    :type description: str
    :param page_url: 
    :type page_url: str

    :rtype: Union[ReportBatchResponse, Tuple[ReportBatchResponse, int], Tuple[ReportBatchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_region_leg_summary_batch(version, body=None):  # noqa: E501
    """Create Offline Report

    Create an entry for the batch for offline report # noqa: E501

    :param version: 
    :type version: 
    :param body: 
    :type body: list | bytes

    :rtype: Union[ReportRegionLegSummaryBatchResponse, Tuple[ReportRegionLegSummaryBatchResponse, int], Tuple[ReportRegionLegSummaryBatchResponse, int, Dict[str, str]]
    """
    body = body
    if connexion.request.is_json:
        body = [RegionLegSummary.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def delete_batch(version, account_id, batch_id):  # noqa: E501
    """Delete Offline Report

    Deletes a batch report. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account
    :type account_id: int
    :param batch_id: the id of the batch to delete
    :type batch_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_report_batch(version, account_id, batch_id, all_results):  # noqa: E501
    """Get Offline Report

    Checks status of batch report. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param batch_id: returned by /report/batch/create
    :type batch_id: int
    :param all_results: whether to return all batch results or not
    :type all_results: bool

    :rtype: Union[ReportBatchResponse, Tuple[ReportBatchResponse, int], Tuple[ReportBatchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def run_report(version, desc, account_id=None, query=None, parameters=None, order=None, start=None, limit=None, response_format=None):  # noqa: E501
    """Run Report

     This endpoint allows you to run a set of predefined reports that can be used to understand your users&#39; behavior as well as trends within your application. # noqa: E501

    :param version: 
    :type version: 
    :param desc: If true then descending order, false is ascending
    :type desc: bool
    :param account_id: The account id of the user for passing account related params
    :type account_id: int
    :param query: The named identifier of the query
    :type query: str
    :param parameters: Parameter values used in the query in JSON format, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    :type parameters: str
    :param order: The order to use, must be a column name (see response results for list of column names)
    :type order: str
    :param start: The start of the pagination
    :type start: int
    :param limit: The limit of the pagination
    :type limit: int
    :param response_format: Determines what response format to return. Options are: JSON or CSV
    :type response_format: str

    :rtype: Union[ReportResponse, Tuple[ReportResponse, int], Tuple[ReportResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_batch(version, account_id, start, limit, names=None, app_key=None, status=None, global_app_search=None, start_date=None, end_date=None):  # noqa: E501
    """Search Offline Reports

    Retrieves batches for a user.. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the account logged in
    :type account_id: int
    :param start: the start of the index and/or pagination
    :type start: int
    :param limit: the limit of the index and/or pagination
    :type limit: int
    :param names: the names of the report batch to search on
    :type names: str
    :param app_key: the application key
    :type app_key: str
    :param status: the report batch status
    :type status: str
    :param global_app_search: the global app to search on
    :type global_app_search: bool
    :param start_date: the start date of the report batch to search on
    :type start_date: int
    :param end_date: the end date of the report batch to search on
    :type end_date: int

    :rtype: Union[List[ReportBatchResponse], Tuple[List[ReportBatchResponse], int], Tuple[List[ReportBatchResponse], int, Dict[str, str]]
    """
    return 'do some magic!'
