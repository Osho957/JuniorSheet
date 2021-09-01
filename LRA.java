package JuniorSheet;

import java.util.Scanner;

public class LRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int l=sc.nextInt() ;
       int r=sc.nextInt() ;
       int a=sc.nextInt() ;
       while(a>0)
       {
           if(l<r)
           ++l;
           else
           ++r;
           --a;
       }
       System.out.println(2*Math.min(l,r));   
	}

}
