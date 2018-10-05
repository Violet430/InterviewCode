/*
package interviewCode;

import java.util.Stack;

*/
/**
 * 设计一个具有getMin功能的栈
 *//*


public class MinStack {

    public Stack<Integer> stackData;
    public Stack<Integer> stackMin ;
    public MinStack(){
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }


    */
/**
     * 压栈：min栈为空，压入min栈和data栈
     * min栈不为空，比较newNum和min栈栈顶也就是当前最小元素，如果<= 压入min栈
     * @param newNum
     *//*

    public void push(int newNum){
            if(stackMin.isEmpty()){
                stackMin.push(newNum);
            }else if(newNum <= stackMin.peek()){
                stackMin.push(newNum);
            }
            stackData.push(newNum);
        }

    */
/**
     * 出栈：data栈空，报错
     * data出栈值记为value，如果和min栈栈顶一样，两个栈都要出栈，否则，只有data出栈
     * @return
     *//*


        public int pop(){
            if (stackData.isEmpty()){
                throw new RuntimeException("empty");
            }
            int value = stackData.pop();
            if(value == stackMin.peek()){
                stackMin.pop();
            }
            return value;
        }

        public int getMin(){
            if (stackMin.isEmpty()){
                throw new RuntimeException("empty");
            }
            return stackMin.peek();
        }

}
*/
