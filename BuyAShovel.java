package JuniorSheet;

import java.util.Scanner;

public class BuyAShovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int i=1;
		
		while(((n*i)%10-k)!=0) {
			if((n*i)%10==0) {
			
				break;
			}
			
			i++;
		}
      System.out.println(i);
	}

}
