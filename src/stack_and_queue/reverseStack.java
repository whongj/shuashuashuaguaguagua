package stack_and_queue;

import java.util.Stack;

/**
 * Created by wanghongjie on 2017/10/30.
 */
public class reverseStack {
    Stack<Integer> stack = new Stack<>();

    public static int getAndRemoveElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveElement(stack);
        reverse(stack);
        stack.push(i);

    }


//    很简单，但很经典，应该背记一下。
}
