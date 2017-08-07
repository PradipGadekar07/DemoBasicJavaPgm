//pgm for comparable interface implementation part-1
package demopgm;

public class playerComparable implements Comparable {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public playerComparable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "\n[Jersey No.=" + this.id + ",player name=" + this.name + "]";
	}

	@Override
	public int compareTo(Object o) {
		playerComparable p = (playerComparable) o;
		return this.id - p.id;
	}

}