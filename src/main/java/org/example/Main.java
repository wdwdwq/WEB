package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("==프로그램 시작==");

        Scanner sc = new Scanner(System.in);

        int lastArticleId = 0;

        List<Article> articles = new ArrayList<>();

        while (true) {
            System.out.print("명령어) "); //
            String cmd = sc.nextLine().trim();

            if (cmd.isBlank()) { //빈문자열, 사용자가 공백 문자만 입력한 경우 \t,\n등
                System.out.println("명령어를 입력해주세요");
                continue;
            }

            switch (cmd) {
                case "exit":
                    System.out.println("==프로그램 끝==");
                    sc.close();
                    return;
                case "article write":
                    lastArticleId++;

                    System.out.print("제목:");
                    String title = sc.nextLine();
                    System.out.print("내용:");
                    String body = sc.nextLine();

                    Article article = new Article(lastArticleId, title, body);
                    articles.add(article);

                    System.out.println(lastArticleId + "번 게시물이 생성되었습니다");
                    break;

                case "article list":
                    if (articles.isEmpty()) {// 리스트가 비어있으면 ture이기 때문에
                        System.out.println("게시물이 존재하지 않습니다");
                    } else {
                        System.out.println("번호\t\t제목\t\t내용");
                        for (int i = articles.size() - 1; i >= 0; i--) {
                            Article articleItem = articles.get(i);
                            System.out.printf("%d\t\t\t%s\t\t\t%s\n", articleItem.id, articleItem.title, articleItem.body);
                        }
                    }
                    break;

                case "article detail":
                    System.out.print("보고자 하는 게시물 번호: ");
                    int id = Integer.parseInt(sc.nextLine().trim());

                    Article foundArticle = null;
                    for (Article detail : articles) {
                        if (detail.id == id) {
                            foundArticle = detail;
                            break;
                        }
                    }

                    if (foundArticle == null) {
                        System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);
                    } else {
                        System.out.printf("번호: %d\n제목: %s\n내용: %s\n", foundArticle.id, foundArticle.title, foundArticle.body);
                    }
                    break;

                        default:
                    System.out.print("존재하지 않는 명령어입니다\n");
            }
        }
    }
}

