package org.example;

import org.example.motivation.entity.Motivation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;
    List<Motivation> motivations = new ArrayList<>();
    int lastMotivation = 0;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation execution ==");
        while (true) {
            System.out.print("command) ");
            String cmd = sc.nextLine().trim();

            if (cmd.length() == 0) {
                System.out.println("없는 명령어야");
                continue;
            } else if (cmd.equals("exit")) {
                System.out.println("== motivation end ==");
                break;
            }

            if (cmd.equals("add")) {
                lastMotivation++;
                System.out.print("motivation: ");
                String body = sc.nextLine();
                System.out.print("source: ");
                String source = sc.nextLine();

                Motivation m = new Motivation(lastMotivation, body, source);
                motivations.add(m);
                System.out.printf("%d번 motivation이 등록되었습니다\n", lastMotivation);

            } else if (cmd.equals("list")) {
                System.out.println("== motivation list ==");
                if (motivations.size() == 0) {
                    System.out.println("생성된 motivation이 없습니다");
                    continue;
                }
                System.out.print("id      //      body//      source      \n");
                System.out.println("=".repeat(35));

                for (int i = motivations.size() - 1; i >= 0; i--) {
                    Motivation m = motivations.get(i);
                    System.out.printf("%d       //      %s      //     %s     \n", m.id, m.body, m.source);
                }
            } else if (cmd.startsWith("detail")) {
                String[] cmdBits = cmd.split(" ");
                int id = Integer.parseInt(cmdBits[1]);

                Motivation foundMotivation = null;

                for (Motivation motivation : motivations) {
                    if (motivation.id == id) {
                        foundMotivation = motivation;
                        break;
                    }
                }
                if (foundMotivation == null) {
                    System.out.printf("%d번 motivation이 존재하지 않습니다\n", id);
                    continue;
                }
                System.out.printf("번호 : %d\n", foundMotivation.id);
                System.out.printf("내용 : %s\n", foundMotivation.body);
                System.out.printf("원작자 : %s\n", foundMotivation.source);

            } else if (cmd.startsWith("delete")) {
                String[] cmdBits = cmd.split(" ");
                int id = Integer.parseInt(cmdBits[1]);

                Motivation foundMotivation = null;

                for (Motivation motivation : motivations) {
                    if (motivation.id == id) {
                        foundMotivation = motivation;
                        break;
                    }
                }
                if (foundMotivation == null) {
                    System.out.printf("");
                }
            }
        }


    }
}
