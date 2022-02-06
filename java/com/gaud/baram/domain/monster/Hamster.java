package com.gaud.baram.domain.monster;

public class Hamster implements Monster {
    String monsName = "햄스터";
    int monsHp = 5;
    int monsExp = 1;
    int monsGold = 10;
    int monsDmg = 1;

    @Override
    public String getMonsName() {
        return this.monsName;
    }

    @Override
    public int getMonsHp() {
        return this.monsHp;
    }

    @Override
    public int minusMonsHp(int dmg) {
        this.monsHp -= dmg;
        return dmg;
    }

    @Override
    public int getMonsExp() {
        return this.monsExp;
    }

    @Override
    public int getMonsGold() {
        return this.monsGold;
    }

    @Override
    public int getMonsDmg() {
        return this.monsDmg;
    }
}
