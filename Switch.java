import java.util.Scanner;

public class Switch {

    /*
    *
    * 10 options
    *
    * 3rd option
    *
    * 3 - execute
    * */
    public static void main(String[] args) {
        int a = 10, b = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        int result;
        switch (choice) {
            case 1:
                result = a + b;
                break;

            case 2:
                result = a - b;
                break;

            case 3:
                result = a * b;
                break;

            case 4:
                result = a / b;
                break;

            case 5:
                result = a % b;
                break;

            default:
                result = 0;
                break;
        }
        System.out.println("Result: " + result);
        sc.close();

        /*
        * same program but take a and b using scanner from the user
        *
        * and write some more cases like comparing a with b
        *
        * ex: case 6: if (a>b) print (a is greater than b)
        *
        * default case should saying to the user that choice should not be greater than 8.
        * */
    }
}
