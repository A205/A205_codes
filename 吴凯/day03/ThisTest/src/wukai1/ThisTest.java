package wukai1;

public class ThisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person("jim",20,"USA");
		person.introduce();
	}

}
class Person{
	String name;
	int age;
	String city;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name,int age,String city){
		this(name,age);
		this.city=city;
	}
    void hello(){
		System.out.println("hello....");
	}
	void introduce(){
		System.out.println(this.name+"\t"+this.age+"\t"+this.city);
		this.hello();
	}
}
