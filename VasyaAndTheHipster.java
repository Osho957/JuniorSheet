package JuniorSheet;

import java.util.Scanner;

public class VasyaAndTheHipster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int x = scanner.nextInt();
       int d1 = Math.min(n, x);
       int d2 = Math.abs(n-x)/2;
       System.out.println(d1+" "+d2);
	}

}
