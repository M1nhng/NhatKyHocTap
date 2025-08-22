package vonglap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        if(name1.equals(name2)){
            System.out.println("Two people have the same name");
        }
        else{
            System.out.println("Two people dont't have the same name");
        }
        scanner.close();
    }
}
