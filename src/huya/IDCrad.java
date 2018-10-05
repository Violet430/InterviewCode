/*
package huya;

import java.util.Scanner;

public class IDCrad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            str = str.replace(" ","");
            //System.out.println(str);
            String res = "";
            if(str.length()<=6){
                res=str;
            }else if(str.length()<=14){
                res = str.substring(0,6)+" "+str.substring(6);
            }else{
                res = str.substring(0,6)+" "+str.substring(6,14)+" "+str.substring(14);
            }

            System.out.println(res);

        }
    }
}
*/
