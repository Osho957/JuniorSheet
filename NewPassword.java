package JuniorSheet;

import java.util.Scanner;

public class NewPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     
     int diff = n-m;
     char ch = 'a';
     if(diff==0) {
    	 String pasString ="";
    	 for (int i = 0; i < n; i++) {
			pasString+=ch;
			ch=(char)(ch+1);
		}
    	 System.out.println(pasString);
     }else {
       	 String pasString ="";
    	 for (int i = 0; i < m; i++) {
 			pasString+=ch;
 			ch=(char)(ch+1);
 		}
    	 int x =0;
    	 for (int i = 0; i < diff; i++) {
			pasString+=pasString.charAt(x);
			x++;
		}
    	 System.out.println(pasString);
     }
     
	}

}
