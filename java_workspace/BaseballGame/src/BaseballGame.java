import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int ball = 0;
		int strike = 0;
		int random[] = new int[3];
		
		random[0] = (int)(Math.random()*10 +1);
		random[1] = (int)(Math.random()*10 +1);
		random[2] = (int)(Math.random()*10 +1);
		
		while(random[0] == random[1]) {
			random[1] = (int)(Math.random()*10 +1);
		}
		
		while(random[0] == random[2] || random[1] == random[2]) {
			random[2] = (int)(Math.random()*10 +1);
		}
		
		
		System.out.print(random[0]+" ");
		System.out.print(random[1]+" ");
		System.out.println(random[2]);
		
		
		int answer0 = sc.nextInt();
		int answer1 = sc.nextInt();
		int answer2 = sc.nextInt();
		
	    if(answer0 == random[0]) strike++;
	    if(answer0 == random[1]) ball++;
	    if(answer0 == random[2]) ball++;
	    if(answer1 == random[0]) ball++;
	    if(answer1 == random[1]) strike++;
	    if(answer1 == random[2]) ball++;
	    if(answer2 == random[0]) ball++;
	    if(answer2 == random[1]) ball++;
	    if(answer2 == random[2]) strike++;
		
	    System.out.println(strike + "스트라이크");
	    System.out.println(ball + "볼 입니다.");
	    
	    
		
		
	}

}
