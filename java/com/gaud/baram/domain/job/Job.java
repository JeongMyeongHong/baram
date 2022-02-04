package com.gaud.baram.domain.job;

import com.gaud.baram.domain.character.CharacterDTO;

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

    String getAttSkill();
    String getRechpSkill();
    String getRecmpSkill();

    int basicAtt(CharacterDTO loadedCharacter);

    int skillAtt(CharacterDTO loadedCharacter);

    int recHp(CharacterDTO loadedCharacter);

    int recMp(CharacterDTO loadedCharacter);
}
