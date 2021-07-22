package JuniorSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class AlyonaAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       long remn[] = new long[5];
       long remm[] = new long[5];
       
       for (int i = 1; i <=n; i++) {
		remn[i%5]++;
	}
       for (int i = 1; i <=m; i++) {
   		remm[i%5]++;
   	}
       
       long count =remn[0]*remm[0];
       for (int i = 1; i < remm.length; i++) {
		count+=remn[i]*remm[5-i];
	}
       System.out.println(count);
	}

}
