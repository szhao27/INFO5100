package ASSIGNMENT8;

public class studentt {
    private String ID;
    private String name;
    private String gender;

    studentt(){}
    studentt(String ID,String name,String gender){
        this.ID=ID;
        this.name=name;
        this.gender=gender;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
}

