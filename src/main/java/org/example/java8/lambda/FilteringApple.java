package org.example.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class FilteringApple {

    /*
        @solution -try1: 녹색사과를 필터링하는 메서드를 만들어야 함.
        @problem
        -만약 다른 색깔 사과를 필터링해야되는 경우에는?
        -새로운 메서드를 또 만들어야 한다.
     */

    public static List<Apple> filterGreenApples(List<Apple>inventory){
        List<Apple> result=new ArrayList<>(); //녹색사과 바구니
        for (Apple apple : inventory) { //전체 사과
            if(apple.getColor()==Color.GREEN){
                result.add(apple);
            }
        }
        return result;

    }

    /*
        @solution -try 2: 색상을 파라미터화 한다.
        @problem
        -만약에 필터 기준이 색상이 아니라 무게였다면?
        -두번째 파라미터로 무게기준을 받아내는 메서드를 또 만들기 싫다...
        -안만들고 한번에
     */

    public static List<Apple> filterApplesByColor(List<Apple> inventory,Color color){
        List<Apple> result=new ArrayList<>();
        for (Apple apple : inventory) {
            if(apple.getColor()==color){ //원하는 색깔이면 result에 담는다
                result.add(apple);
            }
        }
        return result;
    }

    /*
        @solution -try 3: 동작을 파라미터화 한다.- 추상적 조건으로 필터링 (색깔구분, 무게 구분)


     */

}
