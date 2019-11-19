package com.serverless.corecomponent.services;

import com.serverless.corecomponent.clients.InventoryClient;
import com.serverless.corecomponent.models.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class Service {
    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    @Inject
    InventoryClient inventoryClient;

    public void placeOrder(List<Item> item) {
        LOGGER.info("Saving Order ...");
        inventoryClient.save(item);
        LOGGER.info("Item Saved...");

    }

}
