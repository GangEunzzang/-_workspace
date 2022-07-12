public class Nested {

	public static void main(String[] args) {
		
		int sum = 0;
		
		
		for(int i = 1; i<=9; i++) {
				for(int j = 1; j<=9; j++) {
					sum = i * j;
					System.out.print(i + "*" + j + "="  + sum + "\t");
			}
				System.out.println();
		}	
	}
}