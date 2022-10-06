package com.springdesafio.springdesafio.dto;

import com.springdesafio.springdesafio.model.Articles;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticlesDTO implements Serializable {
    private Long productId;
    private String name;
    private Integer quantity;

    public ArticlesDTO(Articles articles) {
        this.productId = articles.getProductId();
        this.name = articles.getName();
        this.quantity = articles.getQuantity();
    }

    public static List<ArticlesDTO> convertDto(List<Articles> articles) {
        return articles.stream().map(ArticlesDTO::new).collect(Collectors.toList());
    }
}
