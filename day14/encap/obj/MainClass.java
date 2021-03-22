package encap.obj;

public class MainClass {
	public static void main(String[] args) {
		//Hotel 안에 있는 Employee의 working() 실행
		Hotel h = new Hotel();
		//1
		Employee e = h.getEmp();
		e.working();
		//2
		h.getEmp().working();
		
		//hotel안에 있는 chef를 새로운 chef로 변경
		//1
		Chef c = new Chef();
		h.setChef(c);
		//2
		h.setChef(new Chef());
	
	}
}
