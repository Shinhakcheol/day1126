package modifiers;

public class Student {
	private static int num=1000;
	public int a;
	
	public static void setNum(int num) {
		Student.num=num;
		//a=10;//static 메서드 내부에서는 non-static 맴버사용불가
	}
	
	public static int getNum() {
		
		return num;
	}

}
