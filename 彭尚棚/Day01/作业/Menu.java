package pm1;

import java.util.Scanner;

public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ѡ��1-3����");
         Scanner scanner=new Scanner(System.in);
         int sel=scanner.nextInt();
         System.out.println("��������ǣ�"+sel); 
         switch(sel)
         {
         case 1:System.out.println("����һ��ѧ��");break;
         case 2:System.out.println("��ʾ����ѧ��");break;
         case 3:System.out.println(" �˳�����");break;
         default: System.out.println("�������");
         }
	}

}
