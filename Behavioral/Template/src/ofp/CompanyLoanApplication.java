package ofp;

import ofp.template.LoanApplication;

public class CompanyLoanApplication extends LoanApplication {
    public CompanyLoanApplication() {
        super(() -> {}, () -> {}, () -> {});
    }
}
