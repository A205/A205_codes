package 多态;

class juicer{
	public void juice(Fruit1 fruit){
		System.out.println("榨"+fruit+"汁");
	}
	public static void main(String[] args) {
		juicer j=new juicer();
		
		Fruit1 fruit = new Mango();
		
		j.juice(fruit);
	}
}
