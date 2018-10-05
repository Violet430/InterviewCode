/*
package huawei;

import java.util.Scanner;

public class niu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0;
        for(int i = 0;i<n;i++){
            int niu = sc.nextInt();
            int month = sc.nextInt();
            System.out.println(niu*fun(month));
        }
    }

    public static int fun(int x){
        int sum = 0;
        if (x == 0) sum =  1;
        if(x ==1) sum =  2;
        if (x ==2) sum = 3;
        if(x ==3) sum =  4;
        if (x>=4) sum =  fun(x-1)+fun(x-4);
        return sum;
    }
}
*/
