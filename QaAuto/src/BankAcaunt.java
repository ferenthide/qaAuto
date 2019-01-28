import java.util.Scanner;

public class BankAcaunt extends Phone {
    public String  acountNumber;
    public double balance;

    public BankAcaunt(){

    };
    public BankAcaunt(String acountNumber, double balance) {
        this.acountNumber = acountNumber;
        this.balance = balance;
    }

    public BankAcaunt(String phoneName, double phonePrice, String acountNumber, double balance) {
        super(phoneName, phonePrice);
        this.acountNumber = acountNumber;
        this.balance = balance;
    }

    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Enter balance: ");
        Scanner scn = new Scanner(System.in);
        balance = scn.nextDouble();
    }
    public void credit(){
        //System.out.println("add money: ");
        Scanner scn = new Scanner(System.in);
        double moneyAddInBalance = scn.nextDouble();
        balance += moneyAddInBalance;
        System.out.println("у вас теперь: " + balance);
    }
    public void debit(){
       // System.out.println("колько снять денег?: ");
        Scanner scn = new Scanner(System.in);
        double moneyMinusInBalance = scn.nextDouble();
        if (balance < moneyMinusInBalance) {
            System.out.println("недостаточно средств для снятия " + "\n"
                                + "у вас осталось: "
                                + balance +"\n" );

        }
        else {
            balance-= moneyMinusInBalance;
            System.out.println("Вы сняли: " + moneyMinusInBalance + "\n"
                                + "осталось: "+  balance);
        }


    }
    @Override
    public String toString() {
        return "Phone{" +
                "PhoneName = '" + PhoneName + '\'' +
                ", PhonePrice = " + PhonePrice +
                ", Balance = "  + balance
                + '}';
    }

}
