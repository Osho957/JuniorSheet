package JuniorSheet;

import java.util.Scanner;

public class PouringRain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double d=sc.nextDouble();
		double h=sc.nextDouble();
		double v=sc.nextDouble();
		double e=sc.nextDouble();
	    double ve=Math.PI*(d/2)*(d/2)*e;  // volume through water increase
	    double v1=Math.PI*(d/2)*(d/2)*h;  //inital volume
		if(v<=ve) {
			System.out.println("NO");
			return;
		}
		else {
			System.out.println("YES");
			System.out.println(v1/(v-ve));
		}
	}

}
