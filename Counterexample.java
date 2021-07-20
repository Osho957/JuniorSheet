package JuniorSheet;

import java.util.Scanner;

public class Counterexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    if(m-n<2) {
    	System.out.println(-1);
    }else if(m-n==2){
    	if(n%2==0) {
    		System.out.println(n+" "+(n+1)+" "+(n+2));
    	}else {
    		System.out.println(-1);
    	}
    	
    }else {
    	if(n%2==0) {
    		System.out.println(n+" "+(n+1)+" "+(n+2));
    	}else {
    		System.out.println(n+1+" "+(n+2)+" "+(n+3));
    	}
    }
	}


}
