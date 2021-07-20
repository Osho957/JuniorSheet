package JuniorSheet;

import java.util.Scanner;

public class FancyFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int a = sc.nextInt();
			System.out.println((360%(180-a)==0)?"YES":"NO");
		}
	
	}

}
