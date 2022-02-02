package com.gaud.baram.service;

import com.gaud.baram.domain.CharacterDTO;

public class JobService {
    public void getJob(CharacterDTO loadedCharacter, String jobName) {
        switch (jobName) {
            case ("전사"):
                loadedCharacter.setJob("전사");
                break;
            case ("도적"):
                loadedCharacter.setJob("도적");
                break;
            case ("주술사"):
                loadedCharacter.setJob("주술사");
                break;
            case ("도사"):
                loadedCharacter.setJob("도사");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }
}
