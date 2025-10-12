package oop.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;

        do {
            System.out.println("=== NGÂN HÀNG ABC ===");
            System.out.println("1. Tao tai khoan moi");
            System.out.println("2. Xem thong tin tai khoan");
            System.out.println("3. Nap tien");
            System.out.println("4. Rut tien");
            System.out.println("0. Thoat");
            System.out.println("======================");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch(input){
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("So du ban dau: ");
                    int balance = scanner.nextInt();

                    account = new Account(name, balance);
                    System.out.println("Da tao thanh cong!");
                    break;

                case 2:
                    if(account == null){
                        System.out.println("Khong co tai khoan, hay tao tai khoan moi!");

                    }
                    account.display();
                    break;
                
                case 3:
                    System.out.println("So tien can nap: ");
                    int amount = scanner.nextInt();
                    if(account == null){
                        System.out.println("Khong co ngan hang, VUI LONG TAO MOI!");
                        break;
                    }
                    account.deposit(amount);
                    break;
                
                case 4:
                    System.out.println("So tien can rut: ");
                    int amount1 = scanner.nextInt();
                    if(account == null){
                        System.out.println("Khong co ngan hang, VUI LONG TAO MOI!");
                        break;
                    }
                    account.withdraw(amount1);
                    break;

                case 0:
                    System.out.println("=== XIN CAM ON ===");
                    return;    

                default:
                    System.out.println("Lua chon khong hop le, VUi LONG CHON LAi!");
                    continue;
            }
        } while (true);
    }

}
