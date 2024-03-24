package com.cospro.version04.question07;

public class Healer extends Unit {
    int healingPoint;

    public Healer(int healingPoint) {
        this.healingPoint = healingPoint;
    }

    @Override
    public void underAttack(int damage) {
        this.HP -= damage;
    }

    public void healing(Unit unit) {
        unit.HP += healingPoint;
    }
}
