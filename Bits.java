package JuniorSheet;

import java.util.Scanner;

public class Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
 int n = scanner.nextInt();
 int ans =0;
 while(n-->0) {
	 String x = scanner.next();
	 
	 if(x.charAt(0)=='+') {
		 ++ans;
	 }else if(x.charAt(0)=='-') {
		 --ans;
	 }else if(x.charAt(1)=='+') {
		 ans++;
	 }else if(x.charAt(1)=='-') {
		 ans--;
	 }
		 
 }
 System.out.println(ans);
	}

}
