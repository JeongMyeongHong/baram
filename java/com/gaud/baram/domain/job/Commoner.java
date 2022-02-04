package com.gaud.baram.domain.job;

import com.gaud.baram.domain.character.CharacterDTO;

/**
 * packageName   :   com.gaud.baram.domain.job
 * fileName      :   Commoner
 * author        :   JeongMyeongHong
 * date          :   2022-02-04
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-04      JeongMyoengHong     최초 생성
 */
public class Commoner implements Job{

    String attSkill = "백열장";
    String rechpSkill = "평민의기원";
    String recmpSkill = "막걸리한잔";
    int rechp = 50;
    int recmp = 50;

    @Override
    public String getAttSkill() {
        return this.attSkill;
    }

    @Override
    public String getRechpSkill() {
        return this.rechpSkill;
    }

    @Override
    public String getRecmpSkill() {
        return this.recmpSkill;
    }

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
    public int recHp(CharacterDTO loadedCharacter) {
        if (loadedCharacter.getMpNow() >= 10) {
            System.out.println(rechpSkill + "을 사용합니다.");
            loadedCharacter.minusMpNow(10);
            loadedCharacter.plusHpNow(rechp);
        } else {
            System.out.println("마나가 부족하여 사용할 수 없습니다.");
        }
        return rechp;
    }

    @Override
    public int recMp(CharacterDTO loadedCharacter) {
        if (loadedCharacter.getHpNow() >= 10) {
            System.out.println(recmpSkill + "을 사용합니다.");
            loadedCharacter.setMpNow(loadedCharacter.getMp());
            loadedCharacter.setHpNow(loadedCharacter.getHp() / 2);
        } else {
            System.out.println("체력이 부족하여 사용할 수 없습니다.");
        }
        return 0;
    }
}
