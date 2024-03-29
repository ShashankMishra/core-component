package com.serverless.corecomponent.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String id;

    private String name;

    private double price;

    private long quantity = 0;

}
