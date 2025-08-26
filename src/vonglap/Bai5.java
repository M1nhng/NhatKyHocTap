package vonglap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <= 10){
            System.out.println("The score is valid");
        }else System.out.println("The score is not valid");
        scanner.close();
    }
    //end
}
