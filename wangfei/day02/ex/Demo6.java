package comfor;

public class Demo6 {

	/**
	 * ð������
	 */
	public static void main(String[] args) {
		int []a={10,2,31,45,23,5};
		int temp;
		for(int i=0;i<6;i++){
			for(int j=i;j<6;j++){
				//   ��С����
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println("num."+(i+1)+":  "+a[i]);
		}
	}

}
