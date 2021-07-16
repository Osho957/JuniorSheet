package JuniorSheet;

import java.util.Arrays;
import java.util.Scanner;

public class IsItRated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a[] = new int[n];
     int b[] = new int[n];
     for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
		b[i]= sc.nextInt();
	}
     boolean rated = false;
     for (int i = 0; i < b.length; i++) {
		if(a[i]-b[i]!=0) {
			rated = true;
			break;
		}
	}
     
     if(rated) {
    	 System.out.println("rated");
     }else {
    	 
    	 if(isSorted(a,b)) {
    		 System.out.println("maybe");
    	 }else {
    		 System.out.println("unrated");
    	 }
    	 
     }
     
     
	}

	private static boolean isSorted(int[] a,int b[]) {
         
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[b.length-i-1]) {
				return false;
			}
		}
		return true;
		
		
	}
	}


