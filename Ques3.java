package JuniorSheet;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int yr =0;
     while(n<=m) {
    	 n=n*3;
    	 m=m*2;
    	 yr++;
     }
     System.out.println(yr);
	}

}
