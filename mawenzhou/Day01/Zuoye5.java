import java.util.Scanner;


public class Zuoye5 {
	public static void main(String[] args){
		System.out.println("����1��3����һ������");
		Scanner scanner=new Scanner(System.in);
		int shuzi=scanner.nextInt();
		switch(shuzi)
		{
		case 1:System.out.println("����һ��ѧ��");break;
		case 2:System.out.println("��ʾ����ѧ��");break;
		case 3:System.out.println("�˳�����");break;
		}
	}

}