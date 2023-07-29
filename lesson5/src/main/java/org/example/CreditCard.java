package org.example;

 class CreditCard {
    private int accountNumber;
    private int balance;

      public  CreditCard(int accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public  int getAccountNumber(){
          return accountNumber;
    }
    public int getBalance(){
          return balance;
    }
    public void deposite(int amount){
          this.balance+=amount;
    }
    public void withdraw(int amount){
              if (this.balance>=amount) {
                  this.balance -= amount;
              }
              else {
                  this.balance=0;
              }
    }
    public void getInfo(){
        System.out.println("Номер  счета:"+this.accountNumber+" ,Баланс:"+this.balance);
    }
}