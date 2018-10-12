package firstUniqChar;

public class firstUniqChar {
   
	
	static char[] number=new char[256];
	
	static void countString(String s) {
		for(int i=0;i<s.length();i++) {
			number[s.charAt(i)]++;
		}
	}
	 static int firstUniqiChar(String s) {
		 countString(s);
		 int index=-1;
		 for(int i=0;i<s.length();i++) {
			 if(number[s.charAt(i)]==1) {
				 index=i;
				 break;
			 }
		 }
		 return index;
	 }
	

public static void main(String[] args) {
	String s="loveleetcode";
	int index=firstUniqiChar(s);
	if(index==-1) {
		System.out.println("Doesn't exist");
	}
	else {System.out.println("first unique character is: "+index);}

}
}