package lesson3;

import java.lang.String;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Phone tel = new Phone("iphone", 1.0);
        System.out.println(tel);
        BankAcaunt BA = new BankAcaunt("samsung", 100.0, "1", 3500.0);
        System.out.println(BA);
        printMenu();

        do {
            Scanner scn = new Scanner(System.in);
            int i = scn.nextInt();
            if (i < 1 && i > 4)
                System.out.println("виход за рамки выбора");
             else {


                switch (i) {
                    case 1:
                        System.out.println("сколько зачислить денег? : ");
                        BA.credit();
                        printMenu();
                        break;
                    case 2:
                        System.out.println("сколько хотите снять?: ");
                        BA.debit();
                        printMenu();
                        break;
                    case 3:
                        System.out.println(BA);
                        printMenu();
                        break;
                    case 4:
                        System.out.println("EXIT");
                        break;
                }

            }
        }
        while (true);

    }
    private static void printMenu () {
        System.out.println("МЕНЮ: \n" + "1) зачислить деньги \n" +
                "2)Снять с баланса\n" +
                "3)info acaunt\n" +
                " Ваш выбор: ");
    };
}
