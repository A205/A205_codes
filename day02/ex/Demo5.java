package comfor;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		//int n=100;
		//��ȡ�к�num
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		//������ո�
		for(int i=1;i<=num;i++){
			for(int k=1;k<num-i+1;k++){
			System.out.print(" ");
			}
			//�������
			for(int j=1;j<=2*i-1;j++){
			System.out.print(i);
			}
			System.out.println();
		}

	}

}
