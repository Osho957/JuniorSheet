package JuniorSheet;

import java.util.Scanner;

public class EasyMath {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		   int t = sc.nextInt();
		   while(t-->0) {
		   int n = sc.nextInt();
		   int m = sc.nextInt();
		   int a = sc.nextInt();
		   int d = sc.nextInt();
		   int count =0;
		   for(int i=n;i<m;i++){
		   	if(i%(a)==0||i%(a+d)==0||i%(a+2*d)==0||i%(a+3*d)==0||i%(a+4*d)==0){
		   		continue;
		   	}else{
		   		count++;
		   	}
		   }
		   System.out.println(count);
		   
		   }
   
	}

}
