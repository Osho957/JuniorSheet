package JuniorSheet;

import java.util.Scanner;

public class NightMuseum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   Scanner sc=  new Scanner(System.in);
   String string = sc.next();
    string= "a"+string;
   int ans =0;
   for (int i = 1; i <string.length(); i++) {
	  ans+=Math.min(Math.abs(string.charAt(i)-string.charAt(i-1)),26-Math.abs(string.charAt(i)-string.charAt(i-1)));
   }
   System.out.println(ans);
   

	}

}
