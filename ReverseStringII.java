public class ReverseStringII {
   
        public String reverseStr(String s, int k) {
            boolean twice = false;
            int i = 0;
            while(i<s.length()){
            // for(int i = 0;i<s.length()-k-1;i++){
                if(i%(k)==0){
                    if(!twice){
                        int end = Math.min(i+k,s.length());
                        s=s.substring(0,i)+reverse(s.substring(i,end),k)+s.substring(end);
                        i = i+k;

                        twice = true;
                    }
                    else{
                        i = i+k;
                        twice = false;
                    }
                    // System.out.println(i);
                }else{
                i++;
                }
            }
                return s;
        }
        public String reverse(String str,int k){
            int i = 0;
            int j = str.length()-1;
            char[] strArr = str.toCharArray(); 
            while(i<j){ 
                char temp = strArr[j];
                strArr[j--] = strArr[i];
                strArr[i++] = temp;
                // System.out.println("getting here");
                
            }
            // System.err.println("Getting out");
            return new String(strArr);
        }
    public static void main(String[] args){
        String strr = "abcdefg";
        int k = 2;
        ReverseStringII revstr = new ReverseStringII();
        String rev = revstr.reverseStr(strr, k);
        for(char s:rev.toCharArray()){
            System.out.print(s);
        }
    }
}

