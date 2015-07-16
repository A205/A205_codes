package Homework;

public class test {
	 public static void main(String[] args) {
		  Army a = new Army(3);
		  a.addWeapon(new Tank());
		  a.addWeapon(new Flighter());
		  a.addWeapon(new Warship());
		  a.attackAll();
		  a.moveAll();
		 }
}
