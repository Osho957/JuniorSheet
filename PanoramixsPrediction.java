package JuniorSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class PanoramixsPrediction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=  new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();
       for (int i = 2; i <=55; i++) {
		if(isPrime(i)) {
			list.add(i);
		}
	}
       //System.out.println(list);
       int n = sc.nextInt();
       int m = sc.nextInt();
       boolean ok = false;
       for (int i = 0; i < list.size()-1; i++) {
		if(list.get(i)==n&&list.get(i+1)==m) {
			ok = true;
			break;
		}
	}
       if(ok) {
    	   System.out.println("YES");
       }else {
    	  System.out.println("NO");
       }
	}

	private static boolean isPrime(int x) {
	for(int i=2;i*i<=x;i++) {
		if(x%i==0) {
			return false;
		}
	}
	return true;
	}

}
