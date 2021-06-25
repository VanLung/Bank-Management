/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public class VIPAccount extends Account {

    private boolean promotion;

    public VIPAccount(boolean promotion, String code, String name, double balance) {
        super(code, name, balance);
        this.promotion = promotion;
    }

    public VIPAccount(boolean promotion) {
        this.promotion = promotion;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    @Override
    public String output() {
        return "Code: " + code + "Name: " + name + "Balance: " + balance + "Promotion: " + promotion;
    }

}
