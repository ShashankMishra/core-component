package com.serverless.corecomponent.clients;

import com.serverless.corecomponent.models.Order;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(value = "${client.order-service}")
public interface OrderServiceClient {

    @Post("/order")
    void save(Order order);

    @Get("/order")
    Order get(String orderId);
}
