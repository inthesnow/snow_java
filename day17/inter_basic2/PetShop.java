package inter_basic2;

public class PetShop {
	/*
	 * 1. carePet() 메서드선언
	 * 매개변수는 모든 펫타입을 전달 받을 수 있도록 선언
	 * 기능 - instanceof사용해서 캐스팅하고, "xxx를 돌봅니다"출력
	 */
	
	public void carePet(IPet pet) {
		if(pet instanceof Dog) {
			Dog dog = (Dog)pet;
			System.out.println(dog.name +"를 돌봅니다.");
		} else if (pet instanceof Cat) {
			Cat cat = (Cat)pet;
			System.out.println(cat.name +"를 돌봅니다.");
			
		} else if (pet instanceof GoldFish) {
			GoldFish gf = (GoldFish)pet;
			System.out.println(gf.name +"를 돌봅니다.");
		}
	}
	
	/*
	 * 2. petInfo()메서드 선언
	 * 매개변수는 펫배열을 받도록 선언
	 * 기능 - 모든 펫의 play메서드 실행
	 */
	
	public void petInfo(IPet[] pet) {
		for(IPet i : pet) {
			i.play();
		}
	}
	
}
