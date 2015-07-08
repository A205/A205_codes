package wukai1;

public class Fruit {
	String name;
	int price;
	String add;
	Fruit(String a,int b,String c){
		name=a;
		price=b;
		add=c;
	}
	
	void getName(){
		System.out.println(name);
	}
	
	void getPrice(){
		System.out.println(price);
	}
	
	void getAdd(){
		System.out.println(add);
	}
	public static void main(String[] args) {
		Fruit x=new Fruit("apple",5,"HF");
		x.getName();
	}

}
