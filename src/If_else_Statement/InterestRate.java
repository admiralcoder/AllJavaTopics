package If_else_Statement;

public class InterestRate {

    //method to print simple InterestRate using if else statements
    public static final double Overdrawn_Penalty = 8.00;
    public static final double interestRate = 0.5;

    public static void main(String[] args) {

        bankInterest(20);

    }


    public static void bankInterest(double balance) {
        if (balance >= 0) {
            balance = balance + (interestRate * balance) / 12;
        } else balance = balance - Overdrawn_Penalty;
        System.out.println("new balance is $" + balance);
    }
}
