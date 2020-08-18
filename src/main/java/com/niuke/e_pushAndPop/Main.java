package com.niuke.e_pushAndPop;

import java.util.Stack;

public class Main {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
//        while (!stack1.empty()){
//            stack2.push(stack1.pop());
//        }
//        int ret = stack2.pop();
//        while(!stack2.empty()){
//            stack1.push(stack2.pop());
//        }
//        return ret;
        if(stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
