import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int stars = n;
        int space = 0;

        //upper
        for (int i = 1; i<=n; i++){
            //star
            for (int j=1; j<=stars; j++){
                System.out.print("*");
            }
            //space
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            stars = stars - 1;
            space = space + 2;

            System.out.println();
        }

        //lower
        for (int i = 1; i<=n; i++){
            //star
            for (int j=1; j<=stars; j++){
                System.out.print("*");
            }
            //space
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            stars = stars + 1;
            space = space - 2;

            System.out.println();
        }
    }
}

// Output:
// Enter the number of rows: 5
/*
**********
****  ****
***    ***
**      **
*        *
          
*        *
**      **
***    ***
****  **** 
**********
*/
