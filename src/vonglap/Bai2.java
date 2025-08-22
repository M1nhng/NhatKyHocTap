package vonglap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("n is negative number");
        }
        if(n > 0){
            System.out.println("n is positive number");
        }
        if(n == 0){
            System.out.println("n is equal to 0");
        }
        scanner.close();
    }
}
