package arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = new int[20];

        for(int i=0;i<array.length;i++) {
            array[i] = i + 1;
        }
        // 0 - 19 varaku elements untayi

        int sum = 0;

        // 0 + 1 + 2 + 3 + ... + 19 = ?

        // prathi okka element ni sum lo add chestunna kabatti
        // prathi okka element ni touch cheyali
        // touch cheyali ante nenu array ni loop lo petti, prathi element ni access cheyali.

        for (int i=0;i<array.length;i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum: " + sum);

        /*
        * Array sum upto 100 elements
        *
        * take 100 elements in an array and put all the even numbers into separate array and print that array.
        *
        * take array from 1-25 and print the product of all the elements.
        *
        * */
    }
}
