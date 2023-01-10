package org.example.inherit;

import org.example.basic.Dancer;
import org.example.basic.Rapper;
import org.example.basic.Singer;

public class IdolDancer extends Dancer implements Singer, Rapper {
    //IdolDancer는 Singer와  Rapper 가능한 걸 인터페이스를 보고 알 수 있다.

    private int numberOfFan; //팬의 수

    //생성자를 선언하지 않으면 기본 생성자가 자동으로 만들어진다.
//    public IdolDancer(){
//        super();
//    }

    public IdolDancer(String crewName, String myName){
        super(crewName, myName);
        this.numberOfFan=10;
        System.out.println("idol dancer 생성됨!");
    }

    //오버라이딩: 부모 메서드 재정의
    //부모 메서드 시그니처(이름, 리턴타입, 파라미터)를 똑같이 맞춰야한다.
    @Override //부모에서 받아서 사용한거 알 수 있도록 Override 어노테이션 붙인다.
    public void dance(){ //dance 를 오버라이딩 해야한다 무조건
        wink();
    }


    private void wink(){
        System.out.println("윙크를 세게 갈깁니다.");
    }


    @Override
    public void sing() {

    }

    @Override
    public void rap() {

    }
}
