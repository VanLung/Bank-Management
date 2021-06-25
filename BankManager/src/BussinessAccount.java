/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public class BussinessAccount extends Account {

    private double interestRate;

    public BussinessAccount(double interestRate, String code, String name, double balance) {
        super(code, name, balance);
        this.interestRate = interestRate;
    }

    public BussinessAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public BussinessAccount() {
    }

    public double getInteresRate() {
        return interestRate;
    }

    public void setInteresRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String output() {
        return "Code: " + code + "Name: " + name + "Balance: " + balance + "Interest Rate: " + interestRate;
    }

}
