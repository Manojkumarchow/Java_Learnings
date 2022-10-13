package patterns;

public class StarPattern {
    public static void main(String[] args) {
        int totalRows = 5, totalColumns = 3;

        for (int row=1;row<=totalRows;row++) {
            for (int col=1;col<=row;col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
/*
* Print the below patterns
*
* --------------
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
* --------------
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
* --------------
// *
// * *
// * * *
// * * * *
// * * * * *
* --------------
*
*
* */