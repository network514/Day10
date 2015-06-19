
public class J04_mainCla {
	public static void main(String[] args) {
		J04_staticData s = new J04_staticData();
		s.msg = "s가 저장한 메시지";
		System.out.println("s.msg : " + s.msg);
		J04_staticData p = new J04_staticData();
		System.out.println("p.msg : " + p.msg);
		p.msg = "p가 저장한 메세지";
		System.out.println("p.msg : " + p.msg);
		System.out.println("s.msg : " + s.msg);
		
//		=> static이 명시된 멤버변수 및 메서드는 독립적인 영역에 저장되는데, 
//		객체가 만들어질 때에는 객체 안에 존재하지 않는다.
//		=> 각 객체가 static멤버 변수 및 메서드를 이용할 때에는 독립적으로 존재하는 
//		하나의 대상을 서로 접근하기 때문에 "static은 공유되는 특성이 있다."라고 말한다.
	}
}
