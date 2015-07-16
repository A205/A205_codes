
package wukai1;

import java.util.Scanner;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner=new Scanner(System.in);
		System.out.println("input hanghao");
		int num=inScanner.nextInt();
		
		for(int i =1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
