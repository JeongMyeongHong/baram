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
    private String job = "평민";
    private int gold;
    private int hp = 50;
    private int hpNow;
    private int mp = 50;
    private int mpNow;
    private int exp;
    private int expNow;
    private int lv = 1;
    private int dmg = 1;
    private int status;

    public CharacterDTO(String id, String pw, String nickname) {
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
    }

    public int getExpNow() {
        return expNow;
    }

    public void setExpNow(int expNow) {
        this.expNow = expNow;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getHpNow() {
        return hpNow;
    }

    public void setHpNow(int hpNow) {
        this.hpNow = hpNow;
    }

    public int getMpNow() {
        return mpNow;
    }

    public void setMpNow(int mpNow) {
        this.mpNow = mpNow;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
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
