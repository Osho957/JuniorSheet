package JuniorSheet;

import java.util.Scanner;

public class IQTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		char ch[][] = new char[4][4];
		for (int i = 0; i <4; i++) {
			String string = scanner.next();
			for (int j = 0; j < ch[0].length; j++) {
				ch[i][j]= string.charAt(j);
			}
		}
		boolean possible = false;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
			
				if(isPossible(ch,i,j)) {
					possible = true;
				break;
				}
			}
			if(possible) {
				break;
			}
		}
		if(possible) {
			
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

	private static boolean isPossible(char c[][], int i, int j) {
		// TODO Auto-generated method stub
		int x =i;
		int y =j;
		int count1 =0;
		int count2 =0;
		if(y<c.length-1&&x<c.length-1) {
			if(c[x][y]=='#') {
				count1++;
			}else {
				count2++;
			}
			if(c[x][y+1]=='#') {
				count1++;
			}else {
				count2++;
			}
			if(c[x+1][y]=='#') {
				count1++;
			}else {
				count2++;
			}
			if(c[x+1][y+1]=='#') {
				count1++;
			}else {
				count2++;
			}
			
		}
		if(count1>=3) {
			return true;
		}else if(count2>=3) {
			return true;
		}
		
		return false;
	}

}
