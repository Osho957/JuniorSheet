package JuniorSheet;

import java.util.Scanner;

public class DiceTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       int  m = sc.nextInt();
       boolean possible  = true;
       while(n-->0) {
    	   int u = sc.nextInt();
    	   int v = sc.nextInt();
    	   if(u==m||u==7-m||v==m||v==7-m) {
    		   possible=false;
    		   break;
    	   }
       }
       if(possible) {
    	   System.out.println("YES");
       }else {
    	   System.out.println("NO");
       }
	}

}
