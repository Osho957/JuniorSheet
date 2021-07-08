package JuniorSheet;

import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

	   String s[] = new String[n];
	   for (int i = 0; i < s.length; i++) {
		s[i]= sc.next();
	}
	   int group =1;
	   int max =1;
	   for (int i = 0; i < s.length-1; i++) {
		char ch1 = s[i].charAt(1);
		char ch2 = s[i+1].charAt(0);
		if(ch1==ch2) {
			group++;
		}else {
			group=max;
		}
		
		if(max<group) {
			max=group;
		}
	}
	   System.out.println(max);
  
	}

}
