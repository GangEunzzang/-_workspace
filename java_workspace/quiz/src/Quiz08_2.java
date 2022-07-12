interface Point2{
	public void set(int x, int y);
	public void showPoint();
}

class ColorColor implements Point2{
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
	
	public void color(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.print(color);
		showPoint();
	}
}	
	
public class Quiz08_2{	
	public static void main(String[] args) {
		ColorColor a = new ColorColor();
		a.set(1, 2);
		a.showPoint();		
		a.color("blue");
		a.showColor();
	}		
}

