
public class Calculator {
	public Calculator() { // 기본생성자 생략
	}
	
	// 속성 or 필드
	int firstNum;
	int secondNum;
	
	
	// 메소드
	// def add(firstNum, secondNum):
	// return firstNum + secondNum
	// add(10,20) -> 30
	
	public int add(int first, int second) {
		return first + second;
	}
	
	public int sub(int first, int second) {
		return first - second;
	}
	
	public int mul(int first, int second) {
		return first * second;
	}
	
	
	public double divid(double first, int second) {
		return first / second;
	}
	// 메인 함수가 없는 클래스는 단독 으로 실행 할 수 없음 - 설계도만 만들어둔 상태
	
	//제곱 연산
	
	public int pow(int number) {
		return number * number;
	}
	
	public int pow(int number, int number2) { // 메소드 오버로딩
		return number * number2;
	}
}
