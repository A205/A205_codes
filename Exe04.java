package wukai1;

import java.util.Scanner;
class Students{
	int num;
	char name;
}
public class Exe04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu1=new Students();
		Students stu2=new Students();
         stu1.num=1;
         stu1.name='A';
         stu2.num=2;
         stu2.name='B';
         System.out.println("|1.增加一个学生|"+"\n|2.显示所有学生|"+"\n|3.退出程序|"+"\n|请输入选择（1-3）|");
         Scanner inScanner=new Scanner(System.in);
         int n=inScanner.nextInt();
         if(n==1){
        	 Students stu3=new Students();
        	 stu1.num=3;
        	 stu1.name='C';
         }
         if(n==2){
        	 System.out.println("students 1"+stu1.name+stu1.num+"\nstudents 2"+stu2.name+stu2.num);
         }
         if(n==3){
        	 System.exit(0);
         }
        

	}

}
