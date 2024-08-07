/*
 * We have two special characters:

The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.

 

Example 1:

Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
Example 2:

Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.
 
 */
public class Problem717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i<bits.length){
            
            if(bits[i] == 0){
                i++;
                if(i == bits.length){
                    return true;
                }
            }
            else{
                i = i+2;
                if(i == bits.length){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Problem717 problem717 = new Problem717();
        int[] arr = {1,0,1,1};
        System.out.println(problem717.isOneBitCharacter(arr));
    }
}
