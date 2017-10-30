package stack_and_queue;

import java.util.Stack;

/**
 * Created by wanghongjie on 2017/10/30.
 */
public class StackSort {
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {

                stack.push(help.pop());

            }
            help.push(cur);

        }
    }
}
