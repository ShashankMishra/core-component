package com.serverless.corecomponent.clients;

import com.serverless.corecomponent.models.Order;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(value = "${client.order-service}")
public interface OrderServiceClient {

    @Post("/order")
    void save(@Body Order order);

    @Get("/order/{orderId}")
    Order get(@PathVariable String orderId);
}
