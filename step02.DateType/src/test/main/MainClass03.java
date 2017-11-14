package test.main;
/*
 * [자바 기본 데이터 타입]
 * 2.논리형
 * -가질수없는 값의 범위 :true,false두가지 값을 가질수있다
 * -만드는방법 :true,false를 직접써주거나 비교 연산 혹은
 * 			 논리연산의 결과로 얻어낼수있다*/
public class MainClass03 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean	isRun=true; 
		if(isRun) {
			System.out.println("달려요!");
		}
		System.out.println("메인메소드가 종료됩니다.");
		boolean isGreater=10>1;
		if(isGreater) {
			System.out.println("10은 1보다커요");
			
		}
		boolean result=true||false;
		System.out.println("메인 메소드가 종료됩니다");
	}
}
