package org.example.java8.stream.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        //연습1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬
        //List<Transaction>
        transactions.stream()
                .filter(t->t.getYear()==2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList())
                .forEach(out::println);


        out.println("================================");

        //연습2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열
        //거래목록에서 거래자들을 추출한담에 거래자안에 있는 도시이름 추출
        //filter: 10개중에 조건에 맞는 3개를 필터링
        //map: 10개중에 10개를 가져오는데 조건에 맞게 추출
        //List<String>
       List<String> cities=transactions.stream()
               .map(t->t.getTrader().getCity())
               .distinct()
               .collect(toList());

       out.println("cities="+cities);

        out.println("================================");

        //연습3: Cambridge에 근무하는 모든 거래자를 찾아 이름순으로 오름차정렬
        //List<Trader>
         List<Trader>cambridge=transactions.stream()
                 .map(t->t.getTrader())
                 .filter(td-> td.getCity().equals("Cambridge"))
                 .distinct()
                 .sorted(comparing(Trader::getName))
                 .collect(toList());
         cambridge.forEach(out::println);



        out.println("================================");
        //연습4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환
        //List<String>

        List<String>names=transactions.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted(String::compareTo) //정렬 리스트 대상이 String이나 숫자타입이면 Comparator를 안써도 정렬됨
                .collect(toList());
        out.println("names="+names);

        //연습5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?

        //연습6: Cambridge에 사는 거래자의모든 거래액의 총합 출력

        //연습7: 모든 거래에서 최고 거래액은 얼마인가??

    }
}
