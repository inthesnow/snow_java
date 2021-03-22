package Quiz02;

public class Student {
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String sName, int sNo, int sKor, int sEng, int sMath) {
		name = sName;
		no = sNo;
		kor = sKor;
		eng = sEng;
		math = sMath;
	}
	double getTotal() {
		return kor+eng+math;
	}
	double getAvg() {
		return (int)(getTotal()/3 *100)/100.0;
	}
}
