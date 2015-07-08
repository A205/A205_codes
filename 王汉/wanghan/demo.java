package wanghan;

import java.util.Scanner;

interface Assaultable{
public void attack() ;
}
interface Mobile{
public void move();
}
 abstract class weapon implements Assaultable,Mobile{
	}
  class Tank extends weapon{
	  public void attack() {
		System.out.println("attack");
	}
	 public void move() {
		System.out.println("move");
	}
 }
  class Flighter extends weapon{
	  public void attack() {
		System.out.println("attack twice");
	}
	 public void move() {
		System.out.println("move twice");
	}
 }
  class Warship extends weapon{
	  public void attack() {
		System.out.println("attack again");
	}
	 public void move() {
		System.out.println("move again");
	}
 }
 class Army{
	 public weapon[]w=null;
	 public int i=0;
	 public Army(int i){
		 w=new weapon[i];
	 }
	 public void addweapon(weapon we){
		 if (i>=w.length) {
			System.out.println("wuqizugou");
			return;
		}else {
			w[i]=we;
			i++;
		}
	 }
	 public void attackall(){
		 for (weapon we:w) {
			 if (we!=null) {
				we.attack();
			}
			
		}
	 }
	 public void moveAll(){
		 for(weapon we:w){
			 if (we!=null) {
				we.move();
			}
		 }
	 }
 }
public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a=new Army(3);
		a.addweapon(new Tank());
		a.addweapon(new Flighter());
		a.addweapon(new Warship());
		a.attackall();
		a.moveAll();
		

	}

}
