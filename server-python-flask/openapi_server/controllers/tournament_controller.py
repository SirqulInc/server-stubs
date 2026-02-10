import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.mission_short_response import MissionShortResponse  # noqa: E501
from openapi_server.models.sirqul_response import SirqulResponse  # noqa: E501
from openapi_server.models.tournament_response import TournamentResponse  # noqa: E501
from openapi_server import util


def create_tournament(version, account_id, app_key, title, cost_to_play, start_date, sub_type=None, image_asset_id=None, seconds_between_levels=None, seconds_for_tie_breaker=None, seconds_between_packs=None, maximum_level_length=None, cost_to_play_type=None, minimum_to_play=None, starting_limit=None, available_limit=None, description=None, meta_data=None, audience_ids=None, active=None, enable_buy_back=None, offer_ids=None, offer_asset_id=None, fixed_reward=None, split_reward=None, allocate_tickets=None, tournament_data=None, mission_type=None, visibility=None, preliminary_groups=None, preliminary_group_advancements=None, enable_multiple_entries=None, enable_multiple_votes=None, featured=None, winner_tag=None, tie_tag=None):  # noqa: E501
    """Create Tournament

    Create a tournament. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The appKey the tournament is created for.
    :type app_key: str
    :param title: The title of the tournament
    :type title: str
    :param cost_to_play: The number of tickets required to pay to enter the tournament
    :type cost_to_play: int
    :param start_date: The date/time to start the tournament
    :type start_date: int
    :param sub_type: Custom string client apps can use for searching/filtering tournaments
    :type sub_type: str
    :param image_asset_id: The asset ID to attach to the tournament
    :type image_asset_id: int
    :param seconds_between_levels: The number of seconds in between the start of each tournament game/group
    :type seconds_between_levels: int
    :param seconds_for_tie_breaker: The number of seconds to extend the round end time in the case of a tie breaker
    :type seconds_for_tie_breaker: int
    :param seconds_between_packs: The number of seconds in between the start of each tournament round
    :type seconds_between_packs: int
    :param maximum_level_length: The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity
    :type maximum_level_length: int
    :param cost_to_play_type: The type of ticket required to pay
    :type cost_to_play_type: str
    :param minimum_to_play: The minimum number of players required to sign up for the tournament to be played
    :type minimum_to_play: int
    :param starting_limit: The starting number of players for a tournament (filled with AI&#39;s)
    :type starting_limit: int
    :param available_limit: The maximum number of players for a tournament (currently 128 but not enforced)
    :type available_limit: int
    :param description: The description of the tournament
    :type description: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param audience_ids: The audiences associated with the tournament
    :type audience_ids: str
    :param active: Activate/deactivate the tournament
    :type active: bool
    :param enable_buy_back: Determines whether to allow players to buy back into a tournament
    :type enable_buy_back: bool
    :param offer_ids: The list of offers to give as a reward beyond the tickets
    :type offer_ids: str
    :param offer_asset_id: The artwork ID to attach to the reward tickets offers
    :type offer_asset_id: int
    :param fixed_reward: If set then do not update the ticket reward, auto set to true if offerIds provided
    :type fixed_reward: bool
    :param split_reward: Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored
    :type split_reward: str
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed missions
    :type allocate_tickets: bool
    :param tournament_data: A text based string that will be passed into each tournament setup to populate the content
    :type tournament_data: str
    :param mission_type: The style of tournament to build, options are: TOURNAMENT, POOLPLAY
    :type mission_type: str
    :param visibility: Sets the visibility flag for the tournament
    :type visibility: str
    :param preliminary_groups: The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)
    :type preliminary_groups: int
    :param preliminary_group_advancements: This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)
    :type preliminary_group_advancements: str
    :param enable_multiple_entries: This determines if multiple submissions/entries are allowed in a multi-stage album tournament
    :type enable_multiple_entries: bool
    :param enable_multiple_votes: This determines if users are allowed to vote multiple times per group in a multi-stage album tournament
    :type enable_multiple_votes: bool
    :param featured: This determines whether the tournament is \&quot;featured\&quot; or not
    :type featured: bool
    :param winner_tag: This sets what analytic tag is used when a winner is determined
    :type winner_tag: str
    :param tie_tag: This sets what analytic tag is used when a tie has occurred
    :type tie_tag: str

    :rtype: Union[TournamentResponse, Tuple[TournamentResponse, int], Tuple[TournamentResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_tournament(version, account_id, mission_id):  # noqa: E501
    """Delete Tournament

    Delete a tournament. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param mission_id: the id of the mission to delete
    :type mission_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tournament(version, account_id, mission_id=None, join_code=None, include_scores=None, object_preview_size=None):  # noqa: E501
    """Get Tournament

    Get a tournament. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The id of the logged in user
    :type account_id: int
    :param mission_id: The id of the mission to return (either missionId or joinCode is required)
    :type mission_id: int
    :param join_code: Optional identifier for getting the tournament (either missionId or joinCode is required)
    :type join_code: str
    :param include_scores: Determines which type of scores are returned. Possible values include: ALL, MINE
    :type include_scores: str
    :param object_preview_size: Determines the max number of game objects that will get returned for each game level response
    :type object_preview_size: int

    :rtype: Union[TournamentResponse, Tuple[TournamentResponse, int], Tuple[TournamentResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_objects(version, account_id, game_level_id, sort_field=None, descending=None, start=None, limit=None):  # noqa: E501
    """Search Tournament Objects

    Search on game objects of tournaments # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account ID
    :type account_id: int
    :param game_level_id: the game level id to filter results by
    :type game_level_id: int
    :param sort_field: the field to sort by
    :type sort_field: str
    :param descending: determines whether the sorted list is in descending or ascending order
    :type descending: bool
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_rounds(version, account_id, app_key, status=None, mission_type=None, current_only=None, visibilities=None, start=None, limit=None):  # noqa: E501
    """Search Tournament Rounds

    Search for the user&#39;s tournament games. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the account ID
    :type account_id: int
    :param app_key: the application key
    :type app_key: str
    :param status: comma separated list of statuses to filter results by
    :type status: str
    :param mission_type: The style of tournament to search for, options are: TOURNAMENT, POOLPLAY
    :type mission_type: str
    :param current_only: search for games that are flagged current only
    :type current_only: bool
    :param visibilities: Filter tournament rounds by the mission visibility flag
    :type visibilities: str
    :param start: the start index for pagination
    :type start: int
    :param limit: the limit for pagination
    :type limit: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_tournaments(version, account_id, app_key, keyword=None, sub_type=None, include_inactive=None, mission_types=None, filter=None, sort_field=None, descending=None, visibility=None, start=None, limit=None):  # noqa: E501
    """Search Tournaments

    Search for tournaments # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The application key
    :type app_key: str
    :param keyword: the keyword to search tournament on
    :type keyword: str
    :param sub_type: filter results by subType
    :type sub_type: str
    :param include_inactive: whether to include inactives in the search or not
    :type include_inactive: bool
    :param mission_types: comma separated list of mission types to filter results, possbile values include: TOURNAMENT, POOLPLAY, MULTISTAGE
    :type mission_types: str
    :param filter: filter tournaments by the tournament&#39;s current state
    :type filter: str
    :param sort_field: which field to sort on
    :type sort_field: str
    :param descending: Determines whether to return results in descending order. The default value will be true if the filter is \&quot;PAST\&quot;, otherwise the default value will be false.
    :type descending: bool
    :param visibility: Comma separated list of visibility flags for search for, possible values include: PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE
    :type visibility: str
    :param start: Start the result set at some index.
    :type start: int
    :param limit: Limit the result to some number
    :type limit: int

    :rtype: Union[MissionShortResponse, Tuple[MissionShortResponse, int], Tuple[MissionShortResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def submit_tournament_score(version, account_id, app_key, mission_id, game_id, pack_id, scores, game_level_id=None):  # noqa: E501
    """Submit Tournament Score

    Submit an array of scores for a tournament match.  # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user account ID.
    :type account_id: int
    :param app_key: The application key.
    :type app_key: str
    :param mission_id: The missionId to score for
    :type mission_id: int
    :param game_id: The gameId to score for
    :type game_id: int
    :param pack_id: The packId to score for
    :type pack_id: int
    :param scores: a JSON Array of scores to submit for a tournament match &#x60;&#x60;&#x60;json [   {     \&quot;accountId\&quot;: 2,     \&quot;points\&quot;: 3   },   {     \&quot;accountId\&quot;: 1777662,     \&quot;points\&quot;: 7   } ] &#x60;&#x60;&#x60; 
    :type scores: str
    :param game_level_id: The gameLevelId to score for
    :type game_level_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def submit_tournament_vote(version, account_id, app_key, mission_id, game_object_id, device_id=None, check_if_device_already_voted=None):  # noqa: E501
    """Submit a vote for a multi-stage album tournament.

    Submit a vote for a multi-stage album tournament. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param app_key: The application to target
    :type app_key: str
    :param mission_id: The tournament&#39;s primary id
    :type mission_id: int
    :param game_object_id: The tournament game object the user wants to vote on
    :type game_object_id: int
    :param device_id: The unique id of the device making the request (optional)
    :type device_id: str
    :param check_if_device_already_voted: When true, check if the device already voted to prevent duplicate votes from the same device
    :type check_if_device_already_voted: bool

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def substitute_tournament_player(version, account_id, mission_id, pack_id, game_level_id):  # noqa: E501
    """Substitute Tournament Player

    Service to replace the user&#39;s opponent in the current level - pack - mission with an AI account. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: the id of the logged in user
    :type account_id: int
    :param mission_id: the id of the mission
    :type mission_id: int
    :param pack_id: the id of the pack
    :type pack_id: int
    :param game_level_id: the id of the game level
    :type game_level_id: int

    :rtype: Union[SirqulResponse, Tuple[SirqulResponse, int], Tuple[SirqulResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_tournament(version, account_id, mission_id, title=None, sub_type=None, image_asset_id=None, seconds_between_levels=None, seconds_for_tie_breaker=None, seconds_between_packs=None, maximum_level_length=None, cost_to_play=None, cost_to_play_type=None, minimum_to_play=None, starting_limit=None, available_limit=None, description=None, meta_data=None, start_date=None, audience_ids=None, active=None, enable_buy_back=None, offer_ids=None, offer_asset_id=None, fixed_reward=None, split_reward=None, allocate_tickets=None, tournament_data=None, visibility=None, preliminary_groups=None, preliminary_group_advancements=None, enable_multiple_entries=None, enable_multiple_votes=None, featured=None, winner_tag=None, tie_tag=None):  # noqa: E501
    """Update Tournament

    Update a tournament. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: The logged in user.
    :type account_id: int
    :param mission_id: The mission/tournament to update
    :type mission_id: int
    :param title: The title of the tournament
    :type title: str
    :param sub_type: Custom string client apps can use for searching/filtering missions
    :type sub_type: str
    :param image_asset_id: The asset ID to attach to the tournament
    :type image_asset_id: int
    :param seconds_between_levels: The number of seconds in between the start of each tournament game
    :type seconds_between_levels: int
    :param seconds_for_tie_breaker: The number of seconds to extend the round end time in the case of a tie breaker
    :type seconds_for_tie_breaker: int
    :param seconds_between_packs: The number of seconds in between the start of each tournament round
    :type seconds_between_packs: int
    :param maximum_level_length: The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity
    :type maximum_level_length: int
    :param cost_to_play: The number of tickets required to pay to enter the tournament
    :type cost_to_play: int
    :param cost_to_play_type: The type of ticket required to pay
    :type cost_to_play_type: str
    :param minimum_to_play: The minimum number of players required to sign up for the tournament to be played
    :type minimum_to_play: int
    :param starting_limit: The starting number of players for a tournament (filled with AI&#39;s)
    :type starting_limit: int
    :param available_limit: The maximum number of players for a tournament (currently 128 but not enforced)
    :type available_limit: int
    :param description: The description of the tournament
    :type description: str
    :param meta_data: External custom client defined data
    :type meta_data: str
    :param start_date: The date/time to start the tournament
    :type start_date: int
    :param audience_ids: The audiences associated with the tournament
    :type audience_ids: str
    :param active: Activate/deactivate the mission
    :type active: bool
    :param enable_buy_back: Determines whether to allow players to buy back into a tournament
    :type enable_buy_back: bool
    :param offer_ids: The list of offers to give as a reward beyond the tickets
    :type offer_ids: str
    :param offer_asset_id: The artwork ID to attach to the reward offer
    :type offer_asset_id: int
    :param fixed_reward: If set then do not update the ticket reward, auto set to true if offerIds provided
    :type fixed_reward: bool
    :param split_reward: Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored
    :type split_reward: str
    :param allocate_tickets: Flag to indicate owner should receive tickets for completed missions
    :type allocate_tickets: bool
    :param tournament_data: A text based string that will be passed into each tournament setup to populate the content
    :type tournament_data: str
    :param visibility: Sets the visibility flag for the tournament
    :type visibility: str
    :param preliminary_groups: The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)
    :type preliminary_groups: int
    :param preliminary_group_advancements: This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)
    :type preliminary_group_advancements: str
    :param enable_multiple_entries: This determines if multiple submissions/entries are allowed in a multi-stage album tournament
    :type enable_multiple_entries: bool
    :param enable_multiple_votes: This determines if users are allowed to vote multiple times per group in a multi-stage album tournament
    :type enable_multiple_votes: bool
    :param featured: This determines whether the tournament is \&quot;featured\&quot; or not
    :type featured: bool
    :param winner_tag: This sets what analytic tag is used when a winner is determined
    :type winner_tag: str
    :param tie_tag: This sets what analytic tag is used when a winner is determined
    :type tie_tag: str

    :rtype: Union[TournamentResponse, Tuple[TournamentResponse, int], Tuple[TournamentResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
