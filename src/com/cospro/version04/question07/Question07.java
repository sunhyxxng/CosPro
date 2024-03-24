package com.cospro.version04.question07;

import java.util.Arrays;

public class Question07 {
    public int[] solution(int monsterAttackPoint, int warriorAttackPoint, int healingPoint) {
        Monster monster = new Monster(monsterAttackPoint);
        Warrior warrior = new Warrior(warriorAttackPoint);
        Healer healer = new Healer(healingPoint);

        monster.underAttack(warrior.attack());  // 전사가 몬스터를 한 번 공격
        warrior.underAttack(monster.attack());  // 몬스터가 전사를 한 번 공격
        healer.underAttack(monster.attack());   // 몬스터가 힐러를 한 번 공격
        healer.healing(warrior);    // 힐러가 전사의 체력을 한 번 회복
        healer.healing(monster);    // 힐러가 몬스터의 체력을 한 번 회복

        int[] answer = {monster.HP, warrior.HP, healer.HP};
        return answer;
    }

    public static void main(String[] args) {
        Question07 sol = new Question07();
        int monsterAttackPoint = 100;
        int warriorAttackPoint = 90;
        int healingPoint = 30;
        System.out.println(Arrays.toString(sol.solution(monsterAttackPoint, warriorAttackPoint, healingPoint)));
    }
}
