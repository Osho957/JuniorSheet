package JuniorSheet;

import java.util.Scanner;

public class KeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    String a = "qwertyuiopasdfghjkl;zxcvbnm,./";
		    int move = sc.next().charAt(0) == 'R' ? -1 : 1;
		    char[] s = sc.next().toCharArray();
		    for (int i = 0; i < s.length; i++) {
		      s[i] = a.charAt(a.indexOf(s[i]) + move);
		    }
		    StringBuilder ansBuilder = new StringBuilder();
		    for (int i = 0; i < s.length; i++) {
				ansBuilder.append(s[i]);
			}
		    
		    System.out.println(ansBuilder.toString());
	}

}
