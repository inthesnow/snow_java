package Quiz08;

public class User {
	private String name;
	private int rnn;
	private int age;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, int rnn, int age) {
		super();
		this.name = name;
		this.rnn = rnn;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRnn() {
		return rnn;
	}
	public void setRnn(int rnn) {
		this.rnn = rnn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void info() {
		System.out.println("이름 : "+getName());
		System.out.println("Rnn : "+getRnn());
		System.out.println("나이 : "+getAge());
	}
}