package labExc4;

public class Person {
	private int age;
	private String name;
	public Person(String name,int age) {
		super();
		this.name = name;
		this.age = age;

	}
	public Person() {
		super();
	}
     public String getName() {
    	 return name;
     }
     public void setName(String name) {
    	 this.name = name;
     }
     public int getAge() {
    	 return age;
    }
     public void setAge(int age) {
    	 this.age = age;
     }
     @Override
     public String toString() {
    	 return "Person [name ="+name+".age ="+age+ "]";
     }
     }
