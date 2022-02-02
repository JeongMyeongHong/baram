package com.gaud.baram.domain;

/**
 * packageName   :   com.gaud.baram.domain
 * fileName      :   Poet
 * author        :   JeongMyeongHong
 * date          :   2022-02-01
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-01      JeongMyoengHong     최초 생성
 */
public class Poet implements Job {
    String attSkill = "지진";
    String rechpSkill = "봉황의기원";
    String recmpSkill = "명상";

    @Override
    public int basicAtt(CharacterDTO loadedCharacter) {
        return loadedCharacter.getDmg();
    }

    @Override
    public int skillAtt(CharacterDTO loadedCharacter) {
        if (loadedCharacter.getMpNow() >= 10) {
            System.out.println(attSkill + "!!");
            loadedCharacter.minusMpNow(10);
            return loadedCharacter.getDmg() * 2;
        } else {
            System.out.println("마나가 부족하여 사용할 수 없습니다.");
            return 0;
        }
    }

    @Override
    public void recHp(CharacterDTO loadedCharacter) {
        if (loadedCharacter.getMpNow() >= 10) {
            System.out.println(rechpSkill + "을 사용합니다.");
            loadedCharacter.minusMpNow(10);
            loadedCharacter.plusHpNow(100);
        } else {
            System.out.println("마나가 부족하여 사용할 수 없습니다.");
        }
    }

    @Override
    public void recMp(CharacterDTO loadedCharacter) {
        if (loadedCharacter.getHpNow() >= 10) {
            System.out.println(recmpSkill + "을 사용합니다.");
            loadedCharacter.setMpNow(loadedCharacter.getMp());
            loadedCharacter.setHpNow(loadedCharacter.getHp() / 2);
        } else {
            System.out.println("체력이 부족하여 사용할 수 없습니다.");
        }
    }
}
