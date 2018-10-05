/*
package interviewCode;

import java.util.Stack;

*/
/**
 * 使用两个栈实现一个队列
 *//*


public class StackToQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    */
/**
     * 准备两个栈 push栈 和 pop栈
     *//*

    public StackToQueue(){
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    */
/**
     * 进栈往push中压入
     * @param pushInt
     *//*

    public void add(int pushInt){
        stackPush.push(pushInt);
    }

    */
/**
     * 出栈，判断是否为空，若都为空，报错
     * 只有当pop栈为空时 才能将push栈导入pop栈里面
     * @return
     *//*

    public int poll(){
        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("empty");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("empty");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

}
*/
