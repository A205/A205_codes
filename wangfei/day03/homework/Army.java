package home;

import java.util.Scanner;

public class Army {
	
	
	public int numb(){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		return num;
	}
	
	int sum=numb();
	//存储sum
	public int getSum(){
		return sum;
	}
	// 武器的数组
	Weapon []w=new Weapon[sum];
	
	public void addWeapon(Weapon wa){
		int k=1;
		for(int i=1;i<=sum;i++){
			if(w[i]==null){
				w[i]=wa;
				break;
			}
			else 
				k++;
		}
		if(k==sum){
			System.out.println("error!");
		}
	}
	
	
	
	public void attackAll (){
		for(Weapon we:w){
			if(we!=null){
			we.attack();}
		}
	}
	
	public void moveAll(){
		for(Weapon we:w){
			if(we!=null){
			we.move();}
		}
	}
	
	
}
