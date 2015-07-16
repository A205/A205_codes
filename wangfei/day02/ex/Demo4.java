package comfor;

import java.util.Scanner;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("«Î ‰»Î––∫≈£∫");
		int num=inputScanner.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			//
			for(int j=1;j<=i*2-1;j++){
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
