package com.gaud.baram.domain.character;

import com.gaud.baram.domain.job.Commoner;
import com.gaud.baram.domain.job.Job;

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
    private String jobName = "평민";
    private int gold;
    private int hp = 50;
    private int hpNow;
    private int mp = 50;
    private int mpNow;
    private int lv = 1;
    private int exp = 10;
    private int expNow;
    private int dmg = 1;
    private int status;
    public Job job = new Commoner();


    public void resetCharacter(){
        this.hpNow = this.hp;
        this.mpNow = this.mp;
    }

    public void lvUpCharacter(){
        this.lv++;
        this.hp = this.hp * this.lv;
        this.mp = this.mp * this.lv;
        this.exp = this.exp * this.lv;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public CharacterDTO(String id, String pw, String nickname) {
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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }



    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHpNow() {
        return hpNow;
    }

    public void setHpNow(int hpNow) {
        this.hpNow = hpNow;
    }

    public void plusHpNow(int value) {
        this.hpNow += value;
    }

    public void minusHpNow(int value) {
        this.hpNow -= value;
    }


    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMpNow() {
        return mpNow;
    }

    public void plusMp(int value) {
        this.mpNow += value;
    }

    public void minusMpNow(int value) {
        this.mpNow -= value;
    }

    public void setMpNow(int mpNow) {
        this.mpNow = mpNow;
    }


    public int getGold() {
        return gold;
    }

    public void plusGold(int gold) {
        this.gold += gold;
    }

    public void minusGold(int gold) {
        this.gold -= gold;
    }


    public int getExp() {
        return exp;
    }

    public void setExpNow(int exp) {
        this.expNow += exp;
    }

    public int getExpNow() {
        return expNow;
    }

    public void plusExpNow(int expNow) {
        this.expNow += expNow;
    }

    public int getLv() {
        return lv;
    }

    public int getDmg() {
        return dmg;
    }

    public void plusDmg(int dmg) {
        this.dmg += dmg;
    }
}
