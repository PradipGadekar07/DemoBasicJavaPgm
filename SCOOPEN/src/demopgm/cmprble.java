//pgm for comparable interface implementation part-2
package demopgm;

import java.util.ArrayList;
import java.util.Collections;

public class cmprble {

	public static void main(String[] args) {

		ArrayList<playerComparable> al = new ArrayList<>();
		playerComparable p1 = new playerComparable(7, "MSD");
		playerComparable p2 = new playerComparable(12, "Yuvi");
		playerComparable p3 = new playerComparable(10, "Messi");
		playerComparable p4 = new playerComparable(18, "virat");
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		System.out.println("Arraylist before sorting :" + al);
		Collections.sort(al);
		System.out.println("Arraylist after sorting :" + al);
	}
}
