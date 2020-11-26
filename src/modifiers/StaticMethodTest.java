package modifiers;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		//System.out.println(Student.num);
		
		//객체생성없이 클래스이름.메서드호출
		Student.setNum(10);
		System.out.println(Student.getNum());

	}

}
