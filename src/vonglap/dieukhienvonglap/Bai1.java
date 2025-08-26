package vonglap.dieukhienvonglap;

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(n % 2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
   //end
}
