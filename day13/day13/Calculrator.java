package day13;

public class Calculrator {
	int result=1;
	double pi=3.14;
	
	int multi(int a) {
		result *=a;
		return result;
	}
	int div(int a) {
		result /=a;
		return result;
	}
	double circle(int a){
		return (a/2)*(a/2)*pi;
	}
}
