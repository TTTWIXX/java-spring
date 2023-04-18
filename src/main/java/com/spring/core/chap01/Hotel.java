package com.spring.core.chap01;

public class Hotel {
    /*
    @problem - 호텔 클래스에서 직접 객체를 생성하면
               나중에 의존객체를 변경해야 될 때
               직접 호텔 클래스를 수정해야 되므로
               OCP 를 위반하게 됨   그리고 headChef 가
               변경되면 레스토랑 안에  쉐프도 같이 바뀌어야
               할때 2군데를 수정해야 함.
    */

    // 레스토랑 객체에 의존
    private Restaurant restaurant=new EasterRestaurant();

    // 헤드 쉐프
    private  Chef headChef =new KimuraChef();
    // 레스토랑이 변경되서 세프도 같이 변경하는 것은 OCP 위반 이다.
    // 즉 레드토랑이 바뀌면 헤드쉐프도 자동으로 바뀌게 코딩을 해야한다.
    // EX) 대표가 알바생 바뀌는 것도 알아야 되나?
    // 제어의 역전형 : 객체생성의 권한을 외부로 넘긴다.

    // 호텔의 정보를 알려주는 기능
    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s\n"
                ,restaurant.getClass().getSimpleName() // 클레스 이름이 찍힌다.
                ,headChef.getClass().getSimpleName());
        restaurant.order();
    }

}
