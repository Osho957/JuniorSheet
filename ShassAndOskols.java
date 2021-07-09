package JuniorSheet;

import java.util.Scanner;

public class ShassAndOskols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int a[] = new int[n];
         for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
         int m = sc.nextInt();
         while(m-->0) {
        	 int x = sc.nextInt();
        	 int y = sc.nextInt();
        	 int left =0;
        	 int right =0;
        	 
        	 if(x==1) {
        		 left =0;
        		 right = a[x-1] - y;
        		 if(a.length>1) {
        		 a[x]+=right;
        		 }
        		 a[x-1]=0;
        	 }else if(x==n) {
        		 right =0;
        		 left = y-1;
        		 a[x-2] +=left;
        		 a[x-1]=0;
        		 
        	 }else {
   
        		 left = y-1;
        		 right =  a[x-1] -y;
        		 a[x]+=right;
        		 a[x-2]+=left;
        		 a[x-1]=0;
        	 }
         }
         for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
