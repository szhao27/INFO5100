package a7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



 class Interval {
            int start;
            int end;

            Interval() {
                start = 0;
                end = 0;
            }

            Interval(int a, int b) {
                start = a;
                end = b;
            }
        }

    public class mergeInt {
            public ArrayList<Interval> merge(ArrayList<Interval> intv) {
                if (intv.size() == 0) {
                    return intv;
                }
                if (intv.size() == 1) {
                    return intv;
                }
                Collections.sort(intv, new intvComp());

                Interval ss = intv.get(0);
                int start = ss.start;
                int end = ss.end;
                ArrayList<Interval> r = new ArrayList<Interval>();
                for (int i = 1; i < intv.size(); i++) {
                    Interval curr = intv.get(i);
                    if (curr.start <= end) {
                        end = Math.max(curr.end, end);
                    } else {
                        r.add(new Interval(start, end));
                        start = curr.start;
                        end = curr.end;
                    }
                }
                r.add(new Interval(start, end));
                return r;
            }

            class intvComp implements Comparator {
                public int compare(Object o1, Object o2) {
                    Interval kk = (Interval) o1;
                    Interval gg = (Interval) o2;
                    return kk.start - gg.start;
                }
            }




    }

