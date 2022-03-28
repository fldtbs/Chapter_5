package inherit;

public class ColorPoint extends Point1{ //Point1 클래스를 상속 받음
	
	private String color;//점의 색
	
	
	
	public ColorPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();//point 클래스의 showPoint 메서드 호출
	}
}
