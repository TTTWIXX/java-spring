package com.spring.core.person;

import lombok.*;

/*
@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
*/
@Data //실무에서는 상황에따라 setter 나 getter 를 삭제하는 경우가있음 그래서 실무에서는 안쓰는게 좋다.
// 위에있는것 다만듬
public class Person {
    private String nickName;
    private String address;
    private int age;
    //Ctrl+Shift+ t


}
