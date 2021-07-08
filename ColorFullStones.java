package JuniorSheet;

import java.util.Scanner;

public class ColorFullStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int pos =1;
		int j =0;
		int i =0;
		while(j<s2.length()) {
			char ch = s2.charAt(j);
			char ch1 = s1.charAt(i);
			if(ch1==ch) {
				pos++;
				i++;
				j++;
			}else {
				j++;
			}
		}
		
		System.out.println(pos);

	}

}
