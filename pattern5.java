import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int leftspace = n-1;
        System.out.println();
        for (int i =1; i<=n; i++){
            for (int j=1; j<=leftspace; j++){
                System.out.print(" ");
            }

            if (i == 1 || i == n) {
                for (int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for (int j=1; j<=n-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            leftspace = leftspace - 1;
            System.out.println();
        }
        System.out.println();
    }
}

// Output: pattern5.java
// Enter the number of rows: 5
/*   
        *****
       *   *
      *   *
     *   *
    ***** 
*/