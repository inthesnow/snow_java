package group_quiz;

public class Dropship extends Unit {
	
	public static final String Name = "드랍쉽";
	//유닛을 저장할 수 있는 8칸 배열을 생성, index변수도 선언.
	public int index;
	public Unit[] arrRide = new Unit[8];
	public Dropship() {
		super(0, 2, 150, Name);
	}
	/*
	 * hold()의 기능
	 * 마린의 현제 위치를 출력, stop메서트 출력
	 */
	@Override
	public void hold() {		
		String z = "("+this.x+","+this.y+")";
		System.out.println("현재 드라그쉽의 위치 : " +z);
		stop();
	}
	/*
	 * move()의 기능
	 * 1. 현제의 좌표값에서 매개변수의 좌표만큼 이동한 거리를 구합니다.
	 *  공식 피타고라스, 루트- math.sqrt(값)
	 * 2. 현제 좌표값을 매개변수의 좌표값으로 변경.
	 * 3. 이동한 거리를 상수형으로 출력.
	 * 4. 수송선이 움직이면 안에 있는 유닛의 위치를 전부 드랍쉽의 위치로 변경
	 */
	@Override
	public void move(int x, int y) {
		int x2 = (x-this.x)*(x-this.x);
		int y2 = (y-this.y)*(y-this.y);
		int root =  (int)Math.sqrt(x2+y2);
		this.x=x;
		this.y=y;
		for(Unit i:arrRide) {
			if(i!=null) {
				i.inMove(x, y);
			}
		}
		System.out.println("이동한 거리는 : "+root);
	}
	
	public void inMove(int x, int y) {
		this.x=x;
		this.y=y;
	}
	/*
	 * 3, 드랍쉽만의 특별한 기능 ride()
	 * 	배열의 크기는 8고정, 수송선안에는 탱크와 마린이 탈수있다.
	 *  마린은 1칸 탱크는 4칸의 공간을 차지
	 *  
	 *  배열에 윳닛이 탈 수 있으면 ㅐㅁ개변수로 받은 유닛을 배열에 저장.
	 *  (단, 탱크는 배열에 타면 4칸 처리)
	 *  배열이 전부 차거나, 탈수 있는 공간이 없으면 "수송선의 공간이 부족" 출력 후 종료
	 *  
	 *  4. 수송선에 탄 유닛을 전부 가로로 출력
	 *  
	 */
	public void ride(Unit unit) {
		for (Unit i:arrRide) {
			if (i==unit) {
				System.out.println("이미 이 " + unit.name + "은 드랍쉽 안에 있습니다.");
				return;
			}
		}
		System.out.println("드랍쉽 안에 "+unit.name+"을 태웁니다");
		if (unit instanceof Marine) {
			if (index + 1 < 8) {
				arrRide[index] = unit;
				index++;
			} else {
				System.out.println("수송 공간 부족으로 탑승에 실패!");
			}
		} else if (unit instanceof Tank) {
			if (index + 4 < 8) {
				arrRide[index] = unit;
				index += 4;
			} else {
				System.out.println("수송 공간 부족으로 탑승에 실패!");
			}
		} else {
			System.out.println("잘못된 유닛 지정입니다.");
		}
		dropList();
	}
	private void dropList() {
		System.out.println("----드랍쉽 안 유닛----");
		System.out.print("[");
		
		for(int i = 0; i<arrRide.length;i++) {
			if(arrRide[i]!=null) {
				System.out.print(arrRide[i].name);
			}
			if(arrRide[i+1]!=null)
				System.out.print(",  ");
			if( i == index -1) break; 
		} 
		System.out.println("]");
		System.out.println("------------------");
	}
	
	//여기서부터는 심심해서 만든거
	public void drop() {
		for(int i=0; i<arrRide.length;i++) {
		arrRide[i]=null;
		}
		System.out.println("드랍십의 모든 병력이 내립니다.");
		dropList();
	}
	
}
