class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.debit();
        account.credit();
        account.withdrawUsingChecking();
    }
}