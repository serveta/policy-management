public enum AccountType {
    INDIVIDUAL(0),
    ENTERPRISE(1);

    private int accountType;
    AccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public static String getAccountTypeName(int accountType) {
        switch (accountType) {
            case 0: return INDIVIDUAL.name();
            case 1: return ENTERPRISE.name();
        }

        return "ERROR!";
    }
}
