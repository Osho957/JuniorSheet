package JuniorSheet;

import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        String string = sc.next();
        int lower =0;
        int upper =0;
        for (int i = 0; i <string.length(); i++) {
			if(string.charAt(i)>='a'&&string.charAt(i)<='z') {
				lower++;
			}else {
				upper++;
			}
		}
   
        if(lower<upper) {
        	System.out.println(string.toUpperCase());
        }else  {
        	System.out.println(string.toLowerCase());
        }
	}

}
