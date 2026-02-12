# Go API Server for openapi

Sirqul provides an Engagement-as-a-Service (EaaS)
           IoT Platform with Smart Mesh network technology to drive
           engagement, operational efficiency, rapid innovation and new
           revenue streams. Please visit https://dev.sirqul.com/ for more
           documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>

## Overview

- API version: 3.16
- Build date: 2026-02-11T19:24:30.112418100Z[Etc/UTC]
- Generator version: 7.20.0-SNAPSHOT
For more information, please visit [https://corp.sirqul.com/contact-us/](https://corp.sirqul.com/contact-us/)


### Running the server
To run the server, follow these simple steps:

```
go run main.go
```

The server will be available on `http://localhost:8080`.

To run the server in a docker container
```
docker build --network=host -t openapi .
```

Once image is built use
```
docker run --rm -it openapi
```
