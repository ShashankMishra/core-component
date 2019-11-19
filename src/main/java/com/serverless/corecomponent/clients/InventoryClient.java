package com.serverless.corecomponent.clients;

import com.serverless.corecomponent.models.Item;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client
public interface InventoryClient {

    @Post
    void save(List<Item> item);
}
