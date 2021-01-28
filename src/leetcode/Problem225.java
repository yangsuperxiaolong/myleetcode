package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem225 {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        int param_3 = obj.top();
        int param_2 = obj.pop();

        boolean param_4 = obj.empty();
    }
}

class MyStack {

    private List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        list = new ArrayList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        list.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (this.empty()) {
            return -1;
        } else {
            int result = list.get(list.size()-1);
            list.remove(list.size()-1);
            return result;
        }
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (this.empty()) {
            return -1;
        } else {
            int result = list.get(list.size()-1);
            return result;
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return list.isEmpty();
    }
}
