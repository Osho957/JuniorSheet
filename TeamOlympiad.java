package JuniorSheet;

import java.util.HashMap;
import java.util.Scanner;

public class TeamOlympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     int a[] = new int[n];
     int c1= 0;
     int c2 =0;
     int c3 =0;
     for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
		if(a[i]==1) {
			c1++;
		}else if(a[i]==2) {
			c2++;
		}else {
			c3++;
		}
	}
     int team = Math.min(c1, Math.min(c2, c3));
     System.out.println(team);
     while(team-->0) {
    	 int m=0;
    	 int p=0;
    	 int o=0;
    	 for(int j=0;j<n;j++) {
    		 if(a[j]==1) {
    			m=j+1;
    			a[j]=0;
    			break;
    		 }
    	 }
    	 for(int j=0;j<n;j++) {
    		 if(a[j]==2) {
    			 p=j+1;
    			 a[j]=0;
    			 break;
    		 }
    	 }
    	 for(int j=0;j<n;j++) {
    		 if(a[j]==3) {
    			 o=j+1;
    			 a[j]=0;
    			 break;
    		 }
    	 }
    	 System.out.println(m+" "+p+" "+o);
    	 }
      
	}

}
