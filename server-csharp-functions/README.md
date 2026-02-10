# Org.OpenAPITools - Azure Functions v4 Server

Sirqul provides an Engagement-as-a-Service (EaaS)
           IoT Platform with Smart Mesh network technology to drive
           engagement, operational efficiency, rapid innovation and new
           revenue streams. Please visit https://dev.sirqul.com/ for more
           documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/Org.OpenAPITools
docker build -t org.openapitools .
docker run -p 5000:8080 org.openapitools
```
