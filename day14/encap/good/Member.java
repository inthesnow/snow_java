package encap.good;

public class Member {
	private String pw;
	private String name;
	private char gender;
	private int birth;
	private int number;
	private String addr;
	private String zipNum;
	private String id;

	//기본성생자 ctrl + shift > enter
	public Member() {
	}
	//변수를 가지는 생성자 
	//alt+shift+s or source텝 > generate constructor using fields
	public Member(String pw, String name, char gender, int birth, int number, String addr, String zipNum, String id) {
		super();
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.number = number;
		this.addr = addr;
		this.zipNum = zipNum;
		this.id = id;
	}

	//getter, setter빨리 생성하는 방법
	//alt+shift+s or source텝 > generate getter/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getZipNum() {
		return zipNum;
	}
	public void setZipNum(String zipNum) {
		this.zipNum = zipNum;
	}
}
