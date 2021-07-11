package JuniorSheet;

import java.math.BigInteger;
import java.util.Scanner;

public class Profuct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=  new Scanner (System.in);
 String num1 = sc.next();
 String num2 =  sc.next();
 BigInteger a = new BigInteger(num1);
 BigInteger b = new BigInteger(num2);
 
 BigInteger product = a.multiply(b);
 System.out.println(product);
	}

}
