package JuniorSheet;

import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int home[] = new int[n];
     int guest[] = new int [n];
     for (int i = 0; i < guest.length; i++) {
		home[i]=sc.nextInt();
		guest[i]=sc.nextInt();
	}
   
     int ans =0;
     for (int i = 0; i < guest.length; i++) {
		for (int j = 0; j < guest.length; j++) {
			if(home[i]==guest[j]) {
				
				ans++;
			}
		}
	}
     System.out.println(ans);
	}

}
