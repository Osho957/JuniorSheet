package JuniorSheet;
import java.util.*;
public class AntonAndPolyGon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 
		 HashMap<String, Integer> hs = new HashMap<>();
		 hs.put("Tetrahedron", 4);
		 hs.put("Cube", 6);
		 hs.put("Octahedron", 8);
		 hs.put("Dodecahedron", 12);
		 hs.put("Icosahedron", 20);
		 int sum =0;
		 for (int i = 0; i < n; i++) {
			 String s = sc.next();
			 sum+=hs.get(s);
			
		}
		 System.out.println(sum);
	}

}
