package JuniorSheet;

import java.util.HashSet;
import java.util.Scanner;

public class ValeraAndX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
   char ch [][] = new char[n][n];
   int countdia = 2*n-1;
   int remele=n*n-(2*n-1);
   int cd=0;
   int remd=0;
   for (int i = 0; i < ch.length; i++) {
	String string = sc.next();
	for (int j = 0; j < string.length(); j++) {
		ch[i][j]= string.charAt(j);
	}
}
     char c=ch[0][0];
     char c1=ch[0][1];
     for (int i = 0; i < ch.length; i++) {
		for (int j = 0; j < ch.length; j++) {
			if(i==j||i+j==n-1) {
				if(ch[i][j]==c)
				cd++;
			}else {
				if(ch[i][j]==c1) {
					remd++;
				}
			}
			
		}
	}

   if(cd == countdia&&remd == remele&&c!=c1) {
	   System.out.println("YES");
   }else {
	   System.out.println("NO");
   }
      
	}


}
