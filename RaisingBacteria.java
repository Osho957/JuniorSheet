package JuniorSheet;

import java.util.Scanner;

public class RaisingBacteria {


	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans =0;
		
		while(n!=0) {
			ans+=n%2;
			n=n/2;
		}
		
		System.out.println(ans);
		
		
	}

}
