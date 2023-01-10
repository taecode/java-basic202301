package org.example.basic;

import static org.example.basic.DanceLevel.*;

public class Dancer {

    private final String crewName; // 팀의 이름
    private final String myName; // 내 이름

    private DanceLevel level = BEGINNER; // 춤 수준 (전문가, 중수, 하수, 초보자)


    // 스트레칭 했는지
    private boolean stretch;

    // 유연성 운동 했는지
    private boolean flexible;

    // 생성자 : 객체가 처음 생성될 때 호출되는 메서드
    public Dancer(String crewName, String myName) {
        this.crewName = crewName;
        this.myName = myName;
    }

    // 스트레칭
    private void stretch() {
        System.out.println(myName + "님이 스트레칭합니다.");
        this.stretch = true;
    }

    // 다리찢기
    private void makeFlexible() {
        if (!stretch) {
            System.out.println("스트레칭 안해서 죽었습니다.");
            return;
        }
        System.out.println(myName + "님이 유연성 운동을 합니다.");
        this.flexible = true;
    }

    // 춤추기
    public void dance() {

        stretch();
        makeFlexible();

        if (!flexible) {
            System.out.println("유연성 운동 안해서 죽었습니다.");
            return;
        }
        System.out.println(myName + "님이 춤을 춥니다.");
    }

}






