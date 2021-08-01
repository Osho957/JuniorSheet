package JuniorSheet;

import java.util.Scanner;

public class KseniaAndPanScale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           String string = sc.next();
           String input = sc.next();
          
           int len1 =0;
           int len2 =0;
           int idx =-1;
           for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)!='|') {
				len1++;
			}else {
				idx=i;
				break;
			}	
		}
         len2  = string.substring(idx+1).length();
         if(len1==len2) {
        	 System.out.println("Impossible");
         }else if(len1<len2) {
			if(len1+input.length()==len2) {
				System.out.println(input+string.substring(0,idx)+"|"+string.substring(idx+1));
			}else {
				System.out.println("Impossible");
			}
		}else {
			if(len2+input.length()==len1) {
				System.out.println(string.substring(0,idx)+"|"+input+string.substring(idx+1));
			}else {
				System.out.println("Impossible");
			}
		}
	}

}
