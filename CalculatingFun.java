package JuniorSheet;

import java.util.Scanner;

public class CalculatingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
      if(n%2==0) {
    	  System.out.println(n/2);
      }else {
    	  System.out.println(-(n/2 +1));
      }
	}

}
