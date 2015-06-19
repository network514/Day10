
public class J03_staticCla {
	String n1; // 일반 멤버 변수, 인스턴스 멤버 변수
	
	void mth(){ // 일반 메소드, 인스턴스 메소드
		mth2(); // static 메소드 호출 가능
	}
//	=> 객체가 생성되야만, 존재하게 되는 변수와 메서드이기 때문에
//	인스턴스 변수, 인스턴스 메소드라 불린다.
	
	static String n2; // 클래스 변수, static 변수라 부른다.
	
//	클래스 메소드, static 메소드라 부른다.
	static void mth2(){
		System.out.println("static mth2 호출");
		
//		mth1(); // 에러
//		=> 생성 시점이 static 멤버인 mth2()가 객체 멤버인 mth1() 보다 빠르기 때문에 
//		mth1()은 호출할 수 없다.
	}
//	static 멤버들은 객체를 생성하지 않고도 클래스를 정의하기만 하면, 
//	준비되기 때문에 바로 사용 가능하다.
	
}
