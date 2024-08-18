import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Problem264 {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        pq.add(1L);
        //set.add(1);
        // int count = 0;
        int i = 0;
        // int j = 0;
        long min = 1;
        while(i<n){
             min = pq.poll();
            //if(!set.contains(min*2))
                set.add(min*2);
            //if(!set.contains(min*3))
                set.add(min*3);
            //if(!set.contains(min*5))
                set.add(min*5);
                pq.add(Collections.min(set));
                set.remove(Collections.min(set));
            i++;
        }
        return (int)min;
    }
    public static void main(String[] args) {
        Problem264 problem264 = new Problem264();
        System.out.println(problem264.nthUglyNumber(1407));
    }
}
