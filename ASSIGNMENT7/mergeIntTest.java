package a7;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class mergeIntTest {

    @Test
    public void merge() {
        ArrayList<Interval> a = new ArrayList<>();
        a.add(new Interval(1, 3));
        a.add(new Interval(2, 4));
        a.add(new Interval(5, 7));
        a.add(new Interval(6, 8));
        ArrayList<Interval> b = new ArrayList<>();

        b.add(new Interval(1, 4));

        b.add(new Interval(5, 8));
        mergeInt ll = new mergeInt();
        assertTrue(leq(b, ll.merge(a)));
    }
        private boolean leq(ArrayList<Interval> x,ArrayList<Interval> y){
            if(x.size()!=y.size())   {return false;}
            for(int i=0;i<x.size();i++){
                int xs=x.get(i).start;
                int xe=x.get(i).end;
                int ys=y.get(i).start;
                int ye=y.get(i).end;
                if(xs !=ys || xe !=ye){
                    return false;
                }
            }
            return true;
        }
}