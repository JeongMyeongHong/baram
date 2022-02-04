package com.gaud.baram.service;

import com.gaud.baram.domain.character.CharacterDTO;
import com.gaud.baram.domain.job.Mage;
import com.gaud.baram.domain.job.Poet;
import com.gaud.baram.domain.job.Rogue;
import com.gaud.baram.domain.job.Warrior;

public class JobService {
    public void getJob(CharacterDTO loadedCharacter, String jobName) {
        switch (jobName) {
            case ("전사"):
                loadedCharacter.setJobName("전사");
                loadedCharacter.setJob(new Warrior());
                break;
            case ("도적"):
                loadedCharacter.setJobName("도적");
                loadedCharacter.setJob(new Rogue());
                break;
            case ("주술사"):
                loadedCharacter.setJobName("주술사");
                loadedCharacter.setJob(new Mage());
                break;
            case ("도사"):
                loadedCharacter.setJobName("도사");
                loadedCharacter.setJob(new Poet());
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }
}
