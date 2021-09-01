package JuniorSheet;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();
    int k = scanner.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
		a[i]= scanner.nextInt();
	}
    int ans =0;
    for (int i = 0; i < a.length; i++) {
		if(a[k-1]<=a[i]&&a[i]>0) {
			ans++;
		}
	}
    System.out.println(ans);
    
	}

}
