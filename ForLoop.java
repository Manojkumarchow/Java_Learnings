import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // loop -> if you want to execute a set of statements or a piece of code
        // multiple times repeatedly. Then we use loops

        // 3 loops - for loop, while loop, do-while loop

        // 1 - 1000
        // print(1)
        // print(2)

        // print(3);
        // print(num); loop - repeat

        // for (initialize; condition; update_expression)

        // loop gets executed only if the condition is true
        // loop gets ended if the condition is false

        // initialize part will get executed only for the first time
        // update_expression won't get executed for the first time

        int number = sc.nextInt(); // 10

        // 0 - 50

        // 1 - 100
//        for (int i=1;i<=number;i++) {
//            System.out.println(i);
//        }

//        100 - 1

        // 100 99 98 97 96 95 ..... 1
        // i-- ok
        // i = number
        // i > 0 --> positive
        // i < 0 --> negative

        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }

        /*
        * print 0 to 50
        *
        * print 1 to 100
        *
        * print 100 to 10
        *
        * print only even numbers from 1 to 100
        * (hint: use 'if' condition inside the loop as previous lecture)
        * */

        sc.close();
    }
}
