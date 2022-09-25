
public class Secant_method {

	public static double result;
	public static double fonksiyon(double x) {
		result = x*x-5*x+1;
		
		return result;
	}
	
	public static double secant(double x,double x1) {
		double xn1 = x- fonksiyon(x)*(x1-x)/(fonksiyon(x1)-fonksiyon(x));
		
		return xn1;
	}
	
	
	public static double brain(double a, double b) {
		
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
		double aa = brain(0,1);
		System.out.print(aa);
}}


