package com.spring.core.chap01;

public class EasterRestaurant implements Restaurant{

    // 쉐프
    private Chef chef=new KimuraChef();

    // JannChef 객체에 의존(DIP 위반)

    // 요리 코스
    private  Course course=new SushiCourse();


    // 요리를 주문하는 기능
    public void order(){
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }

}
