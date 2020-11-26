package modifiers;

//1.public
//2.package(default): 생략
//3.private
//4.protected

class Car{
	public String name;
	int speed;
	private int price;  //같은글레스 공간까지만 접근허용, 외부클래스 접근불가
	protected String oil;//package + 상속(protected)
}
class Point{
	public static int x;  //static 공유
	int y;
	
	public Point() {
		System.out.println("생성자가 호출되었습니다.");
	}
	static {
		x=100;
		System.out.println("static초기화 실행되었습니다.");
	}
}


public class ModiierTest01 {

	public static void main(String[] args) {
		
		Car car1=new Car(); //객체생성
		car1.name="내자동차";
		car1.speed=300;
		//car1.price=100000000;
		car1.oil="desel";
		System.out.println(car1.name);
		
		//Point pos=new Point();
		//pos.x=10;
		
		Point.x=100;
		System.out.println(Point.x);
		
		

	}

}
