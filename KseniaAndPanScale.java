package JuniorSheet;

import java.util.Scanner;

public class KseniaAndPanScale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           String string = sc.next();
           String input = sc.next();
          int idx = string.indexOf("|");
         String left = string.substring(0,idx);
         String right = string.substring(idx+1);
         for (int i = 0; i < input.length(); i++) {
			if(left.length()<right.length()) {
				left+=input.charAt(i);
			}else {
				right+=input.charAt(i);
			}
		}
         if(right.length()==left.length()) {
        	 System.out.println(left+'|'+right);
         }else {
        	 System.out.println("Impossible");
         }
	}

}
