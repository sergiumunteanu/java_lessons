package edu.step.modifiers;

class BankService {

    public static BankService service = new BankService();

    private BankService() { // Singleton

    }

    // verify balance
    private boolean verifyBalance() {
        return false;
    }
    // subtract amount
    void subtractAmount(double sum) {
        verifyBalance();

        // scot banii

        printReceipt();
    }
    // receipt
    private void printReceipt() {

    }


}
