public class spiralMatrix {
    static void sprialMatrix(int x[][],int er, int ec){
        //a starting row
        //b starting column
        //ec last column
        //er last row
        int a=0;
        int b=0;
        while(a<er && b<ec){
        for(int i=b;i<ec;i++){
         System.out.print(x[a][i]+" ");
        }
        a++;

        for(int j=a;j<er;j++){
            System.out.print(x[j][ec-1]+" ");
        }
        ec--;
        if(a<er) {
            for (int k = ec-1; k >=1; --k) {
                System.out.print(x[er-1][k]+" ");
            }
            er--;
        }
        if(b<ec) {
            for (int o = er-1; o>=a; --o) {
                System.out.print(x[o][b] + " ");
            }
            b++;
        }

        }
    }
    public static void main(String[] args){
        int x=4;
        int y=4;
        int z[][]={ {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16} };
        sprialMatrix(z,x,y);
    }
}
