package pl.wojtczak.lesson4.homework;

public class BillCalculator {

    public double calculate(double valueBill, float servicePayment) {
        return valueBill + servicePayment;
    }

    public double calculate(double valueBill, float servicePayment, double discount) {
        return valueBill + servicePayment - discount;
    }

    public double calculate(double valueBill, float servicePayment, short packingFee) {
        return valueBill + servicePayment + packingFee;
    }

}
