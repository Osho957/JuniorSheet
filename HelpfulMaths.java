package JuniorSheet;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=  new Scanner(System.in);
      String string = sc.next();
      string = string.replace("+", "");
      String ansString ="";
     char ch[] =string.toCharArray();
     Arrays.sort(ch);
     ansString=""+ch[0];
     for (int i = 1; i < ch.length; i++) {
		if(i==ch.length-1) {
			ansString+="+"+ch[i];
		}else {
			ansString+="+"+ch[i];
		}
	}
   System.out.println(ansString);
	}

}
