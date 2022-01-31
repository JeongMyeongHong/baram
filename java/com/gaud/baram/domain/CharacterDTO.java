package com.gaud.baram.domain;

/**
 * packageName   :   com.gaud.baram.domain
 * fileName      :   CharacterDTO
 * author        :   JeongMyeongHong
 * date          :   2022-01-28
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-28      JeongMyoengHong     최초 생성
 */
public class CharacterDTO {
    private String id;
    private String pw;
    private String nickname;
    private String job;

    public CharacterDTO(String id, String pw, String nickname){
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
