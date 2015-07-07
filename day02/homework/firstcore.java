package home;

import java.util.Random;

public class firstcore {
	public static void main(String[] args) {
		//每门课程名
		String []name=new String[6];
		name[0]="Student";
		name[1]="core C++";
		name[2]="coreJava";
		name[3]="Servlet";
		name[4]="JSP";
		name[5]="EJB";
		
		//20*5的二维数组来储存20位学生的5门成绩
		int [][]score=new int[20][6];
		for(int ii=0;ii<20;ii++){
			score[ii][0]=ii+1;
		}
		Random random=new Random();
		//20名学生
		for(int i=0;i<20;i++){
			//每门课的成绩
			for(int j=1;j<=5;j++){
				score[i][j]=random.nextInt(100);
				// System.out.println(score[i][j]);
			}
		}
		/**
		 * 按列表输出
		 */
		//对齐控制
//		int le=0;
//		for(int p=0;p<5;p++){
//			le=name[p].length()+le;
//		}
		for(int k=0;k<=5;k++){
			if(k==3){
				System.out.print(name[k]+" ");	
			}
			else 
				System.out.print(name[k]+"   ");
		}
		System.out.println();
		for(int a=0;a<20;a++){
			for(int b=0;b<=5;b++){
				if(b!=0){
				System.out.print(score[a][b]+"\t");}
				else{
					System.out.print("stu."+score[a][b]+"   \t");
				}
			}
			System.out.println();
		}
		//求每个成员的总分
		int []sum=new int[20];
		for(int s=0;s<20;s++){
			for(int ss=1;ss<6;ss++){
				sum[s]=sum[s]+score[s][ss];
			}
			System.out.print("总分stu."+(s+1)+":   "+sum[s]+"\n");
		}
		//求每门课的平均数
		float []su=new float[5];
		float []ave=new float[5];
		for(int aa=0;aa<5;aa++){
			for(int bb=0;bb<20;bb++){
				su[aa]=su[aa]+score[bb][aa+1];
			}
			ave[aa]=su[aa]/20;
			System.out.print("平均分："+" "+name[aa+1]+":"+ave[aa]+"\n");
		}
		
	}

}
