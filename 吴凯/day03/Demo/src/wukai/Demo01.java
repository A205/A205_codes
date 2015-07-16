package wukai;

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person();
		
	}

}
class Person{
	Person(){
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
}
