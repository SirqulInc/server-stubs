from typing import List, Dict
from aiohttp import web

from openapi_server.models.availability_response import AvailabilityResponse
from openapi_server.models.reservation_response import ReservationResponse
from openapi_server.models.time_slot_response import TimeSlotResponse
from openapi_server import util


async def create_reservation(request: web.Request, version, device_id=None, account_id=None, start_date=None, end_date=None, offer_id=None, offer_location_id=None, app_key=None, meta_data=None) -> web.Response:
    """Create Reservation

    Creates a reservation on an offer object

    :param version: 
    :type version: 
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int
    :param start_date: The start date
    :type start_date: int
    :param end_date: The end date
    :type end_date: int
    :param offer_id: The id of the offer being added (offerId or offeLocationId required)
    :type offer_id: int
    :param offer_location_id: The id of the offer location being added (offerId or offeLocationId required)
    :type offer_location_id: int
    :param app_key: The application requesting the reservation
    :type app_key: str
    :param meta_data: External custom client defined data
    :type meta_data: str

    """
    return web.Response(status=200)


async def delete_reservation(request: web.Request, version, reservation_id, device_id=None, account_id=None) -> web.Response:
    """Delete Reservation

    Deleted a reservation on a reservation object

    :param version: 
    :type version: 
    :param reservation_id: The reservation id
    :type reservation_id: int
    :param device_id: The device id (deviceId or accountId required)
    :type device_id: str
    :param account_id: The account id of the user (deviceId or accountId required)
    :type account_id: int

    """
    return web.Response(status=200)


async def reservable_availability(request: web.Request, version, reservable_id, reservable_type, device_id=None, account_id=None, availability=None, availability_summary=None) -> web.Response:
    """Update Availability

    

    :param version: 
    :type version: 
    :param reservable_id: the id of the reservation
    :type reservable_id: int
    :param reservable_type: the type of reservation
    :type reservable_type: str
    :param device_id: the device id of the reservation
    :type device_id: str
    :param account_id: the id of the logged in user
    :type account_id: int
    :param availability: Availability
    :type availability: str
    :param availability_summary: Availability Summary
    :type availability_summary: str

    """
    return web.Response(status=200)


async def search_availability(request: web.Request, version, reservable_id, reservable_type, device_id=None, account_id=None, start_date=None, end_date=None, start=None, limit=None) -> web.Response:
    """Search Availability

    

    :param version: 
    :type version: 
    :param reservable_id: the id of the reservation
    :type reservable_id: int
    :param reservable_type: the reservable type
    :type reservable_type: str
    :param device_id: the device ID that the reservation is on
    :type device_id: str
    :param account_id: the id of the logged in user
    :type account_id: int
    :param start_date: the start date of the reservation
    :type start_date: int
    :param end_date: the end date of the reservation
    :type end_date: int
    :param start: the start of the index and/or pagination
    :type start: int
    :param limit: the limit of the index and/or pagination
    :type limit: int

    """
    return web.Response(status=200)


async def search_reservations(request: web.Request, version, device_id=None, app_key=None, account_id=None, filter_account_id=None, reservable_id=None, reservable_type=None, keyword=None, start_date=None, end_date=None, start=None, limit=None) -> web.Response:
    """Search Reservations

    

    :param version: 
    :type version: 
    :param device_id: Device Id
    :type device_id: str
    :param app_key: Appilcation Key
    :type app_key: str
    :param account_id: the id of the logged in user
    :type account_id: int
    :param filter_account_id: filter reservations by account ID
    :type filter_account_id: int
    :param reservable_id: the reservation ID
    :type reservable_id: int
    :param reservable_type: the type of reservation
    :type reservable_type: str
    :param keyword: the keyword to search the reservation on
    :type keyword: str
    :param start_date: the start date of the reservation search
    :type start_date: int
    :param end_date: the end date of the reservation search
    :type end_date: int
    :param start: the start of the index and/or pagination
    :type start: int
    :param limit: the limit of the index and/or pagination
    :type limit: int

    """
    return web.Response(status=200)


async def search_schedule(request: web.Request, version, reservable_id, reservable_type, start_date, end_date, device_id=None, account_id=None, time_bucket_mins=None) -> web.Response:
    """Search Schedule

    

    :param version: 
    :type version: 
    :param reservable_id: the id of the reservation
    :type reservable_id: int
    :param reservable_type: the reservation type
    :type reservable_type: str
    :param start_date: the start date of the reservation
    :type start_date: int
    :param end_date: the end date of the reservation
    :type end_date: int
    :param device_id: the id of the device that the reservation is on
    :type device_id: str
    :param account_id: the id of the logged in user
    :type account_id: int
    :param time_bucket_mins: the length of time in minutes to search on for reservation
    :type time_bucket_mins: int

    """
    return web.Response(status=200)
