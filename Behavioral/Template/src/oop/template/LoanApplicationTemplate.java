package oop.template;

import oop.ApplicationDenied;

public abstract class LoanApplicationTemplate {

    public final void checkLoanApplication() throws ApplicationDenied {
        checkIdentity();
        checkCreditHistory();
        checkIncomeHistory();
        reportFindings();
    }

    protected abstract void checkIdentity() throws ApplicationDenied;
    protected abstract void checkIncomeHistory() throws ApplicationDenied;
    protected abstract void checkCreditHistory() throws ApplicationDenied;

    private void reportFindings() {
        System.out.println("generate report on loan application.");
    }
}

