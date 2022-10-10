import java.util.Scanner;

class EvenSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Input value must not be less than 2.");
        } else {
            int i = 2;
            int sum = 0;
            while (i <= number) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
                i++;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
