package com.gaud.baram.service;

import com.gaud.baram.domain.character.CharacterDTO;

import java.util.Map;

public class IdService {
    public CharacterDTO creatID(Map<String, CharacterDTO> characterDB, String id, String pw, String nickname) {
        if (characterDB.containsKey(id)) {
            System.out.println("이미 존재하는 ID 입니다.");
            return null;
        } else {
            return new CharacterDTO(id, pw, nickname);
        }
    }

    public void loadID(CharacterDTO loadedCharacter, String id, String pw) {
        if (loadedCharacter.getPw().equals(pw)) {
            System.out.println(String.format("%s 님 로그인 성공",id));
            loadedCharacter.setStatus(1);
        }else{
            System.out.println("비번 틀림");
        }
    }

    public void showInfo(CharacterDTO loadedCharacter){
        System.out.println(String.format(
                "닉네임 : %s\n" +
                "직업 : %s\n" +
                "레벨 : %d\n" +
                "최대 체력 : %d\n" +
                "최대 마력 : %d\n" +
                "현재 경험치 / 최대경험치 : %d / %d\n" +
                "데미지 : %d\n" +
                "보유 골드 : %d\n", loadedCharacter.getNickname(), loadedCharacter.getJobName(), loadedCharacter.getLv(),
                loadedCharacter.getHp(), loadedCharacter.getMp(), loadedCharacter.getExpNow(), loadedCharacter.getExp()
                , loadedCharacter.getDmg(), loadedCharacter.getGold()
        ));
    }

}
