package org.example.abs;

public abstract class Car {

    private int abc;

    //필수 기능
    public abstract void brake(); //추상화 해서 자식 메서드에서 강제로 오버라이딩 하도록 이름도 고정


    public abstract void accel();


}
