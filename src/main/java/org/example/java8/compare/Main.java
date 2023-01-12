package org.example.java8.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums=List.of(9,4,3,2,3,6,7);
        List<String> str=List.of("apple", "banana", "홍길동");

        List<Person> pList=new ArrayList<>(

                List.of(
                new Person("김철수",33)
                ,new Person("홍길동",16)
                ,new Person("박영희",44)
                ,new Person("김희수",22)
                )
        );

//        pList.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//                //return o2.getAge()-o1.getAge();  //여기서 바로 가능
//                //return o1.compareTo(o2);
//            }
//
//        });

        //pList.sort((o1, o2) -> o1.getAge()-o2.getAge());
        //pList.sort(Comparator.comparing(person -> person.getAge()));

        //pList.sort(comparing(Person::getAge));
        pList.sort(comparing(Person::getName).reversed()); //내림차 정렬

        System.out.println("pList="+pList);

    }
}
