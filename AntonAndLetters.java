package JuniorSheet;

import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  s=s.replaceAll(" ", "");
  HashSet<Character> hs = new HashSet<>();
  for (int i = 0; i < s.length(); i++) {
	char ch = s.charAt(i);
	if(ch==','||ch=='{'||ch=='}') {
		continue;
	}
	
	hs.add(ch);
}
  System.out.println(hs.size());
  
		  
 	}

}
