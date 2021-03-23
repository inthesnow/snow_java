package day26.ramda.basic;

public class Person {
	public void greeting(Say01 say) {
		say.talking();
	}
	
	public void greeting(Say02 say) {
		String word = say.talking();
		System.out.println(word);
	}
	
	public void greeting(Say03 say) {
		String word = say.talking("hi");
		System.out.println(word);
	}
	
	public String greeting(Say04 say) {
		String result = say.taling("hi", 3);
		return result;
	}
}
