
public class J01_MyMath {
	
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
