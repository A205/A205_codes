import java.util.Scanner;


public class HomeWork_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int m=0;
		int j=1;
		for(i=1;i>=0;i++){
			System.out.println("|1.����һ��ѧ��|");
			System.out.println("|2.��ʾ����ѧ��|");
			System.out.println("|3.�˳�����|");
			System.out.println("|������ѡ��");
			Scanner scanner=new Scanner(System.in);
			int choice=scanner.nextInt();
			if(choice==1){
				m++;
			}
			else if(choice==2){
				for(j=1;j<=m;j++){
					System.out.println("Student:"+j);
				}
			}
			else if(choice==3) break;
			else {
				System.out.println("ORDER_ERROR");
				break;
			}

		}

	}

}
