
public class Phone {
	String name;
	String brand;
	int price;
	void Call(){
		System.out.println("��绰...");
	}
	void Sendmag(){
		System.out.println("������....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone=new Phone();
		phone.name="note";
		phone.brand="���׻�";
		phone.price=19;
		phone.Call();
		phone.Sendmag();
	}

}
