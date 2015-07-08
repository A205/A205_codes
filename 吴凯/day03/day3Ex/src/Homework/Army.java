package Homework;


class Army {
	Weapon []w=null;
	int size=0;
	Army(){
		
	}
	public Army(int i){
		w = new Weapon[i];
	}
	public void addWeapon(Weapon wa){
		if(size>=w.length){
			System.out.println("enough");
		}
		else{
			w[size]=wa;
			size++;
		}
	}
	public void attackAll(){
		for(Weapon weapon:w){
			if(weapon!=null){
				weapon.attack();
			}
		}
	}
	public void moveAll(){
		for(Weapon weapon:w){
			if(weapon!=null){
				weapon.move();
			}
		}
	}
}
