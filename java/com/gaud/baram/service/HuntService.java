package com.gaud.baram.service;

import com.gaud.baram.domain.character.CharacterDTO;
import com.gaud.baram.domain.monster.*;

/**
 * packageName   :   com.gaud.baram.service
 * fileName      :   HuntService
 * author        :   JeongMyeongHong
 * date          :   2022-02-03
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-03      JeongMyoengHong     최초 생성
 */
public class HuntService {
    Monster monster;

    public int startHunt(CharacterDTO loadedcharacter, int selField, String selMons) {
        switch (selField) {
            case 1:
                switch (selMons) {
                    case "1":
                        System.out.println("토끼를 사냥합니다.");
                        monster = new Rabbit();
                        return 1;
                    case "2":
                        System.out.println("다람쥐를 사냥합니다.");
                        monster = new Squirrel();
                        return 2;
                    case "3":
                        return 3;
                }
                break;
            case 2:
                switch (selMons) {
                    case "1":
                        System.out.println("시궁쥐를 사냥합니다.");
                        monster = new Mouse();
                        return 1;
                    case "2":
                        System.out.println("박쥐를 사냥합니다.");
                        monster = new Bat();
                        return 2;
                    case "3":
                        System.out.println("햄스터를 사냥합니다.");
                        monster = new Hamster();
                        return 4;
                    case "4":
                        return 3;

                }
                break;
            case 3:
                switch (selMons) {
                    case "1":
                        System.out.println("산돼지를 사냥합니다.");
                        monster = new PigOfMountain();
                        return 1;
                    case "2":
                        System.out.println("숲돼지를 사냥합니다.");
                        monster = new PigOfForest();
                        return 2;
                    case "3":
                        return 3;
                }
                break;
            case 4:
                switch (selMons) {
                    case "1":
                        System.out.println("전갈를 사냥합니다.");
                        monster = new Scorpion();
                        return 1;
                    case "2":
                        System.out.println("가재를 사냥합니다.");
                        monster = new Crawfish();
                        return 2;
                    case "3":
                        return 3;
                }
            default:
                return 3;
        }
        System.out.println(String.format("%s 님께서 %s를 사냥합니다.", loadedcharacter.getNickname(), monster.getMonsName()));
        return 3;
    }

    public int huntMons(CharacterDTO loadedCharacter, String selHuntOption) {
        switch (selHuntOption) {
            case "1":
                System.out.println(String.format("%s의 체력이 %d 만큼 닳았습니다. 남은 체력 %d",
                        monster.getMonsName(), monster.minusMonsHp(loadedCharacter.job.basicAtt(loadedCharacter)), monster.getMonsHp()));
                break;
            case "2":
                System.out.println(String.format("%s의 체력이 %d 만큼 닳았습니다. 남은 체력 %d",
                        monster.getMonsName(), monster.minusMonsHp(loadedCharacter.job.skillAtt(loadedCharacter)), monster.getMonsHp()));
                break;
            case "3":
                System.out.println(String.format("체력이 %d 만큼 올랐습니다. 현재 체력 %d", loadedCharacter.job.recHp(loadedCharacter), loadedCharacter.getHpNow()));
                break;
            case "4":
                System.out.println(String.format("마력이 %d 만큼 올랐습니다. 현재 체력 %d", loadedCharacter.job.recMp(loadedCharacter), loadedCharacter.getMpNow()));
                break;
            case "5":
                System.out.println(String.format("%s에게서 도망갑니다.", monster.getMonsName()));
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
        return monster.getMonsHp();
    }

    public void killMons(CharacterDTO loadedCharacter) {
        loadedCharacter.setExpNow(monster.getMonsExp());
        if (loadedCharacter.getExpNow() >= loadedCharacter.getExp()) {
            loadedCharacter.setExpNow(-loadedCharacter.getExp());
            loadedCharacter.lvUpCharacter();
            System.out.printf("%d 경험치 획득!\n%s를 잡아 레벨업!\n레벨이 %d (이)가 되었습니다. 현재경험치 %d / %d\n",
                    monster.getMonsExp(), monster.getMonsName(), loadedCharacter.getLv(),
                    loadedCharacter.getExpNow(), loadedCharacter.getExp());
        } else {
            System.out.println(String.format("%d 경험치 획득! 현재 경험치 %d / %d", monster.getMonsExp(), loadedCharacter.getExpNow(), loadedCharacter.getExp()));
        }
    }
}
