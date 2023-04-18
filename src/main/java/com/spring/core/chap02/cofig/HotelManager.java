package com.spring.core.chap02.cofig;

import com.spring.core.chap02.*;
import lombok.NoArgsConstructor;


// 호텔을 운영하기 위한 객체들을 만들어서
// 호텔에 주입해주는 클래스
// Spring Container: Bean Factory
public class HotelManager {

    // 쉐프 객체를 생성

    public Chef chef() {
        return new KimuraChef();
    }

    // 코스 객체를 생성
    public Course course() {
        return new SushiCourse();
    }

    // 레스토랑 객체를 생성
    public Restaurant restaurant() {
        return new EasterRestaurant(chef(), course());
    }

    // 호텔 객체 생성
    public Hotel hotel() {
        // return new Hotel(restaurant(), chef()); // 생성자 주입(한번 생성하면 다시 생성 못함)
        Hotel hotel = new Hotel();
        hotel.setRestaurant(restaurant());
        hotel.setHeadChef(chef());
        return hotel;
        // 세터주입(웬만하면 안쓰는게 좋다.원할때마다 계속 호출 할수있다.)

    }


}
