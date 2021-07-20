package JuniorSheet;

import java.util.Scanner;

public class WastedTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     double k= sc.nextDouble();
     double length =0.0;
     double x1 = sc.nextDouble();
     double y1 = sc.nextDouble();
     n--;
     while(n-->0){
    	 
    	 double x2=sc.nextDouble();
    	 double y2=sc.nextDouble();
    	 double sum =0;
    	sum=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
    	x1=x2;
    	y1=y2;
  
    	 length+=sum;
     }
     
     System.out.println(length*(k/50));
     
	}

}
