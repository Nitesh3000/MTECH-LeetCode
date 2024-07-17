public class SpecialCharacters {
    public static int numberOfSpecialChars(String word) {
        boolean[] alphabet = new boolean[58];
        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                alphabet[c - 'A'] = true;
            } else if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a' + 26] = true;
            }
        }
        int count = 0;
        for(char c : word.toCharArray()){

            if((c>='A') && (c<='Z') && (alphabet[c - 'A'] == true) && (alphabet[c - 'A' + 26] == true)){
                alphabet[c-'A'] = false;
                alphabet[c-'A'+26] = false;
                count++;

            }
        }
        System.gc();
        return count;

    }
    public static void main(String[] args) {
        System.out.print(numberOfSpecialChars("aaAbBBcC"));
    }
}
