package JuniorSheet;

import java.util.Scanner;

public class Presents {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		int ans[] = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			ans[a[i]-1]=i+1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}System.out.println();
 	}

}
