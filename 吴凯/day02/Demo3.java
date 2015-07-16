package wukai1;

import java.util.Scanner;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner=new Scanner(System.in);
		System.out.println("input hanghao");
		int num=inScanner.nextInt();
		
		for(int i =1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
	    for(int j=1;j<=2*i-1;j++){
	    	System.out.print("*");
	    }
	    System.out.println();
		}

	}

}
