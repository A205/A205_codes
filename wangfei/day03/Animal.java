package 多态1;

public abstract class Animal {
	public abstract void sleep();

}


class Tiger extends Animal{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("趴着睡......");
	}
	
}

class Monkey extends Animal{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("仰着睡.....");
	}
	
}
