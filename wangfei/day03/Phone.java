
public class Phone {
	String name;
	String brand;
	int price;
	void Call(){
		System.out.println("打电话...");
	}
	void Sendmag(){
		System.out.println("发短信....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone=new Phone();
		phone.name="note";
		phone.brand="爆米花";
		phone.price=19;
		phone.Call();
		phone.Sendmag();
	}

}
