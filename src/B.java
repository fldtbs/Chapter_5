
public class B {
	public B() {
		System.out.println("생성자 B");
	}
	
	public B(int x) {
		super(x);//부모클래스의 생성자 중에 인수가 1개인 생성자를 찾아서 호출
		System.out.println("생성자 B->" + x);
	}
}
