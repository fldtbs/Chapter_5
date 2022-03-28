
public class Student extends Person {
	
	int a, b;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Student(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}



	public void setStudent() {
		
		age = 30;
		name = "홍길동";
		height = 170;
//		weight = 80;//슈퍼클래스에서 private 선언되어 있어 접근 불가능
		setWeight(80);
		
		Person p = new Person();
		p.age = 30;
		p.setWeight(80);
	}

}
