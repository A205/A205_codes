
public class Person {
	String name;
	int age;
	String address;
	//�޲�
	void introudce(){
		System.out.println("��Һã��ҽ�"+name+",����"+age+"��,����"+address);
	}
	//�в�
	void introudce(String a,int b,String c){
		name=a;
		age=b;
		address=c;
	}
	public static void main(String[] args) {
		Person a=new Person();
		a.name="����";
		a.age=20;
		a.address="����";
		a.introudce();
		a.introudce("����",20,"����");
		System.out.println(a.name+"\n"+a.age+"\n"+a.address);
	}

}
