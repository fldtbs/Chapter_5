package inherit;

public class Point1 {
	private int x, y;
	
	public Point1() {
		
		this.x = 0;
		this.y = 0;
	}

	public Point1(int x, int y) {
		
		this.x = x;
		this.y = y;
	}



	public void set(int x, int y) {  // setter 메서드
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")"); //(x,y) 출력
	}

}
