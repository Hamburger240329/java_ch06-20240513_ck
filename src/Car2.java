
public class Car2 {

	//생성자
	// 회사, 모델명, 색깔, 최고속도 모두 생성자를 통하여 초기화하도록 생성자를 작성하시오.
	// 생성자 작성후 MainClass 에서 Car2 객체를 선언하시오.
	// 생성자 오버로딩 ->매개변수가 다른 생성자 3개 선언
	
//	public Car2(String company) { // 생성자(클래스의 이름과 같은 메소드) ->생성자는 반환타입이 없음!!
//		System.out.println("회사:" + company);
//		this.company =  company;
//	}
//
//	public Car2(String model) { // 생성자(클래스의 이름과 같은 메소드) ->생성자는 반환타입이 없음!!
//		System.out.println("모델:" + model);
//		this.maxspeed =  model;
//	}
//	
//	public Car2(String color) { // 생성자(클래스의 이름과 같은 메소드) ->생성자는 반환타입이 없음!!
//		System.out.println("색깔:" + color);
//		this.color =  color;
//	}
//	
//	public Car2(int maxspeed) { // 생성자(클래스의 이름과 같은 메소드) ->생성자는 반환타입이 없음!!
//		System.out.println("속도:" + maxspeed);
//		this.maxspeed =  maxspeed;
//	}	
	
	public Car2() { // 기본 생성자 -> 매개변수 없음
	}
	
	public Car2(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	public Car2(String company, String model, String color, int maxspeed) { // 생성자(클래스의 이름과 같은 메소드) ->생성자는 반환타입이 없음!!
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;

	}
//	System.out.println("회사:" + company);
//	System.out.println("모델:" + model);
//	System.out.println("색깔:" + color);
//	System.out.println("속도:" + maxspeed);
	

//	public Car2(char tire) { // 생성자(클래스의 이름과 같은 메소드) ->생성자는 반환타입이 없음!!
//		System.out.println("생성자 호출!!");
//		System.out.println("타이어 수:" + tire);
//		this.tire = tire;  // 생성자를 통해서 인수를 입력받아서 필드값을 초기화
//		// this : 파이썬의 self 와 동일하게 전역변수로 지정해줌 - 이렇게 함으로서 지역변수와 로컬변수를 나눠
//	}
	
	String company;
	String model;
	String color;
	int maxspeed;
	Car car; // 다른 클레스로 만든 객체도 필드로 사용 가능
}





