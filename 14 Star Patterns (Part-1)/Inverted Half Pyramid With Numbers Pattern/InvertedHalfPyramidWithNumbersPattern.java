import java.util.Scanner;

public class InvertedHalfPyramidWithNumbersPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int line = sc.nextInt();

        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i ;) {            
                System.out.print(j++ +" ");
            }
            System.out.println();
        }
    }
}