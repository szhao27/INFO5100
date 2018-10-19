package assignment5;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<DessertItem> l;

    public Checkout(){
        l = new ArrayList<>();
    }

    public int numberOfItems () {
            return l.size();
    }

    public void enterItem(DessertItem item) {
        l.add(item);
    }

    public void clear() {
        l.clear();

    }

    public int totalCost() {
        int total=0;
        for(int i=0;i<l.size();i++){
            total = total + l.get(i).getCost();
        }

        return total;
    }

    public int totalTax() {
        int tax=Math.round((int)(totalCost()*DessertShoppe.taxrate+0.5f));
        return tax;
    }

    public String toString() {
        String outPut="";
        outPut=outPut+"\n     ";
        outPut=outPut+DessertShoppe.nameOfStore + "\n";
        outPut=outPut+"     ";
        outPut=outPut+"--------------------\n\n";
        for(int i=0;i<l.size();i++){
            outPut=outPut+l.get(i).toString();
        }
        outPut=outPut+"\n";
        outPut=outPut+"Tax"+DessertShoppe.widTh("Tax",DessertShoppe.cents2dollarsAndCentsmethod(totalTax()))+DessertShoppe.cents2dollarsAndCentsmethod(totalTax())+ "\n";
        outPut=outPut+"Total Cost"+ DessertShoppe.widTh("Total Cost", DessertShoppe.cents2dollarsAndCentsmethod(totalCost()))
                + DessertShoppe.cents2dollarsAndCentsmethod(totalCost()+totalTax())+"\n";
        return outPut;
    }
}
