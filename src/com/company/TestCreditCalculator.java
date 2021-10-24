package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class TestCreditCalculator {

    @Test
    public void testMonthPay() {
        CreditCalculator creditCalculator = new CreditCalculator();
        int loanSum = 100000;
        int month = 24;
        int monthInterestOnCredit = 2;
        int monthlyPay = creditCalculator.monthPay(loanSum, month, monthInterestOnCredit);
        assertTrue(" Неверный результат расчета ежемесячного платежа  ", loanSum * (monthInterestOnCredit + (
                monthInterestOnCredit / (1 + monthInterestOnCredit) * month - 1 )) == monthlyPay);
    }

    @Test
    public void testTotalPay() {
        CreditCalculator creditCalculator = new CreditCalculator();
        int loanSum = 100000;
        int month = 24;
        int monthInterestOnCredit = 2;
        int total = creditCalculator.totalPay(loanSum, month, monthInterestOnCredit);
        assertTrue(" Неверный расчет общей суммы долга за кредит ", month * loanSum * (monthInterestOnCredit + (
                monthInterestOnCredit / (1 + monthInterestOnCredit) * month - 1 )) == total);
    }

    @Test
    public void testPayOver() {
        CreditCalculator creditCalculator = new CreditCalculator();
        int loanSum = 100000;
        int month = 24;
        int monthInterestOnCredit = 2;
        int overPay = creditCalculator.payOver(loanSum, month, monthInterestOnCredit);
        assertTrue(" Неверная сумма переплаты за кредит ", month * loanSum * (monthInterestOnCredit + (
                monthInterestOnCredit / (1 + monthInterestOnCredit) * month - 1 )) - loanSum == overPay);
    }
}
