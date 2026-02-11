#!/bin/bash

# Define the array of strings
servers=("aspnet-fastendpoints" "cpp-pistache-server" "csharp-functions" "erlang-server" "go-server" "graphql-nodejs-express-server" "haskell" "java-play-framework" "jaxrs-cxf" "jaxrs-jersey" "jaxrs-resteasy" "kotlin-server" "kotlin-spring" "php-laravel" "python-aiohttp" "python-flask" "ruby-on-rails" "ruby-sinatra" "rust-server" "scala-play-server" "scalatra" "spring")

# Iterate through the array
# the --skip-operation-example option is important to get around memory issues
for server in "${servers[@]}"; do
  echo "---------------- generating server-stubs for $server"

  # Run a command for each element
  docker run -e JAVA_OPTS="-Xmx10g" --rm \
    -v $PWD:/local openapitools/openapi-generator-cli generate \
    --global-property modelTests=false,modelDocs=false,apiTests=false,apiDocs=false \
    --skip-operation-example \
    -i /local/sirqul-openapi-servicesFULL.yaml \
    -g $server \
    -o "/local/server-$server"

  echo "---------------- server-stubs for $server finished"
done
