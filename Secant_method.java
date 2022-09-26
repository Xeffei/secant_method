package numericalanalysis;

public class secant_method // write here your own class folder name.
	{
	
	public static double func(double a) {
		return (Math.PI*a)-(0.002)/(a*a); // write your own function here.
		
	}
	
	
	public static double secant(double x0, double x1) {
		double x2;
		while(true) {	
				x2  =   x1 - ((( func(x1) *( x0-x1 ) ) / ( func(x0)-func(x1) )));
				if(Math.abs(x2-x1)<0.00001) {break;}
					else {
						x0=x1;
						x1=x2;}}	
		return x2;}

	public static void main(String[] args) {
		System.out.print(secant(0.01, 2)); // 0.01 and 2 my default values.
}}
