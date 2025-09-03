package number.contest;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                cnt++;
            }
        }
            if(cnt == 4 || cnt == 7){
                System.out.print("YES");
            }else System.out.print("NO");
        
        scanner.close();
        
    }
}
