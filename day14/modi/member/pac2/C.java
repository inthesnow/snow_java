package modi.member.pac2;

import modi.cls.pac1.*;
import modi.member.pac1.A;

public class C {
	public C() {
		A a = new A();
		a.var1 =1;
		//a.var2 = 2; //default
		//a.var3 = 3; //private
		
		a.method01();
		//a.method02(); //default
		//a.method03(); //private
	}
}
