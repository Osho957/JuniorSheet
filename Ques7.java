package JuniorSheet;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=  new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
   
    for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i)==s2.charAt(i)) {
			continue;
		}else if(s1.charAt(i)>s2.charAt(i)) {
			System.out.println(1);
			return;
		}else {
			System.out.println(-1);
			return;
		}
	}
    
    System.out.println(0);
	}

}
