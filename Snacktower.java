package JuniorSheet;

import java.util.HashSet;

import java.util.Scanner;

public class Snacktower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     int a[]= new int[n];

     for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
     int max = n;
     HashSet<Integer> q = new HashSet<>();
     
     for (int i = 0; i < a.length; i++) {
		
			q.add(a[i]);
			while(q.contains(max)) {
			System.out.print(max+" ");
			max = max-1;
			}
		System.out.println();
		}
		
	
  
	}

}
