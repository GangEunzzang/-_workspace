class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

class Student extends Person {
	public void set() {
		age = 27;
		name = "¿Ã∞≠¿∫";
		height = 239;
		setWeight(84);
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s  = new Student();
		s.set();
		
	}

}
