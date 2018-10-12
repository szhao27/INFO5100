import java.util.Arrays;

public class rotate {
    public static void rotate(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=i;j<m[0].length;j++){
                int t=0;
                t=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=t;
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length/2;j++){
                int t=0;
                t=m[i][j];
                m[i][j]=m[i][m.length-1-j];
                m[i][m.length-1-j]=t;
            }
        }
    }
    public static void main(String[] args) {
        int[][] m = new int[][] {
                new int[]{1,2,3,4},
                new int[]{5,6,7,8},
                new int[]{9,10,11,12},
                new int[]{13,14,15,16}
        };
        rotate(m);

        for(int[] num : m){System.out.println(Arrays.toString(num));}
    }
}
