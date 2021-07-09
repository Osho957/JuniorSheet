package JuniorSheet;

import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int  t = sc.nextInt();
       while(t-->0) {
    	   String string = sc.next();
    	   if(string.length()<=10) {
    		   System.out.println(string);
    	   }else {
    		   System.out.println(string.charAt(0)+""+(string.length()-2)+""+string.charAt(string.length()-1));
    	   }
       }
	}

}
