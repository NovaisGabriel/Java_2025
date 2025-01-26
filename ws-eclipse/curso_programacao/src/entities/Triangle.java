package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	public double semiperimeter() {
		return (a+b+c)/2;
	};
	
	public double area() {
		double p = semiperimeter();
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	};
}


