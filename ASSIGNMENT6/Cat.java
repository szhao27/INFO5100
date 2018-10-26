import java.util.Date;

	public class Cat extends Pet implements Boardable {
	    private String hairLength;
	    public int[] kk,gg;
	    public Cat(String name,String ownerName,String color,String hairLength){
	        super(name,ownerName,color);
	        this.hairLength = hairLength;
	    }

	    @Override
	    public void setBoardStart(int month, int day, int year) {
	        if (year >= 1000 && year <= 9999 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
	            int[] kk = new int[3];
	            kk[0] = year;
	            kk[1] = month;
	            kk[2] = day;
	        }
	    }



	    @Override
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

	    String getHairLength(){
	            return hairLength;
	        }
	        public String toString(){
	            StringBuilder c=new StringBuilder();
	            c.append("CAT:"+"\n"+super.toString()+"\nHair: "+this.getHairLength());
	            return c.toString();
	        }
	     public static void main(String[] args) {
	    	 Cat t=new Cat("Tom","Bob","black","short");
	    	 t.setBoardStart(7, 3, 1995);
	    	 t.setBoardEnd(10,26,2018);
	    	 t.setSex(FEMALE);
	    	 System.out.println(t);
	    	 System.out.println(t.boarding(7,21,2012));
	     }
	      
	}

