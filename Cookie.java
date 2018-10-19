package assignment5;

public class Cookie extends DessertItem {
    private int number;
    private int priceperdozen;

    public Cookie(String name, int number, int priceperdozen) {
        super(name);
        this.number = number;
        this.priceperdozen = priceperdozen;

    }

    public int getCost() {
        double cost = number * priceperdozen/12+0.5f;
        return (int) cost;
    }
    public String toString(){
        String o="";
        String p="";
        int price=(int)Math.round(priceperdozen);
        o=o+(int)(this.number)+" @ "+DessertShoppe.cents2dollarsAndCentsmethod(price)+" /dz.\n";
        p=p+getName()+DessertShoppe.widTh(getName(),DessertShoppe.cents2dollarsAndCentsmethod(getCost()))+DessertShoppe.cents2dollarsAndCentsmethod(getCost())+"\n";
        return o+p;
    }
}
