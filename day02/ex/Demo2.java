package comfor;

public class Demo2 {

	/**
	 * 输出1-99不能被5整除的个数
	 */
	public static void main(String[] args) {
		int i=1;
		int number=0;
		for(;i<100;i++){
			if(i%5==0){
				continue;
			}
			number++;
		}
		System.err.println("1-99不能被5整除的个数：");
		System.out.println(number);

	}

}
