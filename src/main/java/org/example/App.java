package org.example;

import org.example.Article.entity.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("==Article Start==");

        int lastArticleId = 0;
        List<Article> articles = new ArrayList<>();

        while (true) {
            System.out.print("command) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("==Article End==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("==PLEASE ENTER THE COMMAND!==");
                continue;
            }

            if (cmd.equals("add")) {
                int id = lastArticleId + 1;
                System.out.print("title: ");
                String title = sc.nextLine().trim();
                System.out.print("body: ");
                String body = sc.nextLine().trim();

                Article article = new Article(id, title, body);

                articles.add(article);

                System.out.printf("%d번 게시물이 생성되었습니다\n", id);
                lastArticleId++;
            } else if (cmd.equals("list")) {
                if (articles.size() == 0) {
                    System.out.println("게시물이 존재하지 않습니다");
                    continue;
                }else{
                    System.out.println("있음");
                    System.out.printf("등록된 article 갯수 : " + articles.size() + "\n");
                }
                System.out.println("== Article list ==");
                System.out.println("번호      /       제목      /       내용");
                for (int i = articles.size() - 1; i >= 0; i--) {
                    Article article = articles.get(i);
                    System.out.printf("%d        /       %s     /       %s\n", article.getId(), article.getTitle(), article.getBody());
                    System.out.println("=".repeat(35));
                }

            } else if (cmd.startsWith("detail")) {
                String[] cmdBits = cmd.split(" ");
                int id = Integer.parseInt(cmdBits[1]);

                Article foundArticle = null;

                for (Article article : articles) {
                    if (article.getId() == id) {
                        foundArticle = article;
                        break;
                    }
                }
                if (foundArticle == null) {
                    System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
                    continue;
                }

                System.out.printf("번호 : %d\n", foundArticle.getId());
                System.out.printf("제목 : %s\n", foundArticle.getTitle());
                System.out.printf("내용 : %s\n", foundArticle.getBody());
            } else if (cmd.startsWith("delete")) {
                String[] cmdBits = cmd.split(" ");
                int id = Integer.parseInt(cmdBits[1]);

                Article foundArticle = null;

                for (Article article : articles) {
                    if (article.getId() == id) {
                        foundArticle = article;
                        break;
                    }
                }
                if (foundArticle == null) {
                    System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
                    continue;
                }
                articles.remove(foundArticle);
                System.out.printf("%d번 게시물은 삭제 되었습니다\n", id);
            }

        }


    }
}
