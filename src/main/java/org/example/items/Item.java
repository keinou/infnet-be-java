package org.example.items;

import lombok.Data;

@Data
public class Item {
    private String name;
    private int weight;
    private int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
}
