package JuniorSheet;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String string = sc.next();
    int cA=0;
    int cD=0;
    for (int i = 0; i < n; i++) {
		char ch = string.charAt(i);
		if(ch=='A') {
			cA+=1;
		}else {
			cD+=1;
		}
	}
 
    if(cA>cD) {
      System.out.println("Anton");
    }else if(cA<cD) {
    	System.out.println("Danik");
    }else {
    	System.out.println("Friendship");
    }
	}

}
