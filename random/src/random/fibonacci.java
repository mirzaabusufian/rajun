package random;

public class fibonacci {

	public static void main(String[] args) {
		
		int sum1=0;
		int sum2=1;
		System.out.print(sum1 + "  "+sum2  +" ");
		int sum;
		for(int i=2;i<=10;i++) {
			sum=sum1+sum2;
			sum1=sum2;
			sum2=sum;
			System.out.print(sum +" ");
			
		}
        System.out.println();
	}

}
