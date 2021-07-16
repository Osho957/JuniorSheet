package JuniorSheet;

import java.util.*;
import java.io.*;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FastReader fs = new FastReader();
      long n = fs.nextLong();
      long m = fs.nextLong();
      if(m<=(n+1)/2) {
    	  System.out.println(2*m-1);
      }else {
    	  System.out.println((m-(n+1)/2)*2);
      }
	}
	
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine().trim());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String nextLine() {
			StringBuilder str = new StringBuilder("");
			try {
				str.append(br.readLine().trim());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str.toString();
		}
 
		int[] readArray(int size) {
			int[] ar = new int[size];
			for (int i = 0; i < size; ++i)
				ar[i] = nextInt();
			return ar;
		}
 
		void close() {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
