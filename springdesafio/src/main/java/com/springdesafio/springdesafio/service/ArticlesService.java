package com.springdesafio.springdesafio.service;

import com.springdesafio.springdesafio.dto.ArticlesDTO;
import com.springdesafio.springdesafio.model.Articles;
import com.springdesafio.springdesafio.repository.ArticlesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ArticlesService implements IArticles {

    @Autowired
    private ArticlesRepo repo;

    @Override
    public List<ArticlesDTO> getAllArticles() {
        return ArticlesDTO.convertDto(repo.getAll());
    }

    @Override
    public Articles add(Articles article) throws IOException {
        return repo.add(article);
    }

    @Override
    public List<ArticlesDTO> getByCategory(String category) {
        return ArticlesDTO.convertDto(repo.getByCategory(category));
    }

    @Override
    public List<ArticlesDTO> getByOrder(String category, Boolean status, Integer order) {
        return ArticlesDTO.convertDto(repo.getByOrder(category, status, order));
    }

    @Override
    public List<ArticlesDTO> getByFreePrestige(Boolean status, String prestige) {
        return ArticlesDTO.convertDto(repo.getByFreePrestige(status, prestige));
    }

    @Override
    public List<ArticlesDTO> getByCategoryFree(String category, Boolean status) {
        return ArticlesDTO.convertDto(repo.getByCategoryFree(category, status));
    }
}
