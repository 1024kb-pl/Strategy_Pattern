package org.blog.posts.service;

import org.blog.posts.date.DateManager;
import org.blog.posts.model.Article;
import org.blog.posts.model.PublishMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ArticleService {
    private final List<Article> articleList = new ArrayList<>();
    private final DateManager dateManager = new DateManager();

    public void publishArticle(Article article, PublishMethod publishMethod) {
        String title = article.getTitle();


        switch (publishMethod) {
            case PUBLISH_TODAY:
                System.out.println(String.format("Opublikowałem artykuł: %s", title));
                return;

            case PUBLISH_TOMORROW:
                LocalDate tomorrow = dateManager.getTomorrow();
                System.out.println(String.format("Zaplanowałem publikację artykułu na jutro (%s): %s", tomorrow.toString(), title));
                return;

            case SAVE:
                System.out.println(String.format("Zapisałem artykuł: %s", title));
                return;

            default:
                System.out.println("Nie rozpoznano metody publikacji.");
        }
    }
}
