package com.gaud.baram.domain;

/**
 * packageName   :   com.gaud.baram.domain
 * fileName      :   Mage
 * author        :   JeongMyeongHong
 * date          :   2022-02-01
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-01      JeongMyoengHong     최초 생성
 */
public class Mage implements Job {
    String attSkill = "헬파이어";
    String rechpSkill = "현자의기원";
    String recmpSkill = "공력증강";

    @Override
    public int basicAtt() {
        return 0;
    }

    @Override
    public int skillAtt(String attSkill, int dmg, int hpNow, int mpNow) {
        System.out.println(attSkill + "!!");
        return dmg * (hpNow + mpNow);
    }

    @Override
    public int recHp(int hp, int hpNow) {
        return (hp >= (hpNow + hp * 0.5)) ? hp : (hpNow + (int) (hp * 0.5));

    }

    @Override
    public int recMp(int mp, int mpNow) {
        return 0;
    }

}
