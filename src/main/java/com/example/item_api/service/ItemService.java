package com.example.item_api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.item_api.entity.Item;
import com.example.item_api.repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    // Save item
    public Item saveItem(Item item) {
        return repository.save(item);
    }

    // Get item by ID
    public Item getItemById(int id) {
        Optional<Item> optionalItem = repository.findById(id);
        return optionalItem.orElse(null); // return null if not found
    }
}
