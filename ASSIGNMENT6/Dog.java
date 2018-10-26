import java.util.Date;

public class Dog extends Pet implements Boardable {
	    private String size;
	    private int syear;
	    private int smonth;
	    private int sday;
	    private int eyear;
	    private int emonth;
	    private int eday;
	    public int[] kk,gg;
	    public Dog(String name, String ownerName, String color, String size) {
	        super(name, ownerName, color);
	        this.size = size;

	    }
	    String getSize(){
	        return size;
	    }
	    public void setBoardStart(int month, int day, int year) {
	        if (year >= 1000 && year <= 9999 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
	            int[] kk = new int[3];
	            kk[0] = year;
	            kk[1] = month;
	            kk[2] = day;
	        }
	    }
	    public void setBoardEnd(int month, int day, int year) {
	        if (year >= 1000 && year <= 9999 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
	            int[] gg = new int[3];
	            gg[0] = year;
	            gg[1] = month;
	            gg[2] = day;
	        }
	    }

	    @Override
	    public boolean boarding(int month, int day, int year) {
	        Date d=new Date(year,month,day);
	        Date start=new Date(kk[0],kk[1],kk[2]);
	        Date end=new Date(gg[0],gg[1],gg[2]);
	        if(d.before(start)){
	            return false;
	        }
	        else if(d.after(end)){
	            return false;
	        }
	        else{
	            return true;
	        }
	    }
	    public String toString(){
	        StringBuilder c=new StringBuilder();
	        c.append("DOG:"+"\n"+super.toString()+"\nSize: "+this.getSize());
	        return c.toString();
	    }

	     public static void main(String[] args) {
		 Dog s=new Dog("Spot","Susan","white","medium");
		 s.setBoardStart(7, 3, 1995);
		 s.setBoardEnd(10,26,2018);
		 s.setSex(SPAYED);
		 System.out.println(s);
		 System.out.println(s.boarding(7,21,2012));
    }
 
}


