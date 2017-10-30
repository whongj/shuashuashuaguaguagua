package stack_and_queue;

import java.util.Stack;

/**
 * Created by wanghongjie on 2017/10/30.
 */
public class TwoStacksQueue {
    private Stack<Integer> stackPush = new Stack<>();

    private Stack<Integer> Pop = new Stack<>();


    public void add(Integer integer) {

        stackPush.push(integer);

    }

    public Integer poll() {
        if (Pop.empty() && stackPush.empty()) {
            throw new RuntimeException("queue is empty");
        } else if (Pop.empty()) {
            while (!stackPush.empty()) {
                stackPush.push(stackPush.pop());

            }
        }
        return Pop.pop();

    }
    public Integer peek() {
        if (Pop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (Pop.empty()) {
            while (!stackPush.empty()) {
                Pop.push(stackPush.pop());

            }

        }
        return Pop.peek();
    }

//    一定要注意代码健壮性——看这个判断了几次为空
}
