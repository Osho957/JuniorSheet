package JuniorSheet;

import java.util.Scanner;

public class CasesOfZeroAnd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int n  = scanner.nextInt();
      String string = scanner.next();
      int z =0;
      int o = 0;
      for (int i = 0; i < string.length(); i++) {
		if(string.charAt(i)=='1') {
			o++;
		}else {
			z++;
		}
	}
      System.out.println(Math.abs(z-o));
	}

}
