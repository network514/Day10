import javax.swing.JOptionPane;


public class J01_Overloading_main {
	public static void main(String[] args) {
//		문제 : 수학 관련 클래스 작성
//		1. 다음 두 개의 데이터에 대하여 큰 수를 제공하는 오버로딩 메소드 작성 
//		- int, double
//		2. 다음 두 개의 데이터에 대하여 두 수의 합을 제공하는 오버로딩 메소드 작성
//		-int, float

		J01_MyMath math = new J01_MyMath();
		
		System.out.println(math.max(100, 20.3));
	}
}
