package Homework;

 class Tank extends Weapon {
	public void attack(){
		System.out.println("放炮");
	}
	public void move(){
		System.out.println("开坦克咯");
	}
}
 class Flighter extends Weapon {
	public void attack(){
		System.out.println("放导弹");
	}
	public void move(){
		System.out.println("飞飞飞");
	}
}
 class Warship extends Weapon {
	public void attack(){
		System.out.println("放水炮");
	}
	public void move(){
		System.out.println("开船咯");
	}
}