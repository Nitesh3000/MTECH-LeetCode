import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        
        if(paths.size() == 1){
            List<String> list=paths.get(0);
            System.gc();
            return list.get(1); 
        }
        for(int i = 0;i<paths.size();i++){
            List<String> list = paths.get(i);
            set.add(list.get(0));
        }
        for(int i = 0;i<paths.size();i++){
            List<String> list = paths.get(i);
            if(!(set.contains(list.get(1)))){
                System.gc();
                return list.get(1);
            }
        }
        
        return "";
    }
    public static void main(String[] args) {
        List<List<String>> listoflist = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("New York");
        listoflist.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("New York");
        list2.add("Lima");
        listoflist.add(list2);
        List<String> list3 = new ArrayList<>();
        list3.add("Lima");
        list3.add("Brazil");
        listoflist.add(list3);

        DestinationCity dest = new DestinationCity();
        System.out.println(dest.destCity(listoflist));
        
    }
}
