package learning;
import java.util.Scanner;

public class Forloop4 {
	public static void main(String args[]){
		
	
	Scanner sc = new Scanner(System.in);
	int i;
	int num=100;

		    for(i=1;i<=num;i++) {
			 if(i%2==0) {
		
			System.out.println(i);
		}
	}
	sc.close();
	
	}
}
