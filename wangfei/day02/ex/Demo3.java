package comfor;

public class Demo3 {

	/**
	 * 2-50的质数
	 */
	public static void main(String[] args) {
		//i代表第一个乘数
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.println(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("\n");
		}
	}

}
