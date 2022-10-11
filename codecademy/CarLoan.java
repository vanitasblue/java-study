package payroll;

public class CarLoan {
    int carLoan; // 대출금액
    int loanLength; // 대출기간
    int interestRate; // 대출금리
    int downPayment; // 계약금
    int months;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment) {
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            this.carLoan = carLoan;
            this.loanLength = loanLength;
            this.interestRate = interestRate;
            this.downPayment = downPayment;
            this.months = loanLength * 12;
        }
    }

    public String calculateMonthlyPayment() {
        if (carLoan <= 0 || loanLength <= 0 || interestRate <= 0 || downPayment <= 0) {
            return "Error! It's invalid car loan.";
        } else {
            int remainingBalance = carLoan - downPayment;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;

            return "Monthly Payment is: " + monthlyPayment;
        }
    }

    public static void main(String[] args) {
        int carLoan = 10000; // 대출금액
        int loanLength = 3; // 대출기간
        int interestRate = 5; // 대출금리
        int downPayment = 2000; // 계약금

        CarLoan firstLoan = new CarLoan(carLoan, loanLength, interestRate, downPayment);
        System.out.println(firstLoan.calculateMonthlyPayment());
    }
}
