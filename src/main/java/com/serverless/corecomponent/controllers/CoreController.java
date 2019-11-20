package com.serverless.corecomponent.controllers;

import com.serverless.corecomponent.models.Item;
import com.serverless.corecomponent.models.Order;
import com.serverless.corecomponent.services.Service;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;


@Controller("/v1")
public class CoreController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CoreController.class);

    @Inject
    private Service service;

    @Post(value = "/order", produces = MediaType.APPLICATION_JSON)
    public HttpResponse saveOrder(@Body Order order) {
        LOGGER.info("Create order request received: {}", order);
        service.placeOrder(order);
        return HttpResponse.ok();
    }

    @Get(value = "/order/{orderId}", produces = MediaType.APPLICATION_JSON)
    public HttpResponse getOrder(@PathVariable String orderId) {
        LOGGER.info("Get order request received: {}", orderId);
        Order order = service.getOrder(orderId);
        return Objects.nonNull(order) ? HttpResponse.ok(order) : HttpResponse.notFound();
    }


}