
public class J01_Overloading_main {
	public static void main(String[] args) {
//		문제 : 수학 관련 클래스 작성
//		1. 다음 두 개의 데이터에 대하여 큰 수를 제공하는 오버로딩 메소드 작성 
//		- int, double
//		2. 다음 두 개의 데이터에 대하여 두 수의 합을 제공하는 오버로딩 메소드 작성
//		-int, float
	}
	
	public String max(int a, int b){
		int result = a>b ? a:b;
		return Integer.toString(result);
	}
	
	public String max(int a, double b){
		double result = a>b ? (double)a:b;
		return Double.toString(result);
	}
	public String max(double a, int b){
		double result = a>b ? a:(double)b;
		return Double.toString(result);
	}
	
	public String max(double a, double b){
		double result = a>b ? a:b;
		return Double.toString(result);
	}
	
	public String sum(int a, int b){
		return Double.toString(a+b);
	}
	
	public String sum(int a, float b){
		return Float.toString(a+b);
	}
	
	public String sum(float a, int b){
		return Float.toString(a+b);
	}
	
	public String sum(float a, float b){
		return Float.toString(a+b);
	}
}
