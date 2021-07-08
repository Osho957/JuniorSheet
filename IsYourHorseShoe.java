package JuniorSheet;

import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = 4;
       HashSet<Integer> hsHashSet =new HashSet<>();
       for (int i = 0; i < n; i++) {
    	   int x = sc.nextInt();
		hsHashSet.add(x);
	}
       System.out.println(n-hsHashSet.size());
       
	}

}
