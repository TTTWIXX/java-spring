package com.spring.core.chap02;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Hotel {

    // 제어의 역전(Ioc) : 객체 생성의 제어권을 외부로 넘긴다.
    // 의존성 주입(DI) : 외부에서 생성된 객체를 주입받는 개념


    // 레스토랑 객체에 의존
    private Restaurant restaurant;

    // 헤드 쉐프
    private Chef headChef;

    // 생성자 주입
    public Hotel(Restaurant restaurant, Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }



    // 수정자 주입
    public void setHeadChef(Chef headChef) {
        this.headChef = headChef;
    }

    // 수정자 주입
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // 호텔의 정보를 알려주는 기능
    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s\n"
                ,restaurant.getClass().getSimpleName() // 클레스 이름이 찍힌다.
                ,headChef.getClass().getSimpleName());

        restaurant.order();
    }

}
