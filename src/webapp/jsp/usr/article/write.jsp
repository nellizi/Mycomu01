<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ll.exam.article.dto.ArticleDto" %>
<%@ page import="java.util.List"%>

<%
List<ArticleDto>articles = (List<ArticleDto>)request.getAttribute("articles");
%>
<h1>게시물 작성</h1>

<form>
    <div>
        <span>제목</span>
        <div>
            <input name="title" Type = "text" maxlength = "50" placeholder="제목을 입력해주세요"/>
        </div>
    </div>

    <div>
        <span>내용</span>
        <div>
            <input name="body" Type = "text" maxlength = "300" placeholder="내용을 입력해주세요"/>
        </div>
    </div>

     <div>
            <span>작성성</san>
            <div>
                <input Type = "submit" value="작성"/>
            </div>
        </div>

</form>
