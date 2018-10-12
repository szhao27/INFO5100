package extracredit;
// score 2/2
import java.util.regex.Pattern;
public class extracredit{
	
	static String reverse(String s) {
		Pattern pattern= Pattern.compile("\\s");
		String[] a=pattern.split(s);
		String re="";
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1) {
				re=a[i]+re;}
			else re=" "+a[i]+re;
		}
		return re;
		
 	}
	public static void main(String[] args) {
		String a="The sky is blue";
		System.out.println(reverse(a));
	}
}
