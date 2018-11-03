package a7;

public class median {
    public static double findMedian(int[] x, int[] y){
        int a=x.length;
        int b=y.length;
        if(a>b){
            int[] temp=x;
            x=y;
            y=temp;
            int t=a;
            a=b;
            b=t;
        }
        int mmin=0;
        int mmax=a;
        int hl=(a+b+1)/2;
        while(mmin<=mmax){
            int ll=(mmin+mmax)/2;
            int zz=hl-ll;
            if(ll<mmax && y[zz-1]>x[ll]){
                mmin=ll+1;
            }
            else if(ll>mmin && x[ll-1]>y[zz]){
                mmax=ll-1;
            }
            else{
                int maxl=0;
                if(ll==0){
                    maxl=y[zz-1];
                }
                else if(zz==0){maxl=x[ll-1];
                }
                else{maxl=Math.max(x[ll-1],y[zz-1]);}
                if((a+b)%2==1){return maxl;}
                int minr=0;
                if(ll==a){minr=y[zz];}
                else if(zz==b){minr=x[ll];}
                else{minr=Math.min(y[zz],x[ll]);}
                return (maxl+minr)/2.0;
            }
        }
        return 0.0;

    }
    public static void main(String[] args){
        int[] a={1,3};
        int[] b={2};
        double x;
        x=findMedian(a,b);
        System.out.println(x);
    }
}

