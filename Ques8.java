package JuniorSheet;

import java.util.HashSet;
import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String string = sc.next();
         HashSet<Character> hs = new HashSet<>();
         for (int i = 0; i < string.length(); i++) {
			hs.add(string.charAt(i));
		}
         if(hs.size()%2==0) {
        	 System.out.println("CHAT WITH HER!\n"
        	 		+ "");
	}else {
		System.out.println("IGNORE HIM!\n"
				+ "");
	}
	}

}
