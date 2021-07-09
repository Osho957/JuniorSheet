package JuniorSheet;

import java.util.Scanner;

public class Juicer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int b = sc.nextInt();
      int d = sc.nextInt();
      int a[] = new int[n];
      int sum =0;
      int count =0;
      for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
		if(a[i]>b) {
			a[i]=0;
		}
	}
      
      for (int i = 0; i < a.length; i++) {
		sum+=a[i];
		if(sum>d) {
			sum=0;
			count++;
		}
	}
      System.out.println(count);
      
	}

}
