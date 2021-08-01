package JuniorSheet;

import java.util.Arrays;
import java.util.Scanner;

public class MountainScenery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int  k= sc.nextInt();
   int a[] = new int[2*n+1];
   for (int i = 0; i < a.length; i++) {
	a[i]= sc.nextInt();
}
   
   for (int i = 1; i < a.length-1; i=i+2) {
	if(a[i]>a[i-1] && a[i]>a[i+1] && k>0) {
		if(a[i]-1!=a[i-1]&&a[i]-1!=a[i+1]) {
			a[i]=a[i]-1;
			k--;
		}
	}
	
}
   for (int j = 0; j < a.length; j++) {
		System.out.print(a[j]+" ");
	}System.out.println();
	
   
   
	}
}
