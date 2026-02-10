require 'json'


MyApp.add_route('POST', '/api/{version}/orson/ai/addMovie', {
  "resourcePath" => "/Orson",
  "summary" => "Add Movie",
  "nickname" => "add_movie",
  "responseClass" => "OrsonAiAddMovieResponse",
  "endpoint" => "/api/{version}/orson/ai/addMovie",
  "notes" => "Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "A user defined list (comma-delimited) of tags associated with the movie",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "movie_name",
      "description" => "Movie Name",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "An uploaded recording to analyze (Currently limited to 10MB)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url",
      "description" => "A recording file to download and analyze (Size limit: 1GB)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/docs', {
  "resourcePath" => "/Orson",
  "summary" => "Search Docs",
  "nickname" => "ai_docs",
  "responseClass" => "OrsonAiProtoResponse",
  "endpoint" => "/api/{version}/orson/ai/docs",
  "notes" => "Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "doc",
      "description" => "Doc",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "return_topics",
      "description" => "Return Topics",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "Offset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/img', {
  "resourcePath" => "/Orson",
  "summary" => "Find images",
  "nickname" => "ai_find_images",
  "responseClass" => "OrsonAiProtoResponse",
  "endpoint" => "/api/{version}/orson/ai/img",
  "notes" => "Returns a list of URIs of images that match the text.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "text",
      "description" => "Text",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parse_flag",
      "description" => "Parse Flag",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "fetch_flag",
      "description" => "Fetch Flag",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "size",
      "description" => "Size",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/tags', {
  "resourcePath" => "/Orson",
  "summary" => "Search Tags",
  "nickname" => "ai_tags",
  "responseClass" => "OrsonAiProtoResponse",
  "endpoint" => "/api/{version}/orson/ai/tags",
  "notes" => "Search the tags column of user provided tags using this endpoint.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "tags",
      "description" => "Tags",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conditional",
      "description" => "Conditional",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "Offset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/text', {
  "resourcePath" => "/Orson",
  "summary" => "Search Text",
  "nickname" => "ai_text",
  "responseClass" => "OrsonAiProtoResponse",
  "endpoint" => "/api/{version}/orson/ai/text",
  "notes" => "Search the movie text column of movie text using this endpoint.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "terms",
      "description" => "Terms",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "conditional",
      "description" => "Conditional",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Limit",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "Offset",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/ai/batch', {
  "resourcePath" => "/Orson",
  "summary" => "Batch Analysis",
  "nickname" => "batch",
  "responseClass" => "OrsonAiBatchResponse",
  "endpoint" => "/api/{version}/orson/ai/batch",
  "notes" => "Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The number of topics to return",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "operations",
      "description" => "The comma-delimited list of A/V batch analysis operations to run on this file. Possible values: Transcript,Topics,Emotions",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "An uploaded recording to analyze (Currently limited to 10MB)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url",
      "description" => "A recording file to download and analyze (Size limit: 1GB)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/stories/episodes/instant', {
  "resourcePath" => "/Orson",
  "summary" => "Creates an instant episode",
  "nickname" => "create_instant_episode",
  "responseClass" => "OrsonEpisodeResponse",
  "endpoint" => "/api/{version}/orson/stories/episodes/instant",
  "notes" => "Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "Request Data String",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/ai/voiceCanvas', {
  "resourcePath" => "/Orson",
  "summary" => "Create VoiceCanvas images",
  "nickname" => "create_voice_canvas",
  "responseClass" => "OrsonAiVoiceCanvasResponse",
  "endpoint" => "/api/{version}/orson/ai/voiceCanvas",
  "notes" => "Create VoiceCanvas images for provided text, file upload, or file URL",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "dimensions",
      "description" => "Enum: \&quot;256x256\&quot; \&quot;512x512\&quot; \&quot;1024x1024\&quot;",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "text",
      "description" => "Provide a transcript or previously extracted topics for image generation",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "An uploaded recording to analyze (Currently limited to 10MB)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url",
      "description" => "A recording file to download and analyze (Size limit: 1GB)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "parse_flag",
      "description" => "When false, uses the raw value from text instead of identifying topics to fetch/generate from",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "fetch_flag",
      "description" => "When true, fetches images instead of generating them",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/ai/emotion', {
  "resourcePath" => "/Orson",
  "summary" => "Detect emotions",
  "nickname" => "emotion",
  "responseClass" => "OrsonAiEmotionsResponse",
  "endpoint" => "/api/{version}/orson/ai/emotion",
  "notes" => "Detects emotions in an audio or video recording.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "An uploaded recording to analyze (Currently limited to 10MB)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url",
      "description" => "A recording file to download and analyze (Size limit: 1GB)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/addMovie/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get Add Movie Result",
  "nickname" => "get_add_movie_result",
  "responseClass" => "OrsonAiAddMovieResponse",
  "endpoint" => "/api/{version}/orson/ai/addMovie/{requestId}",
  "notes" => "Get the result of an in progress Add Movie request from an earlier POST.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/batch/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get Batch Analysis Results",
  "nickname" => "get_batch",
  "responseClass" => "OrsonAiBatchResponse",
  "endpoint" => "/api/{version}/orson/ai/batch/{requestId}",
  "notes" => "Gets the completed Video Batch results, if done, or an error or status update if not.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/emotion/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get Emotion Results",
  "nickname" => "get_emotion",
  "responseClass" => "OrsonAiEmotionsResponse",
  "endpoint" => "/api/{version}/orson/ai/emotion/{requestId}",
  "notes" => "Checks the Emotion analysis and returns in progress, results, or error.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/stories/episodes/{episodeId}/status', {
  "resourcePath" => "/Orson",
  "summary" => "Check episode status",
  "nickname" => "get_episode_status",
  "responseClass" => "OrsonEpisodeResponse",
  "endpoint" => "/api/{version}/orson/stories/episodes/{episodeId}/status",
  "notes" => "Gets a summary of the episode's status, including any renders.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "episode_id",
      "description" => "Episode ID",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/stories/renders/{renderId}/status', {
  "resourcePath" => "/Orson",
  "summary" => "Check episode status",
  "nickname" => "get_render_status",
  "responseClass" => "OrsonRenderResponse",
  "endpoint" => "/api/{version}/orson/stories/renders/{renderId}/status",
  "notes" => "Gets a summary of the episode's status, including any renders.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "render_id",
      "description" => "Render ID",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/stt/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get Speach to Text Result",
  "nickname" => "get_stt",
  "responseClass" => "OrsonAiSTTResponse",
  "endpoint" => "/api/{version}/orson/ai/stt/{requestId}",
  "notes" => "The results of the video transcription and optional translation.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/techTune/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get TechTune Results",
  "nickname" => "get_tech_tune",
  "responseClass" => "OrsonAiTechTuneResponse",
  "endpoint" => "/api/{version}/orson/ai/techTune/{requestId}",
  "notes" => "Get a result or continue waiting for a pending request for TechTune analysis.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/topics/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get Topics",
  "nickname" => "get_topics",
  "responseClass" => "OrsonAiTopicsResponse",
  "endpoint" => "/api/{version}/orson/ai/topics/{requestId}",
  "notes" => "Get the result of an in progress Topics Analysis from an earlier POST.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/tts/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get Text to Speach Result",
  "nickname" => "get_tts",
  "responseClass" => "OrsonAiTTSResponse",
  "endpoint" => "/api/{version}/orson/ai/tts/{requestId}",
  "notes" => "Check the status of an in progress Text-to-Speech call or download the result.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{version}/orson/ai/voiceCanvas/{requestId}', {
  "resourcePath" => "/Orson",
  "summary" => "Get VoiceCanvas images",
  "nickname" => "get_voice_canvas",
  "responseClass" => "OrsonAiVoiceCanvasResponse",
  "endpoint" => "/api/{version}/orson/ai/voiceCanvas/{requestId}",
  "notes" => "Get a result or continue waiting for a pending request for VoiceCanvas Images.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    {
      "name" => "request_id",
      "description" => "Orson Request Id",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/stories/renders', {
  "resourcePath" => "/Orson",
  "summary" => "Starts a StoryStitch video render",
  "nickname" => "start_video_render",
  "responseClass" => "OrsonRenderResponse",
  "endpoint" => "/api/{version}/orson/stories/renders",
  "notes" => "Starts a StoryStitch video render to produce your final video, returning the status details.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "data",
      "description" => "Request Data String",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/ai/stt', {
  "resourcePath" => "/Orson",
  "summary" => "Speach to Text",
  "nickname" => "stt",
  "responseClass" => "OrsonAiSTTResponse",
  "endpoint" => "/api/{version}/orson/ai/stt",
  "notes" => "Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "source_language",
      "description" => "Source Language",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "target_language",
      "description" => "Target Language",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "An uploaded recording to analyze (Currently limited to 10MB)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url",
      "description" => "A recording file to download and analyze (Size limit: 1GB)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/ai/topics', {
  "resourcePath" => "/Orson",
  "summary" => "Summarize Topics",
  "nickname" => "summarize_topics",
  "responseClass" => "OrsonAiTopicsResponse",
  "endpoint" => "/api/{version}/orson/ai/topics",
  "notes" => "Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "doc",
      "description" => "The text to get topics for.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "An uploaded recording to analyze (Currently limited to 10MB)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url",
      "description" => "A recording file to download and analyze (Size limit: 1GB)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "The number of results to return",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "The starting offset into the total result set to start from",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/ai/techTune', {
  "resourcePath" => "/Orson",
  "summary" => "Detect Technical Issues",
  "nickname" => "tech_tune",
  "responseClass" => "OrsonAiTechTuneResponse",
  "endpoint" => "/api/{version}/orson/ai/techTune",
  "notes" => "Analyses a movie file to detect technical issues, such as too few people in frame.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "num_faces_expected",
      "description" => "Number of expected faces",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "file",
      "description" => "An uploaded recording to analyze (Currently limited to 10MB)",
      "dataType" => "File",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "url",
      "description" => "A recording file to download and analyze (Size limit: 1GB)",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/{version}/orson/ai/tts', {
  "resourcePath" => "/Orson",
  "summary" => "Text to Speach",
  "nickname" => "tts",
  "responseClass" => "OrsonAiTTSResponse",
  "endpoint" => "/api/{version}/orson/ai/tts",
  "notes" => "Creates an audio file for the given text, with the option of language and voice selection.",
  "parameters" => [
    {
      "name" => "account_id",
      "description" => "Sirqul Account Id",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "third_party_account_id",
      "description" => "A third-party account id that is meaningful to your systems",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "text",
      "description" => "Text",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "language",
      "description" => "The language to use for the speaker and incoming text",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "voice",
      "description" => "A language-specific voice to use, or picks the language default if not provided",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "callback",
      "description" => "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "Float",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

