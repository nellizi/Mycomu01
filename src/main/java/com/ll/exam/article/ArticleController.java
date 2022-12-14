package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {

    private ArticlerService articlerService;

    public ArticleController(){
        articlerService = new ArticlerService();
    }

    public void showList(Rq rq) {
        List<ArticleDto> articleDtos = articlerService.findAll();

        rq.setAttr("articles", articleDtos);
        rq.view("usr/article/list");


        }

    public void showWrite(Rq rq) {
        rq.view("usr/article/write");
    }

    public void doWrite(Rq rq) {
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");


       long id =  articlerService.write(title,body);
       rq.appendBody("%d번 게시물이 생성 되었습니다.".formatted(id));


    }

    public void showdetail(Rq rq) {
        long id = 1;

        ArticleDto articleDto = articlerService.findById(id);

        rq.setAttr("article", articleDto);
        rq.view("usr/article/detail");

    }
}
