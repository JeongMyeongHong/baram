package com.gaud.baram.service;

import com.gaud.baram.domain.character.CharacterDTO;
import com.gaud.baram.domain.job.Mage;
import com.gaud.baram.domain.job.Poet;
import com.gaud.baram.domain.job.Rogue;
import com.gaud.baram.domain.job.Warrior;

import java.util.Scanner;

public class JobService {
    public void getJob(CharacterDTO loadedCharacter, Scanner scanner) {
        if (loadedCharacter.getJobName().equals("평민")
                && loadedCharacter.getLv() >= 5) {
            System.out.println("전직하기.\n" +
                    "전 사\t" +
                    "도 적\t" +
                    "주술사\t" +
                    "도 사\n" +
                    "원하시는 직업의 이름을 입력해주세요.");
            switch (scanner.next()) {
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
        } else {
            System.out.println("전직할 수 없는 상태입니다.");
        }
    }
}
