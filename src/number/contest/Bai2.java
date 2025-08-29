package number.contest;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t -- > 0) {
            String s = scanner.nextLine();
            boolean ok = true;
            for(int i = 0; i < s.length() - 1; i++){
                if(Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1)) != 1){
                    ok = false;
                    break;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
        scanner.close();
    }
    
    
}
