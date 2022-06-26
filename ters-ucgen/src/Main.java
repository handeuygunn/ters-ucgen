import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz:");
        int n = input.nextInt();

        for (int i = n; i>=1; i--) {
            for (int k= (n-i); k>=1; k--){
                System.out.print(" ");
            }
            for (int l = ((2*i)-1) ; l>=1; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
