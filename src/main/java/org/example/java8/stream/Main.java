package org.example.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {

    /*
        요리 목록에서 칼로리가 400칼로리보다 작은 요리들만 추출
        칼로리가 낮은 순서대로 오름차 정렬한 후
        그 요리의 이름들만 추출해서 리스트로 만들고 싶다
     */

    //스트림 사용 x

    public static List<String> getHealthyDishName1(List<Dish> menu) {

        List<Dish>lowCaloricdDishes=new ArrayList<>();
        for (Dish dish : menu) {
            if(dish.getCalories()<400){
                lowCaloricdDishes.add(dish);
            }
        }

        //오름차순 정렬
        lowCaloricdDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories()-o2.getCalories();
            }
        });

        //요리의 이름을 담을 리스트
        List<String> dishNames=new ArrayList<>();
        for (Dish lowCaloricdDish : lowCaloricdDishes) {
            dishNames.add(lowCaloricdDish.getName());
        }
        return dishNames;
    }


    //스트림 사용
    public static List<String> getHealthyDishName2(List<Dish> menu){
        List<String> collect = menu.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
        return collect;
    }

    public static void main(String[] args) {

        List<String> dishName1=getHealthyDishName1(Dish.menu);
        System.out.println("dishName1="+dishName1);

        List<String> dishName2=getHealthyDishName2(Dish.menu);
        System.out.println("dishName1="+dishName1);

    }
}
