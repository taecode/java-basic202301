package org.example;

import org.example.basic.Dancer;
import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;

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
    }
}