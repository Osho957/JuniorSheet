package JuniorSheet;

import java.util.Scanner;

public class YoungPhysicst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
	    int n= scanner.nextInt();
	    int sumx =0,sumy=0,sumz=0;
	    while(n-->0) {
	    	int x = scanner.nextInt();
	    	int y = scanner.nextInt();
	    	int z = scanner.nextInt();
	    	sumx+=x;
	    	sumy+=y;
	    	sumz+=z;
	    }
	    if(sumx==0&&sumy==0&&sumz==0) {
	    	System.out.println("YES");
	    }else {
	    	System.out.println("NO");
	    }
	}

}
