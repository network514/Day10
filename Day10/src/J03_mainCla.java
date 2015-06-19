
public class J03_mainCla {
	public static void main(String[] args) {
//		일반 인스턴스 변수의 이용(객체 필요)
		J03_staticCla ref = new J03_staticCla();
		ref.n1 = "객체가 있어야만 사용 가능";
		ref.mth();
		
//		static 변수의 이용(클래스, 객체 가능)
		J03_staticCla.n2 = "객체 없이 가능";
		J03_staticCla.mth2();
		J03_staticCla sCla = new J03_staticCla();
		
		sCla.n2 = "객체 있을때에도 가능";
		sCla.mth2();
	}
}
