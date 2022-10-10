package com.springdesafio.springdesafio.service;

import com.springdesafio.springdesafio.dto.ArticlesDTO;
import com.springdesafio.springdesafio.model.Articles;

import java.io.IOException;
import java.util.List;

public interface IArticles {
    List<ArticlesDTO> getAllArticles();

    Articles add(Articles article) throws IOException;

    List<ArticlesDTO> getByCategory(String category);

    List<ArticlesDTO> getByOrder(String category, Boolean status, Integer order);

    // /api/v1/articles?freeShipping=true&prestige=****
    List<ArticlesDTO> getByFreePrestige(Boolean status, String prestige);

    ///api/v1/articles?category=categoryName&freeShipping=true
    List<ArticlesDTO> getByCategoryFree(String category, Boolean status);
}
