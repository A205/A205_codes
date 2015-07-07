package pm1;

import java.util.Scanner;

public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入选择（1-3）：");
         Scanner scanner=new Scanner(System.in);
         int sel=scanner.nextInt();
         System.out.println("你的输入是："+sel); 
         switch(sel)
         {
         case 1:System.out.println("增加一个学生");break;
         case 2:System.out.println("显示所有学生");break;
         case 3:System.out.println(" 退出程序");break;
         default: System.out.println("输入错误");
         }
	}

}
