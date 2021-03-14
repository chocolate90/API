package api.lang.obj;

public class Person implements Cloneable {

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

	// equals() 오버라이딩 -> 객체의 이름이 같으면 true반환 
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			
			Person p = (Person)obj; // Person 캐스팅
			
			String name = p.getName();
			
			if(name.equals(this.name)) {
				return true;
			}
		}
		
		return false; // 이름이 같지 않다.
	}
	
	// toString() 오버라이딩

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + "객체가 소멸됨");
		super.finalize();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	
	
	
	
	
	
	
}
