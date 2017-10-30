package stack_and_queue;

import java.util.Stack;

/**
 * Created by wanghongjie on 2017/10/30.
 */
public class getmin {
    Stack<Integer> integerStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public void push(Integer integer) {
        integerStack.push(integer);
        if (minStack.peek() < integer) {
            minStack.push(minStack.peek());
        } else {
            minStack.push(integer);
        }
    }

    public Integer pop() {
        minStack.pop();
        return integerStack.pop();
    }

    public Integer getmin() {
        return minStack.pop();
    }
//    问题：没有判断minStack是否为空，导致了minStack.pop()会出问题。。。




}


class getminway2 {
    Stack<Integer> integerStack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void push(Integer integer) {
        integerStack.push(integer);
        if (minstack.isEmpty()) {
            minstack.push(integer);

        } else if (minstack.peek() > integer) {
            minstack.push(integer);
        }
    }

    public Integer pop() {
        if (integerStack.peek() == minstack.peek()) {
            minstack.pop();
        }
        return integerStack.pop();
    }

    public Integer getmin() {
        return minstack.peek();
    }



//    每次弹出和peek 要考虑代码健壮性
}