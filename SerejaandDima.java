package JuniorSheet;

import java.util.Scanner;

public class SerejaandDima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
       int sereja =0;
       int dima =0;
      boolean turn  = false;
       int i=0;
       int j=a.length-1;
       while(i<j) {
    	   if(a[i]<a[j]) {
    		   if(!turn) {
    			   sereja+=a[j];
    		   }else {
    			   dima+=a[j];
    		   }
    		   j--;
    	   }else {
    		   if(!turn) {
    			   sereja+=a[i];
    		   }else {
    			   dima+=a[i];
    		   }  
    		   i++;
    	   }
    	
    	   if(turn) {
    		   turn=false;
    	   }else {
    		   turn =true;
    	   }
    	    
       }
       
       
	   if(i==j) {
		   if(!turn) {
			   sereja+=a[j];
		   }else {
			   dima+=a[j];
		   }  
	   }
       
       System.out.println(sereja+" "+dima);
       
       
	}

}
