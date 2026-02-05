package com.example.item_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.item_api.entity.Item;
import com.example.item_api.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService service;

    // Add a new item
    @PostMapping
    public Item addItem(@Valid @RequestBody Item item) {
        return service.saveItem(item);
    }

    // Get item by ID
    @GetMapping("/{id}")
    public Item getItem(@PathVariable int id) {
        return service.getItemById(id);
    }
}
