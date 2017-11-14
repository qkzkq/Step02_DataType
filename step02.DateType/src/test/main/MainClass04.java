package test.main;

public class MainClass04 {
	/*
	 *[자바 기본 데이터 타입]
	 *3 문자형(char)
	 *-65536가지의 코드값을 가질수있어서 전세계에서 사용하는 문자
	 *한글자를 표현할수있다 
	 */
	public static void main(String[] args) {
		//char 형 변수 선은과동시에 값 대입하기
		char ch1='a';
		char ch2='1';
		char ch3='@';
		char ch4='가';
		char ch5='쀍';
		
		//내부적으로 정수code값으로 처리한다
		int code1=ch1;//자동 casting되어서 담긴다
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		
	}
}
