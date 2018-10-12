package addDigits;
import java.util.*;
public class addDigits {
	
public static int oneDigit(int n){
    int rest=0;
	while(n>0) {
		
		rest=rest+n%10;
		n=n/10;
		if(n==0 && rest>9) {
			n=rest;
			rest=0;
		}
	}
	return rest;
 }
	public static void main(String[] args) {
		int n=99999;
		System.out.println("result = "+oneDigit(n));
	}
}
