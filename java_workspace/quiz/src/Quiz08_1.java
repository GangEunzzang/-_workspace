abstract class Point{
	abstract public void set(int x, int y);
	abstract public void showPoint();
}

public class Quiz08_1 extends Point {
	private int x,y;
	private String color;
		
	@Override
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
	public static void main(String[] args) {
		Quiz08_1 a = new Quiz08_1();
		a.set(1, 2);
		a.showPoint();	
		
		a.setColor("blue");
		a.showColorPoint();
	}		
}


