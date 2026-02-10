import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.queue_response import QueueResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server import util


def consumer_create(version, app_key, name, hostname, username, password, data_mapping, device_id=None, account_id=None, port=None, virtual_host=None, exchanger=None, exchanger_type=None, workers=None, use_ssl=None):  # noqa: E501
    """Create Consumer

    Create a connection to an existing amqp queue and register as a consumer. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.
    :type app_key: str
    :param name: The name of the queue to connect to
    :type name: str
    :param hostname: The hostname of the server the queue is hosted on
    :type hostname: str
    :param username: The username to access the server the queue is hosted on
    :type username: str
    :param password: The password to access the queue to connect to
    :type password: str
    :param data_mapping: The data mapping information in the format of AMQPRequest
    :type data_mapping: str
    :param device_id: The client deviceID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int
    :param port: The port of the server the queue is hosted on
    :type port: int
    :param virtual_host: The virtual host defined on the server the queue is associated on
    :type virtual_host: str
    :param exchanger: The exchanger of the queue to connect to
    :type exchanger: str
    :param exchanger_type: The exchanger type of the queue to connect to
    :type exchanger_type: str
    :param workers: The number of workers to generate 
    :type workers: int
    :param use_ssl: Use SSL
    :type use_ssl: bool

    :rtype: Union[QueueResponse, Tuple[QueueResponse, int], Tuple[QueueResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def consumer_update(version, app_key, queue_id, data_mapping, device_id=None, account_id=None, use_ssl=None):  # noqa: E501
    """Update Consumer

    Update an existing amqp queue&#39;s data mapping. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.
    :type app_key: str
    :param queue_id: The queue to update
    :type queue_id: int
    :param data_mapping: The data mapping information in the format of AMQPRequest
    :type data_mapping: str
    :param device_id: The client deviceID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int
    :param use_ssl: Use SSL
    :type use_ssl: bool

    :rtype: Union[QueueResponse, Tuple[QueueResponse, int], Tuple[QueueResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def queue_create(version, app_key, name, device_id=None, account_id=None, workers=None, analytic_tags=None, hostname=None, port=None, username=None, password=None, virtual_host=None, use_ssl=None):  # noqa: E501
    """Create Queue

    Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application. # noqa: E501

    :param version: 
    :type version: 
    :param app_key: The application key unique to each application.
    :type app_key: str
    :param name: The name of the queue to create
    :type name: str
    :param device_id: The client deviceID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int
    :param workers: The number of workers to generate 
    :type workers: int
    :param analytic_tags: If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags
    :type analytic_tags: str
    :param hostname: The hostname of the server the queue is hosted on
    :type hostname: str
    :param port: The port of the server the queue is hosted on
    :type port: int
    :param username: The username to access the server that the queue is on
    :type username: str
    :param password: The password to access the queue to connect to
    :type password: str
    :param virtual_host: The virtual host defined on the server to queue
    :type virtual_host: str
    :param use_ssl: Use SSL
    :type use_ssl: bool

    :rtype: Union[QueueResponse, Tuple[QueueResponse, int], Tuple[QueueResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def queue_delete(version, queue_id, device_id=None, account_id=None):  # noqa: E501
    """Delete Queue

    Delete the stored queue record and close any active connections to the AMQP servers. # noqa: E501

    :param version: 
    :type version: 
    :param queue_id: The id of the queue to find
    :type queue_id: int
    :param device_id: The client device ID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def queue_get(version, device_id=None, account_id=None, queue_id=None, app_key=None, name=None, hostname=None, virtual_host=None):  # noqa: E501
    """Get Queue

    Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record. # noqa: E501

    :param version: 
    :type version: 
    :param device_id: The client device ID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int
    :param queue_id: The id of the queue to find
    :type queue_id: int
    :param app_key: The application key the queue was assigned to
    :type app_key: str
    :param name: The name of the queue to find
    :type name: str
    :param hostname: The hostname of the queue to find
    :type hostname: str
    :param virtual_host: The virtual host of the queue to find
    :type virtual_host: str

    :rtype: Union[QueueResponse, Tuple[QueueResponse, int], Tuple[QueueResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def queue_publish(version, message, queue_id=None, app_key=None, name=None, hostname=None, virtual_host=None):  # noqa: E501
    """Publish Queue

    Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record. # noqa: E501

    :param version: 
    :type version: 
    :param message: The payload to send to the queue
    :type message: str
    :param queue_id: The id of the queue to publish to
    :type queue_id: int
    :param app_key: The application key the queue was assigned to
    :type app_key: str
    :param name: The name of the queue to publish to or the analytic tag to handle if the analytic param is true
    :type name: str
    :param hostname: The hostname of the server the queue is hosted on
    :type hostname: str
    :param virtual_host: The virtual host defined on the server to queue
    :type virtual_host: str

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def queue_search(version, queue_id=None, device_id=None, account_id=None, name=None, start=None, limit=None):  # noqa: E501
    """Search Queue

    Get the queues setup for the BillableEntity&#39;s applications. # noqa: E501

    :param version: 
    :type version: 
    :param queue_id: The id of the queue to find
    :type queue_id: int
    :param device_id: The client device ID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int
    :param name: The name of the queue to find
    :type name: str
    :param start: Start of the index
    :type start: int
    :param limit: Limit of the index
    :type limit: int

    :rtype: Union[QueueResponse, Tuple[QueueResponse, int], Tuple[QueueResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def queue_update(version, queue_id, device_id=None, account_id=None, app_key=None, workers=None, analytic_tags=None, hostname=None, port=None, username=None, password=None, virtual_host=None, use_ssl=None):  # noqa: E501
    """Update Queue

    Update the basic AMQP queue. # noqa: E501

    :param version: 
    :type version: 
    :param queue_id: The id of the queue to update
    :type queue_id: int
    :param device_id: The client deviceID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int
    :param app_key: The application key unique to each application.
    :type app_key: str
    :param workers: The number of workers to generate
    :type workers: int
    :param analytic_tags: If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags
    :type analytic_tags: str
    :param hostname: The hostname of the server the queue is hosted on
    :type hostname: str
    :param port: The port of the server the queue is hosted on
    :type port: int
    :param username: The username to access the server that the queue is on
    :type username: str
    :param password: The password to access the queue to connect to
    :type password: str
    :param virtual_host: The virtual host defined on the server to queue
    :type virtual_host: str
    :param use_ssl: the SSL to use
    :type use_ssl: bool

    :rtype: Union[QueueResponse, Tuple[QueueResponse, int], Tuple[QueueResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
