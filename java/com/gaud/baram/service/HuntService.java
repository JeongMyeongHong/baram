package com.gaud.baram.service;

import com.gaud.baram.domain.character.CharacterDTO;
import com.gaud.baram.domain.monster.Monster;
import com.gaud.baram.domain.monster.Rabbit;
import com.gaud.baram.domain.monster.Squirrel;

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

    public void startHunt(CharacterDTO loadedcharacter, String selGround) {
        switch (selGround) {
            case "1":
                monster = new Rabbit();
                break;
            case "2":
                monster = new Squirrel();
                break;
        }
        System.out.println(String.format("%s 님께서 %s를 사냥합니다.", loadedcharacter.getNickname(), monster.getMonsName()));
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
            default:
                System.out.println("잘못된 선택입니다.");
        }
        return monster.getMonsHp();
    }

    public void clearMons(CharacterDTO loadedCharacter) {
        loadedCharacter.setExpNow(monster.getMonsExp());
        if (loadedCharacter.getExpNow() >= loadedCharacter.getExp()) {
            loadedCharacter.setExpNow(-loadedCharacter.getExp());
            loadedCharacter.lvUpCharacter();
            System.out.printf("%d 경험치 획득!\n%s를 잡아 레벨업!\n레벨이 %d (이)가 되었습니다. 현재경험치 %d / %d\n",
                    monster.getMonsExp(),monster.getMonsName(), loadedCharacter.getLv(),
                    loadedCharacter.getExpNow(), loadedCharacter.getExp());
        } else {
            System.out.println(String.format("%d 경험치 획득! 현재 경험치 %d / %d", monster.getMonsExp(), loadedCharacter.getExpNow(), loadedCharacter.getExp()));
        }
    }
}
