package JuniorSheet;

import java.util.Scanner;

public class Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       long m = sc.nextLong();
       long k = sc.nextLong();
       long ans = (long)Math.ceil((double)n/k)*(long)Math.ceil((double)m/k);
       System.out.println(ans);
	}

}
