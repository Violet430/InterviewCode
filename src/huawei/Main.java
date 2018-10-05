/*
package huawei;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            char[] arr = line.toCharArray();

            Stack<Character> st = new Stack<Character>();
            int ans = 0;
            for(int i = arr.length-1;i>=0;i--){
                //System.out.println(i);
                if ((arr[i]>='0' && arr[i]<='9')||arr[i]=='-'){
                    //System.out.println("push"+i+arr[i]);
                    st.push(arr[i]);
                }else if(i==0 || !((arr[i]>='0' && arr[i]<='9')||arr[i]=='-') ){
                    int m = 1;
                    int sum = 0;
                    while(!st.isEmpty()){
                        //System.out.println("peek"+st.peek());
                        if (st.peek()=='-'){
                            m = m *(-1);
                            //System.out.println(m);
                            st.pop();
                        }
                        if(st.peek()>='0'&& st.peek()<='9'){
                            //System.out.println(st.peek());
                            sum = sum*10+((int)st.peek()-48);
                            st.pop();
                            //System.out.println("sum"+sum);
                        }
                    }
                    sum = sum * m;
                    ans = ans + sum;
                }

            }
            System.out.println(ans);
        }

    }
}
*/
