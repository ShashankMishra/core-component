package com.serverless.corecomponent.services;

import com.serverless.corecomponent.clients.InventoryServiceClient;
import com.serverless.corecomponent.clients.OrderServiceClient;
import com.serverless.corecomponent.models.Item;
import com.serverless.corecomponent.models.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class Service {
    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    @Inject
    InventoryServiceClient inventoryServiceClient;

    @Inject
    OrderServiceClient orderServiceClient;

    public void placeOrder(Order order) {

        LOGGER.info("Saving Order ... {} ",order);
        orderServiceClient.save(order);
        LOGGER.info("Item Saving ... {} ",order.getItems());
        inventoryServiceClient.update(order.getItems());
        LOGGER.info("Item Saved...");

    }

    public Order getOrder(String orderId) {
        LOGGER.info("Get Order ...");
        return orderServiceClient.get(orderId);
    }

}
