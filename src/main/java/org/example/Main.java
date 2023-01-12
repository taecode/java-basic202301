package org.example;

import org.example.basic.Dancer;
import org.example.beans.Goods;
import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.example.poly.PerformanceTeam;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Goods goods1 = new Goods("세탁기", 300000);
        Goods goods2 = new Goods("세탁기", 300000);
        
        
        //soutv
        System.out.println("goods1 = " + goods1); //16진수 값으로 나옴 6bf256fa (toString 오버라이딩 안하면)
        System.out.println("goods2 = " + goods2);

        System.out.println("(goods1==goods2) = " + (goods1==goods2)); //둘은 메모리에 따로 올라가기 떄문에 다른 객체로 본다
        System.out.println("(goods1.equals(goods2) = " + (goods1.equals(goods2)));
        //System.out.println(goods1.hashCode());

        Set<String>set1=new HashSet<>(); //set 자동으로 중복 제거
        set1.add("짜장면");
        set1.add("짬뽕");
        set1.add("짜장면");

        System.out.println("set1 = " + set1);
        System.out.println("set1.size() = " + set1.size());

        System.out.println("-----------------------------------------");

        Set<Goods> set2=new HashSet<>();
        set2.add(goods1);
        set2.add(goods2);

        System.out.println("set2 = " + set2);
        System.out.println("set2.size() = " + set2.size()); //hash값이 다르기 때문에 setsize=2

        System.out.println(goods1.hashCode()); //hash도 오버라이딩 해야 완전히 같은 값이 된다.
        System.out.println(goods2.hashCode());
    }
}