package Quiz04;

public class DmbPhone extends Phone {
	//부모클래스는 수정하지 않습니다.
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	int channel;
	
	public DmbPhone(String m, String c, int cha) {
		model = m;
		color = c;
		channel = cha;
	}
	
	void info() {
		System.out.println("모델 : "+model+", 색상 : "+color+", 채널 : "+channel);
	}

	void turnOnDmb(){
		System.out.println("TV를 켭니다.");
	}
	void changeChannel(int a) {
		channel=a;
		System.out.println(channel+"번 채널로 이동합니다.");
	}
	void turnOffDmb() {
		System.out.println("TV를 끕니다.");
	}
}
