package oop;

import oop.template.LoanApplicationTemplate;

public class PersonalLoanApplication extends LoanApplicationTemplate {

    @Override
    protected void checkIdentity() throws ApplicationDenied {
        System.out.println("validate address");
    }

    @Override
    protected void checkIncomeHistory() {
        System.out.println("check payslips");
    }

    @Override
    protected void checkCreditHistory() throws ApplicationDenied {
        System.out.println("delegating to external provider");
    }
}
