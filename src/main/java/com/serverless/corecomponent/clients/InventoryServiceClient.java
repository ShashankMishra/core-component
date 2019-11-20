package com.serverless.corecomponent.clients;

import com.serverless.corecomponent.models.Item;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client(value = "${client.inventory-service}")
public interface InventoryServiceClient {

    @Put("/items")
    void update(List<Item> order);

    @Get("/items")
    List<Item> getAll();
}
