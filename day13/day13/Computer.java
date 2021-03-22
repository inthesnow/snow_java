package day13;

public class Computer extends Calculrator {
	
	double circle(int a) {
		return (a*a/4)*Math.PI;
	}
	
	double rect(double a) {
		return a*a;
	}
	double rect(double a, double b) {
		return a*b;
	}
	double rect(double a,double b,double c) {
		return a*b*c;
	}
}
