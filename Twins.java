package JuniorSheet;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    int sum=0;
    for (int i = 0; i < n; i++) {
		a[i]=sc.nextInt();
		sum+=a[i];
	}
    int half =0;
    
    int count =0;
    Arrays.sort(a);
    for (int i = a.length-1; i >=0; i--) {
		half+=a[i];
	
		if(half>sum-half) {
			count++;
			break;
		}
		count++;
	}
    System.out.println(count);
	}

}
