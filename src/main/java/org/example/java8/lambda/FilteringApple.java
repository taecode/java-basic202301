package org.example.java8.lambda;

import org.w3c.dom.ls.LSException;

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
        @problem
        -과일이 사과가 아니라 오렌지이면? 사용불가
        -과일이 아니라면?

     */
    public  static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result=new ArrayList<>();
        for (Apple apple : inventory) {
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    /*
        @solution -try 4: 제네릭 필터 메서드 생성

     */
    public static<T> List<T> filter(List<T> inventory, GenericPredicate<T> p){
        List<T> result=new ArrayList<>();
        for (T t : inventory) {
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    /*
        리스트와 변경 조건을 전달하면 리스트 내부의 값을 변경조건에 따라
        변환한 뒤 반환하는 map이라는 메서드를 구현

        ex) map(appleList, apple->apple.setColor(RED))
        => 리스트 안의 모든 사과가 빨강색으로 변해야 한다.
     */

    //T는 Apple R은 Color
    //R=Color로 반환
    public static <T, R> List<R> map(List<T> list, GenericFunction<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = mapper.apply(t);
            result.add(r);
        }
        return result;
    }

}
