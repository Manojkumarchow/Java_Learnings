package learning;
import java.util.Scanner;

public class Hundredtoone {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		int i=1;
		int num=1000;
		int sum=0;
		//num  = sc.nextInt();
		if(i<1) {
			System.out.println("Enter value is less than 1");
		}
		for(i=1;i<=num;i++) {
			if(i%2 ==0) {
				sum = sum+i;
				
				
			}
		}
		System.out.println(sum);
		//sc.close();
		
	}
	
}
