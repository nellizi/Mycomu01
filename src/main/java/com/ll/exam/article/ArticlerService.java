package com.ll.exam.article;

public class ArticlerService {

    private ArticleRepository articleRepository;

    public ArticlerService(){
        articleRepository = new ArticleRepository();
    }


    public long write(String title, String body) {
      
       return articleRepository.write(title,body);
    }
}
