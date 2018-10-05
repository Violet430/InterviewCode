package jingdong;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class duobutu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String res = "Yes";
            int n = sc.nextInt();
            int m = sc.nextInt();
            HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
            for(int i=0;i<m;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(!map.containsKey(a)) map.put(a,new HashSet<>());
                map.get(a).add(b);
                if(!map.containsKey(b)) map.put(b,new HashSet<>());
                map.get(b).add(a);
            }
            for(int x:map.keySet()){
                for (int y:map.keySet()){
                    if(y!=x && !map.get(x).contains(y)){
                        for(int j:map.get(y)){
                            if(!map.get(x).contains(j)){
                                res = "No";
                                break;
                            }
                        }
                    }
                    if(res.equals("No")) break;
                }
                if(res.equals("No")) break;
            }
            System.out.println("Yes");
            t--;
        }
    }
}