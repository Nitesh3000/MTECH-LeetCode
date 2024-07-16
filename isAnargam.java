public class isAnargam{
    
        public static boolean isAnagram(String s, String t) {
            int[] alphabet = new int[26];
            int i = 0;
            for(char c: s.toCharArray()){
                alphabet[c - (int)'a']++;
                alphabet[t.charAt(i) - (int)'a']--;
                i++;
            }
            for(int j = 0;j<26;j++){
                if(alphabet[j]!=0){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        System.out.println(isAnagram("racecar","carrace"));
    }
    
}