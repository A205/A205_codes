package comfor;

public class Demo2 {

	/**
	 * ���1-99���ܱ�5�����ĸ���
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
		System.err.println("1-99���ܱ�5�����ĸ�����");
		System.out.println(number);

	}

}
