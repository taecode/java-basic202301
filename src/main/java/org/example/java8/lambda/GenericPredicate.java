package org.example.java8.lambda;

@FunctionalInterface
public interface GenericPredicate<T> { //아무 타입 T로 받는다.

    boolean test(T t);

}
