
public class Person {

	public static int count;

	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	public Person(String name) {
		count++;
		this.name = name;
	}

}
