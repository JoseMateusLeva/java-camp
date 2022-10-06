package com.springdesafio.springdesafio.controller;

import com.springdesafio.springdesafio.dto.ArticlesDTO;
import com.springdesafio.springdesafio.service.IArticles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticlesController {
    @Autowired
    private IArticles service;

    @GetMapping(path = "/api/v1/articless")
    public String getParams(@RequestParam(name = "category", required = false) String category,
                            @RequestParam(name = "freeShipping", required = false) Boolean freeShipping,
                            @RequestParam(name = "order", required = false) Integer order) {

        return category + " " + freeShipping + " " + order;

    }

    // /api/v1/articles?category=categoryName&freeShipping=true&order=2
    @GetMapping(path = "/api/v1/articles", params = {"category", "freeShipping", "order"})
    public ResponseEntity<List<ArticlesDTO>> getByOrder(@RequestParam String category, @RequestParam Boolean freeShipping, @RequestParam Integer order) {
        return new ResponseEntity<>(service.getByOrder(category, freeShipping, order), HttpStatus.OK);
    }


    // /api/v1/articles?freeShipping=true&prestige=****
    @GetMapping(path = "/api/v1/articles", params = {"freeShipping", "prestige"})
    public ResponseEntity<List<ArticlesDTO>> getByFreePrestige(@RequestParam Boolean freeShipping, @RequestParam String prestige) {
        return new ResponseEntity<>(service.getByFreePrestige(freeShipping, prestige), HttpStatus.OK);
    }

    // /api/v1/articles?category=categoryName&freeShipping=true
    @GetMapping(path = "/api/v1/articles", params = {"category", "freeShipping"})
    public ResponseEntity<List<ArticlesDTO>> getByCategoryFree(@RequestParam String category, @RequestParam Boolean freeShipping) {
        return new ResponseEntity<>(service.getByCategoryFree(category, freeShipping), HttpStatus.OK);
    }

    // /api/v1/articles?category=categoryName
    @GetMapping(path = "/api/v1/articles", params = {"category"})
    public ResponseEntity<List<ArticlesDTO>> getByCategory(@RequestParam String category) {
        return new ResponseEntity<>(service.getByCategory(category), HttpStatus.OK);
    }

    // /api/v1/articles
    @GetMapping("/api/v1/articles/")
    public ResponseEntity<List<ArticlesDTO>> getAll() {
        return new ResponseEntity<>(service.getAllArticles(), HttpStatus.OK);
    }
}
