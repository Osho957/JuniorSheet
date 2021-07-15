package JuniorSheet;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=  new Scanner(System.in);
 int n = sc.nextInt();
 String string = sc.next();
 string = string.toLowerCase();
 HashSet<Character> hs = new HashSet<>();
 for (int i = 0; i < string.length(); i++) {
	hs.add(string.charAt(i));
}
 if(hs.size()==26) {
	 System.out.println("YES");
 }else {
	 System.out.println("NO");
 }
	}

}
