import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.score_response import ScoreResponse  # noqa: E501
from openapi_server import util


def create_score(version, account_id, app_key, points, mission_id=None, game_id=None, pack_id=None, game_level_id=None, game_object_id=None, time_taken=None, highest=None):  # noqa: E501
    """Create Score

    Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The game application key to save the score for.
    :type app_key: str
    :param points: The score
    :type points: int
    :param mission_id: The missionId to score for, ignore if not playing mission.
    :type mission_id: int
    :param game_id: The gameId to score for, ignore if not playing mission.
    :type game_id: int
    :param pack_id: The packId to score for, send -2 if playing community levels.
    :type pack_id: int
    :param game_level_id: The gameLevelId to score for.
    :type game_level_id: int
    :param game_object_id: The gameObjectId to score for, ignore if level based scoring.
    :type game_object_id: int
    :param time_taken: The time taken to complete task
    :type time_taken: int
    :param highest: 
    :type highest: bool

    :rtype: Union[ScoreResponse, Tuple[ScoreResponse, int], Tuple[ScoreResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_score(version, account_id, app_key, mission_id=None, game_id=None, pack_id=None, game_level_id=None, game_object_id=None, score_object_type=None, score_status=None):  # noqa: E501
    """Get Score

    Get the high score for an item.  Pass in the full path IDs for the score. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The game application key to get the level for.
    :type app_key: str
    :param mission_id: The missionId to score for, null if not playing mission.
    :type mission_id: int
    :param game_id: The gameId to score for, null if not playing mission.
    :type game_id: int
    :param pack_id: The packId to score for, null if playing community levels.
    :type pack_id: int
    :param game_level_id: The gameLevelId to score for.
    :type game_level_id: int
    :param game_object_id: The gameObjectId to score for, null if level based scoring.
    :type game_object_id: int
    :param score_object_type: The object type to filter scores by (TicketObjectType)
    :type score_object_type: str
    :param score_status: The status of the score to filter (ScoreStatus)
    :type score_status: str

    :rtype: Union[ScoreResponse, Tuple[ScoreResponse, int], Tuple[ScoreResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_scores(version, account_id, app_key, mission_id=None, game_id=None, pack_id=None, game_level_id=None, game_object_id=None):  # noqa: E501
    """Search Score

    Search the scores for an item.  Pass in the full path IDs for the scores. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The game application key to get the level for.
    :type app_key: str
    :param mission_id: The missionId to score for, null if not playing mission.
    :type mission_id: int
    :param game_id: The gameId to score for, null if not playing mission.
    :type game_id: int
    :param pack_id: The packId to score for, null if playing community levels.
    :type pack_id: int
    :param game_level_id: The gameLevelId to score for.
    :type game_level_id: int
    :param game_object_id: The gameObjectId to score for, null if level based scoring.
    :type game_object_id: int

    :rtype: Union[List[ScoreResponse], Tuple[List[ScoreResponse], int], Tuple[List[ScoreResponse], int, Dict[str, str]]
    """
    return 'do some magic!'
