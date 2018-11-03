package a7;

import java.util.Scanner;

public class MyIndexOutOfBoundException extends Exception{
    int lowerBound,upperBound,index;
    public void MyIndexOutOfBoundException(){}
    public MyIndexOutOfBoundException(int lowerBound,int upperBound,int index){
        this.lowerBound=lowerBound;
        this.upperBound=upperBound;
        this.index=index;
    }
    public String toString() {
        StringBuilder a=new StringBuilder();
        a.append("Error Message: Index: "+index+", but Lower bound: "+lowerBound+", Upper bound: "+upperBound);
        return a.toString();
    }
    public static void main(String[] args) throws Exception{
        System.out.println("Enter lowerBound and upperBound:");
        int curr=0,lower=0,upper=0;
        Scanner scanner=new Scanner(System.in);
        lower=Integer.parseInt(scanner.nextLine());
        upper=Integer.parseInt(scanner.nextLine());
        while(true){
            System.out.println("Enter a number:");
            curr=Integer.parseInt(scanner.nextLine());
            try{
                if(curr<lower || curr>upper){
                    throw new MyIndexOutOfBoundException(lower,upper,curr);
                }
                 else{
                     System.out.println("valid number");
                     continue;
                }
            }
            catch(Exception e){
                throw e;
            }

        }
    }

}
