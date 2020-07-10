package oop;

public class EmployeeLoanApplication extends PersonalLoanApplication {

    @Override
    protected void checkIncomeHistory() {
        System.out.println("Bank employee. Income history already verified");
    }
}
