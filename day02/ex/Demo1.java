package comfor;

public class Demo1 {
	public static void main(String[] args) {
		/**
		 * ÕÒ1-100µÄÖÊÊı
		 */
		int i=1;
		for(;i<101;i++){
			int j=2;
			for(;j<i;j++){
				if(i%j==0){
					break;
				}
			}
			if(j==i){
				System.out.println(j);
			}
		}
	}
}
