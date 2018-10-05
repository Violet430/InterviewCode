/*
package iqiyi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[] food = new int[n];
        for (int i =0;i<n;i++){
            food[i] = sc.nextInt();
        }
        String no = sc.nextLine();
        for (int i = 0;i<m;i++){
            String deal = sc.nextLine();
            String[] strs = deal.split(" ");
            if(strs[0].equals("B")) food[Integer.parseInt(strs[1])-1]--;
            else if(strs[0].equals("A")) food[Integer.parseInt(strs[1])-1]++;
        }
        int res = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int i =0;i<n;i++){
            if(i!=(p-1) && food[i]>food[p-1]) res++;
        }
        System.out.println(res);


    }
}
*/
