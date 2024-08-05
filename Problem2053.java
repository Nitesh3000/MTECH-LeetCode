import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Problem2053{
    
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> set = new LinkedHashMap<>();
        for(String str:arr){
            if(set.containsKey(str)){
                set.put(str,set.get(str)+1);
            }
            else{
                set.put(str,1);
            }
        }
        int i = 0;
        System.out.println(set);
        for (Map.Entry<String,Integer> itr:set.entrySet()){
            if(itr.getValue() == 1){
                i++;
            }
            if(i == k){
                return itr.getKey();
            }
        }
        return "";

    }
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        Problem2053 problem2053 = new Problem2053();
        System.out.println(problem2053.kthDistinct(arr, 2));
    }
}