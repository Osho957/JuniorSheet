package JuniorSheet;

import java.util.Arrays;
import java.util.Scanner;

public class MountainScenery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m  = sc.nextInt();
    int a[] = new int[2*n+1];
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
		
	}
    
    for (int i = 0; i < a.length; i++) {
    	boolean ok = true;
		for (int j = i+1; j < a.length; j++) {
		if(a[i]<a[j]) {
			ok= false;
			break;
		}
		}
		if(ok&&m>0) {
			a[i]=a[i]-1;
			m--;
		}
	}
    for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}System.out.println();
  
	}

}
