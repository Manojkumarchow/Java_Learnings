package learning;

public class Oddnumbers {
	public static void main(String args[]) {
		int i;
		int num=100;
		for(i=1;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
