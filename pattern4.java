import java.util.*;

public class pattern4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int leftspace = 0;
        int middlespace = 1 + 2*(n-2);
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=leftspace; j++){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1; j<=middlespace; j++){
                System.out.print(" ");
            }
            if(i!=n){
                System.out.print(i);
            }
            
            leftspace++;
            middlespace -= 2;
            System.out.println();
        }
        
        leftspace = n-2;
        middlespace = 1;

        for (int i = n-1; i>=1; i--){
            for(int j=1; j<=leftspace; j++){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1; j<=middlespace; j++){
                System.out.print(" ");
            }
            if(i!=n){
                System.out.print(i);
            }
            leftspace--;
            middlespace += 2;
            System.out.println();
        }
        System.out.println();
    }
}


// Output: pattern4.java
// Enter the number of rows: 5
/*   1       1
      2     2
       3   3
        4 4
         5
        4 4
       3   3
      2     2
     1       1   */