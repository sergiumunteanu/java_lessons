package edu.step.modifiers;

public class BankDemo {
    public static void main(String[] args) {
        BankService service = BankService.service;
        service.subtractAmount(200);

        DbService dbService = DbService.instance;
    }
}
