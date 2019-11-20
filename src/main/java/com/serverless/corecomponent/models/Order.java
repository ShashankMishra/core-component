package com.serverless.corecomponent.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Order {

    private String id;

    private String description;

    private List<Item> items;

    private Date createdAt;

    private Date updatedAt;
}