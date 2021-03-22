package inter_basic2;

public class MainClass {
	public static void main(String[] args) {
			
	Animal d = new Dog();
	Animal c = new Cat();
	Animal t = new Tiger();
	
	//1. Animal[]을 생성하고 저장, 향상된 포문으로 동물의 기능을 출력하세요.
	Animal[] a = {d, c, t};
	
	for(Animal i: a) {
		i.eat();
	}
	
	
	//2. IPet[]을 생성 후 (강아지, 고양이, 금붕어)를 저장, 향상된 포문으로 펫의 기능 출력
	IPet[] pet = new IPet[3];
	pet[0]=(IPet)d;
	pet[1]=(IPet)c;
	pet[2]=new GoldFish();
			
	for(IPet i : pet) {
		i.play();
	}
	
	PetShop ps= new PetShop();
	ps.carePet((IPet)d);
	ps.carePet(new Cat());
	ps.carePet(pet[2]);
	
	ps.petInfo(pet);
	
	}
}
