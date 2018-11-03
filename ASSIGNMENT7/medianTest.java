package a7;

import static org.junit.Assert.*;

public class medianTest {

    @org.junit.Test
    public void findMedian() {
        int[] a={1,3};
        int[] b={2};
        median t=new median();
        assertEquals(t.findMedian(a,b),2, 0);
    }
}