package JuniorSheet;

import java.util.Scanner;

public class PoloThePenguine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int sum =0;
       while(n-->0) {
    	   int l = sc.nextInt();
    	   int r  = sc.nextInt();
    	   int diff  = r-l+1;
    	   sum+=diff;
       }
  
       if(sum%k==0) {
    	   System.out.println(0);
       }else {
    	   System.out.println(k- (sum%k));
       }
       
	}

}
