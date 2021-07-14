package JuniorSheet;

import java.util.Scanner;

public class MahmoudAndLUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String string  = sc.next();
    String string2 = sc.next();
    if(string.length()<string2.length()) {
    	if(string2.contains(string)) {
    		if(string2.length()-string.length()==0) {
    			System.out.println(-1);
    		}else {
    			System.out.println(string2.length());
    		}
    	}else {
    		System.out.println(string2.length());
    	}
    }else {
    	if(string.contains(string2)) {
    		if(string2.length()-string.length()==0) {
    			System.out.println(-1);
    		}else {
    			System.out.println(string.length());
    		}
    	}else {
    		System.out.println(string.length());
    	}
    }
	}

}
