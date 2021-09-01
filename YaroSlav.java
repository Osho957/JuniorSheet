package JuniorSheet;

import java.util.Scanner;

public class YaroSlav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a[] = new int[1001];
      for (int i = 0; i < n; i++) {
		int x = scanner.nextInt();
		a[x]++;
	}
 
      if(n==1) {
    	  System.out.println("YES");
      }else {
    	  boolean ok = true;
    	  for (int i = 1; i < a.length; i++) {
			if(a[i]>Math.ceil(n/2.0)) {
				ok = false;
			}
		}
    	  if(ok) {
    		  System.out.println("YES");
    	  }else {
    		  System.out.println("NO");
    	  }
      }
	}

}
