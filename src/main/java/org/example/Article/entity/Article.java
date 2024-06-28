package org.example.Article.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article {
    int id;
    String title;
    String body;

     public Article(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title=" + title + '\'' +
                ", source=" + body + '\'' +
                '}';
    }
}
