package ��̬;

class juicer{
	public void juice(Fruit1 fruit){
		System.out.println("ե"+fruit+"֭");
	}
	public static void main(String[] args) {
		juicer j=new juicer();
		
		Fruit1 fruit = new Mango();
		
		j.juice(fruit);
	}
}
