package com.gaud.baram.domain.monster;

/**
 * packageName   :   com.gaud.baram.domain
 * fileName      :   Squirrel
 * author        :   JeongMyeongHong
 * date          :   2022-02-03
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-03      JeongMyoengHong     최초 생성
 */
public class Squirrel implements Monster {
    String monsName = "다람쥐";
    int monsHp = 2;
    int monsExp = 9;
    int monsGold = 15;
    int monsDmg = 3;

    @Override
    public String getMonsName() {
        return this.monsName;
    }

    @Override
    public int getMonsHp() {
        return this.monsHp;
    }

    @Override
    public int minusMonsHp(int dmg) {
        this.monsHp -= dmg;
        return dmg;
    }

    @Override
    public int getMonsExp() {
        return this.monsExp;
    }

    @Override
    public int getMonsGold() {
        return this.monsGold;
    }

    @Override
    public int getMonsDmg() {
        return this.monsDmg;
    }
}
