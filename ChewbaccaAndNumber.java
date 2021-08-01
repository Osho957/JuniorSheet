package JuniorSheet;

import java.util.Scanner;

public class ChewbaccaAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           long n = sc.nextLong();
           long num =0L;
           long i=0;
           while(n!=0) {
        	   long ld = n%10; // before 
        	   if(ld==9&& n<10) {
        		   num+=ld*(long)(Math.pow(10, i));
        		   break;
        	   }
        	   long after = 9-ld;
        	   
        	   if(after<ld) {
        		   num+=after*(long)(Math.pow(10, i));
        		   i++;
        	   }else {
        		   num+=ld*(long)(Math.pow(10, i));
        		   i++;
        	   }
        	   n=n/10;
           }
           System.out.println(num);
           
	}

}
