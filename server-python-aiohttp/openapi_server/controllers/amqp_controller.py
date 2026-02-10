from typing import List, Dict
from aiohttp import web

from openapi_server.models.queue_response import QueueResponse
from openapi_server.models.sirqul_response import SirqulResponse
from openapi_server import util


async def consumer_create(request: web.Request, version, app_key, name, hostname, username, password, data_mapping, device_id=None, account_id=None, port=None, virtual_host=None, exchanger=None, exchanger_type=None, workers=None, use_ssl=None) -> web.Response:
    """Create Consumer

    Create a connection to an existing amqp queue and register as a consumer.

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

    """
    return web.Response(status=200)


async def consumer_update(request: web.Request, version, app_key, queue_id, data_mapping, device_id=None, account_id=None, use_ssl=None) -> web.Response:
    """Update Consumer

    Update an existing amqp queue&#39;s data mapping.

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

    """
    return web.Response(status=200)


async def queue_create(request: web.Request, version, app_key, name, device_id=None, account_id=None, workers=None, analytic_tags=None, hostname=None, port=None, username=None, password=None, virtual_host=None, use_ssl=None) -> web.Response:
    """Create Queue

    Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.

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

    """
    return web.Response(status=200)


async def queue_delete(request: web.Request, version, queue_id, device_id=None, account_id=None) -> web.Response:
    """Delete Queue

    Delete the stored queue record and close any active connections to the AMQP servers.

    :param version: 
    :type version: 
    :param queue_id: The id of the queue to find
    :type queue_id: int
    :param device_id: The client device ID
    :type device_id: str
    :param account_id: The logged in user ID
    :type account_id: int

    """
    return web.Response(status=200)


async def queue_get(request: web.Request, version, device_id=None, account_id=None, queue_id=None, app_key=None, name=None, hostname=None, virtual_host=None) -> web.Response:
    """Get Queue

    Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.

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

    """
    return web.Response(status=200)


async def queue_publish(request: web.Request, version, message, queue_id=None, app_key=None, name=None, hostname=None, virtual_host=None) -> web.Response:
    """Publish Queue

    Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.

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

    """
    return web.Response(status=200)


async def queue_search(request: web.Request, version, queue_id=None, device_id=None, account_id=None, name=None, start=None, limit=None) -> web.Response:
    """Search Queue

    Get the queues setup for the BillableEntity&#39;s applications.

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

    """
    return web.Response(status=200)


async def queue_update(request: web.Request, version, queue_id, device_id=None, account_id=None, app_key=None, workers=None, analytic_tags=None, hostname=None, port=None, username=None, password=None, virtual_host=None, use_ssl=None) -> web.Response:
    """Update Queue

    Update the basic AMQP queue.

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

    """
    return web.Response(status=200)
