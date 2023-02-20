package dayfive;

public class Child extends Person{
	public int age;
	
	public int getAge(){
		return age;
		}
	
	public void setAge(int age) {
		this.age=age;
	}
	
//default
	public Child() {
		
	}
	
//parameterized
	public Child(int age) {
		super();
		this.age = age;
	}
	
//toString
	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
