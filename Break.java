public class Break {

    public static void main(String[] args) {
        /*
         * break statement is used to break the execution of a loop
         * The loop gets stopped after the break statement. After the break statement
         * the remaining program gets executed.
         * */
        // break & continue;

        // break - to stop the loop
        // continue - to skip that particular iteration
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
//                break;
                continue;
            }
            System.out.println(i);
        }

        /*
        * 1 - 100 loop petti
        *
        * even number count 20 vachaka 'break' aipovali loop
        *
        * 1 - 100 loop petti
        * only odd numbers print avvali using 'continue';
        *
        * if (i%2 == 0) {
        *   continue;
        * } else {
        *   print();
        * }
        *
        * */
//        System.out.println("After the break statement");
    }
}
