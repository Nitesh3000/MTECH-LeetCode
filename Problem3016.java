import java.util.Arrays;
// import java.util.Collections;

public class Problem3016 {
    public int minimumPushes(String word){

        int[] alphabets = new int[26];
        for(char c : word.toCharArray()){
            
            alphabets[c-'a']++;
            //System.out.println("printing "+ (int)(c-'a'));
        }
        Arrays.sort(alphabets);
        int count = 0;
        int j = 25;
        int m = 0;
        int i=0;
        while(alphabets[j] != 0){
            if(m%8==0){
                i++;
            }
            count += alphabets[j]*i;
            j--;
            m++;
            if(j == -1){
                break;
            }
        }
        return count;
        
    }   public static void main(String[] args) {
        String word = "avghdcyinjmbopwtrfslzkuxeq";
        Problem3016 problem3016 = new Problem3016();
        System.out.println(problem3016.minimumPushes(word));
    }
}
