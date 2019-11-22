package com.serverless.corecomponent.clients;

import com.serverless.corecomponent.models.Item;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client(value = "${client.inventory-service}")
public interface InventoryServiceClient {

    @Put("/item/all")
    void update(@Body List<Item> items);
}
