
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
		name = "ȫ�浿";
		height = 170;
//		weight = 80;//����Ŭ�������� private ����Ǿ� �־� ���� �Ұ���
		setWeight(80);
		
		Person p = new Person();
		p.age = 30;
		p.setWeight(80);
	}

}
