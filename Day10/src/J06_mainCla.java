
import javax.swing.JOptionPane;

import pck02.J06_TestCla02;
//	=> import로 명시한 클래스는 이후로는 경로를 입력하지 않아도 좋다.

public class J06_mainCla {
	public static void main(String[] args) {
		pck01.J06_TestCla tCla = new pck01.J06_TestCla();
//		=> 다른 패키지에 있는 클래스를 이용하는 경우에는 접근이 안되기 때문에
//		에러가 발생한다.
//		=> 따라서, 위와 같이 패키지 경로가 명시된 클래스 전체 이름을 명시해야
//		하는데, 형식은 패키지명.클래스명과 같다.
//		javax.swing.JOptionPane
//		=> 경로가 명시된 클래스 전체 이름을 사용하는 것이 번거로우므로, 
//		import 기능을 이용하여 해당 클래스의 경로를 선언한다.
//		=> import는 일반적으로 소스코드 상단에서 명시한다.
		
//		import된 다른 패키지의 클래스 이용하기
		J06_TestCla02 tt = new J06_TestCla02();
		
//		JOptionPane
//		=> 자동완성 기능으로 import를 실시했던 대상임
	}
}
