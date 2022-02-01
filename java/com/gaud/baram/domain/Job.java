package com.gaud.baram.domain;

/**
 * packageName   :   com.gaud.baram.domain
 * fileName      :   Job
 * author        :   JeongMyeongHong
 * date          :   2022-02-01
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-01      JeongMyoengHong     최초 생성
 */
public interface Job {

    int basicAtt();

    int skillAtt(String attSkill, int dmg, int hpNow, int mpNow);

    int recHp(int hp, int hpNow);

    int recMp(int mp, int mpNow);
}
