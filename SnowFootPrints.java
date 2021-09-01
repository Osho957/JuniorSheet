package JuniorSheet;

import java.util.Scanner;

public class SnowFootPrints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String string = sc.next();

   int start =-1;
   for (int i = 0; i <n; i++) {
	if(string.charAt(i)=='R') {
		start =i+1;
		break;
	}
}
   
   if(start==-1) {
	   for (int i = 0; i <n; i++) {
			if(string.charAt(i)=='L') {
				start =i+1;
			
			}
		} 
   }
   
   int end =-1;
   for (int i = 0; i < n; i++) {
	if(string.charAt(i)=='L') {
		end = i;
		break;
	}
}
   
    if(end ==-1) {
    	for (int i = n-1; i >= 0; i--) {
		if(string.charAt(i)!='.') {
			end = i+2;
			break;
		}
		}
    }
    
    System.out.println(start+" "+end);
   
	}

}
