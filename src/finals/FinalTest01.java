package finals;

//final : 수정불가
class AA{
	
	//final은 선언시에 초기화가 되어야합니다.
	final int a=10;//상수로 표현할때 사용
	int b;
	
	void disp() {
		//a=100; //final : 수정불가
		System.out.println(a);
	}
	final void display() {
		System.out.println("AAA");
	}
	
}

final class Point extends AA{
	int x;
	int y;
	
	@Override
	void disp() {
		System.out.println(a);
	}
	//final은 Override(재정의) 사용 불가
	/*
	final void disp() {
		System.out.println("AAA");
	}
	*/	
}

/*
//The type Circle cannot subclass the final class Point
class Circle extends Point{
	int r;
}
*/// 클레스 상속불가

public class FinalTest01 {	
	
	public final static double PI=3.14;
	
	public static void main(String[] args) {
		
		System.out.println(FinalTest01.PI);
		Math meth;
		Integer num;
		
	}

}
