package com.gaud.baram.domain.monster;

public class FieldOfMons {
    public int selectField(String selGround) {
        switch (selGround) {
            case "1":
                System.out.println("왕초보사냥터 입니다. 사냥할 몹을 고르세요");
                System.out.println("1. 토끼 2. 다람쥐 3. 뒤로가기");
                return 1;
            case "2":
                System.out.println("쥐굴 입니다. 사냥할 몹을 고르세요");
                System.out.println("1. 시궁쥐 2. 박쥐 3. 햄스터 4. 뒤로가기");
                return 2;
            case "3":
                System.out.println("돼지굴 입니다. 사냥할 몹을 고르세요");
                System.out.println("1. 산돼지 2. 숲돼지 3. 뒤로가기");
                return 3;
            case "4":
                System.out.println("전갈굴 입니다. 사냥할 몹을 고르세요");
                System.out.println("1. 전갈 2. 가재 3. 뒤로가기");
                return 4;
            default:
                System.out.println("잘못된 선택 입니다.");
                return 0;
        }
    }
}
