public class FaultyKeyboard {
    public static String finalString(String s) {
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'i'){
                s = reverseSubstring(s.substring(0,i)) + s.substring(i+1);
                i--;
            }
        }
        return s;
    }
    public static String reverseSubstring(String s){
        int i = 0;
        int j = s.length()-1;
        char[] charArr = s.toCharArray();
        while(i<j){
            char temp = charArr[j];
            charArr[j] = charArr[i];
            charArr[i] = temp;
            i++;
            j--;
        }
        return new String(charArr);
    }
    public static void main(String[] args) {
        String s = "string";
        System.out.println(finalString(s));
    }
}
