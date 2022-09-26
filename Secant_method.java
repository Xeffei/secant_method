
public class Secant_method {

	public static double result;
	public static double fonksiyon(double x) {
		result = x*x-5*x+1; // it was my function write here your own.
		return result;
	}
	
	public static double secant(double x,double x1) {
		
		double xn1 = x- fonksiyon(x)*(x1-x)/(fonksiyon(x1)-fonksiyon(x));
		
		return xn1;
	}
	
	
	public static double motorFunction(double a, double b) {
		
		double result = secant(a,b);
		
		while(true) {
			if(Math.abs(fonksiyon(result)-fonksiyon(a))<0.001||Math.abs(fonksiyon(result-fonksiyon(b)))<0.001) {
				
				return result;
			
			
			}
			else {
				System.out.print(result);
				secant(b,result);
			}
		}
	}
	
	public static void main(String[] args) {
		double mainResult = motorFunction(0,1);  // 0 and 1 is default values.
		System.out.print(mainResult);
	}
}


