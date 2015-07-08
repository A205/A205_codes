package wukai;

public abstract class Animal {
	public abstract void sleep(); 
}
//抽象方法

class Tiger extends Animal{
	public void sleep(){
		System.out.println("趴着睡....");
	}
}
class Monkeys extends Animal{
	public void sleep(){
		System.out.println("仰着睡");
	}
}

