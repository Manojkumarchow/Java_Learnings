import java.util.Scanner;
/*
* Find the greatest of the 3 elements
* */
public class GreaterOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int c = sc.nextInt();

        // largest number of 3 numbers

        // a b c

        // a > b and a > c --> a is largest
        // b > a and b > c --> b is largest
        // c > a and c > b --> c is largest
        // otherwise c is largest
//        && --> Logical AND
//        || --> Logical OR
        if (a > b && a > c) {
            // a is largest
            System.out.println("a is largest");
        }
        else if (b > c && b > a) {
            // b is largest
            System.out.println("b is largest");
        }
        else {
            /* else will have no condition because it is the last thing that
            gets executed after all the above statements get failed.
            Else should be written at the last.
            */
            // c is largest
            System.out.println("c is largest");
        }

        sc.close();
    }
}
