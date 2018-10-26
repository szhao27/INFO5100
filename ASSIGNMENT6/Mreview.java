import java.util.*;

public class Mreview implements Comparable<Mreview> {

    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    public Mreview(){
        this.title="";
        this.ratings=new ArrayList<>();

    }

    public Mreview(String ttl){
        this.title = ttl;
        this.ratings=new ArrayList<>();
    }
    public Mreview(String ttl,int firstRating){
    	this.title=ttl;
    	this.ratings=new ArrayList<>();
    	ratings.add(firstRating);
    }
    public void addRating(int r){
        ratings.add(r);

    }
    public double aveRating(){
        double result=0;
       for(int i=0;i<ratings.size();i++){
           result=result+ratings.get(i);

       }
       double ave=0;
       ave=result/ratings.size();
       return ave;
    }

    public int compareTo(Mreview obj){
       return this.title.compareTo(obj.title);
    }
    public boolean equals(Mreview obj){
        return this.title.equals(((Mreview)obj).getTitle());

    }
    public String getTitle(){
        return title;

    }
    public int numRatings(){
        int k=0;
        k=ratings.size();
        return k;

    }
    public String toString(){
        StringBuilder a=new StringBuilder();
        a.append(this.title+ ",average "+this.aveRating()+" out of " +this.numRatings()+" ratings" );
        return a.toString();

    }
    public static void main(String[] args)
    {
        Mreview BS=new Mreview("Before Sunrise");
        BS.addRating(1);
        BS.addRating(2);
        BS.addRating(8);
        System.out.println(BS);
     
    }





}

