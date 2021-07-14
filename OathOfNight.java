package JuniorSheet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class OathOfNight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];

    for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	
	}
    
   int ans =0;
   Arrays.sort(a);
   int min = a[0];
   int max =a[n-1];
   for (int i = 0; i < a.length; i++) {
	     if(a[i]==min||a[i]==max) {
	    	 continue;
	     }else {
	    	 ans++;
	     }
}
  System.out.println(ans);
	}
}
