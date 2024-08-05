public class Problem3216 {
    public String getSmallestString(String s) {
        
        for(int i = 0;i<=s.length()-2;i++){
            if(sameParityAndSmaller(s.charAt(i) - '0', s.charAt(i+1) - '0')){
                s = s.substring(0,i)+s.charAt(i+1)+s.charAt(i)+s.substring(i+2);
                return s;
            }
        }
        return s;
    }
    public boolean sameParityAndSmaller(int i,int j){
        if(j<i){
            if((j%2 == 0 && i%2 == 0) || (j%2 != 0 && i%2 != 0)){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Problem3216 prb = new Problem3216();
        String s = "3131";
        System.out.println(prb.getSmallestString(s));
    }
}
