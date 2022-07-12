public class quiz_04_5 {

	public static void main(String[] args) {
		
		for(int i =1; i<6; i++) {
			
			for(int j=0; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
