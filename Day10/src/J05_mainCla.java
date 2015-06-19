
public class J05_mainCla {
	public static void main(String[] args) {
		J05_finalData fd = new J05_finalData();
		System.out.println(fd.msg);
		
//		fd.msg = "변경해보자"; //에러
//		=> final이므로 변경 불가
	}
}