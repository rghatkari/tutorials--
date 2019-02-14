package com.rghatkari.test.creational.builder;

public class BuilderPatternDriver {
    public static void main(String[] args){
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Rajesh", "12345")
                .withEmail("ghatkarirajesh@gmail.com")
                .wantNewsLetter(true)
                .build();

        System.out.println("Name: " + newAccount.getName());
        System.out.println("Account Number: " + newAccount.getAccountNumber());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Want News letter? : " + newAccount.isNewsLetter());
    }
}
