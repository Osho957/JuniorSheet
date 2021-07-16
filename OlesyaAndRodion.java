package JuniorSheet;

import java.util.Scanner;

public class OlesyaAndRodion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		if(n == 1 && t == 10) System.out.println("-1");
		else if(n >= 2 && t == 10) {
			System.out.print("1");
			for(int i = 1; i < n; i++) System.out.print("0");
		}else {
			for(int i = 0; i < n; i++) System.out.print(t);
		}
	}

}
