package a7;

class Tool {
    private int strength;
    protected char type;
    public Tool() {

    }
    public Tool(int strength){
        this.strength=strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength(){
        return this.strength;
    }
}

class Rock extends Tool{
    public Rock(int strength){
        super(strength);
        super.type = 'r';
    }

    public boolean fight(Tool t){
        int temp = 0;
        if(t.type =='s'){
            temp=2*this.getStrength();
        } else if(t.type=='p'){
            temp=this.getStrength()/2;
        }
        if(temp>t.getStrength()){return true;}
        else return false;
    }

}

class Paper extends Tool{

    public Paper(int strength){
        super(strength);
        super.type='p';


    }
    public boolean fight(Tool t){
        int temp=0;
        if(t.type =='s'){
            temp=this.getStrength()/2;
        }
        else if(t.type=='r'){
            temp=this.getStrength()*2;
        }
        if(temp>t.getStrength()){return true;}
        else return false;
    }

}

class Scissors extends Tool{
    public Scissors(int strength){
        super(strength);
        super.type='s';
    }

    public boolean fight(Tool t){
        int temp=0;
        if(t.type =='r'){
            temp=this.getStrength()/2;
        }
        else if(t.type=='p'){
            temp=this.getStrength()*2;
        }
        if(temp>t.getStrength()){return true;}
        else return false;
    }
}

class RockPaperScissorsGame{


    public static void main(String args[]){
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , "+ p.fight(s) );
        System.out.println(p.fight(r) + " , "+ r.fight(p) );
        System.out.println(r.fight(s) + " , "+ s.fight(r) );
    }
}
