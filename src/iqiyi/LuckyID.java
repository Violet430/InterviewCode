
package iqiyi;

import java.util.Scanner;

public class LuckyID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            int[] nums = new int[arr.length];
            for(int i =0;i<arr.length;i++){
                nums[i] = arr[i]-48;
            }
            int x = nums[0]+nums[1]+nums[2];
            int y = nums[3]+nums[4]+nums[5];
            if(x==y){
                System.out.println(0);
            }else{
                int del = x<y?(y-x):(x-y);
                int res = 0;
                if (x<y){
                    int i =0;
                    while(i<3){
                        if(del<10-arr[i]){
                            res = 1;
                            break;
                        }
                        else{
                            del = del-10+arr[i];
                            res++;
                        }
                        i++;
                    }
                }else{
                    int i =3;
                    while(i<6){
                        if(del<10-arr[i]){
                            res = 1;
                            break;
                        }
                        else{
                            del = del-10+arr[i];
                            res++;
                        }
                        i++;
                    }
                }


                //int res = del/10 + 1;
                System.out.println(res);
            }
        }
    }
}

