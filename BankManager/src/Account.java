/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public class Account {

    String code;
    String name;
    double balance;

    public Account(String code, String name, double balance) {
        this.code = code;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
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

    public String output() {
        return toString();
    }

    @Override
    public String toString() {
        return "code=" + code + ", name=" + name + ", balance=" + balance;
    }

}
