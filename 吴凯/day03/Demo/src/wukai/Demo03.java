package wukai;

public class Demo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caculator c1=new caculator();
		caculator c2=new caculator();
		c1.a();
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println("------------------");
		System.out.println(c2.num1);
		System.out.println(c2.num2);
	}

}
class caculator{
	static int num1=1;
	int num2=2;
	
	void a(){
		num1=9;
		num2=10;
	}
	
}
