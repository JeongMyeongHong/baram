package com.gaud.baram.controller;

import com.gaud.baram.domain.CharacterDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * packageName   :   com.gaud.baram.controller
 * fileName      :   Baram
 * author        :   JeongMyeongHong
 * date          :   2022-01-28
 * desc          :
 * <p>
 * 처음하기 - 계정 생성
 * 이어하기 - 계정 로그인
 * <p>
 * 메인메뉴
 * 1. 정보보기
 * 1) 체/마/경험치/골드
 * 2) 아이템(무기, 투구, 갑옷)
 * 1. 아이템 Status
 * 2. 아이템 Upgrade
 * 3. 아이템 매매
 * 3) 스킬
 * 1. 평타
 * 2. 공격스킬
 * 3. 강화(약화)스킬
 * <p>
 * <p>
 * 2. 사냥하기
 * 1) 사냥터1
 * 1. 몹(체력, 공격, 경험치, 골드, 템(확률))
 * 2) 사냥터2...
 * <p>
 * <p>
 * <p>
 * 3. 전직/승급하기
 * 1)평민인경우전직.(4가지 직업)
 * 1-2) 직업이 있으면 승급하기
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-28      JeongMyoengHong     최초 생성
 */
public class BaramMain {
    Scanner scanner = new Scanner(System.in);
    Map<String, CharacterDTO> characterDB = new HashMap<>();
    CharacterDTO loadedCharacter;
    int status;


    private void CreatID() {
        System.out.println("계정 생성/n" +
                "ID, PW, NickName 입력.");
        // 가입 로직 진행
        String id = scanner.next();
        if (characterDB.containsKey(id)) {
            CharacterDTO character = new CharacterDTO(id, scanner.next(), scanner.next());
            characterDB.put(character.getId(), character);
        } else {
            System.out.println("이미 존재하는 ID 입니다.");
        }
    }

    private void LoadID() {
        System.out.println("이어하기/n" +
                "ID, PW 입력");
        String id = scanner.next();
        this.loadedCharacter = characterDB.get(id);
        if (loadedCharacter.getId().equals(scanner.next())) {
            status = 1;
        }

    }

    public void showInfo() {
        System.out.println("정보보기 페이지 입니다.");

    }

    private void hunt() {
        System.out.println("사냥터");
    }

    private void getJob() {
        System.out.println("전직/승급하기");
    }

    public void runGame() {
        while (true) {

            if (status == 0) { //메인화면
                System.out.println("===바람의나라===\n" +
                        "1.처음하기\n" +
                        "2.이어하기\n" +
                        "0.게임종료");
                switch (scanner.nextInt()) {
                    case 1:
                        CreatID();//처음하기, 계정생성 메소드 호출
                        break;
                    case 2:
                        LoadID();//이어하기, 계정로드
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        break;
                }
            } else if (status == 1) {//로그인 완료
                System.out.println("===메인메뉴===\n" +
                        "1.정보보기\n" +
                        "2.사냥하기\n" +
                        "3.전직/승급하기\n" +
                        "9.뒤로가기\n" +
                        "0.게임종료");
                switch (scanner.nextInt()) {
                    case 1:
                        showInfo();//정보보기
                        break;
                    case 2:
                        hunt();//사냥하기
                        break;
                    case 3:
                        getJob();//전직/승급하기
                        break;
                    case 9:
                        status = 0;
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        break;
                }
            }
        }
    }


    public static void main(String[] args) {
        BaramMain game = new BaramMain();
        game.runGame();
    }
}
