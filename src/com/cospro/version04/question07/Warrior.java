package com.cospro.version04.question07;

public class Warrior extends Unit {
    int attackPoint;

    public Warrior(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    @Override
    public void underAttack(int damage) {
        this.HP -= damage;
    }

    public int attack() {
        return attackPoint;
    }
}
