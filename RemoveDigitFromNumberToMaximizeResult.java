import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDigitFromNumberToMaximizeResult {
    public static String removeDigit(String number, char digit) {
        List<String> list = new ArrayList<>();
        int i = 0;
        for(char num:number.toCharArray()){
            if(num == digit){
                
                list.add(number.substring(0,i) + number.substring(i+1));
                
            }
            i=i+1;
        }
        // System.out.println(list);
        return Collections.max(list);
    }
    public static void main(String[] args) {
        String number = new String("12321");
        char digit = '1';
        System.out.println(removeDigit(number,digit));
    }
}
