package 多态2;

public abstract class Fruit {
	
}

class Mango extends Fruit{
	public String toString(){
		return "芒果";
	}
}

class Apple extends Fruit{
	public String toString(){
		return "苹果";
	}
}

class Juicer{
	public void juice(Fruit fruit){
		System.out.println("榨"+fruit+"汁");
	}
	public static void main(String[] args) {
		Juicer juicer=new Juicer();
		Fruit f=new Mango();
		juicer.juice(f);
		
	}
}