package inherit;

public class ColorPoint extends Point1{ //Point1 Ŭ������ ��� ����
	
	private String color;//���� ��
	
	
	
	public ColorPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();//point Ŭ������ showPoint �޼��� ȣ��
	}
}
