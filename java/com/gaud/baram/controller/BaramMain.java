package com.gaud.baram.controller;

import com.gaud.baram.domain.character.CharacterDTO;
import com.gaud.baram.service.HuntService;
import com.gaud.baram.service.IdService;
import com.gaud.baram.service.JobService;

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
    IdService idService = new IdService();
    Map<String, CharacterDTO> characterDB = new HashMap<>();
    CharacterDTO loadedCharacter = new CharacterDTO("", "", "");
    JobService jobService = new JobService();
    HuntService huntService = new HuntService();

    public static void main(String[] args) {
        BaramMain game = new BaramMain();
        game.runGame();
    }

    public void runGame() {
        while (true) {
            if (loadedCharacter.getStatus() == 0) { //메인화면
                System.out.println("===바람의나라===\n" +
                        "1.처음하기\n" +
                        "2.이어하기\n" +
                        "0.게임종료");
                switch (scanner.next()) {
                    case "1"://처음하기
                        System.out.println("계정 생성\n" +
                                "ID, PW, NickName 입력.");
                        String creatID = scanner.next();
                        String creatPW = scanner.next();
                        String creatNickname = scanner.next();
                        loadedCharacter =
                                idService.creatID(characterDB, creatID, creatPW, creatNickname);
                        characterDB.put(creatID, loadedCharacter);
                        System.out.println(String.format
                                ("ID : %s\tPW : %s\t닉 : %s", loadedCharacter.getId(), loadedCharacter.getPw(), loadedCharacter.getNickname()));
                        break;
                    case "2"://이어하기
                        System.out.println("이어하기\n" +
                                "ID, PW 입력");
                        String joinID = scanner.next();
                        String joinPW = scanner.next();
                        loadedCharacter = characterDB.get(joinID);
                        idService.loadID(loadedCharacter, joinID, joinPW);
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        break;
                }
            }

            if (loadedCharacter.getStatus() == 1) {//로그인 완료
                System.out.println("===메인메뉴===\n" +
                        "1.정보보기\n" +
                        "2.사냥하기\n" +
                        "3.전직/승급하기\n" +
                        "9.로그아웃\n" +
                        "0.게임종료");
                switch (scanner.next()) {
                    case "1"://정보보기
                        idService.showInfo(loadedCharacter);
                        break;
                    case "2":
                        while (true) {
                            loadedCharacter.resetCharacter();
                            System.out.println("사냥터 가기\n1. 토끼 2. 다람쥐 0. 나가기");
                            String sel = scanner.next();
                            if (sel.equals("0")) {
                                System.out.println("사냥터을 종료합니다.");
                                break;
                            } else {
                                huntService.startHunt(loadedCharacter, sel);
                                while (true) {
                                    System.out.println(String.format("1. 평타 2. %s 3. %s 4. %s 5. 도망가기",
                                            loadedCharacter.job.getAttSkill(), loadedCharacter.job.getRechpSkill(), loadedCharacter.job.getRecmpSkill()
                                    ));
                                    String userOption = scanner.next();
                                    if (huntService.huntMons(loadedCharacter, userOption) <= 0) {
                                        huntService.killMons(loadedCharacter);
                                        break;
                                    }
                                    else if(userOption.equals("5")){
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case "3"://전직/승급하기
                        System.out.println("전직하기.\n" +
                                "전 사\t" +
                                "도 적\t" +
                                "주술사\t" +
                                "도 사\n" +
                                "원하시는 직업의 이름을 입력해주세요.");
                        jobService.getJob(loadedCharacter, scanner.next());
                        break;
                    case "9"://로그아웃
                        loadedCharacter.setStatus(0);
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        break;
                }
            }
        }
    }
}
