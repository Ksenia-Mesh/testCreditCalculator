public class CreditPaymentService {
    public int calculate(int loanAmount, int period, double interestRate) {

        double monthlyRate = interestRate / 12 / 100;
        int sumMonth = period * 12;
        double x = Math.pow(1 + monthlyRate, sumMonth);
        double monthlyPayment = loanAmount * (monthlyRate + (monthlyRate / (x - 1)));

        int monthlyPaymentInt = (int)monthlyPayment;
        return monthlyPaymentInt;
    }
}