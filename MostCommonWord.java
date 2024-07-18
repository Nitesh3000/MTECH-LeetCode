/*
 * 819. Most Common Word

Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a"
 

Constraints:

1 <= paragraph.length <= 1000
paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
0 <= banned.length <= 100
1 <= banned[i].length <= 10
banned[i] consists of only lowercase English letters.
 */
import java.util.HashMap;
import java.util.Map;
import java.io.*;
public class MostCommonWord{
    public static String mostCommonWord(String paragraph, String[] banned){
        paragraph = paragraph.replaceAll("[!?',;\\.]", " ");
        String[] para = paragraph.split(" ");
        String maxCharacter = "";
        int max = Integer.MIN_VALUE;
        Map<String,Integer> map = new HashMap<>();
        for(String p:para){
            p = p.replaceAll("[!?',;\\.]", "").toLowerCase();
            if(!check(banned, p) && !p.equals("")){
                
                // System.out.println(p);
                if(map.containsKey(p)){
                    // System.out.println("if "+ p);
                    map.put(p,map.get(p)+1);
                }
                else{
                    map.put(p,new Integer(1));
                    // System.out.println("else: "+ p);
                }
                if(max<map.get(p)){
                    max = map.get(p);
                    maxCharacter = p;
                    // System.out.println(maxCharacter + " " + max);
                }
                // System.out.println(map);

            }
        }
        System.gc();
        return maxCharacter;
    }
    public static boolean check(String[] banned, String p){
        for(String ban:banned){
            if(ban.equals(p))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"}; 
        System.out.println(mostCommonWord(paragraph, banned));
        System.out.println("done");
    }
}