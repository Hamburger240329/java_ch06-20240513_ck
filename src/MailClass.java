
public class MailClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		Calculator cal1 = new Calculator();
		// Calculator 클래스로 new 연산자를 사용하여 call 객체를 생성
		// Calculator cal2 new Calculator();
		
		a = cal1.add(100, 200);
		
		double b = cal1.divid(10,3);
		System.out.println(b);
		
		System.out.println(a);
		
		cal1.pow(10);//100
		
//		int b = call.pow(10);//100
//		System.out.println(b);

		Car car = new Car(4); // Car 클래스로 car 라는 객체를 선언
		
		System.out.println(car.company);
		car.speed = 150;
		
		System.out.println(car.speed); // 초기값을 안넣었지만 자동으로 0으로 초기화가 되어있음
				
		System.out.println(car.price[0]);
		
//		Car car2 = new Car(2);
		
//		Car2 car2 = new Car2(400);
		
//		Car2 carCompany = new Car2("현대");
//		Car2 carMaxspeed = new Car2(200);
		
		Car2 Car3 = new Car2("기아자동차", "K5", "회색", 200);
		
		System.out.println(Car3.model);
		
		Car2 Car4 = new Car2("기아자동차", "K5", "회색");
		
		Car2 Car5 = new Car2();
		
		Test test = new Test();
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		test.sum2(car);
		
		System.out.println();
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
//		MemberService memberService1 = new MemberService(
		
		
		
		
	}

}
