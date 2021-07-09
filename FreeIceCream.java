package JuniorSheet;

import java.util.Scanner;

public class FreeIceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       long p = sc.nextLong();
       int distressed =0;
       
       while(n-->0) {
    	   char ch = sc.next().charAt(0);
    	   long x = sc.nextLong();
    	   if(ch=='+') {
    		   p=p+x;
    	   }else {
    		   if(p>=x) {
    			   p=p-x;
    		   }else {
    			   distressed++;
    		   }
    	   }
       }
       System.out.println(p+" "+distressed);
	}

}
