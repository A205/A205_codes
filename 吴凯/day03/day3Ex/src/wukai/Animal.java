package wukai;

public abstract class Animal {
	public abstract void sleep(); 
}
//���󷽷�

class Tiger extends Animal{
	public void sleep(){
		System.out.println("ſ��˯....");
	}
}
class Monkeys extends Animal{
	public void sleep(){
		System.out.println("����˯");
	}
}

