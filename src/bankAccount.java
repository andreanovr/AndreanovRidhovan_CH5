public class bankAccount {
    private final String idTransaction;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String accountNumber;
    private double Balance;
    private static int accountsCount = 0;
    private static double totalAmount = 0;

    public bankAccount() {
        accountsCount++;
        this.idTransaction = getIdTransaction();
    }

    public String getIdTransaction() {
        String idTransaction = "";

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random()*10);
            idTransaction += random;
        }

        return idTransaction;
    }

    public double getSavingsBalance() {
        return this.Balance;
    }

    public void getDeposit(double amount) {
        this.Balance += amount;
        totalAmount += amount;
    }

    public void getWithdraw(double amount) {
            if (amount > this.Balance) {
                System.out.println("\n=====================================================");
                System.out.println("Saldo tidak mencukupi untuk melakukan penarikan tunai");
                System.out.println("=====================================================");
            } else {
                this.Balance -= amount;
                totalAmount -= amount;
                System.out.println("\n===============================================================");
                System.out.println("Penarikan saldo dari rekening tabungan anda berhasil dilakukan");
                System.out.println("===============================================================");
            }

    }

    public void getBalances() {
        System.out.println("\n======================================");
        System.out.println("===========STRUK TRANSAKSI============");
        System.out.println("======================================");
        System.out.println("ID Transaksi : "+getIdTransaction());
        System.out.println("No Rekening  : "+getAccountNumber());
        System.out.println("Sisa saldo   : $" + getSavingsBalance());
        System.out.println("Nama         : " + getCustomerName());
        System.out.println("Email        : " + getCustomerEmail());
        System.out.println("No Telp      : " + getCustomerPhone());
        System.out.println("======================================");
    }


}