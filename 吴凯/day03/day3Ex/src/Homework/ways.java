package Homework;

 class Tank extends Weapon {
	public void attack(){
		System.out.println("����");
	}
	public void move(){
		System.out.println("��̹�˿�");
	}
}
 class Flighter extends Weapon {
	public void attack(){
		System.out.println("�ŵ���");
	}
	public void move(){
		System.out.println("�ɷɷ�");
	}
}
 class Warship extends Weapon {
	public void attack(){
		System.out.println("��ˮ��");
	}
	public void move(){
		System.out.println("������");
	}
}