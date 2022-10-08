package learning;
import java.util.Scanner;

public class Greatestoffournumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        System.out.println("Enter 1st Number: ");
        int b = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int c = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int d = sc.nextInt();
        System.out.println("Enter 4th number: ");
        if(a>b && a>c && a>d) {
        	System.out.println("a is largest");
        }
        else if(b>a && b>c && b>d) {
        		System.out.println("b is largest");
        	}
        else if(c>a && c>b && c>d) {
        	System.out.println("c is largest");
        }
        else {
        	System.out.println("d is largest");
        }
        sc.close();
        
	}
}
