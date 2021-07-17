package JuniorSheet;

import java.util.Scanner;

public class BrainsPhoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int count =0;
       String string[][] = new String[n][m];
       for (int i = 0; i < string.length; i++) {
		for (int j = 0; j < string[0].length; j++) {
			string[i][j]= sc.next();
			if(string[i][j].equals("B")||string[i][j].equals("G")||string[i][j].equals("W")) {
				count++;
			}
		}
	}
    
   
       if(count==n*m) {
    	   System.out.println("#Black&White");
       }else {
    	   System.out.println("#Color");
       }
       
       
	}

}
