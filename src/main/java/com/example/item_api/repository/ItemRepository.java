package com.example.item_api.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.item_api.entity.Item;

@Repository
public class ItemRepository {

    // In-memory list to store items
    private List<Item> items = new ArrayList<>();
    private int idCounter = 1; // For auto-incrementing IDs

    // Save a new item
    public Item save(Item item) {
        item.setId(idCounter++); // assign unique ID
        items.add(item);
        return item;
    }

    // Find an item by ID
    public Optional<Item> findById(int id) {
        return items.stream()
                    .filter(item -> item.getId() == id)
                    .findFirst();
    }
}
