package wanghan;

import java.util.Random;

public class work4 {
	
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        String []  name={"core C++","corejava","servlet","jsp","EJB"};                    
		Random random=new Random();	
		int grade[][]=new int[20][5];
		 for (int i = 0; i < 20; i++) {
        	for (int j = 0; j < 5; j++) {
        		int a=random.nextInt(100);
        		grade[i][j]=a;
				
			}
        	}
		 for (int i = 0; i < 5; i++) {
			 System.out.print(name[i]+"   ");
			
		}
		 System.out.println();
            for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(grade[i][j]+"         "+"\t");
				}
				System.out.println();
			}
            int sum[]=new int[20];
            for (int i = 0; i< 20; i++) {
            	  
            	for (int j= 0; j < 5; j++) {
            		sum[i]=sum[i]+grade[i][j];   
            		}
            	System.out.print(sum[i]+"   ");


			}
            System.out.println();
            int sum1[]=new int[5];
            for (int j = 0; j< 5; j++) {
            	  
            	for (int i= 0; i < 20; i++) {
            		sum1[j]=sum1[j]+grade[i][j];   
            		}
            	
            
            	System.out.print((float)sum1[j]/20+"         ");


			}
            
            
				
			}
				
			
			
		

	}


