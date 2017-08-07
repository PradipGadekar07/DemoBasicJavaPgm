//comparator implementation class part 1
package demopgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class playerComparator {
	private int id;
	private String name;

	public playerComparator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n player [id=" + id + ", name=" + name + "]";
	}

}

class sortingByPlayer implements Comparator<playerComparator> {

	@Override
	public int compare(playerComparator o1, playerComparator o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}
}

class sortbyname implements Comparator<playerComparator> {

	@Override
	public int compare(playerComparator o1, playerComparator o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class MainComarator {
	public static void main(String[] args) {
		ArrayList<playerComparator> al = new ArrayList<playerComparator>();
		al.add(new playerComparator(7, "MSD"));
		al.add(new playerComparator(81, "Kedar"));
		al.add(new playerComparator(3, "Gayle"));

		System.out.println("Unsorted");
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));

		Collections.sort(al, new sortingByPlayer());

		System.out.println("\nSorted by player id");
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));

		Collections.sort(al, new sortbyname());

		System.out.println("\nSorted by  name");
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));

	}
}
