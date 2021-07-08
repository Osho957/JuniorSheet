package JuniorSheet;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=  new Scanner(System.in);
    int  n= sc.nextInt();
    int a[][] = new int[n][3];
    for (int i = 0; i < n; i++) {
		for (int j = 0; j < 3; j++) {
			a[i][j]= sc.nextInt();
		}
	}
    int ans= 0;
    for (int i = 0; i < a.length; i++) {
    	int count =0;
		for (int j = 0; j < a[0].length; j++) {
			if(a[i][j]==1) {
				count++;
			}
		}
		if(count>=2) {
			ans++;
		}
	}
    System.out.println(ans);
	}
	
	//optimised approach
	
//	  int t = sc.nextInt();
//      int cout =0;
//      while(t-->0) {
//   	   int a =sc.nextInt();
//   	   int b =sc.nextInt();
//   	   int c =sc.nextInt();
//   	   if(a>0&&b>0||b>0&&c>0||c>0&&a>0) {
//   	   cout++;
//   	  }
//      } System.out.println(cout);
//
//}
}
