package com.company;

public class CreditCalculator {

    public int monthPay(int loan, int month, int monthBankInterest) {

        return loan * (monthBankInterest + (
                monthBankInterest / (1 + monthBankInterest) * month - 1 ));
    }

    public int totalPay(int loan, int month, int monthBankInterest) {
        return month * loan * (monthBankInterest + (
                monthBankInterest / (1 + monthBankInterest) * month - 1 ));
    }

    public int payOver(int loan, int month, int monthBankInterest) {

        return month * loan * (monthBankInterest + (
                monthBankInterest / (1 + monthBankInterest) * month - 1 )) - loan;
    }
}
