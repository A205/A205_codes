import java.util.Scanner;


public class Zuoye5 {
	public static void main(String[] args){
		System.out.println("输入1到3任意一个数字");
		Scanner scanner=new Scanner(System.in);
		int shuzi=scanner.nextInt();
		switch(shuzi)
		{
		case 1:System.out.println("增加一个学生");break;
		case 2:System.out.println("显示所有学生");break;
		case 3:System.out.println("退出程序");break;
		}
	}

}