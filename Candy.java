package assignment5;

import java.text.DecimalFormat;

public class Candy extends DessertItem{
    private double weight;
    private int priceperpound;
    public Candy(String name,double weight,int priceperpound){
        super(name);
        this.weight=weight;
        this.priceperpound=priceperpound;

    }
    public int getCost() {
        double cost = weight*priceperpound+0.5f;
        return (int) cost;
    }
    public String toString(){
            String o = "";
            String p = "";
            int price = (int) Math.round(priceperpound);
            DecimalFormat al=new DecimalFormat("#.00");
            o = o + al.format(this.weight) + " lbs. @ " + DessertShoppe.cents2dollarsAndCentsmethod(price) + "/lb.\n";
            p = p + getName() + DessertShoppe.widTh(getName(), DessertShoppe.cents2dollarsAndCentsmethod(getCost())) + DessertShoppe.cents2dollarsAndCentsmethod(getCost()) + "\n";
            return o + p;
    }

}
