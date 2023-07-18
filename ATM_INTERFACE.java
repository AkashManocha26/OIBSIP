
import java.util.*;

public class ATM_INTERFACE {
    public static void main(String[] args) {
        int balance = 10000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ATM INTERFACE");
            System.out.println("Press 1 to Withdraw");
            System.out.println("Press 2 to Deposit");
            System.out.println("Press 3 to Check Balance");
            System.out.println("Press 4 to Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter Money To Be Withdraw");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to be Deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been Deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);

            }

        }
    }

}
