public class mainBank {
    public static void main(String[] args) {

        bankAccount account = new bankAccount();
        // Customer Identity
        account.setAccountNumber("1234567890");
        account.setCustomerName("Andreanov Ridhovan");
        account.setCustomerEmail("andreanovr@gmail.com");
        account.setCustomerPhone("082299070001");

        // Transaction Type
        account.getDeposit(100);
        account.getWithdraw(75);
        account.getBalances();
    }
}
