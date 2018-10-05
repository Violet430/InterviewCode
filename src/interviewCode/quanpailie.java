package interviewCode;

import java.util.*;

public class quanpailie {
    private  static ArrayList<String> pailie = null;
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] jihe = new String[n + 1];
        jihe[0] = "";
        for (int i = 1; i < jihe.length; i++) {
            jihe[i] = i + "";
        }

        pailie =new ArrayList<>();
        permStr(jihe, 1);
        Collections.sort(pailie);
        String res ="";
        if (pailie.size()>0){
            for (String i : pailie){
                res+=i+" ";
            }
            System.out.println(res);
        }
        pailie =null;

    }

    private static void permStr(String[] str, int i) {
        if (i == str.length - 1) {
            StringBuilder res = new StringBuilder();
            for (int k = 0; k < str.length; k++) {
                res.append(str[k]);
            }
            pailie.add(res.toString());
        } else {
            for (int j = i; j <= str.length - 1; j++) {
                swapStr(str, i, j);
                permStr(str, i + 1);
                swapStr(str, i, j);
            }
        }
    }

    private static void swapStr(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
