package quiz24;

public class Product {
	//  날짜, 지점, 등급, 상세, 가격 
	private int day;
	private String store;
	private String grade;
	private String detail;
	private int price;

	public Product() {
		
	}
	public Product(int day, String store, String grade, String detail, int price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = grade;
		this.detail = detail;
		this.price = price;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
