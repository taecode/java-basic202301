package org.example;

import org.example.basic.Dancer;
import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.example.poly.PerformanceTeam;

public class Main {
    public static void main(String[] args) {

//        Dancer dancer1 = new Dancer();
//        Dancer dancer = new Dancer("총알탄소년단", "춤신춤왕");
//
//        dancer.dance();

        IdolDancer idolDancer = new IdolDancer("AB6IX", "이대휘");

        StreetDancer streetDancer = new StreetDancer("길거리춤꾼들", "박격포");

        idolDancer.dance(); //Idol 댄서만 wink 갈긴다. 오버라이딩으로
        System.out.println();

        streetDancer.dance();

       // new dancer(); // dancer에 abstract 선언해서 추상화 시킴 -> 객체 생성 불가

        Dancer idolDancer1 = new IdolDancer("아이돌팀1", "아이돌1"); //IdolDancer의 상위 타입 사용 가능
        Dancer idolDancer2 = new IdolDancer("아이돌팀2", "아이돌2");
        Dancer idolDancer3 = new IdolDancer("아이돌팀3", "아이돌3");

        Dancer streetDancer1 = new StreetDancer("스트릿팀1", "스트릿댄서1");
        Dancer streetDancer2 = new StreetDancer("스트릿팀2", "스트릿댄서2");
        Dancer streetDancer3 = new StreetDancer("스트릿팀3", "스트릿댄서3");

        PerformanceTeam team = new PerformanceTeam();
        team.joinDancer(idolDancer1);
        team.joinDancer(streetDancer3);

        System.out.println();

        team.groupDance();
    }
}