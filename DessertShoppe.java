package assignment5;

public class DessertShoppe {
    public static final double taxrate=0.065d;
    public static final String nameOfStore="M & M Dessert Shoppe ";
    public static final int maxSize=30;
    public static final int width=30;
public static String cents2dollarsAndCentsmethod(int cents){
    int o1=cents/100;
    int o2=cents%100;
    String empty= "";
    if(o2<10){
        empty="0";
    }
    return Integer.toString(o1)+"."+ empty + Integer.toString(o2);

}
    public static String widTh(String name,String cost){
    int number=width-name.length()-cost.length();
    String f="";
    for(int i=0;i<number;i++){
        f=f+" ";
    }
    return f;
    }
}
