package JuniorSheet;

import java.util.HashMap;
import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  HashMap<String, Integer> hs = new HashMap<>();
  while(t-->0) {
	  String string = sc.next();
	  hs.put(string, hs.getOrDefault(string, 0)+1);
	  
  }
  
  int max = Integer.MIN_VALUE;
 
 String ansString ="";
  for(String key:hs.keySet()) {
	 if(hs.get(key)>max) {
		 max=hs.get(key);
		ansString=key;
	 }
  }
  System.out.println(ansString);
  
	}

}
