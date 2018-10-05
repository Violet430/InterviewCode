package help;

import java.util.Scanner;

public class 数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i =1;i<n-1;i++){

                if(arr[i+1]-arr[i-1]<2*arr[i+1]-arr[i]) arr[i]*=2;
                else arr[i+1]*=2;

        }

        for(int x:arr){
            System.out.println(x);
        }
    }
}
