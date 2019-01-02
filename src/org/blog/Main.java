package org.blog;

import org.blog.posts.model.Article;
import org.blog.posts.model.PublishMethod;
import org.blog.posts.service.ArticleService;

public class Main {

    public static void main(String[] args) {
        ArticleService articleService = new ArticleService();

        Article article = new Article("Java 8 features", "Lorem impsum....");

        articleService.publishArticle(article, PublishMethod.PUBLISH_TOMORROW);
    }
}
