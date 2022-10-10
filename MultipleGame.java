import java.util.Random;
import java.util.Scanner;

class MultipleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random myRandomNumber = new Random();
        int result;
        while (true) {
            int myOneDigitNumber = Math.abs(myRandomNumber.nextInt() % 10);
            int myOneDigitNumber_2 = Math.abs(myRandomNumber.nextInt() % 10);
            int prod = myOneDigitNumber * myOneDigitNumber_2;
            System.out.println("How much is " + myOneDigitNumber + " times " + myOneDigitNumber_2 + "?");
            result = sc.nextInt();
            while (true) {
                if (result == prod) {
                    System.out.println("Very Good!");
                    break;
                } else if (result == -1) {
                    break;
                } else if (result != prod) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + myOneDigitNumber + " times " + myOneDigitNumber_2 + "?");
                    result = sc.nextInt();
                }
            }
            if (result == -1)
                break;
        }
        sc.close();
    }
}
