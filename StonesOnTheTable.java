package JuniorSheet;

import java.util.Scanner;

public class StonesOnTheTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   String string = sc.next();
   int count =0;
   for (int i = 1; i < string.length(); i++) {
	     if(string.charAt(i-1)==string.charAt(i)) {
	    	 count++;
	     }
}
   System.out.println(count);
	}

}
