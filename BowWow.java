package JuniorSheet;

import java.util.Scanner;

public class BowWow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
   String string = scanner.next();
   long ans =0;
   for (int i = string.length()-1; i >= 0; i--) {
	if(string.charAt(i)=='1') {
	
		ans++;
	}
}
 if(ans>1) {
	 System.out.println((string.length()-1)/2 +1);
 }else {
	 System.out.println(string.length()/2);
 }
	}

}
