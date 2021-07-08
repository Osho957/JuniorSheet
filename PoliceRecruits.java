package JuniorSheet;

import java.util.Scanner;

public class PoliceRecruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int [n];
    for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
    
    int hired =0;
  
    int crimehappened =0;
    for (int i = 0; i < a.length; i++) {
	if(a[i]==-1&&hired==0) {
		crimehappened++;
	}else {
		hired+=a[i];
	}
		
	}
    System.out.println(crimehappened);
    
	}

}
