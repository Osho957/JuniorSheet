package JuniorSheet;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class IWannaBeTheGuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FastReader fs =new FastReader();
     int n = fs.nextInt();
     HashSet<Integer> hs = new HashSet<>();
     int p = fs.nextInt();
     while(p-->0) {
    	 hs.add(fs.nextInt());
     }
     int m = fs.nextInt();
     while(m-->0) {
    	 hs.add(fs.nextInt());
     }
     if(hs.size()==n) {
    	 System.out.println("I become the guy.");
     }else {
    	 System.out.println("Oh, my keyboard!");
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
