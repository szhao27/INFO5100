package assignment5;

public class Sundae extends IceCream{
    private int topping;
    private String sname;
    public Sundae(String name,int cost,String sname,int topping) {
        super(name,cost);
        this.topping = topping;
        this.sname=sname;
    }
    public int getCost(){
        int total=super.getCost()+topping;
        return total;
    }
    public String toString(){
        String v="";
        v=v+this.sname + " Sundae with\n" + getName() + DessertShoppe.widTh(getName(),DessertShoppe.cents2dollarsAndCentsmethod(getCost()))+DessertShoppe.cents2dollarsAndCentsmethod(getCost()) + "\n";
        return v;
    }


}
