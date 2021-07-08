package JuniorSheet;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a[][] = new int[5][5];
       int x=-1;
       int y=-1;
       for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			a[i][j]= sc.nextInt();
			if(a[i][j]==1) {
				x=i;
				y=j;
			}
		}
	}
       System.out.println(Math.abs((x-2))+Math.abs(y-2));
	}

}
