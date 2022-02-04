package com.gaud.baram.domain.monster;

/**
 * packageName   :   com.gaud.baram.domain
 * fileName      :   Mon
 * author        :   JeongMyeongHong
 * date          :   2022-02-04
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-04      JeongMyoengHong     최초 생성
 */
public interface Monster {
    public String getMonsName();

    public int getMonsHp();

    public int minusMonsHp(int dmg);

    public int getMonsExp();

    public int getMonsGold();

    public int getMonsDmg();
}
