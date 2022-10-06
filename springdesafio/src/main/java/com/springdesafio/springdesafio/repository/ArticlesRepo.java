package com.springdesafio.springdesafio.repository;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.springdesafio.springdesafio.model.Articles;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ArticlesRepo {
    ObjectMapper mapper = new ObjectMapper();


    public List<Articles> getByOrder(String category, Boolean freeShipping, Integer order) {
        switch (order) {
            case 0 -> {
                return getAll().stream()
                        .filter(v -> v.getCategory().equals(category) && v.getFreeShipping().equals(freeShipping))
                        .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName()))
                        .collect(Collectors.toList());
            }
            case 2 -> {
                return getAll().stream()
                        .filter(v -> v.getCategory().equals(category) && v.getFreeShipping().equals(freeShipping))
                        .sorted(Comparator.comparing(Articles::getPrice))
                        .collect(Collectors.toList());
            }
            default -> {
                return null;
            }
        }
    }

    public List<Articles> getByFreePrestige(Boolean status, String prestige) {
        return getAll().stream().filter(v -> v.getFreeShipping().equals(status) && v.getPrestige().equals(prestige)).collect(Collectors.toList());
    }

    public List<Articles> getByCategoryFree(String category, Boolean status) {
        return getAll().stream().filter(v -> v.getCategory().equals(category) && v.getFreeShipping().equals(status)).collect(Collectors.toList());
    }

    public List<Articles> getByCategory(String category) {
        return getAll().stream().filter(v -> v.getCategory().equals(category)).collect(Collectors.toList());
    }

    public List<Articles> getAll() {
        try {
            String DATABASE = "src/main/resources/products.json";
            return Arrays.asList(mapper.readValue(new File(DATABASE), Articles[].class));
        } catch (Exception ex) {
            System.out.println("Arquivo não encontrado!");
        }

        return null;
    }
}
