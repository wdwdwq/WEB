package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// while ~하는 동안에
// if 만약에
// for 이거라면
public class Main2 {
    public static void main(String[] args) {
        System.out.println("==프로그램 시작==");//코드를 시작하자마자 화면에 보여줌

        Scanner sc = new Scanner(System.in); // 사용자의 입력을 Scanner로 입력 받을거야

        int lasArticleId = 0; // 마지막 생성된 게시물 id를 저장할 변수

        List<Article> articles = new ArrayList<>(); //articles라는 배열안에 게시물'들'을 저장할거야

        while (true){//이 프로그램이 진행할 동안 계속 될거야
            System.out.printf("명령어) ");// 실행된다면 명령어를 받을 준비를 해
            String cmd = sc.nextLine().trim();// 입력되는 명령어 앞뒤 공백을 제거해

            if(cmd.length() == 0){
                System.out.println("명령어를 입력해주세요");
                 continue;
            }
            if(cmd.equals("끝")){ // 끝이라고 입력하면 루프를 종료한다
                break; // 종료
            }
            if(cmd.equals("article write")){ // article write를 입력력 게시물 작성 기능을 시작
                lasArticleId++ ; // 게시물 id를 생성하고
                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("내용 : ");
                String body = sc.nextLine();

                Article article = new Article(lasArticleId, Util.getDateStr(), title, body); //제목을 입력받아 Article 객체를 생성함
                articles.add(article);//article 리스트에 추가하고, 게시물 생성 메시지를 출력한다.
            }
            else if(cmd.equals("article list")) {// 만약에 article list를 입력하면 명령어를 실행하는데
                if (articles.size() == 0) { // articles리스트 안에 아무것도 없으면
                    System.out.println("게시물이 존재하지 않습니다");// 게시물이 존재하지 않습니다를 출력해라
                    continue;// 그 다음 프로그램 처음으로 돌아간다
                }

                System.out.println("번호  /   제목  /   작성일");
                for (int i = articles.size() - 1; i >= 0; i--) {
                    //int i = articles.size() - 1 article.size는 articles의 리스트 요소 개수를 반환다
                    //-1은 리스트의 마지막 요소 개수를 반환한다.(인덱스는 0부터 시작하기 때문에 크기에서 1을 뺀다)
                    //인덱스가 0 이상일 때 실행된다
                    //i-- 반복이 끝날때마다 반복해서 i의 값을 감소시킨다
                    //리스트의 인덱스가 처음(0)까지 도달할 때까지 루프를 실행한다
                    Article article = articles.get(i);//i 해당하는 Article 를 반환한다
                    System.out.printf("%d	/	%s	/	%s\n", article.id, article.regDate ,article.title);
                }// 확면에 보여준다 id(번호),title(제목)
            } else if (cmd.startsWith("article detail")) { //입력한 명령어가 article detail로 시작하는지 확인함
             String[] cmdBits = cmd.split(" "); //입력받은 명령어를 공백 지준으로 분리해서 배열에 저장한다
             int id = Integer.parseInt(cmdBits[2]); // cmdBits[2]는 분리된 배열 세번째 요소로 cmdBits
                //["article", "detail", "?"] 가 저장되고
                //article detail [게시물 번호] 구조로 명령어가 되어 있는데
                // 배열 안에 2가 세번째에 해당하는 것이고 그게 찾아야 할 번호 이기 때문에
                Article foundArticle = null;// null로 초기화 Article안에 있는 articles를 찾기 위해

                for(Article article : articles) { //articles 안에 article 객체들을 찾아본다
                    if (article.id == id) {
                        foundArticle = article; //일치한다면 foundArticle 변수에 해당 객체를 할당하고
                        break;// 종료한다
                    }
                }
                    if(foundArticle == null){ //사용자가 요청한 게시물 id에 해당하는 게시물이 리스트에 존재하지 않는다
                        System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);// id에 해당하는 게시물이 리스테 존재하지 않음을 의미함
                        continue; // 다음 반복
                    }
//foundArticle 변수에 저장된 게시물 객체가 있으면 해당 게시물 상세 정보를 id,title,body를 보여준다
                System.out.printf("번호 : %d\n", foundArticle.id);
                System.out.printf("제목 : %s\n", foundArticle.title);
                System.out.printf("내용 : %s\n", foundArticle.body);
// 몇번째 게시물을 지워야하는지 내용은 detail 코드와 유사하다
            }else if (cmd.startsWith("article delete")){//명령어가 article delete 로 시작하는지 확인한다
                String[] cmdBits = cmd.split(" ");// 문자열 공백을 분리한다
                int id = Integer.parseInt(cmdBits[2]);// 문자열 형태를 게시물 번호를 수정해 정수로 변환한다

                Article foundArticle = null;//article 안에 foundArticle를 찾는데 기본값으로는 업다는 걸 가정으로

                for(Article article : articles){//article 리스트를 보면서
                    if(article.id == id){//article delete ? 뒤에 id와 일치하면
                        foundArticle = article;// foundArticle 안에 넣고 반복을 종료한다
                        break;
                    }
                }
                if (foundArticle == null) {//만약에 변수가 아직 null이면
                    System.out.printf("%d번 게시물은 존재하지 않습니다\n", id);//해당 메시지를 출력한다
                    continue;//명령어) 이모양으로 다시 돌아간다
                }
                articles.remove(foundArticle);//articles 리스트안에는 foundArticle에 저장되어 넣은 정보를 삭제한다
                System.out.printf("%d번 게시물을 삭제했습니다\n", id);// 삭제한 출력문을 내보낸다
            }else{
                System.out.println("없는 명령어");
            }
        }
        System.out.println("==프로그램 끝=="); // 모든게 끝나면 프로그램이 끝난다

        sc.close(); // Scanner를 닫는다
    }
}

class Article {// Article이라는 클래스를 생성
    int id;// id값을 주고
    String regDate;
    String title;// 문자열인 제목
    String body;// 문자열인 내용

    Article(int id, String title, String body, String regDate){// 생성자를 통해 객체를 초기화함
        this.id = id; //번호
        this.title = title; // 제목
        this.body = body; // 내용
        this.regDate = regDate;
    }
}
