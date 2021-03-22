
package group_quiz;

public class MainClass {
	public static void main(String[] args) {
		Marine m = new Marine();
		Marine m2 = new Marine();
		Tank t = new Tank();
		Tank t2 = new Tank();
		Dropship d = new Dropship();
		
		m.hold();
		m.move(3, 4);
		
		t.hold();
		t.move(3, 5);
		
		d.ride(m);
		d.ride(m);
		d.ride(t);
		d.ride(m2);
		d.ride(t2);
		
		d.hold();
		d.move(3, 6);
		
		m2.hold();
		d.drop();
	}
}
