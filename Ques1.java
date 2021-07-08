package JuniorSheet;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=  new Scanner(System.in);
  int n = sc.nextInt();
  int h = sc.nextInt();
  int count =0;
  while(n-->0) {
	  int x = sc.nextInt();
	 
	if(x<=h) {
		  count+=1;
	  }else {
		  count+=2;
	  }
	  
  }
  System.out.println(count);
	}

}
