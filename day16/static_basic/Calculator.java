package static_basic;

import day01.SystemOut;

public class Calculator {
	
	/*
	 * 계산기 마다 색깔이나 결과겂은 다르기 때문에 일반 맴버변수가 됩니다.
	 * 반면에 계산기 마다 원주율은 동일하기 때문에 static으로 선언하는게 좋습니다.
	 */
	private int result;
	private String color;
	public static double pi = 3.14;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	//3.
	public void setResult(int result) {
		this.result = result;
	}
	public int getResult() {
		return result;
	}
	
	//result에 누적하는 add()
	public void add(int a) {
		result+=a;
	}
	
	public double areaircle(int r) {
		return pi*r*r;
	}
	public double areaRect(int side) {
		return side*side;
	}
	
	//
	
}
