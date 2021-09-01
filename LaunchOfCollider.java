package JuniorSheet;

import java.util.Scanner;

public class LaunchOfCollider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   \
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		int idx = -1;
		int min =Integer.MAX_VALUE;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='R'&&s.charAt(i+1)=='L'&&(a[i+1]-a[i])<min) {
				min =a[i+1]-a[i];
				idx = i;	
			}
		}
		
		if(idx<a.length-1&&idx!=-1) {
			int x = a[idx];
			int y = a[idx+1];
			long avg = (x+y)/2;
			long ans = avg-x;
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}
	}

}
