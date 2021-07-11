package JuniorSheet;

import java.util.Scanner;

public class LightMoreLight {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
while(sc.hasNext()) {
    	int n = sc.nextInt();
    	if(n==0) {
    		break;
    	}
    	int x =(int) Math.sqrt(n);
    	if(x*x==n) {
    		System.out.println("yes");
    	}else {
    		System.out.println("no");
    	}
}
	}

}
