import java.util.Scanner;


public class ceshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		
		Scanner scanner=new Scanner(System.in);
		
		int Score=scanner.nextInt();
	    
	if((Score>=90)&&(Score<=100))
   {
	  System.out.println("等级为A");
   }
	if((Score>=80)&&(Score<90))
   {
	  System.out.println("等级为B");
   }
	if((Score>=70)&&(Score<80))
   {
	   System.out.println("等级为C");
   }
	if((Score>=60)&&(Score<70));
   {
	   System.out.println("等级为D");
   }
   if((Score>=0)&&(Score<60))
   {
	   System.out.println("等级为E");
   }
  }
}

