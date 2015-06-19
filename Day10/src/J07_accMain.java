
import data.*;
//	=> data 패키지 안에 있는 모든 클래스를 이용하기 위해 경로를 설정한 의미

public class J07_accMain {
	public static void main(String[] args) {
		J07_publicCla pCla = new J07_publicCla();
//		=> 1. public 클래스는 정상적으로 이용 가능.
		
//		System.out.println(pCla.msg); // 에러
//		=> 디폴트 상태의 변수 msg는 외부에서 접근 불가능하다.
//		=> public 상태의 변수가 되어야 접근이 가능해진다.
		
//		J07_defaultCla dCla = new J07_defaultCla(); //에러
//		=> 클래스와 마찬가지로 public이 없는 상태면 외부에서 접근이 불가능하다.
	}
}
