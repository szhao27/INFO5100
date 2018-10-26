
public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected int sex;
    public static final int MALE=0;
    public static final int FEMALE=1;
    public static final int SPAYED=2;
    public static final int NEUTERED=3;
    public Pet(String name,String ownerName,String color){
        this.name=name;
        this.ownerName=ownerName;
        this.color=color;
    }
    public String getPetName()
    {
        return this.name;
    }
    public String getOwnerName()
    {
        return this.ownerName;
    }
    public String getColor(){
        return this.color;
    }
    public void setSex(int sexid){
        this.sex=sexid;
    }
    public String getSex(){
      if(sex==0){
          return "MALE";
      }
      if(sex==1){
          return "FEMALE";
      }
      if(sex==2){
          return "SPAYER";
      }
      if(sex==3){
          return "NEUTERED";
      }
      return "wrong input";

    }
    public String toString(){
        StringBuilder b=new StringBuilder();
        b.append(name +" owned by "+ownerName+"\n"+"Color: "+color+"\n"+"Sex:"+getSex());
        return b.toString();
    }
    public static void main(String[] args){
        Pet Spot=new Pet("Spot","Mary","Black and White");
        Spot.setSex(0);
        System.out.println(Spot);
    }
}
