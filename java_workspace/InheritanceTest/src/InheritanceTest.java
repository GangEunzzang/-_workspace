class Person{
	public String name;
	public void speak() {System.out.println("speak");}
	public void eat() {System.out.println("eat");}
	public void walk() {System.out.println("walk");}
	public void sleep() {System.out.println("sleep");}
}
class Student extends Person{
	public void Study() {System.out.println("study");}
}

class StudentWorker extends Student{
	public void work() {System.out.println("work");}
}

class Researcher extends Student{
	public void reser() {System.out.println("�����ϱ�!");}
}

class ProFessor extends Researcher{
	public void teacher() {System.out.println("����ġ��");}
}



public class InheritanceTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "�ֱ���";
		System.out.println(p.name);
		Student s = new Student();
		s.name = "�ֱ���";
		System.out.println(s.name);
		s.Study();
		s.eat();
		
		StudentWorker sw = new StudentWorker();
		sw.name = "�ֱ����ٺ�";
		sw.sleep();
		sw.sleep();
		sw.Study();
		
		ProFessor pf = new ProFessor();
		pf.name = "������";
		pf.reser();
		pf.teacher();
	}

}

