//public class Student {
//	
//	String name;
//	int korea = 0, 
//		english =0, 
//		math =0;	
//	public double getAvg() {
//		return (korea + english + math) /3 ;
//	
//		
public class Student {
			
			String name;
			int korea = 0, 
				english =0, 
				math =0;	
			public double getAvg() {
				return (korea + english + math) /3 ;
					
		
	}
	
	public static void main(String[] args) {
		
		Student lge = new Student();
		
		lge.name ="�̰���";
		lge.korea = 100;
		lge.english = 58;
		lge.math = 35;
		
		System.out.println(lge.name + "�л�\n���� :" + lge.korea +"\n"+ "���� :" + 
		lge.english +"\n"+ "���� :" + lge.math);
	}
}
