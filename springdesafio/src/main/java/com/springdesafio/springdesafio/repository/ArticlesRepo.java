package com.springdesafio.springdesafio.repository;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.springdesafio.springdesafio.model.Articles;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Repository
public class ArticlesRepo {
    private final String DATABASE = "src/main/resources/products.json";

    ObjectMapper mapper = new ObjectMapper();

    Logger logger = Logger.getLogger(ArticlesRepo.class.getName());

    public Articles add(Articles article) throws IOException {
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Articles> productList = new ArrayList<>(getAll());

        productList.add(article);
        writer.writeValue(new File(DATABASE), productList);

        return article;
    }

    public List<Articles> getByOrder(String category, Boolean freeShipping, Integer order) {
        switch (order) {
            case 0 -> {
                return getAll().stream()
                        .filter(v -> v.getCategory().equals(category) && v.getFreeShipping().equals(freeShipping))
                        .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName()))
                        .toList();
            }
            case 2 -> {
                return getAll().stream()
                        .filter(v -> v.getCategory().equals(category) && v.getFreeShipping().equals(freeShipping))
                        .sorted(Comparator.comparing(Articles::getPrice))
                        .toList();
            }
            default -> {
                return Collections.emptyList();
            }
        }
    }

    public List<Articles> getByFreePrestige(Boolean status, String prestige) {
        return getAll().stream().filter(v -> v.getFreeShipping().equals(status) && v.getPrestige().equals(prestige)).collect(Collectors.toList());
    }

    public List<Articles> getByCategoryFree(String category, Boolean status) {
        return getAll().stream()
                .filter(v -> v.getCategory().equals(category) && v.getFreeShipping().equals(status))
                .toList();
    }

    public List<Articles> getByCategory(String category) {
        return getAll().stream().filter(v -> v.getCategory().equals(category)).toList();
    }

    public List<Articles> getAll() {
        try {
            return Arrays.asList(mapper.readValue(new File(DATABASE), Articles[].class));
        } catch (Exception ex) {
            logger.log(Level.INFO, "Arquivo não encontrado!");
        }

        return Collections.emptyList();
    }
}
