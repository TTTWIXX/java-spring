package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc")
// default 클래스이름을 camelcase 로 변환
public class KimuraChef implements Chef {

    public void cook() {
        System.out.println("일식 요리의 대가 키무라입니다.");
    }
}
