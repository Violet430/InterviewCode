/*
package huawei;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[][] arr = new int[5][2];
        int[][] brr = new int[5][2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i<5;i++){
            int shi = sc.nextInt();
            int xu = sc.nextInt();
            arr[i][0]=shi;
            arr[i][1]=xu;
        }
        for (int i = 0;i<5;i++){
            int shi = sc.nextInt();
            int xu = sc.nextInt();
            brr[i][0]=shi;
            brr[i][1]=xu;
        }

        for (int k = 8;k>=0;k--){
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0;i<5;i++){
                for (int j = 0;j<5;j++){
                    if ((i+j) == k){
                        sum1 = sum1 + shimul(arr[i][0],arr[i][1],brr[j][0],brr[j][0]);
                        sum2 = sum2 + xumul(arr[i][0],arr[i][1],brr[j][0],brr[j][0]);
                    }
                }
            }
            System.out.println(sum1);
            System.out.println(sum2);
        }
    }


    private static int shimul(int x,int y,int a,int b){

        int shi = x*a-y*b;
        //System.out.println(shi);
        //int xu = x*b+a*y;
        return shi;
    }
    private static int xumul(int x,int y,int a,int b){
        //int shi = x*a-y*b;
        int xu = x*b+a*y;
        //System.out.println(shi);
        return xu;
    }
}*/
