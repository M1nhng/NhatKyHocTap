package oop.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;
        ArrayList<Account> list = new ArrayList<>();

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
                    list.add(account);
                    System.out.println("Da tao thanh cong!, ID: " + account.getId());
                    break;

                case 2:
                    if(list.isEmpty()){
                        System.out.println("Khong co tai khoan, hay tao tai khoan moi!");
                        break;
                    }
                    for (Account showAccount : list) {
                        showAccount.display();
                    }
                    break;
                
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Khong co tai khoan, hay tao tai khoan moi!");
                        break;
                    }
                    System.out.print("Nhap ID tai khoan can nap tien: ");
                    String depositId = scanner.nextLine();
                    Account accToDeposit = null;
                    for (Account acc : list) {
                        if (acc.getId().equals(depositId)) {
                            accToDeposit = acc;
                            break;
                        }
                    }

                    if (accToDeposit == null) {
                        System.out.println("Loi! Khong tim thay tai khoan voi ID " + depositId);
                        break;
                    }

                    System.out.println("So tien can nap: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    accToDeposit.deposit(amount);
                    break;
                
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("Khong co tai khoan, hay tao tai khoan moi!");
                        break;
                    }
                    System.out.print("Nhap ID tai khoan can rut tien: ");
                    String withdrawId = scanner.nextLine();
                    System.out.println("So tien can rut: ");
                    int amount1 = scanner.nextInt();
                    scanner.nextLine(); 

                    boolean found = false;
                    for (Account acc : list) {
                        if (acc.getId().equals(withdrawId)) {
                            acc.withdraw(amount1);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Loi! Khong tim thay tai khoan voi ID " + withdrawId);
                    }
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
