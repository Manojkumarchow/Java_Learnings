import java.util.Scanner;
/*
* Find the given number is odd or even
* */
public class Conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // scanner is used to read input from the user

        int number = sc.nextInt();


        // nextInt() --> only integers
        // manoj --> error

        // next() --> Integer convert

        // manoj --> string
        // Integer.parseInt(manoj) --> error

        // mainly 3
        // if, else if, else

        // odd or even

        // even number -> 4, 6
        // how is 4 even?? -> divided by 2
        // reminder 0

        // operator to calculate reminder --> % -- Modulus operator

        // if number % 2 == 0 then even number otherwise odd number

        if (number % 2 == 0) {
            // even
            System.out.println("Even number");
        } else {

            // remember else as otherwise
            //odd
            System.out.println("Odd number");
        }
        sc.close(); // batti pattu
    }
}
