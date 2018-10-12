package longestpalindrome;

public class longestPalindrome {
	public static String longestPalindrome(String s) {
	      int a=s.length();
	      String b=null;
	      boolean[][] x=new boolean[a][a];
	      
	      for(int i=a-1;i>=0;i--) {
	    	  for(int j=i;j<a;j++) {
	    		  x[i][j]=s.charAt(i)==s.charAt(j) && (j-i<3 || x[i+1][j-1]);
	    		  if(x[i][j] && (b==null || j-i+1>b.length())) {
	    			  b=s.substring(i, j+1);
	    		  }
	    	    }
	    	  }
	      return b;
	      }
	        public static void main(String[] args) {
	            String s = "babad";
	            System.out.println("longestPalindrome= "+ longestPalindrome(s));
	        }
	    }


