package random;

public class revrseString {

	public static void main(String[] args) {
		String r="mirza";
		String r1="";
		
	for(int i=r.length()- 1;i>=0;i--) {
		r1=r1+r.charAt(i);
	}
     System.out.println(r1);
	}

}
