package Quiz11;

public class MyCart {
	
	//1. 모든 맴버변수와 메서드에 적절한 접근제어자를 선언하세요.
	private int money;//카트총액
	private Product[] cart = new Product[1];//상품배열
	private int index = 0;//상품 인덱스
	private int balance;
	//2. MyCart생성자는 balance만 받아서 초기화.
	MyCart(int balance){
		this.balance=balance;
	}
	/* 
	*3. buy()는 모든상품을 받도록 선언
	*
	* 가진돈과 전달된 물건의 가격을 비교해서 가진돈이 적으면 "금액부족"을 출력 후 종료
	* 가진돈이 충분하면 물건의 가격을 money에서 빼고 add(상품) 메서드를 호출
	*/
	public void buy(Product[] product) { 
		for (Product i : product) {
			money+=i.price;
		}
		if (this.balance < money) {
			System.out.println("금액부족");
		} else {
			for (Product i : product) {
				add(i);
			}
			info();
		}
	}
	/*
	 * 4. add()는 모든 상품을 받도록 선언
	 * 만약 index의 값이 cart의 크기보다 같거나 크다면
	 * 기존의 장바구니 보다 크기가 *2배 큰 배열을 생성,
	 * 
	 * 기존 장바구니에 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * info() 메서드를 호출합니다.
	 */
	private void add(Product p) {
		if(index >= cart.length) {
			Product[] addCart=new Product[cart.length*2];
			for(int i=0;i<cart.length;i++ ) {
					addCart[i] = cart[i];					
			}
			cart=addCart;
		}
		cart[index] = p;
		index++;
	}
	
	/*
	 * 5. info()
	 * 장바구니 안에 담긴 물건의 이름을 출력.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력.
	 * 남은 금액 출력.
	 * 
	 * main buy()만 호출.
	 */
	private void info() {
		System.out.println("나의 장바구니 목록은-------------");
		for(Product i:cart) {
			if(i==null) {	
				break;
			}
			i.info();
		}
		System.out.println("카트 총액 : " +money);
	}
}
