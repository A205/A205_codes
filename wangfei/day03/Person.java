
public class Person {
	String name;
	int age;
	String address;
	//无参
	void introudce(){
		System.out.println("大家好，我叫"+name+",今年"+age+"岁,来自"+address);
	}
	//有参
	void introudce(String a,int b,String c){
		name=a;
		age=b;
		address=c;
	}
	public static void main(String[] args) {
		Person a=new Person();
		a.name="大王";
		a.age=20;
		a.address="天堂";
		a.introudce();
		a.introudce("大王",20,"天堂");
		System.out.println(a.name+"\n"+a.age+"\n"+a.address);
	}

}
