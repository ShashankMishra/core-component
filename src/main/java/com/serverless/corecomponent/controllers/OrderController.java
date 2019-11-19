package com.serverless.corecomponent.controllers;

import com.serverless.corecomponent.models.Item;
import com.serverless.corecomponent.services.Service;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;


@Controller("/v1/item")
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @Inject
    private Service service;

    @Post(produces = MediaType.APPLICATION_JSON)
    public HttpResponse placeOrder(@Body List<Item> items) {
        LOGGER.info("Create item -  CreateRequest received: {}", items);
        service.placeOrder(items);
        return HttpResponse.ok();
    }

}