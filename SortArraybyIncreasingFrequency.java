import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortArraybyIncreasingFrequency {
    
    public static int[] frequencySort(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // sortbyKeys();
        nums = sortMap(map, nums);
        return nums;
    }
    
    public static int[] sortMap(HashMap<Integer, Integer> map, int[] nums) {
        List<Entry<Integer, Integer>> List = new LinkedList<>(map.entrySet());
        

        // call the sort() method of Collections
        Collections.sort(List, (l1, l2) -> {
            int cmp = l1.getValue().compareTo(l2.getValue());
            if (cmp == 0) {
                return l2.getKey().compareTo(l1.getKey());
            } else {
                return cmp;
            }
        });

        // get entry from list to the map
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : List) {
            int k = 0;
            while (k < entry.getValue()) {
                nums[index] = entry.getKey();
                k++;
                index++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        nums = frequencySort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
