import java.util.*;
public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The size of the square star pattern
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i;j < n; j++){     
                System.out.print("* ");
            }
            for (int j = 1; j <= (2*i-1);j++){
                if(j==1||j==(2*i-1)){
                    System.out.print("* ");
                }
                else{
                System.out.print(" ");
                }
            }       
              System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > 1; j--) {
               System.out.println(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                if(j==1||j==(2*i-1)){
                    System.out.println("* ");
                }
                else{
                    System.out.println(" ");
                }
                System.out.println();
            }
        }
    }
}
