package JuniorSheet;

import java.util.Scanner;

public class LineLandMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
    int min =0;
    int max =0;
    for (int i = 0; i < a.length; i++) {
		if(i==0) {
			min = Math.abs(a[i]-a[i+1]);
			max=Math.abs(a[i]-a[n-1]);
		}else if(i==n-1) {
			min = Math.abs(a[i]-a[i-1]);
			max=Math.abs(a[i]-a[0]);
		}else {
			min = Math.min(Math.abs(a[i]-a[i+1]),Math.abs(a[i]-a[i-1]));
			max=  Math.max(Math.abs(a[i]-a[0]),Math.abs(a[i]-a[n-1]));
		}
		System.out.println(min+" "+max);
	}
    
	}

}
