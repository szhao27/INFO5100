package assignment5;

public class IceCream extends DessertItem{
    private int cost;
    public IceCream(String name,int cost){
        super(name);
        this.cost=cost;

    }

    public int getCost(){
        return (int) cost;
    }
    public String toString(){
        String g="";
        g=g+getName()+DessertShoppe.widTh(getName(),DessertShoppe.cents2dollarsAndCentsmethod(getCost()))+DessertShoppe.cents2dollarsAndCentsmethod(getCost())+ "\n";
        return g;
    }

}


