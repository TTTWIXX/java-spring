package com.spring.core.chap02;

public class WesterRestaurant implements Restaurant {

    // 쉐프
    private Chef chef;

    // 요리 코스
    private Course course;

    public WesterRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }


    // 요리를 주문하는 기능
    public void order(){
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }

}
