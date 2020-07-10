package oop;

import oop.template.LoanApplicationTemplate;

public class Client {
    public static void main(String[] args) throws ApplicationDenied {
        LoanApplicationTemplate template = new EmployeeLoanApplication();
        template.checkLoanApplication();

        template = new PersonalLoanApplication();
        template.checkLoanApplication();
    }
}
