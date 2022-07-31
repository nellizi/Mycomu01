package com.ll.exam.article;

import com.ll.exam.article.dto.ArticleDto;

import java.util.List;

public class ArticlerService {

    private ArticleRepository articleRepository;

    public ArticlerService(){
        articleRepository = new ArticleRepository();
    }


    public long write(String title, String body) {
      
       return articleRepository.write(title,body);
    }

    public List<ArticleDto> findAll() {

        return articleRepository.findAll();
    }

    public ArticleDto findById(long id) {
        return articleRepository.findById(id);
    }
}
