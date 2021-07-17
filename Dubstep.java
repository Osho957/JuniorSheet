package JuniorSheet;

import java.util.Scanner;

public class Dubstep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	      
	        String x = "";
	        boolean flag =false;
	      StringBuilder sb = new StringBuilder();
	       for(int i=0;i<s.length();i++) {
	    	   if(i<s.length()-2&&s.charAt(i)=='W'&&s.charAt(i+1)=='U'&&s.charAt(i+2)=='B') {
	    		   i=i+2;
	    		   if(flag) {
	    			 sb=sb.append(" ");  
	    		   }
	    	   }
	    	   else {
	    		sb=sb.append(s.charAt(i));
	    	
	    		flag=true;
	    	   }
	 
	       }
	       System.out.println(sb);
	       
	}

}
