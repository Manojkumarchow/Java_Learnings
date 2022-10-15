package arrays;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size
        // array - same type of data ni hold chestadi

        // integer, string, double
        // [] - represents an array
        // we need a new keyword to declare an array
        int[] arr = {1, 2, 3}; // 1st case
        int[] arr2 = new int[5]; // 5 elements eh teeskuntadi - represents size of the array
//        arr2 = new int[]{3, 2, 1};
//        int n = sc.nextInt();
        int[] newArray = new int[10];
        // {99, 23, 34, 56, 67} - size = 5
        // 0, 1, 2, 3, 4 - indices
        // arr[0] - 99
        // arr[1] - 23
        // array index always starts from 0 (zero).
        // 0 - 10 --> 11
        // arr[11] = 11 --> naa array size 10 eh undhi kabatti, 11th dhaaniki space ledu insert cheyadaniki
        // array index out of bound ani exception ochindi.
        // size unna dhaani kanna bayata nundi size kanna ekkuva try cheste exception ostadi.
        // unna size lo ne try cheskovali.
        // 0 - 9 varake vastayi indices
        for (int i=0;i<10;i++) {
            newArray[i] = i;
        }

        // array length - length

        System.out.println("Array length: " + newArray.length);
        // good practice - loop ni eppudina array ki unna length varake thippali
        for (int i=0;i<newArray.length;i++) {
            System.out.println(newArray[i]);
        }


        sc.close();
    }
}
