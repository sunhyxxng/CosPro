package com.cospro.version04.question07;

public class Monster extends Unit {
    int attackPoint;

    public Monster(int attackPoint) {
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
