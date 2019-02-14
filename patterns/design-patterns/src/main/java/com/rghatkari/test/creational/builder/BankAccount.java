package com.rghatkari.test.creational.builder;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsLetter;

    private BankAccount(BankAccountBuilder builder){
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.newsLetter = builder.newsLetter;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsLetter;

        // All the Mandatory parameters goes with this constructor
        public BankAccountBuilder(String name, String accountNumber){
            this.name = name;
            this.accountNumber = accountNumber;
        }

        // setters for optional parameters which returns this builder
        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsLetter(boolean newsLetter){
            this.newsLetter = newsLetter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }

    public String getName(){
        return name;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getEmail(){
        return email;
    }

    public boolean isNewsLetter(){
        return newsLetter;
    }
}
