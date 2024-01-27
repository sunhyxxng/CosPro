package com.cospro.version06;

import java.util.ArrayList;

public class Question09 {
    Integer queuePop(ArrayList<Integer> stack) {
        Integer item = stack.remove(stack.size() - 1);
        return item;
    }

    void popAndPushToTempStack(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {
        while (!isEmpty(stack1)) {
            Integer item = queuePop(stack1);
            stack2.add(item);
        }
    }

    boolean isEmpty(ArrayList<Integer> stack) {
        return 0 == stack.size();
    }

    public int solution(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {
        if (isEmpty(stack2)) {
            popAndPushToTempStack(stack1, stack2);
        }
        Integer answer = queuePop(stack2);
        return answer;
    }

    public static void main(String[] args) {
        Question09 sol = new Question09();
        ArrayList<Integer> stack1 = new ArrayList<>();
        ArrayList<Integer> stack2 = new ArrayList<>();
        stack1.add(1);
        stack1.add(2);
        stack2.add(3);
        stack2.add(4);
        int result1 = sol.solution(stack1, stack2);
        System.out.println(result1);

        ArrayList<Integer> stack3 = new ArrayList<>();
        ArrayList<Integer> stack4 = new ArrayList<>();
        stack3.add(1);
        stack3.add(2);
        stack3.add(3);
        int result2 = sol.solution(stack3, stack4);
        System.out.println(result2);
    }
}
