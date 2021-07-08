package JuniorSheet;

import java.util.Scanner;

public class DieRoll {
	
	static int gcd(int a ,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,b%a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();

  if(n==1 &&n==m) {
	  System.out.println("1/1");
  }
  else {
	  int max = Math.max(n, m);
	  max = 7-max;
	  if(6%max==0) {
		  System.out.println(1+"/"+(6/max));
	  }else {
		  int gcd = gcd(max,6);
		  System.out.println(max/gcd+"/"+6/gcd);
	  }
  }
	}

}
