package JuniorSheet;

import java.util.Scanner;

public class ArpaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
    
       long n = sc.nextLong();
       long ld = 8;
       long ans= 1;
       while(n>0) {
    	   if(n%2==0) {
    		   ld=(ld*ld)%10;
    		   n=n/2;
    	   }else {
    		   ans=(ans*ld)%10;
    		   n--;
    	   }
       }
       System.out.println(ans);
       
	}


}
