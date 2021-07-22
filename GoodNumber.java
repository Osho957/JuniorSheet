package JuniorSheet;

import java.util.Scanner;

public class GoodNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      int n = sc.nextInt();
      int count =0;
      while(t-->0) {
    	  int a[] = new int[n+1];
    	  int num = sc.nextInt();
    	  while(num!=0) {
    		  int temp= num%10;
    		  if(temp<a.length) {
    			  a[temp]=a[temp]+1;
    		  }
    		  num=num/10;
    	  }
    	  boolean possioble = true;
    	  for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				possioble=false;
				break;
			}
		}
    	  if(possioble) {
    		  count++;
    	  }
    	  
      }
    System.out.println(count);
	}

}
