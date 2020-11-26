package day1126;
 
public class Test {
	
	//1.맴버필드
	int a;
	int b;
	
	//2.메서드
	void disp() {
		
	}
	
	
	//3.생성자
	//생성자으를 면시하면 생략되어있는 생성자는 무시된다.
	public Test(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	//생성자를 명시하면 기본생성자를 사용하기위해서는 표현해주어야한다.
	public Test() {
		
	}
	
	
	//4.이너클레스
	class Inner {
		int x;
		int y;
	}
	
	
}
