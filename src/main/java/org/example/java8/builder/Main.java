package org.example.java8.builder;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //회원 정보 생성
        //Member m = new Member("abc1234","1234"); //account, password 강제

        //순서에 상관없이 가능
        Member m = Member.builder()
                .account("abc1234")
                .password("1234")
                .age(33)
                .regDate(LocalDateTime.now())
                .build(); //Member로 리턴 받는다

        Board board = Board.builder()
                .content("글내용")
                .writer("똘끼")
                .title("제목")
                .id(100L)
                .build();

    }
}
