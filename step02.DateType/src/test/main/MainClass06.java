package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//참조 데이터 type을 담을소 있는 빈변수 만들기
		String myName=null;//null 을 대입하면 된다.
		boolean isRun=false;
		if(isRun) {
			myName="김구라";
		}
		//변수에 담긴 값이null인지 아닌지에따라
		//산택적인 동작을 해야하는 경우가 있다. 
		if(myName==null) {
			System.out.println("myName이 null이네");
		}
		System.out.println("메인 메소드가 종료됩니다");
	}
}
