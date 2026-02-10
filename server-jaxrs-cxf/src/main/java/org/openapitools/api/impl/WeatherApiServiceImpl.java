package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.WeatherResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class WeatherApiServiceImpl implements WeatherApi {
    /**
     * Search Weather
     *
     * Search the weather forcast for the next 5 days
     *
     */
    public WeatherResponse searchWeather(BigDecimal version, Long regionId, Double latitude, Double longitude, Long timezoneOffset) {
        // TODO: Implement...

        return null;
    }

}
