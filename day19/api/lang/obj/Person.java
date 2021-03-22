package api.lang.obj;

public class Person implements Cloneable{

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			if(((Person) obj).getName().equals(this.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name+"객체가 소멸됨");
		super.finalize();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return clone();
	}

	

}
