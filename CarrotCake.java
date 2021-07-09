package JuniorSheet;

import java.util.Scanner;

public class CarrotCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int k = sc.nextInt();
    int d = sc.nextInt();
   
    if(k>n) {
    	System.out.println("No");
    }else{
 
    	int one = (int)Math.ceil((double)n/k)*t;
  
    	
    	int two = t+d;
      
    	if(one>two) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
    
    
	}

}
