public class WhileLoop {

    public static void main(String[] args) {

        // while (condition) {
        // if condition is true, then only while loop executes
        // entry condition loop
        // set of stmts
    //    }
        //
//        int i=0;
//        while (i <= 10) {
//            // the condition is always true, so it leads to an infinite loop.
//            System.out.println(i);
//            i++; // update expression
//        }

        // 1 - 10
        // 1 + 2 + 3 + 4 + ... + 10 = ???
        int i=1;
        int number = 10;

        int sum = 0;

//        for (i=1;i<=number;i++) {
//            sum += i;
//        }
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        // sum of 100 numbers
        // print only ODD numbers in the range of 1 - 1000
    }
}
