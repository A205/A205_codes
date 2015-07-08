
public class Fruit {
	String name;
	int price;
	String addr;
	Fruit(){}
	Fruit(String a,int b,String c){
		name=a;
		price=b;
		addr=c;
	}
	public static void main(String[] args) {
		Fruit apple=new Fruit("Apple",5,"É½¶«");
		System.out.println(apple.name+"\n"+apple.price+"\n"+apple.addr);
	}

}
