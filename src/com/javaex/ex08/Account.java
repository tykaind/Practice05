package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    }
    
    public Account(String account) {
    	
    }
    //필요한 메소드 작성
    public void deposit(int balance) {
    	this.balance += balance;
    }
    
    public void withdraw(int balance) {
    	this.balance -= balance;
    }
    
    public void showBalance() {
    	System.out.println(this.balance);
    }

}
