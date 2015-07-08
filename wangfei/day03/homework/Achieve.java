package home;

public class Achieve {
	public static void main(String[] args) {
		Army army=new Army();
		int summ;
		summ=army.getSum();
		for (int i=1;i<summ;i++){
			if(i%2==0){
				army.addWeapon(new Tank());}
			else if(i%3==0){
				army.addWeapon(new Flighter());
			}
			else {
				army.addWeapon(new WarShip());
			}
		}
		army.attackAll();
		army.moveAll();
		
	}

}
