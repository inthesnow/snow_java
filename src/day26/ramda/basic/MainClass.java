package day26.ramda.basic;import day01.SystemOut;

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person();
		p.greeting(new Say01() {
			
			@Override
			public void talking() {
			System.out.println("hello");	
			}
		});
		p.greeting(() -> System.out.println("hello"));
		
		p.greeting(new Say02() {
			
			@Override
			public String talking() {
				// TODO Auto-generated method stub
				return "saaaaaaaaaaaaaay";
						
			}
		});
		p.greeting( () -> {return "saaaaaaaaaaaaay";} );
		
		p.greeting(new Say03() {
			
			@Override
			public String talking(String word) {
				
				return "nice to meet you!";
			}
		});
		
		p.greeting((word) -> word + "nice to meet you");

		String r = p.greeting(new Say04() {
			
			@Override
			public String taling(String word, int i) {
				String result = "";
				for(int j =0; j<i;j++) {
					result += word;
				}
				return result;
			}
		});
		System.out.println(r);
		r = p.greeting((word, i) -> {
			String result = "";
			for(int j=0; j<i;j++) {
				result += word;
			}
			return result;
		});
		System.out.println(r);
	}
}
