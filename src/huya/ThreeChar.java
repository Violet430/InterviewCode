package huya;

import java.util.HashMap;
import java.util.Scanner;

public class ThreeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace(" ","");
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch) ==3){
                System.out.println(ch);
                return;
            }
        }
    }
}
